package com.ruiz211.TheJavaLanguage.XIIII.Generics;

public class Generics {
    public static void main(String... doYourBest) {
        SimpleGeneric<Integer> i = new SimpleGeneric<>(10);
        System.out.println(i.toString());

        SimpleGeneric<String> s = new SimpleGeneric<>("String");
        System.out.println(s.toString());

        SimpleGeneric<Float> f = new SimpleGeneric<>(10.0F);
        System.out.println(f.toString());
    }
}

class SimpleGeneric<T> {
    private T t;

    SimpleGeneric(T t) {
        this.t = t;
    }

    private T getT() {
        return t;
    }

    @Override
    public String toString() {
        return "Type of T: " + getT().getClass().getName();
    }
}