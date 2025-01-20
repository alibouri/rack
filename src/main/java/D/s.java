package D;

import java.util.List;

public final class s {
    public final int a;
    public final r[] b;
    public final t c;
    public final Object d;
    public final int e;
    public final int f;
    public final int g;

    public s(int v, r[] arr_r, t t0, List list0, int v1) {
        this.a = v;
        this.b = arr_r;
        this.c = t0;
        this.d = list0;
        this.e = v1;
        int v2 = 0;
        int v4 = 0;
        for(int v3 = 0; v3 < arr_r.length; ++v3) {
            v4 = Math.max(v4, arr_r[v3].o);
        }
        this.f = v4;
        int v5 = v4 + this.e;
        if(v5 >= 0) {
            v2 = v5;
        }
        this.g = v2;
    }

    public final r[] a(int v, int v1, int v2) {
        r[] arr_r = this.b;
        int v3 = 0;
        int v5 = 0;
        for(int v4 = 0; v3 < arr_r.length; ++v4) {
            r r0 = arr_r[v3];
            int v6 = (int)((b)((List)this.d).get(v4)).a;
            r0.a(v, this.c.b[v5], v1, v2, this.a, v5);
            v5 += v6;
            ++v3;
        }
        return arr_r;
    }
}

