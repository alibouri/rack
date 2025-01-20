package N;

import Ab.t;
import B.q0;
import Nb.k;
import U.d;
import U.p;
import androidx.compose.ui.Modifier;
import c0.b;
import kotlin.jvm.functions.Function2;

public final class a2 extends k implements Function2 {
    public final Modifier X;
    public final Function2 Y;
    public final b Z;
    public final b b0;
    public final b c0;
    public final b d0;
    public final boolean e0;
    public final float f0;
    public final q0 g0;
    public final int h0;

    public a2(Modifier modifier0, Function2 function20, b b0, b b1, b b2, b b3, boolean z, float f, q0 q00, int v) {
        this.X = modifier0;
        this.Y = function20;
        this.Z = b0;
        this.b0 = b1;
        this.c0 = b2;
        this.d0 = b3;
        this.e0 = z;
        this.f0 = f;
        this.g0 = q00;
        this.h0 = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Number)object1).intValue();
        c2.a(this.X, this.Y, this.Z, this.b0, this.c0, this.d0, this.e0, this.f0, this.g0, ((p)object0), d.O(this.h0 | 1));
        return t.a;
    }
}

