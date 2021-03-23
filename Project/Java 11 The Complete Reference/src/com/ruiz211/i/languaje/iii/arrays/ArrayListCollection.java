package com.ruiz211.i.languaje.iii.arrays;

import java.util.ArrayList;

public class ArrayListCollection {

    private ArrayList<String> names = new ArrayList<>(10);

    public static void main(String... doYourBest) {
        ArrayListCollection data = new ArrayListCollection();
        data.names.add("Jose");
        data.names.add(0, "Carlos");

        System.out.println(data.names.size());
        for (String name : data.getNames()) System.out.println(name);

    }

    private ArrayList<String> getNames() {
        return names;
    }
}
