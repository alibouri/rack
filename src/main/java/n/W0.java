package N;

import Ab.t;
import Nb.k;
import U.d;
import U.p;
import androidx.compose.ui.Modifier;
import c0.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import n0.S;

public final class w0 extends k implements Function2 {
    public final Function3 X;
    public final Modifier Y;
    public final C0 Z;
    public final boolean b0;
    public final S c0;
    public final float d0;
    public final long e0;
    public final long f0;
    public final long g0;
    public final b h0;
    public final int i0;

    public w0(Function3 function30, Modifier modifier0, C0 c00, boolean z, S s0, float f, long v, long v1, long v2, b b0, int v3) {
        this.X = function30;
        this.Y = modifier0;
        this.Z = c00;
        this.b0 = z;
        this.c0 = s0;
        this.d0 = f;
        this.e0 = v;
        this.f0 = v1;
        this.g0 = v2;
        this.h0 = b0;
        this.i0 = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Number)object1).intValue();
        B0.a(this.X, this.Y, this.Z, this.b0, this.c0, this.d0, this.e0, this.f0, this.g0, this.h0, ((p)object0), d.O(this.i0 | 1));
        return t.a;
    }
}

