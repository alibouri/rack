package D;

import Ab.t;
import B.g;
import B.i;
import B.q0;
import Nb.k;
import R2.f;
import U.d;
import U.p;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import y.m0;

public final class e extends k implements Function2 {
    public final a X;
    public final Modifier Y;
    public final A Z;
    public final q0 b0;
    public final boolean c0;
    public final i d0;
    public final g e0;
    public final m0 f0;
    public final boolean g0;
    public final Function1 h0;
    public final int i0;

    public e(a a0, Modifier modifier0, A a1, q0 q00, boolean z, i i0, g g0, m0 m00, boolean z1, Function1 function10, int v) {
        this.X = a0;
        this.Y = modifier0;
        this.Z = a1;
        this.b0 = q00;
        this.c0 = z;
        this.d0 = i0;
        this.e0 = g0;
        this.f0 = m00;
        this.g0 = z1;
        this.h0 = function10;
        this.i0 = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Number)object1).intValue();
        f.g(this.X, this.Y, this.Z, this.b0, this.c0, this.d0, this.e0, this.f0, this.g0, this.h0, ((p)object0), d.O(this.i0 | 1));
        return t.a;
    }
}

