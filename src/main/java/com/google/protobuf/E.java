package com.google.protobuf;

import M.J;
import java.io.Serializable;
import java.util.Iterator;
import m5.b;

public class e implements Serializable, Iterable {
    public int X;
    public final byte[] Y;
    public static final e Z;

    static {
        e.Z = new e(u.b);
    }

    public e(byte[] arr_b) {
        this.X = 0;
        arr_b.getClass();
        this.Y = arr_b;
    }

    public byte a(int v) {
        return this.Y[v];
    }

    public static int c(int v, int v1, int v2) {
        int v3 = v1 - v;
        if((v | v1 | v3 | v2 - v1) < 0) {
            if(v < 0) {
                throw new IndexOutOfBoundsException(J.d(v, "Beginning index: ", " < 0"));
            }
            throw v1 >= v ? new IndexOutOfBoundsException(A3.e.t(v1, v2, "End index: ", " >= ")) : new IndexOutOfBoundsException(A3.e.t(v, v1, "Beginning index larger than ending index: ", ", "));
        }
        return v3;
    }

    public int d() {
        return 0;
    }

    public byte e(int v) {
        return this.Y[v];
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        if(this.size() != ((e)object0).size()) {
            return false;
        }
        if(this.size() == 0) {
            return true;
        }
        if(object0 instanceof e) {
            int v = this.X;
            int v1 = ((e)object0).X;
            if(v != 0 && v1 != 0 && v != v1) {
                return false;
            }
            int v2 = this.size();
            if(v2 > ((e)object0).size()) {
                throw new IllegalArgumentException("Length too large: " + v2 + this.size());
            }
            if(v2 <= ((e)object0).size()) {
                int v3 = this.d();
                int v4 = this.d();
                for(int v5 = ((e)object0).d(); v4 < v3 + v2; ++v5) {
                    if(this.Y[v4] != ((e)object0).Y[v5]) {
                        return false;
                    }
                    ++v4;
                }
                return true;
            }
            StringBuilder stringBuilder0 = b.A(v2, "Ran off end of other: 0, ", ", ");
            stringBuilder0.append(((e)object0).size());
            throw new IllegalArgumentException(stringBuilder0.toString());
        }
        return object0.equals(this);
    }

    @Override
    public final int hashCode() {
        int v = this.X;
        if(v == 0) {
            int v1 = this.size();
            int v2 = this.d();
            int v3 = v1;
            for(int v4 = v2; v4 < v2 + v1; ++v4) {
                v3 = v3 * 0x1F + this.Y[v4];
            }
            v = v3 == 0 ? 1 : v3;
            this.X = v;
        }
        return v;
    }

    @Override
    public final Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public int size() {
        return this.Y.length;
    }

    @Override
    public final String toString() {
        String s1;
        String s = Integer.toHexString(System.identityHashCode(this));
        int v = this.size();
        if(this.size() <= 50) {
            s1 = c0.b(this);
        }
        else {
            StringBuilder stringBuilder0 = new StringBuilder();
            int v1 = e.c(0, 0x2F, this.size());
            e e0 = v1 == 0 ? e.Z : new d(this.Y, this.d(), v1);
            stringBuilder0.append(c0.b(e0));
            stringBuilder0.append("...");
            s1 = stringBuilder0.toString();
        }
        StringBuilder stringBuilder1 = new StringBuilder("<ByteString@");
        stringBuilder1.append(s);
        stringBuilder1.append(" size=");
        stringBuilder1.append(v);
        stringBuilder1.append(" contents=\"");
        return b.y(stringBuilder1, s1, "\">");
    }
}

