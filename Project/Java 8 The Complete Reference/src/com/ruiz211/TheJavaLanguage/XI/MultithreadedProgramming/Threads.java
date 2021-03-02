package com.ruiz211.TheJavaLanguage.XI.MultithreadedProgramming;

public class Threads {
    public static void main(String... doYourBest) {
        Thread thread = Thread.currentThread();
        System.out.println("Id: " + thread.getId());
        System.out.println("Name: " + thread.getName());
        System.out.println("State: " + thread.getState());
        System.out.println("Priority: " + thread.getPriority());

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
