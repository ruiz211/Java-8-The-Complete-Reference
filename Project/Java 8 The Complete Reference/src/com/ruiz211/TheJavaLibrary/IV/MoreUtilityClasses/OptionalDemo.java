//
//  OptionalDemo.java
//  Java The Complete Reference
//
//  Created by José Ruiz on 10/3/19.
//  Copyright © 2019 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.IV.MoreUtilityClasses;

import java.util.Optional;

public class OptionalDemo {

    public OptionalDemo() {
    }

    public static void main(String... doYourBest) {
        Optional<String> noVal = Optional.empty();
        Optional<String> val = Optional.of("Jose");

        if (noVal.isPresent()) System.out.println(noVal.get());
        else System.out.println(noVal.orElse("Carlos"));

//        if (val.isPresent()) System.out.println(val.get());
    }
}
