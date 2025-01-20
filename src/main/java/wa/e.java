package Wa;

import Ab.t;
import B.q0;
import J2.w;
import U.d;
import U.p;
import androidx.compose.ui.Modifier;
import c0.b;
import kotlin.jvm.functions.Function2;

public final class e implements Function2 {
    public final long X;
    public final Modifier Y;
    public final q0 Z;
    public final boolean b0;
    public final b c0;
    public final int d0;
    public final int e0;

    public e(long v, Modifier modifier0, q0 q00, boolean z, b b0, int v1, int v2) {
        this.X = v;
        this.Y = modifier0;
        this.Z = q00;
        this.b0 = z;
        this.c0 = b0;
        this.d0 = v1;
        this.e0 = v2;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Integer)object1).getClass();
        w.l(this.X, this.Y, this.Z, this.b0, this.c0, ((p)object0), d.O(this.d0 | 1), this.e0);
        return t.a;
    }
}

