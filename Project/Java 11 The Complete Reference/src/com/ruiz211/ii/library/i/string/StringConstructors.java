package com.ruiz211.ii.library.i.string;

import java.util.Arrays;

public class StringConstructors {
    private static final String name = "John";

    public static void main(String... doYourBest) {
        String s1 = new String();
        String s2 = new String("Hello");
        char[] c = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        String s3 = new String(c);
        String s4 = new String(new char[]{'2', '3'});

        s1 += "Hi";

        for (String s : Arrays.asList(s1, s2, s3, name)) {
            System.out.println(s);
        }
    }
}
