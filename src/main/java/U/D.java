package u;

import Ab.t;
import Nb.k;
import U.p;
import androidx.compose.ui.Modifier;
import c0.b;
import g0.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class d extends k implements Function2 {
    public final Object X;
    public final Modifier Y;
    public final Function1 Z;
    public final c b0;
    public final String c0;
    public final Function1 d0;
    public final b e0;
    public final int f0;
    public final int g0;

    public d(Object object0, Modifier modifier0, Function1 function10, c c0, String s, Function1 function11, b b0, int v, int v1) {
        this.X = object0;
        this.Y = modifier0;
        this.Z = function10;
        this.b0 = c0;
        this.c0 = s;
        this.d0 = function11;
        this.e0 = b0;
        this.f0 = v;
        this.g0 = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Number)object1).intValue();
        M6.b.a(this.X, this.Y, this.Z, this.b0, this.c0, this.d0, this.e0, ((p)object0), U.d.O(this.f0 | 1), this.g0);
        return t.a;
    }
}

