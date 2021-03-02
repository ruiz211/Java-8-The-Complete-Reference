package com.ruiz211.TheJavaLanguage.X.ExceptionHandling;

public class TryCatchFinally {
    public static void main(String... doYourBest) {
        System.out.println("ArithmeticExceptions: " + NewArithmeticExceptions.division());
    }
}


class NewArithmeticExceptions {
    static int a = 10;
    static byte b = 0;

    static int division() {
        int c = 0;
        try {
            c = a / b;
        } catch (ArithmeticException ae) {
            System.out.println("Message: " + ae.getMessage());
        } finally {
            System.out.println("Here goes some final message before returning main()");
        }
        return c;
    }
}