package t;

import Nb.j;

public abstract class a {
    public static final int[] a;
    public static final long[] b;
    public static final Object[] c;

    static {
        a.a = new int[0];
        a.b = new long[0];
        a.c = new Object[0];
    }

    public static final int a(int v, int v1, int[] arr_v) {
        j.f(arr_v, "array");
        int v2 = v - 1;
        int v3 = 0;
        while(v3 <= v2) {
            int v4 = v3 + v2 >>> 1;
            int v5 = arr_v[v4];
            if(v5 < v1) {
                v3 = v4 + 1;
                continue;
            }
            if(v5 > v1) {
                v2 = v4 - 1;
                continue;
            }
            return v4;
        }
        return ~v3;
    }

    public static final int b(long[] arr_v, int v, long v1) {
        j.f(arr_v, "array");
        int v2 = v - 1;
        int v3 = 0;
        while(v3 <= v2) {
            int v4 = v3 + v2 >>> 1;
            int v5 = Long.compare(arr_v[v4], v1);
            if(v5 < 0) {
                v3 = v4 + 1;
                continue;
            }
            if(v5 > 0) {
                v2 = v4 - 1;
                continue;
            }
            return v4;
        }
        return ~v3;
    }

    public static final void c(String s) {
        j.f(s, "message");
        throw new IllegalArgumentException(s);
    }
}

