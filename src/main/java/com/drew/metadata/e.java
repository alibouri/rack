package com.drew.metadata;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public final class e {
    public final byte[] a;
    public final Charset b;

    public e(byte[] arr_b, Charset charset0) {
        this.a = arr_b;
        this.b = charset0;
    }

    @Override
    public final String toString() {
        Charset charset0 = this.b;
        byte[] arr_b = this.a;
        if(charset0 != null) {
            try {
                return new String(arr_b, charset0.name());
            }
            catch(UnsupportedEncodingException unused_ex) {
            }
        }
        return new String(arr_b);
    }
}

