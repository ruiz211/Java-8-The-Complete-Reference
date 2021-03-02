package com.ruiz211.TheJavaLanguage.VIIII.PackagesAndInterfaces;

import com.ruiz211.TheJavaLanguage.VIIII.PackagesAndInterfaces.one.OneOne;
import com.ruiz211.TheJavaLanguage.VIIII.PackagesAndInterfaces.one.two.Two;

public class Root {
    public static void main(String[] args) {
        System.out.println("Message from OneOne class" + new OneOne().toString());
        System.out.println("Message from Two class" + new Two().toString());
    }
}
