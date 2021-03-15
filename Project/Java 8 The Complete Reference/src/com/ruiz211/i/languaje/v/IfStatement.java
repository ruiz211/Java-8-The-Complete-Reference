//
//  IfStatement.java
//  Java 8 The Complete Reference
//
//  Created by José Ruiz on 3/10/21.
//

package com.ruiz211.i.languaje.v;

public class IfStatement {
    public static void main(String... doYourBest) {
        int a = 10;
        int b = 11;

        if (a > b) System.out.println("a");
        else System.out.println("b");

        System.out.println((a > b) ? "a" : "b");
    }
}
