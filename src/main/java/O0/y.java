package O0;

import Z0.g;
import Z0.p;
import Z0.q;
import a1.j;

public abstract class y {
    public static final long a;
    public static final int b;

    static {
        y.a = j.c;
    }

    public static final x a(x x0, int v, int v1, long v2, p p0, z z0, g g0, int v3, int v4, q q0) {
        long v9;
        int v5 = v;
        int v6 = v1;
        p p1 = p0;
        z z1 = z0;
        g g1 = g0;
        int v7 = v3;
        int v8 = v4;
        q q1 = q0;
        if(v != 0x80000000 && v != x0.a) {
            v9 = v2;
        }
        else if(Bb.q.H(v2)) {
            v9 = v2;
        label_16:
            if((p1 == null || p1.equals(x0.d)) && (v6 == 0x80000000 || v6 == x0.b) && (z1 == null || z1.equals(x0.e)) && (g1 == null || g1.equals(x0.f)) && (v7 == 0 || v7 == x0.g) && (v8 == 0x80000000 || v8 == x0.h) && (q1 == null || q1.equals(x0.i))) {
                return x0;
            }
        }
        else {
            v9 = v2;
            if(j.a(v9, x0.c)) {
                goto label_16;
            }
        }
        long v10 = Bb.q.H(v2) ? x0.c : v9;
        if(p1 == null) {
            p1 = x0.d;
        }
        if(v == 0x80000000) {
            v5 = x0.a;
        }
        if(v6 == 0x80000000) {
            v6 = x0.b;
        }
        z z2 = x0.e;
        if(z2 != null && z1 == null) {
            z1 = z2;
        }
        if(g1 == null) {
            g1 = x0.f;
        }
        if(v7 == 0) {
            v7 = x0.g;
        }
        if(v8 == 0x80000000) {
            v8 = x0.h;
        }
        if(q1 == null) {
            q1 = x0.i;
        }
        return new x(v5, v6, v10, p1, z1, g1, v7, v8, q1);
    }
}

