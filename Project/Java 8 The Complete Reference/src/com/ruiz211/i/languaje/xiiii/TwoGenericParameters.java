package com.ruiz211.i.languaje.xiiii;

public class TwoGenericParameters {
    public static void main(String... doYourBest) {
        TwoGenerics<Integer, String> is = new TwoGenerics<>(10, "String");
        System.out.println(is.toString());
    }
}

class TwoGenerics<T, U> {
    private T t;
    private U u;

    TwoGenerics(T t, U u) {
        this.t = t;
        this.u = u;
    }

    private T getT() {
        return t;
    }

    private U getU() {
        return u;
    }

    @Override
    public String toString() {
        return "Type of T: " + getT().getClass().getName() + "\n" +
                "Type of U: " + getU().getClass().getName();
    }
}