//
//  FileWriters.java
//  Java SE 8 The Complete Reference
//
//  Created by José Ruiz on 1/28/20.
//  Copyright © 2020 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.V.IO;

import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.function.IntSupplier;

final class FileWriters {
    FileWriters() {
    }

    public static void main(String... doYourBest) throws IOException {
        FileWriter writer = new FileWriter(new File("./file.txt"));
        IntSupplier supplier = () -> new Random().nextInt(500);
        writer.write((char) supplier.getAsInt());
        System.out.println(supplier.getAsInt());
        Closeable closeable = writer::close;
        closeable.close();
    }
}
