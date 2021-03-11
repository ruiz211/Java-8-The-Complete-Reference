//
//  CountDownLatchs.java
//  Java SE 8 The Complete Reference
//
//  Created by José Ruiz on 2/5/20.
//  Copyright © 2020 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.VIII.Concurrency;


import java.util.concurrent.CountDownLatch;

final class CountDownLatchs {
    CountDownLatchs() {
    }

    public static void main(String... doYourBest) {
        CountDownLatch latch = new CountDownLatch(10);
        new Thread(new CDL(latch)).start();
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}

class CDL implements Runnable {
    private CountDownLatch latch;

    public CDL(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
            latch.countDown();
        }
    }
}