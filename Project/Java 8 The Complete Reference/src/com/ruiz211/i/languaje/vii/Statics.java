package com.ruiz211.i.languaje.vii;

import java.util.Date;

public class Statics {
    static {
        System.out.println("1. before constructor");
    }

    static {
        System.out.println("2. after constructor and before main");
    }

    static {
        System.out.println("3. after main");
        call();
        StaticClass.print();
    }

    private Statics() {
        System.out.println("5. constructor");
    }

    public static void main(String... doYourBest) {
        System.out.println("4. main");
        new Statics();
    }

    static void call() {
        System.out.println("3.1. even before main " + new Date().getTime());
    }
}


class StaticClass {
    static void print() {
        System.out.println("a message from a static class");
    }
}