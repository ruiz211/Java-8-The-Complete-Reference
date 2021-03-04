//
//  Bytes.java
//  Java SE 8 The Complete Reference
//
//  Created by José Ruiz on 1/2/20.
//  Copyright © 2020 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.II.ExploringJavaLang;

public class Bytes {
    public static void main(String... doYourBest) {
        System.out.println("Byte.MAX_VALUE: " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE: " + Byte.MIN_VALUE);
        System.out.println("Byte.SIZE: " + Byte.SIZE);
        System.out.println("Byte.TYPE: " + Byte.TYPE);

        byte b = 100;
        byte c = Byte.parseByte("100");

        System.out.println("b + c: " + (b + c));
    }
}
