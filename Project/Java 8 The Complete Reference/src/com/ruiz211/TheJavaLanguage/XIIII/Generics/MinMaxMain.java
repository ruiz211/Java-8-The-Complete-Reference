package com.ruiz211.TheJavaLanguage.XIIII.Generics;

public class MinMaxMain {
    public static void main(String... doYourBest) {
        Integer[] i = {43, 56, 11, 78, 31, 55, 98};
        MinMax<Integer> minMax = new MinMax<>(i);
        System.out.println(minMax.min());
        System.out.println(minMax.max());
    }
}

class MinMax<T extends Comparable<T>> implements MinMaxInterface {
    T[] t;

    MinMax(T[] t) {
        this.t = t;
    }

    @Override
    public Comparable min() {
        T u = t[0];
        for (T aT : t) if (aT.compareTo(u) < 0) u = aT;
        return u;
    }

    @Override
    public Comparable max() {
        T u = t[0];
        for (T aT : t) if (aT.compareTo(u) > 0) u = aT;
        return u;
    }
}
