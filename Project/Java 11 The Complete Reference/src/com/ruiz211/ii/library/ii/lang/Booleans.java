package com.ruiz211.ii.library.ii.lang;

public class Booleans {
    public static void main(String... doYourBest) {
        boolean bool = Boolean.TRUE;
        System.out.println(bool);
        bool = Boolean.FALSE;
        System.out.println(bool);
        bool = Boolean.parseBoolean("1");
        System.out.println(bool);

        boolean a = true;
        boolean b = false;
        System.out.println("Boolean.compare(a, b): " + Boolean.compare(a, b));
        System.out.println("Boolean.compare(a, !b): " + Boolean.compare(a, !b));
        System.out.println("Boolean.compare(!a, b): " + Boolean.compare(!a, b));
        System.out.println("Boolean.compare(b, a): " + Boolean.compare(b, a));
        System.out.println("Boolean.compare(!b, a): " + Boolean.compare(!b, a));

    }
}
