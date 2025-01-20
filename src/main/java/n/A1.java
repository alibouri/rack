package N;

import Ab.t;
import Nb.k;
import U.d;
import U.p;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final class a1 extends k implements Function2 {
    public final Modifier X;
    public final long Y;
    public final float Z;
    public final long b0;
    public final int c0;
    public final int d0;
    public final int e0;

    public a1(Modifier modifier0, long v, float f, long v1, int v2, int v3, int v4) {
        this.X = modifier0;
        this.Y = v;
        this.Z = f;
        this.b0 = v1;
        this.c0 = v2;
        this.d0 = v3;
        this.e0 = v4;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Number)object1).intValue();
        b1.b(this.X, this.Y, this.Z, this.b0, this.c0, ((p)object0), d.O(this.d0 | 1), this.e0);
        return t.a;
    }
}

