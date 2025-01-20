package q9;

import Ab.t;
import Fb.j;
import Ma.m;
import W5.f;
import Xb.G;
import java.util.ArrayList;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q2.v;

public final class d extends j implements Function2 {
    public final i c0;
    public final ArrayList d0;

    public d(i i0, ArrayList arrayList0, g g0) {
        this.c0 = i0;
        this.d0 = arrayList0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((d)this.t(((G)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new d(this.c0, this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        k k0 = this.c0.b0;
        k0.getClass();
        v v0 = k0.a;
        v0.b();
        m m0 = k0.c;
        x2.g g0 = m0.a();
        try {
            v0.c();
            try {
                g0.b();
                v0.q();
            }
            catch(Throwable throwable0) {
                v0.k();
                throw throwable0;
            }
            v0.k();
        }
        finally {
            m0.c(g0);
        }
        ArrayList arrayList0 = this.d0;
        if(arrayList0 != null) {
            for(Object object1: arrayList0) {
                q9.j j0 = (q9.j)object1;
                Nb.j.f(j0, "agentLocation");
                v0.b();
                v0.c();
                try {
                    k0.b.f(j0);
                    v0.q();
                }
                catch(Throwable throwable1) {
                    v0.k();
                    throw throwable1;
                }
                v0.k();
            }
        }
        return t.a;
    }
}

