//
//  Semaphores.java
//  Java SE 8 The Complete Reference
//
//  Created by José Ruiz on 2/4/20.
//  Copyright © 2020 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.VIII.Concurrency;

import java.util.concurrent.Semaphore;

final class Semaphores {
    Semaphores() {
    }

    public static void main(String... doYourBest) {
        Semaphore semaphore = new Semaphore(1);
        new Thread(new Increment("John", semaphore)).start();
        new Thread(new Decrement("Hammond", semaphore)).start();
    }
}

class Shared {
    static int resource = 0;
}

class Increment implements Runnable {
    String name;
    Semaphore semaphore;

    public Increment(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println("Starting " + name);
        try {
            System.out.println(name + " is waiting for a permit");
            semaphore.acquire();
            System.out.println(name + " got a permit");
            for (int i = 0; i < 11; i++) {
                System.out.println(Shared.resource++);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " release the permit");
        semaphore.release();
    }
}

class Decrement implements Runnable {
    String name;
    Semaphore semaphore;

    public Decrement(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println("Starting " + name);
        try {
            System.out.println(name + " is waiting for a permit");
            semaphore.acquire();
            System.out.println(name + " got a permit");
            for (int i = 0; i < 11; i++) {
                System.out.println(Shared.resource--);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " release the permit");
        semaphore.release();
    }
}