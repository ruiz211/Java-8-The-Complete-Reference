package com.ruiz211.TheJavaLanguage.VI.IntroducingClasses;

public class Methods {
    public static void main(String[] args) {
        House h1 = new House();
        House h2 = new House();

        h1.width = h1.height = h1.depth = 10;
        h2.width = h2.height = h2.depth = 20;

        h1.volume();
        h2.volume();
    }
}

class House {
    int width, height, depth;

    House() {
    }

    public House(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    void volume() {
        System.out.println(width * height * depth);
    }

    public int getWidth() {
        return width;
    }
}
