package com.ruiz211.TheJavaLanguage.VII.ACloserLookAtMethodsAndClasses;

public class ObjectsAsParameters {
    public static void main(String... doYourBest) {
        Test testOne = new Test(10, 10);
        Test testTwo = new Test(10, 10);
        System.out.println(testOne.equals(testTwo));
        System.out.println(testOne.equals(new Test(10, 11)));
    }
}

class Test {
    private int a, b;

    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    boolean equals(Test obj) {
        return (this.a == obj.a && this.b == obj.b);
    }
}