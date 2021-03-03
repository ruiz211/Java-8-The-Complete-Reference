package com.ruiz211.TheJavaLanguage.XV.LambdaExpressions;

interface Value<T> {
    T getValue();
}

interface Compare<T extends Number, U extends T> {
    boolean test(T t, U u);
}

interface Factorial {
    int getFacto(int number);
}