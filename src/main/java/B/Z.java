package B;

import Nb.j;
import U.l;
import U.p;
import W5.f;
import g0.b;
import g0.e;

public abstract class z {
    public static final B a;

    static {
        z.a = new B(k.c, b.m);
    }

    public static final B a(i i0, e e0, p p0, int v) {
        if(j.a(i0, k.c) && j.a(e0, b.m)) {
            p0.Q(0x149EF7E8);
            p0.p(false);
            return z.a;
        }
        p0.Q(0x149FCA3F);
        int v1 = 1;
        int v2 = ((v & 14 ^ 6) <= 4 || !p0.f(i0)) && (v & 6) != 4 ? 0 : 1;
        if(((v & 0x70 ^ 0x30) <= 0x20 || !p0.f(e0)) && (v & 0x30) != 0x20) {
            v1 = 0;
        }
        Object object0 = p0.G();
        if((v2 | v1) != 0 || object0 == l.a) {
            object0 = new B(i0, e0);
            p0.a0(object0);
        }
        p0.p(false);
        return (B)object0;
    }

    public static final long b(int v, int v1, int v2, boolean z) {
        if(!z) {
            return f.b(0, v2, v, v1);
        }
        int v3 = Math.min(v, 0x3FFFE);
        int v4 = 0x7FFFFFFF;
        int v5 = v1 == 0x7FFFFFFF ? 0x7FFFFFFF : Math.min(v1, 0x3FFFE);
        int v6 = f.j((v5 == 0x7FFFFFFF ? v3 : v5));
        if(v2 != 0x7FFFFFFF) {
            v4 = Math.min(v6, v2);
        }
        return f.b(Math.min(v6, 0), v4, v3, v5);
    }
}

