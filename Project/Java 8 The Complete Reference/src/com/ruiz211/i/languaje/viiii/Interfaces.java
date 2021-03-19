package com.ruiz211.i.languaje.viiii;

interface Callable {
    int NUMBER = 211;

    String call(String message); //public and abstract are optionals

    default String sayHi(String name) { //public is optional
        return "Hi! " + name;
    }

    default String sayBye(String name) { //public is optional
        return "Bye! " + name;
    }
}

public class Interfaces {
    public static void main(String... doYourBest) {
        Calling calling = new Calling();
        System.out.println(calling.call("This is a call message"));
        System.out.println(calling.sayHi("John"));
        System.out.println(calling.sayBye("Charles"));

        //Using functional programming, soon...
        Callable c = message -> {
            return message + " " + Callable.NUMBER;
        };

        System.out.println();
        System.out.println(c.call("Functional message"));
    }
}

class Calling implements Callable {

    @Override
    public String call(String message) {
        return "Calling..." + NUMBER;
    }
}