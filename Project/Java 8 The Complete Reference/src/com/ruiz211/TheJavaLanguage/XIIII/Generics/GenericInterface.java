package com.ruiz211.TheJavaLanguage.XIIII.Generics;

interface MinMaxInterface<T extends Comparable<T>> {
    T min();

    T max();
}