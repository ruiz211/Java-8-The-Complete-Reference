//
//  Atomics.java
//  Java SE 8 The Complete Reference
//
//  Created by José Ruiz on 3/13/20.
//  Copyright © 2020 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.VIII.Concurrency;

import java.util.concurrent.atomic.AtomicInteger;

final class Atomics {
    Atomics() {
    }

    public static void main(String... doYourBest) {
        Runnable r = () -> {
            System.out.println("Staring " + Thread.currentThread());
            for (int i = 0; i < 10; i++)
                System.out.println(Thread.currentThread() + " got: " + SharedResource.atomicInteger.getAndSet(i));
        };

        new Thread(new AtomicThread("John Hammond")).start();
        new Thread(new AtomicThread("Ian Malcolm")).start();
        new Thread(new AtomicThread("Alan Grant")).start();
        new Thread(r, "Threads").start();
    }
}

class SharedResource {
    static AtomicInteger atomicInteger = new AtomicInteger(0);
}

class AtomicThread implements Runnable {
    private String name;

    public AtomicThread(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Staring " + getName());
        for (int i = 0; i < 10; i++)
            System.out.println(getName() + " got: " + SharedResource.atomicInteger.getAndSet(i));
    }
}