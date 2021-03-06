package com.ruiz211.i.languaje.xiiii.generics;

public class GenericHierarchies {
    public static void main(String... doYourBest) {
        HierarchiesII<String> ii = new HierarchiesII<>("Some string");
        System.out.println(ii.getT());
    }
}

class Hierarchies<T> {
    protected T t;

    Hierarchies(T t) {
        this.t = t;
    }

    T getT() {
        return t;
    }
}

class HierarchiesII<T> extends Hierarchies<T> {
    HierarchiesII(T t) {
        super(t);
    }
}