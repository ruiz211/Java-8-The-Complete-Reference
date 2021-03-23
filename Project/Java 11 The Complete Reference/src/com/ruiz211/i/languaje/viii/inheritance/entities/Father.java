package com.ruiz211.i.languaje.viii.inheritance.entities;

public class Father extends Grandfather {
    public Father(String name) {
        super(name);
        System.out.println("Father constructor");
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("Hi! I'm the Father, my name is " + name);
    }

    public void printInfo(String info) {
        System.out.println(info);
    }
}