package com.ruiz211.TheJavaLibrary.I.StringHandling;

public class StringConstructors {
    private static final String name = "John";

    public static void main(String... doYourBest) {
        String s1 = new String();
        String s2 = new String("Hello");
        char[] c = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        String s3 = new String(c);

        s1 += "Hi";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(name);
    }
}
