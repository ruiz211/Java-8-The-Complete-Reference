package com.ruiz211.TheJavaLanguage.VII.ACloserLookAtMethodsAndClasses;

public class OverloadingContructors {
    private int a, b, c;

    public OverloadingContructors() {
    }

    public OverloadingContructors(int a) {
        this.a = a;
    }

    public OverloadingContructors(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public OverloadingContructors(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
