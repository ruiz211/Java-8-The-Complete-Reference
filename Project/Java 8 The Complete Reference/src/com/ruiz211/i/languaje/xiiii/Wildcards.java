package com.ruiz211.i.languaje.xiiii;

public class Wildcards {
    public static void main(String... doYourBest) {
        Integer[] arrayInteger = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double[] arrayDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
        SameAverage<Integer> averageI = new SameAverage<>(arrayInteger);
        SameAverage<Double> averageD = new SameAverage<>(arrayDouble);

        System.out.println(averageI.compare(averageD));
        System.out.println(averageD.compare(averageD));
    }
}

class SameAverage<T extends Number> {
    private T[] t;

    SameAverage(T[] t) {
        this.t = t;
    }

    private T[] getT() {
        return t;
    }

    private T getT(int i) {
        return t[i];
    }

    private double average() {
        double sum = 0;
        for (int i = 0; i < getT().length; i++) {
            sum += getT(i).doubleValue();
        }
        return sum / t.length;
    }

    boolean compare(SameAverage<?> object) {
        return average() == object.average();
    }
}