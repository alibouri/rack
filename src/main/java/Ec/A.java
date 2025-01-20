package Ec;

import Nb.j;
import v7.d;

public abstract class a {
    public static final byte[] a;
    public static final byte[] b;

    static {
        a.a = d.l("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").X;
        a.b = d.l("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").X;
    }

    public static final String a(byte[] arr_b, byte[] arr_b1) {
        j.f(arr_b, "<this>");
        j.f(arr_b1, "map");
        byte[] arr_b2 = new byte[(arr_b.length + 2) / 3 * 4];
        int v = arr_b.length - arr_b.length % 3;
        int v1 = 0;
        int v2 = 0;
        while(v1 < v) {
            int v3 = arr_b[v1];
            int v4 = v1 + 2;
            int v5 = arr_b[v1 + 1];
            v1 += 3;
            int v6 = arr_b[v4];
            arr_b2[v2] = arr_b1[(v3 & 0xFF) >> 2];
            arr_b2[v2 + 1] = arr_b1[(v3 & 3) << 4 | (v5 & 0xFF) >> 4];
            int v7 = v2 + 3;
            arr_b2[v2 + 2] = arr_b1[(v5 & 15) << 2 | (v6 & 0xFF) >> 6];
            v2 += 4;
            arr_b2[v7] = arr_b1[v6 & 0x3F];
        }
        switch(arr_b.length - v) {
            case 1: {
                int v8 = arr_b[v1];
                arr_b2[v2] = arr_b1[(v8 & 0xFF) >> 2];
                arr_b2[v2 + 1] = arr_b1[(v8 & 3) << 4];
                arr_b2[v2 + 2] = 61;
                arr_b2[v2 + 3] = 61;
                return new String(arr_b2, Vb.a.a);
            }
            case 2: {
                int v9 = arr_b[v1];
                int v10 = arr_b[v1 + 1];
                arr_b2[v2] = arr_b1[(v9 & 0xFF) >> 2];
                arr_b2[v2 + 1] = arr_b1[(v9 & 3) << 4 | (v10 & 0xFF) >> 4];
                arr_b2[v2 + 2] = arr_b1[(v10 & 15) << 2];
                arr_b2[v2 + 3] = 61;
                return new String(arr_b2, Vb.a.a);
            }
            default: {
                return new String(arr_b2, Vb.a.a);
            }
        }
    }
}

