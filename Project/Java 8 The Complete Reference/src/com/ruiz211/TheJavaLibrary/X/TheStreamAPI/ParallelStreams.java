//
//  ParallelStreams.java
//  Java SE 8 The Complete Reference
//
//  Created by José Ruiz on 1/31/20.
//  Copyright © 2020 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.X.TheStreamAPI;

import java.util.Arrays;
import java.util.List;

final class ParallelStreams {
    ParallelStreams() {
    }

    public static void main(String... doYourBest) {
        List<Integer> list = Arrays.asList(1, 23, 54, 34, 87, 90, 21, 34, 5, 6, 9, 34, 6, 12);
        System.out.println(list.parallelStream().reduce(1, Integer::sum, Integer::compareTo));
    }
}