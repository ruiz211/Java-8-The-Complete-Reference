package com.ruiz211.i.languaje.xiiii;

public class GenericMethods {
    public static void main(String... doYourBest) {
        Integer[] numbs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Methods.inIn(12, numbs));
    }
}

class Methods {
    static <T extends Comparable<T>, V extends T> boolean inIn(T t, V[] v) {
        for (V value : v) if (t == value) return true;
        return false;
    }
}