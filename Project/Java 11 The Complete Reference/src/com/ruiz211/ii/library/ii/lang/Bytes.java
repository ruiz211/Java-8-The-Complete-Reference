package com.ruiz211.ii.library.ii.lang;

public class Bytes {
    public static void main(String... doYourBest) {
        System.out.println("Byte.MAX_VALUE: " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE: " + Byte.MIN_VALUE);
        System.out.println("Byte.SIZE: " + Byte.SIZE);
        System.out.println("Byte.TYPE: " + Byte.TYPE);

        byte b = 100;
        byte c = Byte.parseByte("100");

        System.out.println("b + c: " + (b + c));
    }
}
