package W9;

import Ab.t;
import U.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class b implements Function2 {
    public final String X;
    public final String Y;
    public final d Z;
    public final boolean b0;
    public final Function0 c0;
    public final Function0 d0;
    public final boolean e0;
    public final c0.b f0;
    public final c0.b g0;
    public final int h0;
    public final int i0;

    public b(String s, String s1, d d0, boolean z, Function0 function00, Function0 function01, boolean z1, c0.b b0, c0.b b1, int v, int v1) {
        this.X = s;
        this.Y = s1;
        this.Z = d0;
        this.b0 = z;
        this.c0 = function00;
        this.d0 = function01;
        this.e0 = z1;
        this.f0 = b0;
        this.g0 = b1;
        this.h0 = v;
        this.i0 = v1;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Integer)object1).getClass();
        yc.d.a(this.X, this.Y, this.Z, this.b0, this.c0, this.d0, this.e0, this.f0, this.g0, ((p)object0), U.d.O(this.h0 | 1), this.i0);
        return t.a;
    }
}

