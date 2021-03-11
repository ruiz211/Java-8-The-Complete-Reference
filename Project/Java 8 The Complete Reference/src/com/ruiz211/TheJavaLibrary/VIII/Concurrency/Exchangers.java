//
//  Exchangers.java
//  Java SE 8 The Complete Reference
//
//  Created by José Ruiz on 3/3/20.
//  Copyright © 2020 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.VIII.Concurrency;

import java.util.concurrent.Exchanger;

final class Exchangers {
    Exchangers() {
    }

    public static void main(String... doYourBest) {
        Exchanger<String> exchanger = new Exchanger<>();
        new Thread(new UseString(exchanger)).start();
        new Thread(new MakeString(exchanger)).start();
    }
}

class MakeString implements Runnable {
    Exchanger<String> exchanger;
    String string;

    public MakeString(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        this.string = "";
    }

    @Override
    public void run() {
        char c = 'A';
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                string += c++;
            }
            try {
                string = exchanger.exchange(string);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class UseString implements Runnable {
    Exchanger<String> exchanger;
    String string;

    public UseString(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                string = exchanger.exchange("");
                System.out.println("Got: " + string);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}