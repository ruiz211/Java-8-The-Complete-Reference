package com.ruiz211.ii.library.i;

public class StringComparison {
    public static void main(String... doYourBest) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "ABC";

        //equals()
        System.out.println(s1.equals(s2));

        // equalsIgnoreCase()
        System.out.println(s1.equalsIgnoreCase(s3));

        //startsWith()
        System.out.println(s1.startsWith("a"));

        // endsWith()
        System.out.println(s3.endsWith("Z"));

        //int compareTo(String str)
        System.out.println(s1.compareTo(s2));
    }
}
