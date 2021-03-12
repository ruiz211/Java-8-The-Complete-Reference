//
//  Iterators.java
//  Java SE 8 The Complete Reference
//
//  Created by José Ruiz on 1/10/20.
//  Copyright © 2020 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.III.TheCollectionsFramework;

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
