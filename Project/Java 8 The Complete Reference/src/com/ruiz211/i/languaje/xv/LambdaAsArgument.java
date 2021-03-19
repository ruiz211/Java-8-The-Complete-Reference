package com.ruiz211.i.languaje.xv;

interface ArgumentInterface {
    String func(String ai);
}

public class LambdaAsArgument {
    public static void main(String... doYourBest) {
        System.out.println(Argument.stringOperation(ai -> ai.toUpperCase(), "Some new string"));
        System.out.println(Argument.stringOperation(String::toLowerCase, "Some new string"));
    }
}

class Argument {
    static String stringOperation(ArgumentInterface as, String ai) {
        return as.func(ai);
    }
}