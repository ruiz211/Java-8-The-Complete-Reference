package com.ruiz211.ii.library.iii;

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
        deque.addFirst("First");
//        deque.pop();
        System.out.println(deque);
    }
}
