package B;

import Nb.j;
import U.l;
import U.p;
import W5.f;
import g0.b;

public abstract class v0 {
    public static final x0 a;

    static {
        v0.a = new x0(k.a, b.j);
    }

    public static final long a(int v, int v1, int v2, boolean z) {
        if(!z) {
            return f.b(v, v1, 0, v2);
        }
        int v3 = Math.min(v, 0x3FFFE);
        int v4 = 0x7FFFFFFF;
        int v5 = v1 == 0x7FFFFFFF ? 0x7FFFFFFF : Math.min(v1, 0x3FFFE);
        int v6 = f.j((v5 == 0x7FFFFFFF ? v3 : v5));
        if(v2 != 0x7FFFFFFF) {
            v4 = Math.min(v6, v2);
        }
        return f.b(v3, v5, Math.min(v6, 0), v4);
    }

    public static final x0 b(g g0, g0.f f0, p p0, int v) {
        if(j.a(g0, k.a) && j.a(f0, b.j)) {
            p0.Q(0xCD640ABB);
            p0.p(false);
            return v0.a;
        }
        p0.Q(-849030798);
        int v1 = 1;
        int v2 = ((v & 14 ^ 6) <= 4 || !p0.f(g0)) && (v & 6) != 4 ? 0 : 1;
        if(((v & 0x70 ^ 0x30) <= 0x20 || !p0.f(f0)) && (v & 0x30) != 0x20) {
            v1 = 0;
        }
        Object object0 = p0.G();
        if((v2 | v1) != 0 || object0 == l.a) {
            object0 = new x0(g0, f0);
            p0.a0(object0);
        }
        p0.p(false);
        return (x0)object0;
    }
}

