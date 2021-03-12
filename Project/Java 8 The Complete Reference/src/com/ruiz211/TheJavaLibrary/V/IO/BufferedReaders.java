//
//  BufferedReaders.java
//  Java SE 8 The Complete Reference
//
//  Created by José Ruiz on 1/28/20.
//  Copyright © 2020 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.V.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

final class BufferedReaders {
    BufferedReaders() {
    }

    public static void main(String... doYourBest) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("./file.txt")));
        StringBuilder builder = new StringBuilder();
        String line = reader.readLine();
        while (line != null) {
            builder.append(line).append("\n");
            line = reader.readLine();
        }
        System.out.println(builder.toString());
    }
}
