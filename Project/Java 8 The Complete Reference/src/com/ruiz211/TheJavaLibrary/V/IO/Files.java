//
//  Files.java
//  Java SE 8 The Complete Reference
//
//  Created by José Ruiz on 1/28/20.
//  Copyright © 2020 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.V.IO;

import java.io.File;
import java.io.IOException;

final class Files {
    Files() {
    }

    public static void main(String... doYourBest) throws IOException {
        File file = new File("./file.txt");
        file.createNewFile();
        System.out.println("File exist? " + file.exists());
        System.out.println("File is a directory? " + file.isDirectory());
        System.out.println("File name? " + file.getName());
        System.out.println("File path? " + file.getPath());
        System.out.println("File can read? " + file.canRead());
        System.out.println("File can write? " + file.canWrite());
    }
}
