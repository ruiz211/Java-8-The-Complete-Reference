//
//  HttpURLConnection.java
//  Java SE 8 The Complete Reference
//
//  Created by José Ruiz on 10/24/19.
//  Copyright © 2019 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.VII.Networking;

import java.io.IOException;
import java.net.URL;

public class HttpURLConnection {

    private HttpURLConnection() {
        super();
    }

    public static void main(String... doYourBest) throws IOException {
        URL url = new URL("https://www.google.com");
//        HttpURLConnection connection = (HttpURLConnection) url.openConnection(); ??

    }
}
