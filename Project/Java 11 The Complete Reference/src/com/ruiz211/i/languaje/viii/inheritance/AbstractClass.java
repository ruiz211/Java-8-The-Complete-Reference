package com.ruiz211.i.languaje.viii.inheritance;

public class AbstractClass {
    public static void main(String... doYourBest) {
        Rectangle r = new Rectangle(10, 10);
        System.out.println(r.getArea());

        Triangle t = new Triangle(10, 10);
        System.out.println(t.getArea());
    }
}

abstract class Figure {
    int width, height;

    Figure(int width, int height) {
        this.width = width;
        this.height = height;
    }

    abstract int getArea();
}

class Rectangle extends Figure {
    Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    int getArea() {
        return width * height;
    }
}

class Triangle extends Figure {
    Triangle(int width, int height) {
        super(width, height);
    }

    @Override
    int getArea() {
        return (width * height) / 2;
    }
}