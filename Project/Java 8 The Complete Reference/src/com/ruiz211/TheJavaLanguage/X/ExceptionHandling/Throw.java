package com.ruiz211.TheJavaLanguage.X.ExceptionHandling;

public class Throw {
    public static void main(String... doYourBest) {
        validate(13);
    }

    static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("Age not valid");
        else {
            System.out.println("Welcome");
        }
    }
}