package com.ruiz211.TheJavaLanguage.VII.ACloserLookAtMethodsAndClasses;

public class OverloadingMethods {
    public static void main(String... doYourBest) {

    }

    void test() {
    }

    void test(int a) {
    }

    void test(int a, int b) {
    }

    void test(double a, double b) {
    }

//    String test() { //similar to void test()
//        return "";
//    }

    double test(double a) {
        return 0.0;
    }
}
