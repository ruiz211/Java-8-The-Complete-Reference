package com.ruiz211.TheJavaLanguage.X.ExceptionHandling;

public class TryCatch {
    public static void main(String... doYourBest) {
        System.out.println("ArithmeticException " + ArithmeticExceptions.division());
        System.out.println("ArrayIndexOutOfBoundsException " + MultipleCatches.doubleCatches());
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

class MultipleCatches {
    static int a = 11;
    static byte b = 0;
    static int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    static int doubleCatches() {
        int c = 0;
        try {
            c = a / array[10];
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException ae) {
            System.out.println("Message: " + ae.getMessage());
        }
        return c;
    }
}