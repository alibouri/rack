package Z9;

import Ab.t;
import Nb.j;
import Q4.i;
import kotlin.jvm.functions.Function1;
import m0.e;

public final class d implements Function1 {
    public final long X;
    public final int Y;
    public final int Z;
    public final long b0;

    public d(int v, int v1, long v2, long v3) {
        this.X = v2;
        this.Y = v;
        this.Z = v1;
        this.b0 = v3;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        j.f(((p0.d)object0), "$this$Canvas");
        float f = e.b(((p0.d)object0).d());
        i.k(((p0.d)object0), 0.0f, 1.0f, this.X, f);
        float f1 = e.b(((p0.d)object0).d());
        i.k(((p0.d)object0), 0.0f, ((float)this.Y) / 100.0f, this.X, f1);
        float f2 = e.b(((p0.d)object0).d());
        i.k(((p0.d)object0), ((float)this.Z) / 100.0f, 1.0f, this.b0, f2);
        return t.a;
    }
}

