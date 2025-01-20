package P;

import Ab.t;
import Nb.k;
import U.d;
import U.p;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final class f extends k implements Function2 {
    public final boolean X;
    public final n Y;
    public final Modifier Z;
    public final long b0;
    public final long c0;
    public final boolean d0;
    public final int e0;
    public final int f0;

    public f(boolean z, n n0, Modifier modifier0, long v, long v1, boolean z1, int v2, int v3) {
        this.X = z;
        this.Y = n0;
        this.Z = modifier0;
        this.b0 = v;
        this.c0 = v1;
        this.d0 = z1;
        this.e0 = v2;
        this.f0 = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Number)object1).intValue();
        g.a(this.X, this.Y, this.Z, this.b0, this.c0, this.d0, ((p)object0), d.O(this.e0 | 1), this.f0);
        return t.a;
    }
}

