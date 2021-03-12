package com.ruiz211.i.languaje.iii;

public class Doubles {

    public static void main(String... doYourBest) {
        double numberPi = 3.14159;
        double radius = 3;
        System.out.println("The area is: " + numberPi * Math.pow(numberPi, 2));


        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}
