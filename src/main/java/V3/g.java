package v3;

import Ab.t;
import Fb.j;
import W5.f;
import kotlin.jvm.functions.Function1;
import r3.a;

public final class g extends j implements Function1 {
    public final h c0;
    public final a d0;
    public final float e0;
    public final int f0;
    public final boolean g0;

    public g(h h0, a a0, float f, int v, boolean z, kotlin.coroutines.g g0) {
        this.c0 = h0;
        this.d0 = a0;
        this.e0 = f;
        this.f0 = v;
        this.g0 = z;
        super(1, g0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        new g(this.c0, this.d0, this.e0, this.f0, this.g0, ((kotlin.coroutines.g)object0)).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        h h0 = this.c0;
        h0.g0.setValue(this.d0);
        h0.h(this.e0);
        h0.g(this.f0);
        h0.X.setValue(Boolean.FALSE);
        if(this.g0) {
            h0.j0.setValue(0x8000000000000000L);
        }
        return t.a;
    }
}

