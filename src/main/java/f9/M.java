package f9;

import Ab.t;
import N4.h;
import Nb.j;
import kotlin.jvm.functions.Function1;
import m0.e;
import p0.d;

public final class m implements Function1 {
    public final long X;
    public final b Y;
    public final String Z;
    public final long b0;
    public final long c0;

    public m(long v, b b0, String s, long v1, long v2) {
        this.X = v;
        this.Y = b0;
        this.Z = s;
        this.b0 = v1;
        this.c0 = v2;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        j.f(((d)object0), "$this$Canvas");
        float f = e.b(((d)object0).d());
        h.i(((d)object0), 1.0f, this.X, f);
        b b0 = this.Y;
        float f1 = 0.0f;
        float f2 = j.a(b0.e, this.Z) ? ((float)b0.d) / 100.0f : 0.0f;
        float f3 = e.b(((d)object0).d());
        h.i(((d)object0), f2, this.b0, f3);
        if(j.a(b0.e, this.Z)) {
            f1 = ((float)b0.c) / 100.0f;
        }
        float f4 = e.b(((d)object0).d());
        h.i(((d)object0), f1, this.c0, f4);
        return t.a;
    }
}

