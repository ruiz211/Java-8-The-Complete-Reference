package com.ruiz211.TheJavaLanguage.XV.LambdaExpressions;


public class Lambdas {
    public static void main(String... doYourBest) {
        Value name = () -> "Charles";
        System.out.println(name.getValue());

        Value number = () -> 37;
        System.out.println(number.getValue());

        Compare c = Object::equals;
        System.out.println(c.test(12, 10));

        Factorial f = factor -> {
            int result = 1;
            if (factor < 0) return 0;
            else if (factor == 0) return 1;
            for (int i = 1; i <= factor; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println(f.getFacto(5));
    }
}
