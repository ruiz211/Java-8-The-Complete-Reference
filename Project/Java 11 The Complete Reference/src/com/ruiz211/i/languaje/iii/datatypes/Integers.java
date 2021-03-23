package com.ruiz211.i.languaje.iii.datatypes;

public class Integers {
    public static void main(String... doYourBest) {
//        Integer
        byte numberOne = 127;
        short numberTwo = 32_767;
        int numberThree = 2_147_483_647;

        long numberFour = 9_223_372_036_854_775_807L;

        byte sumOne = (byte) (numberOne + numberTwo);
        System.out.println(sumOne);
        short sumTwo = (byte) (numberOne + numberTwo);
        short a = (short) (sumTwo + sumTwo);
        System.out.println(sumTwo);
        short sumThree = (short) (numberOne + numberTwo);
        System.out.println(sumThree);
        int sumFour = sumTwo + sumThree;
        System.out.println(sumFour); //prints a negative number becuase the actual value overlaps the permited value
        System.out.println();


        int numberTest = 259878;
        System.out.println(numberTest);
        byte number = ((byte) numberTest);
        System.out.println(number);

        // Hex
        // Oct
        // Bin

    }
}
