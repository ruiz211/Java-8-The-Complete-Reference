//
//  ExecutorServices.java
//  Java SE 8 The Complete Reference
//
//  Created by José Ruiz on 3/6/20.
//  Copyright © 2020 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.VIII.Concurrency;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class ExecutorServices {
    ExecutorServices() {
    }

    public static void main(String... doYourBest) {
        CountDownLatch latch = new CountDownLatch(5);
        CountDownLatch latch2 = new CountDownLatch(5);
        CountDownLatch latch3 = new CountDownLatch(5);
        CountDownLatch latch4 = new CountDownLatch(5);
        CountDownLatch latch5 = new CountDownLatch(5);
        ExecutorService service = Executors.newFixedThreadPool(3);
        System.out.println("Starting");
        service.execute(new Thread(new ExecutorServiceExample(latch, "John Hammond")));
        service.execute(new Thread(new ExecutorServiceExample(latch2, "Ian Malcolm")));
        service.execute(new Thread(new ExecutorServiceExample(latch3, "Alan Grant")));
        service.execute(new Thread(new ExecutorServiceExample(latch4, "Ellie Sattler")));
        service.execute(new Thread(new ExecutorServiceExample(latch5, "Denis Nedry")));
        try {
            latch.await();
            latch2.await();
            latch3.await();
            latch4.await();
            latch5.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Important call
        service.shutdown();
        System.out.println("Done");
    }
}

class ExecutorServiceExample implements Runnable {
    private CountDownLatch latch;
    private String name;

    public ExecutorServiceExample(CountDownLatch latch, String name) {
        this.latch = latch;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " " + i);
            latch.countDown();
        }
    }
}