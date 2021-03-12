//
//  BufferedWriters.java
//  Java SE 8 The Complete Reference
//
//  Created by José Ruiz on 1/28/20.
//  Copyright © 2020 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.V.IO;

import java.io.*;

final class BufferedWriters {
    BufferedWriters() {
    }

    public static void main(String... doYourBest) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("./file.txt")));
        writer.write("Hello!");
        writer.newLine();
        writer.write("World!");
        Closeable closeable = () -> writer.close();
        closeable.close();
    }
}
