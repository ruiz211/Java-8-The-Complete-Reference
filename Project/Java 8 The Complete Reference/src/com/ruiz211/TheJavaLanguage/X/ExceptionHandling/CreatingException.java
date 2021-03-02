package com.ruiz211.TheJavaLanguage.X.ExceptionHandling;

public class CreatingException {
    public static void main(String... doYourBest) {
        try {
            Age.compute(1);
        } catch (MyException e) {
            System.out.println("Caught " + e.getMessage() + " " + e.toString());
        }
    }
}

class MyException extends Exception {
    private int number;

    MyException(int number) {
        this.number = number;
    }

    public MyException(String message, int number) {
        super(message);
        this.number = number;
    }

    @Override
    public String toString() {
        return "My Exception: " + this.number;
    }
}

class Age {
    static void compute(int age) throws MyException {
        if (age < 18) throw new MyException("You are so young", age);
        System.out.println("You can pass");
    }
}