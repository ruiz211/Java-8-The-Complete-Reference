package com.ruiz211.TheJavaLanguage.X.ExceptionHandling;

public class TryCatch {
    public static void main(String... doYourBest) {
        System.out.println("ArithmeticException " + ArithmeticExceptions.division());
    }
}

class ArithmeticExceptions {
    static int a = 10;
    static byte b = 0;

    static int division() {
        int c = 0;
        try {
            c = a / b;
        } catch (ArithmeticException ae) {
            System.out.println("Message: " + ae.getMessage());
        }
        return c;
    }
}

