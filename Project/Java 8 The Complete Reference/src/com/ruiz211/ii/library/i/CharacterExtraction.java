package com.ruiz211.ii.library.i;

public class CharacterExtraction {
    public static void main(String... doYourBest) {
        //charAt()
        System.out.println("abcdefg".charAt(5));

        //getChars()
        String abcdefg = "abcdefg";
        char[] c = new char[3];
        abcdefg.getChars(2, 5, c, 0);
        System.out.println(c);
    }
}
