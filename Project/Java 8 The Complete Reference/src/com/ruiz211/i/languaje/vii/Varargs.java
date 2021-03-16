package com.ruiz211.i.languaje.vii;

public class Varargs {
    public static void main(String... doYourBest) {
        Varargs v = new Varargs();
        v.print(1, 2, 3, 4, 5);
        v.print(2.5, 1, 2, 3, 4, 5);
        v.print("4", "2");
    }

    void print(int... arg) {
        for (int value : arg) System.out.println(value);
    }

    void print(double a, int... arg) {
        for (int value : arg) System.out.println(value + a);

    }

    void print(String... arg) {
        for (String value : arg) System.out.println(value);

    }
}
