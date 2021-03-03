package com.ruiz211.TheJavaLanguage.XV.LambdaExpressions;

interface Value<T> {
    T getValue();
}

public class Lambdas {
    public static void main(String... doYourBest) {
        Value name = () -> "Charles";
        System.out.println(name.getValue());

        Value number = () -> 37;
        System.out.println(number.getValue());
    }
}