package N;

import Ab.t;
import Nb.k;
import U.d;
import U.p;
import c0.b;
import kotlin.jvm.functions.Function2;

public final class f2 extends k implements Function2 {
    public final h2 X;
    public final N0 Y;
    public final long Z;
    public final long b0;
    public final X1 c0;
    public final boolean d0;
    public final b e0;
    public final int f0;

    public f2(h2 h20, N0 n00, long v, long v1, X1 x10, boolean z, b b0, int v2) {
        this.X = h20;
        this.Y = n00;
        this.Z = v;
        this.b0 = v1;
        this.c0 = x10;
        this.d0 = z;
        this.e0 = b0;
        this.f0 = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.X.a(this.Y, this.Z, this.b0, this.c0, this.d0, this.e0, ((p)object0), d.O(this.f0 | 1));
        return t.a;
    }
}

