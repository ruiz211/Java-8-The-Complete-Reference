package com.ruiz211.i.languaje.vii;

public class IntroducingInnerClasses {

    private int number = 2;

    public static void main(String... doYourBest) {
        new IntroducingInnerClasses().calc();
    }

    private void calc() {
        Pow p = new Pow();
        System.out.println(p.calculate(3, 5));
    }

    class Pow {
        private int calculate(int x, int n) {
            System.out.println(number);
            if (n <= 1) return x;
            else {
                return x * calculate(x, n - 1);
            }
        }
    }
}
