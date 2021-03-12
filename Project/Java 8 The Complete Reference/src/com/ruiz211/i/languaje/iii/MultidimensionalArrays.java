package com.ruiz211.i.languaje.iii;

public class MultidimensionalArrays {

    public static void main(String... doYourBest) {
        int twoD[][] = new int[5][5];
        int x = 1;
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                twoD[i][j] = x;
                x++;
            }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }

        System.out.println("\n");
        int threeD[][][] = new int[3][4][5];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++)
                for (int k = 0; k < 5; k++)
                    threeD[i][j][k] = i * j * k;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++)
                    System.out.print(threeD[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}
