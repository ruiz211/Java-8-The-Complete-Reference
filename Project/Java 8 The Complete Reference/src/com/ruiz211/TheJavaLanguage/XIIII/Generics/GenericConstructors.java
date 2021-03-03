package com.ruiz211.TheJavaLanguage.XIIII.Generics;

public class GenericConstructors {
    public static void main(String... doYourBest) {
        Constructors a = new Constructors(12.3);
        Constructors b = new Constructors(37.0F);

        System.out.println(a.toString());
        System.out.println(b.toString());

    }
}

class Constructors {
    private double value;

    <T extends Number> Constructors(T value) {
        this.value = value.doubleValue();
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Constructors{" +
                "value=" + value +
                '}';
    }
}