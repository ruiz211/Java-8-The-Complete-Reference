package com.ruiz211.i.languaje.xv.lambdas;

interface ArgumentInterface {
    String func(String ai);
}

public class LambdaAsArgument {
    public static void main(String... doYourBest) {
        ArgumentInterface anInterface = String::toUpperCase;
        System.out.println(Argument.stringOperation(anInterface, "Do your best"));
    }
}

class Argument {
    static String stringOperation(ArgumentInterface as, String ai) {
        return as.func(ai);
    }
}