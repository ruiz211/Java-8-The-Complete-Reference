//
//  Deques.java
//  Java SE 8 The Complete Reference
//
//  Created by José Ruiz on 1/10/20.
//  Copyright © 2020 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.III.TheCollectionsFramework;

import java.util.ArrayDeque;
import java.util.Deque;

final class Deques {
    Deques() {
    }

    public static void main(String... doYourBest) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("John");
        deque.addLast("Hammond");
        deque.addLast("Hammond");
        deque.addLast("Hammond");
        deque.addLast("Hammond");
        deque.addLast("Hammond");
        deque.addLast("Hammond");
        deque.addLast("Hammond");
        deque.pop();
        System.out.println(deque);
    }
}
