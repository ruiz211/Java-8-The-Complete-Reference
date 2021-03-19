package com.ruiz211.ii.library.i;

public class ModifyingString {
    public static void main(String... doYourBest) {
        char[] c = {'a', 'e', 'i', 'o', 'u'};
        String letters = new String(c);

        //substring()
        System.out.println(letters.substring(1, 4));

        String hi = "hi";
        String name = "John";

        //concat()
        String greet = hi.concat(name);
        System.out.println(greet);
    }
}
