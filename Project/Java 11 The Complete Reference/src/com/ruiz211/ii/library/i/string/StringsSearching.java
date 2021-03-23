package com.ruiz211.ii.library.i.string;

public class StringsSearching {
    public static void main(String... doYourBest) {
        String name = "John John John John";

        //indexOf()
        System.out.println(name.indexOf('n'));
        System.out.println(name.indexOf("hn", 10));

        //lastIndexOf()
        System.out.println(name.lastIndexOf('o'));
    }
}
