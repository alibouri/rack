package N;

import Q.h;
import Q.t;
import U.O0;
import U.Z;
import U.p;
import U.x;
import a1.d;
import n0.v;
import w.X;

public abstract class e1 {
    public static final O0 a;
    public static final x b;
    public static final f1 c;
    public static final f1 d;
    public static final h e;
    public static final h f;
    public static final h g;

    static {
        e1.a = new O0(S.g0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        e1.b = new x(Z.e, S.f0);
        e1.c = new f1(true, NaNf, v.i);
        e1.d = new f1(false, NaNf, v.i);
        e1.e = new h(0.16f, 0.24f, 0.08f, 0.24f);
        e1.f = new h(0.08f, 0.12f, 0.04f, 0.12f);
        e1.g = new h(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static final f1 a(boolean z, float f, long v) {
        if(d.a(f, NaNf) && v.c(v, v.i)) {
            return z ? e1.c : e1.d;
        }
        return new f1(z, f, v);
    }

    public static f1 b(int v, long v1) {
        if((v & 4) != 0) {
            v1 = v.i;
        }
        return e1.a((v & 1) != 0, NaNf, v1);
    }

    public static final X c(float f, p p0, int v, int v1) {
        boolean z = (v1 & 1) != 0;
        if((v1 & 2) != 0) {
            f = NaNf;
        }
        long v2 = v.i;
        if(((Boolean)p0.k(e1.a)).booleanValue()) {
            p0.Q(0x5BF221E);
            X x0 = t.a(z, f, v2, p0, v & 0x3FE);
            p0.p(false);
            return x0;
        }
        p0.Q(0x5C08587);
        p0.p(false);
        return e1.a(z, f, v2);
    }
}

