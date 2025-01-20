package N;

import Ab.t;
import Nb.k;
import U.d;
import U.p;
import W4.f;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final class o0 extends k implements Function2 {
    public final Modifier X;
    public final long Y;
    public final float Z;
    public final float b0;
    public final int c0;
    public final int d0;

    public o0(Modifier modifier0, long v, float f, float f1, int v1, int v2) {
        this.X = modifier0;
        this.Y = v;
        this.Z = f;
        this.b0 = f1;
        this.c0 = v1;
        this.d0 = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Number)object1).intValue();
        f.h(this.X, this.Y, this.Z, this.b0, ((p)object0), d.O(this.c0 | 1), this.d0);
        return t.a;
    }
}

