package r1;

import java.util.Arrays;

public final class g {
    public int[] a;
    public int[] b;
    public int c;
    public int[] d;
    public float[] e;
    public int f;
    public int[] g;
    public String[] h;
    public int i;
    public int[] j;
    public boolean[] k;
    public int l;

    public final void a(int v, float f) {
        int[] arr_v = this.d;
        if(this.f >= arr_v.length) {
            this.d = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.e = Arrays.copyOf(this.e, this.e.length * 2);
        }
        int v1 = this.f;
        this.d[v1] = v;
        this.f = v1 + 1;
        this.e[v1] = f;
    }

    public final void b(int v, int v1) {
        int[] arr_v = this.a;
        if(this.c >= arr_v.length) {
            this.a = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.b = Arrays.copyOf(this.b, this.b.length * 2);
        }
        int v2 = this.c;
        this.a[v2] = v;
        this.c = v2 + 1;
        this.b[v2] = v1;
    }

    public final void c(int v, String s) {
        int[] arr_v = this.g;
        if(this.i >= arr_v.length) {
            this.g = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.h = (String[])Arrays.copyOf(this.h, this.h.length * 2);
        }
        int v1 = this.i;
        this.g[v1] = v;
        this.i = v1 + 1;
        this.h[v1] = s;
    }

    public final void d(int v, boolean z) {
        int[] arr_v = this.j;
        if(this.l >= arr_v.length) {
            this.j = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.k = Arrays.copyOf(this.k, this.k.length * 2);
        }
        int v1 = this.l;
        this.j[v1] = v;
        this.l = v1 + 1;
        this.k[v1] = z;
    }
}

