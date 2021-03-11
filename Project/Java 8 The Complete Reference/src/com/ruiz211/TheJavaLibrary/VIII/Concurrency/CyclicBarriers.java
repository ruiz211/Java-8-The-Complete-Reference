//
//  CyclicBarriers.java
//  Java SE 8 The Complete Reference
//
//  Created by José Ruiz on 2/5/20.
//  Copyright © 2020 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.VIII.Concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

final class CyclicBarriers {
    CyclicBarriers() {
    }

    public static void main(String... doYourBest) {
        CyclicBarrier barrier = new CyclicBarrier(2, () -> System.out.println("Barrier Reached!"));
        System.out.println("Starting");
        new Thread(new CB(barrier, "John Hammond")).start();
        new Thread(new CB(barrier, "Ian Malcolm")).start();
        new Thread(new CB(barrier, "Alan Grant")).start();
    }
}

class CB implements Runnable {
    CyclicBarrier barrier;
    String name;

    public CB(CyclicBarrier barrier, String name) {
        this.barrier = barrier;
        this.name = name;
    }


    @Override
    public void run() {
        System.out.println(name);
        try {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}