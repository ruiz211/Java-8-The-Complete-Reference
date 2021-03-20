package com.ruiz211.ii.library.iii;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class Iterators {
    Iterators() {
    }

    public static void main(String... doYourBest) {
        List<String> list = new ArrayList<>();
        list.add("Joseph");
        list.add("Charles");
        list.add("Xavier");

        Iterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
