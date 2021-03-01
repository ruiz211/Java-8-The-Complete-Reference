package com.ruiz211.TheJavaLanguage.III.DataTypesVariablesAndArrays;

public class Arrays {

    public static void main(String... doYourBest) {
        String[] arrayOne;
        String[] arrayTwo = {"Hola"};
        String[] arrayThree = {};
        String[] arrayFour = new String[10];
        String arrayFive[];

        arrayOne = new String[10];

        for (String value : arrayOne) System.out.println(value);
    }
}
