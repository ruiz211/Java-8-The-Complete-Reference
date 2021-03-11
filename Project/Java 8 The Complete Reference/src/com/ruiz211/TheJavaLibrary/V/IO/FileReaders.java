//
//  FileReaders.java
//  Java SE 8 The Complete Reference
//
//  Created by José Ruiz on 1/28/20.
//  Copyright © 2020 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.V.IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

final class FileReaders {
    FileReaders() {
    }

    public static void main(String... doYourBest) {
        try (FileReader reader = new FileReader(new File("./file.txt"))) {
            int c;
            while ((c = reader.read()) != -1) System.out.println((char) c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
