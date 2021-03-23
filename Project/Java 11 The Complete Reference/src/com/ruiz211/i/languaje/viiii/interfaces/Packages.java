package com.ruiz211.i.languaje.viiii.interfaces;

import com.ruiz211.i.languaje.viiii.interfaces.one.OneOne;
import com.ruiz211.i.languaje.viiii.interfaces.one.two.Two;

public class Packages {
    public static void main(String[] args) {
        System.out.println("Message from OneOne class" + new OneOne().toString());
        System.out.println("Message from Two class" + new Two().toString());
    }
}
