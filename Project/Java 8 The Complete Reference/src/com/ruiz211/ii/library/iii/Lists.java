package com.ruiz211.ii.library.iii;

import java.util.ArrayList;
import java.util.List;

final class Lists {
    Lists() {
    }

    public static void main(String... doYourBest) {
        List<String> list = new ArrayList<>();
        list.add("Joseph");
        list.add("Charles");
        list.add("Xavier");

        ArrayList<String> names = new ArrayList<>(list);
        for (String name : names) System.out.print(name + "\t");

        System.out.println();
        if (names.contains("Carlos")) names.remove("Carlos");
        else System.out.println("Sorry, the names is not in the list");
        for (String name : names) System.out.print(name + "\t");

        System.out.println();
        if (names.contains("Carlos")) names.remove("Carlos");
        else System.out.println("Sorry, the names is not in the list");
        for (String name : names) System.out.print(name + "\t");

    }
}
