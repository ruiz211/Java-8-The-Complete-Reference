package com.ruiz211.TheJavaLanguage.XI.MultithreadedProgramming;

public class CreatingThreads {
    public static void main(String... doYourBest) {
        First first = new First();
        first.t.start();

        Second second = new Second();
        second.start();

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Main thread " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}

class First implements Runnable {
    Thread t;

    First() {
        t = new Thread(this, "First");
        t.setPriority(4);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(1999);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}

class Second extends Thread {
    Second() {
        super("New thread");
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(2001);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}