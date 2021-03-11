//
//  Phasers.java
//  Java SE 8 The Complete Reference
//
//  Created by José Ruiz on 3/3/20.
//  Copyright © 2020 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.VIII.Concurrency;

import java.util.concurrent.Phaser;

final class Phasers {
    Phasers() {
    }

    public static void main(String... doYourBest) {
        Phaser phaser = new Phaser(1);
        int currentPhase;
        System.out.println("Starting");
        new Thread(new Phase(phaser, "John Hammond")).start();
        new Thread(new Phase(phaser, "Ian Malcolm")).start();
        new Thread(new Phase(phaser, "Alan Grant")).start();

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println(currentPhase + "completed");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println(currentPhase + "completed");

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println(currentPhase + "completed");

        phaser.arriveAndDeregister();
        if (phaser.isTerminated()) System.out.println("End");
    }
}

class Phase implements Runnable {
    private Phaser phaser;
    private String name;

    public Phase(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Threads " + name + " beginning phase one");
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Threads " + name + " beginning phase two");
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Threads " + name + " beginning phase three");
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}