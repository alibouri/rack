package B;

import Ab.t;
import Nb.k;
import U.d;
import U.p;
import androidx.compose.ui.Modifier;
import c0.b;
import g0.c;
import kotlin.jvm.functions.Function2;

public final class x extends k implements Function2 {
    public final Modifier X;
    public final c Y;
    public final boolean Z;
    public final b b0;
    public final int c0;
    public final int d0;

    public x(Modifier modifier0, c c0, boolean z, b b0, int v, int v1) {
        this.X = modifier0;
        this.Y = c0;
        this.Z = z;
        this.b0 = b0;
        this.c0 = v;
        this.d0 = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Number)object1).intValue();
        e.a(this.X, this.Y, this.Z, this.b0, ((p)object0), d.O(this.c0 | 1), this.d0);
        return t.a;
    }
}

