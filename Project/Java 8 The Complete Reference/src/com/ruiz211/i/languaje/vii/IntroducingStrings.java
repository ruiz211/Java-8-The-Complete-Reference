package com.ruiz211.TheJavaLanguage.VII.ACloserLookAtMethodsAndClasses;

public class IntroducingStrings {
    static String a = "a";
    static String b = "b";
    static String c = "c";

    public static void main(String... doYourBest) {
        String str = new String("Java");
        str.concat(" Tutorial"); //won't happen
        str = str.concat(" Tutorial");
        System.out.println(str);

        a.concat(c); //won't happen
        System.out.println(a.concat(b));

    }
}
