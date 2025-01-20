package l2;

import Nb.j;
import U.H;
import U.Z;
import U.l;
import U.p;
import k2.c0;
import k2.d0;
import k2.f0;
import kotlin.jvm.functions.Function2;

public abstract class h {
    public static final f0 a;

    static {
        d0 d00 = new d0(false);  // initializer: Lk2/e0;-><init>(Z)V
        h.a = new f0(c0.b, d00, d00);
    }

    public static final c a(ac.h h0, p p0) {
        j.f(h0, "<this>");
        p0.R(0x172138FE);
        kotlin.coroutines.j j0 = kotlin.coroutines.j.X;
        p0.R(1046463091);
        boolean z = p0.f(h0);
        Object object0 = p0.G();
        Z z1 = l.a;
        if(z || object0 == z1) {
            object0 = new c(h0);
            p0.a0(object0);
        }
        p0.p(false);
        p0.R(0x3E5FC2C1);
        boolean z2 = p0.h(j0);
        boolean z3 = p0.h(((c)object0));
        Object object1 = p0.G();
        if((z2 | z3) != 0 || object1 == z1) {
            object1 = new e(j0, ((c)object0), null);
            p0.a0(object1);
        }
        p0.p(false);
        H.d(p0, ((c)object0), ((Function2)object1));
        p0.R(0x3E5FC3CE);
        boolean z4 = p0.h(j0);
        boolean z5 = p0.h(((c)object0));
        Object object2 = p0.G();
        if((z4 | z5) != 0 || object2 == z1) {
            object2 = new g(j0, ((c)object0), null);
            p0.a0(object2);
        }
        p0.p(false);
        H.d(p0, ((c)object0), ((Function2)object2));
        p0.p(false);
        return (c)object0;
    }
}

