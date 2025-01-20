package R;

import Q.t;
import U.O0;
import U.Z;
import U.p;
import U.x;
import a1.d;
import n0.v;
import w.X;

public abstract class l0 {
    public static final O0 a;
    public static final x b;
    public static final m0 c;
    public static final m0 d;

    static {
        l0.a = new O0(k.h0);  // initializer: LU/j0;-><init>(Lkotlin/jvm/functions/Function0;)V
        l0.b = new x(Z.e, k.g0);
        l0.c = new m0(true, NaNf, v.i);
        l0.d = new m0(false, NaNf, v.i);
    }

    public static final X a(float f, p p0, int v, int v1) {
        X x0;
        boolean z = (v1 & 1) != 0;
        float f1 = (v1 & 2) == 0 ? f : NaNf;
        long v2 = v.i;
        p0.Q(-1280632857);
        if(((Boolean)p0.k(l0.a)).booleanValue()) {
            x0 = t.a(z, f1, v2, p0, v & 0x3FE);
        }
        else if(!d.a(f1, NaNf) || !v.c(v2, v2)) {
            x0 = new m0(z, f1, v2);
        }
        else if(z) {
            x0 = l0.c;
        }
        else {
            x0 = l0.d;
        }
        p0.p(false);
        return x0;
    }
}

