//
//  BitwiseOperators.java
//  Java 8 The Complete Reference
//
//  Created by José Ruiz on 3/10/21.
//

package com.ruiz211.i.languaje.iv;

public class BitwiseOperators {

    public static void main(String... doYourBest) {
        /*
        ~ Bitwise unary NOT
        & Bitwise AND
        | Bitwise OR
        ^ Bitwise exclusive OR (XOR)
        >> Shift right
        >>> Shift right zero fill
        << Shift left
        &= Bitwise AND assignment
        |= Bitwise OR assignment
        ^= Bitwise exclusive OR assignment
        >>= Shift right assignment
        >>>= Shift right zero fill assignment
        <<= Shift left assignment
         */

        System.out.println(42 & 10);
        System.out.println(42 | 10);
        System.out.println(42 ^ 10);
        System.out.println(42 >> 10);
        System.out.println(~10);


    }
}
