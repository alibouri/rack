package com.google.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

public final class d extends e {
    public final int b0;
    public final int c0;

    public d(byte[] arr_b, int v, int v1) {
        super(arr_b);
        e.c(v, v + v1, arr_b.length);
        this.b0 = v;
        this.c0 = v1;
    }

    @Override  // com.google.protobuf.e
    public final byte a(int v) {
        int v1 = this.c0;
        if((v1 - (v + 1) | v) < 0) {
            throw v >= 0 ? new ArrayIndexOutOfBoundsException(A3.e.t(v, v1, "Index > length: ", ", ")) : new ArrayIndexOutOfBoundsException("Index < 0: " + v);
        }
        return this.Y[this.b0 + v];
    }

    @Override  // com.google.protobuf.e
    public final int d() {
        return this.b0;
    }

    @Override  // com.google.protobuf.e
    public final byte e(int v) {
        return this.Y[this.b0 + v];
    }

    private void readObject(ObjectInputStream objectInputStream0) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override  // com.google.protobuf.e
    public final int size() {
        return this.c0;
    }

    public Object writeReplace() {
        int v = this.c0;
        if(v == 0) {
            return new e(u.b);
        }
        byte[] arr_b = new byte[v];
        System.arraycopy(this.Y, this.b0, arr_b, 0, v);
        return new e(arr_b);
    }
}

