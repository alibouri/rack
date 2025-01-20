package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class u {
    public static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        u.a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] arr_b = new byte[0];
        u.b = arr_b;
        ByteBuffer.wrap(arr_b);
    }

    public static int a(long v) {
        return (int)(v ^ v >>> 0x20);
    }
}

