//
//  InetAddress.java
//  Java SE 8 The Complete Reference
//
//  Created by José Ruiz on 10/6/19.
//  Copyright © 2019 José Ruiz. All rights reserved.
//

//

package com.ruiz211.TheJavaLibrary.VII.Networking;

import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddresss {

    public static void main(String... doYourBest) throws UnknownHostException {
        java.net.InetAddress address = java.net.InetAddress.getLocalHost();
        System.out.println(Arrays.toString(address.getAddress()));

        System.out.println(java.net.InetAddress.getByName("www.google.com"));
        System.out.println(java.net.InetAddress.getByName("www.google.com.ec"));
        System.out.println(java.net.InetAddress.getByName("www.google.com.co"));
        System.out.println(java.net.InetAddress.getByName("www.google.com.pe"));
    }
}

