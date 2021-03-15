package com.ruiz211.i.languaje.xv;

interface Value<T> {
    T getValue();
}

interface Compare<T extends Number, U extends T> {
    boolean test(T t, U u);
}

interface Factorial {
    int getFact(int number);
}