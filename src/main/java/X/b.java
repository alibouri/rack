package x;

import Ab.t;
import Nb.k;
import Q4.i;
import U.d;
import U.p;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class b extends k implements Function2 {
    public final n X;
    public final Function0 Y;
    public final k Z;
    public final Modifier b0;
    public final boolean c0;
    public final c0.b d0;
    public final int e0;
    public final int f0;

    public b(n n0, Function0 function00, Function1 function10, Modifier modifier0, boolean z, c0.b b0, int v, int v1) {
        this.X = n0;
        this.Y = function00;
        this.Z = (k)function10;
        this.b0 = modifier0;
        this.c0 = z;
        this.d0 = b0;
        this.e0 = v;
        this.f0 = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Number)object1).intValue();
        i.g(this.X, this.Y, ((Function1)this.Z), this.b0, this.c0, this.d0, ((p)object0), d.O(this.e0 | 1), this.f0);
        return t.a;
    }
}

