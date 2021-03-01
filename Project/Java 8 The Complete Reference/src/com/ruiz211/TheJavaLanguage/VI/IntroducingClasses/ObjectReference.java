package com.ruiz211.TheJavaLanguage.VI.IntroducingClasses;

public class ObjectReference {

    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = b1;
        b1.width = 10;
        System.out.println(b2.width);
    }
}

class Box {
    int width;
}