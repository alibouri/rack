package x8;

import r8.g;
import r8.i;

public final class d {
    public final g a;
    public byte[] b;
    public final int[] c;
    public b d;
    public static final byte[] e;

    static {
        d.e = new byte[0];
    }

    public d(g g0) {
        this.a = g0;
        this.b = d.e;
        this.c = new int[0x20];
    }

    public static int a(int[] arr_v) {
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v5 = arr_v[v1];
            if(v5 > v2) {
                v4 = v1;
                v2 = v5;
            }
            if(v5 > v3) {
                v3 = v5;
            }
        }
        int v6 = 0;
        int v7 = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            int v8 = arr_v[v] * (v - v4) * (v - v4);
            if(v8 > v7) {
                v6 = v;
                v7 = v8;
            }
        }
        if(v4 <= v6) {
            int v9 = v4;
            v4 = v6;
            v6 = v9;
        }
        if(v4 - v6 <= arr_v.length / 16) {
            throw i.Z;
        }
        int v10 = v4 - 1;
        int v11 = -1;
        int v12 = v10;
        while(v10 > v6) {
            int v13 = (v3 - arr_v[v10]) * ((v4 - v10) * ((v10 - v6) * (v10 - v6)));
            if(v13 > v11) {
                v12 = v10;
                v11 = v13;
            }
            --v10;
        }
        return v12 << 3;
    }
}

