package com.ruiz211.i.languaje.vii;

import java.util.Arrays;

public class Recursion {
    public static void main(String... doYourBest) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Factorial factorial = new Factorial();
        System.out.println(factorial.fact(5));

        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fib(6));

        ArraySum arraySum = new ArraySum();
        System.out.println(arraySum.sum(a));
    }

}

class Factorial {
    int fact(int number) {
        if (number == 0) return 1;
        else return number * fact(number - 1);
    }
}

class Fibonacci {
    int fib(int number) {
        if (number <= 1) return number;
        else return fib(number - 1) + fib(number - 2);
    }
}

//pending!
class ArraySum {
    int sum(int[] array) {
        if (array.length == 0) return 0;
        else return array[0] + sum(Arrays.copyOf(array, array.length - 1));
    }
}
