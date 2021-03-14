package com.ruiz211.TheJavaLanguage.IV.Operators;

public class BitwiseOperatorShiftLeft {

    public static void main(String... doYourBest) {
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}
