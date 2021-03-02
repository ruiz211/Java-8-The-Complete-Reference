package com.ruiz211.TheJavaLanguage.VIII.Inheritance;

import com.ruiz211.TheJavaLanguage.VIII.Inheritance.entities.Father;
import com.ruiz211.TheJavaLanguage.VIII.Inheritance.entities.Grandfather;
import com.ruiz211.TheJavaLanguage.VIII.Inheritance.entities.Son;

public class Master {
    public static void main(String... doYourBest) {
        Grandfather grandfather = new Grandfather("Grandfather");
        grandfather.printName();

        Father father = new Father("Father");
        father.printName();

        Son son = new Son("Son");
        son.printName();

        Grandfather gf = new Father("From GF: I don't know");
        gf.printName();
        ((Father) gf).printInfo("A message from the GF to F");

        gf = new Son("From GF: I don't know");
        gf.printName();
        ((Son) gf).printInfo("A message from the GF to S");
    }
}
