//
//  BooleanDemo.java
//  Java SE 8 The Complete Reference
//
//  Created by José Ruiz on 1/2/20.
//  Copyright © 2020 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.II.ExploringJavaLang;

public class Booleans {
    public static void main(String... doYourBest) {
        boolean bool = Boolean.TRUE;
        System.out.println(bool);
        bool = Boolean.FALSE;
        System.out.println(bool);
        bool = Boolean.parseBoolean("1");
        System.out.println(bool);

        boolean a = true;
        boolean b = false;
        System.out.println("Boolean.compare(a, b): " + Boolean.compare(a, b));
        System.out.println("Boolean.compare(a, !b): " + Boolean.compare(a, !b));
        System.out.println("Boolean.compare(!a, b): " + Boolean.compare(!a, b));
        System.out.println("Boolean.compare(b, a): " + Boolean.compare(b, a));
        System.out.println("Boolean.compare(!b, a): " + Boolean.compare(!b, a));

    }
}
