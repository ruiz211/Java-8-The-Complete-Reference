package com.ruiz211.i.languaje.vi.classes;

public class ObjectReference {

    public static void main(String... doYourBest) {
        Box b1 = new Box();
        Box b2 = b1;
        b1.width = 10;
        System.out.println(b2.width);
    }
}

class Box {
    int width;
}