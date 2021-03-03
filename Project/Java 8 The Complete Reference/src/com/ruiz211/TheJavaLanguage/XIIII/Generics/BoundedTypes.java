package com.ruiz211.TheJavaLanguage.XIIII.Generics;

public class BoundedTypes {
    public static void main(String... doYourBest) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Average<Integer> average = new Average<>(array);
        System.out.println(average.average());
    }
}

class Average<T extends Number> {
    T[] t;

    Average(T[] t) {
        this.t = t;
    }

    private T[] getT() {
        return t;
    }

    private T getT(int i) {
        return t[i];
    }

    double average() {
        double sum = 0;
        for (int i = 0; i < getT().length; i++) {
            sum += getT(i).doubleValue();
        }
        return sum / t.length;
    }
}