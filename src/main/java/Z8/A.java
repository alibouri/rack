package z8;

import Y8.o;

public final class a {
    public final int[] a;
    public final int[] b;
    public final b c;
    public final b d;
    public final int e;
    public final int f;
    public final int g;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final a n;
    public static final a o;

    static {
        a.h = new a(4201, 0x1000, 1);
        a.i = new a(0x409, 0x400, 1);
        a a0 = new a(67, 0x40, 1);
        a.j = a0;
        a.k = new a(19, 16, 1);
        a.l = new a(285, 0x100, 0);
        a a1 = new a(301, 0x100, 1);
        a.m = a1;
        a.n = a1;
        a.o = a0;
    }

    public a(int v, int v1, int v2) {
        this.f = v;
        this.e = v1;
        this.g = v2;
        this.a = new int[v1];
        this.b = new int[v1];
        int v3 = 1;
        for(int v4 = 0; v4 < v1; ++v4) {
            this.a[v4] = v3;
            v3 <<= 1;
            v3 = v3 < v1 ? v3 << 1 : (v3 ^ v) & v1 - 1;
        }
        for(int v5 = 0; v5 < v1 - 1; ++v5) {
            this.b[this.a[v5]] = v5;
        }
        this.c = new b(this, new int[]{0});
        this.d = new b(this, new int[]{1});
    }

    public final b a(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException();
        }
        if(v1 == 0) {
            return this.c;
        }
        int[] arr_v = new int[v + 1];
        arr_v[0] = v1;
        return new b(this, arr_v);
    }

    public final int b(int v) {
        if(v == 0) {
            throw new ArithmeticException();
        }
        return this.a[this.e - this.b[v] - 1];
    }

    public final int c(int v, int v1) {
        return v == 0 || v1 == 0 ? 0 : this.a[(this.b[v] + this.b[v1]) % (this.e - 1)];
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("GF(0x");
        stringBuilder0.append(Integer.toHexString(this.f));
        stringBuilder0.append(',');
        return o.z(stringBuilder0, this.e, ')');
    }
}

