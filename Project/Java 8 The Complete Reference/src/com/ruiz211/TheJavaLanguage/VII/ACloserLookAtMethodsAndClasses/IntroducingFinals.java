package com.ruiz211.TheJavaLanguage.VII.ACloserLookAtMethodsAndClasses;

import java.util.UUID;

public class IntroducingFinals {

    private static final String id = UUID.randomUUID().toString();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(id);
        }
    }
}
