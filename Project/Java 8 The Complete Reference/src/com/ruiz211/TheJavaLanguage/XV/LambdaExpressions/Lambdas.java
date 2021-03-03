package com.ruiz211.TheJavaLanguage.XV.LambdaExpressions;


public class Lambdas {
    public static void main(String... doYourBest) {
        Value name = () -> "Charles";
        System.out.println(name.getValue());

        Value number = () -> 37;
        System.out.println(number.getValue());


        Compare c = Object::equals;
        System.out.println(c.test(12, 10));
    }
}
