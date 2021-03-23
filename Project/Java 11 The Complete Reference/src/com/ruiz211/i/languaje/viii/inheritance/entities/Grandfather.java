package com.ruiz211.i.languaje.viii.inheritance.entities;

public class Grandfather {
    String name;

    public Grandfather(String name) {
        System.out.println("Grandfather constructor");
        this.name = name;
    }

    public void printName() {
        System.out.println(this.name);
    }
}