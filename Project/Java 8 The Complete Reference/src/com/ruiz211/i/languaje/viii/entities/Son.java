package com.ruiz211.i.languaje.viii.entities;

public class Son extends Father {

    public Son(String name) {
        super(name);
        System.out.println("Son constructor");
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("Hi! I'm the Son, my name is " + super.name);
    }

    @Override
    public void printInfo(String info) {
        System.out.println("No messages to the son");
    }
}