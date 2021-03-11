//
//  Callables.java
//  Java SE 8 The Complete Reference
//
//  Created by José Ruiz on 3/6/20.
//  Copyright © 2020 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.VIII.Concurrency;

import java.util.concurrent.*;

final class Callables {
    Callables() {
    }

    public static void main(String... doYourBest) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Future<Integer> future1;
        Future<Double> future2;
        Future<Integer> future3;
        System.out.println("Starting");
        future1 = service.submit(new Sum(10));
        future2 = service.submit(new Hypot(10, 20));
        future3 = service.submit(new Factorial(10));
        try {
            System.out.println(future1.get());
            System.out.println(future2.get());
            System.out.println(future3.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        service.shutdown();
        System.out.println("Done");
    }
}

class Sum implements Callable<Integer> {
    private int stop;

    public Sum(int stop) {
        this.stop = stop;
    }

    public int getStop() {
        return stop;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < getStop(); i++) {
            sum += i;
        }
        return sum;
    }
}

class Hypot implements Callable<Double> {
    private double side1, side2;

    public Hypot(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    @Override
    public Double call() throws Exception {
        return Math.sqrt((Math.pow(getSide1(), 2)) + Math.pow(getSide2(), 2));
    }
}

class Factorial implements Callable<Integer> {
    private int stop;

    public Factorial(int stop) {
        this.stop = stop;
    }

    public int getStop() {
        return stop;
    }

    @Override
    public Integer call() throws Exception {
        int fact = 1;
        for (int i = 0; i < getStop(); i++) {
            fact *= i;
        }
        return fact;
    }
}