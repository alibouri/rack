package X9;

import Ab.t;
import Nb.j;
import kotlin.jvm.functions.Function1;
import p0.d;
import p0.h;

public final class a implements Function1 {
    public final long X;
    public final h Y;
    public final int Z;
    public final long b0;
    public final int c0;
    public final long d0;

    public a(long v, h h0, int v1, long v2, int v3, long v4) {
        this.X = v;
        this.Y = h0;
        this.Z = v1;
        this.b0 = v2;
        this.c0 = v3;
        this.d0 = v4;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        j.f(((d)object0), "$this$drawBehind");
        a.a.l(((d)object0), 0.0f, 360.0f, this.X, this.Y);
        a.a.l(((d)object0), -90.0f, ((float)this.Z) * 360.0f / 100.0f, this.b0, this.Y);
        a.a.l(((d)object0), -90.0f, ((float)this.c0) * 360.0f / 100.0f, this.d0, this.Y);
        return t.a;
    }
}

