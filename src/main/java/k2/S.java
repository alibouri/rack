package k2;

import Bb.p;
import Fb.j;
import W5.f;
import Xb.G;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class s extends j implements Function2 {
    public final t c0;
    public final boolean d0;
    public final boolean e0;

    public s(t t0, boolean z, boolean z1, g g0) {
        this.c0 = t0;
        this.d0 = z;
        this.e0 = z1;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((s)this.t(((G)object0), ((g)object1))).v(Ab.t.a);
        return Ab.t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new s(this.c0, this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        boolean z = this.e0;
        e1 e10 = this.c0.b0;
        if(!this.d0) {
            if(!z) {
                return Ab.t.a;
            }
            Nb.j.c(null);
            p.w0(((w1)p.w0(e10.X)).X);
            throw null;
        }
        Nb.j.c(null);
        p.p0(((w1)p.p0(e10.X)).X);
        throw null;
    }
}

