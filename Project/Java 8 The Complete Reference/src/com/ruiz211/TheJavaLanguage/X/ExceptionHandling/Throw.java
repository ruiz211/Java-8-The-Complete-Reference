package com.ruiz211.TheJavaLanguage.X.ExceptionHandling;

public class Throw {
    public static void main(String... doYourBest) {
        validate(1);
    }

    private static void validate(int age) {
        try {
            if (age < 18) throw new ArithmeticException("Age not valid");
            System.out.println("Welcome");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}