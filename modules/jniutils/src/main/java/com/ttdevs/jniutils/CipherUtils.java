/*
 * Created by ttdevs at 16-4-14 下午3:52.
 * E-mail:ttdevs@gmail.com
 * https://github.com/ttdevs
 * Copyright (c) 2016 ttdevs
 */

package com.ttdevs.jniutils;

public class CipherUtils {

    static {
        System.loadLibrary("CipherUtils");
    }

    public static native String base64Encode(String dataString);
}
