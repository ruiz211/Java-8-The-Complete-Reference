//
//  RecursiveActions.java
//  Java SE 8 The Complete Reference
//
//  Created by José Ruiz on 3/17/20.
//  Copyright © 2020 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.VIII.Concurrency;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

final class RecursiveActions {
    RecursiveActions() {
    }

    public static void main(String... doYourBest) {
        double[] numbers = new double[100_000];
        Arrays.setAll(numbers, i -> i);
        System.out.println("Original sequence");
        Arrays.stream(numbers, 0, 10).forEach(System.out::println);

        ForkJoinPool pool = new ForkJoinPool();
        SqrtTransform task = new SqrtTransform(numbers, 0, numbers.length);
        pool.invoke(task);
        Arrays.stream(numbers, 0, 10).forEach(System.out::println);
    }
}

class SqrtTransform extends RecursiveAction {
    private final int seqThreshold = 1000;
    private double[] data;
    private int start, end;

    public SqrtTransform(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    public int getSeqThreshold() {
        return seqThreshold;
    }

    public double[] getData() {
        return data;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    @Override
    protected void compute() {
        if ((getEnd() - getStart()) < getSeqThreshold()) {
            for (int i = getStart(); i < getEnd(); i++) {
                data[i] = Math.sqrt(data[i]);
            }
        } else {
            int middle = (getStart() + getEnd()) / 2;
            invokeAll(new SqrtTransform(getData(), getStart(), middle), new SqrtTransform(getData(), middle, getEnd()));
        }
    }
}