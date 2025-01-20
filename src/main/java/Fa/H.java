package Fa;

import Ab.t;
import R2.w;
import U.d;
import U.p;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class h implements Function2 {
    public final int X;
    public final e Y;
    public final Modifier Z;
    public final w b0;
    public final Function0 c0;
    public final Function2 d0;
    public final int e0;
    public final int f0;

    public h(int v, e e0, Modifier modifier0, w w0, Function0 function00, Function2 function20, int v1, int v2) {
        this.X = v;
        this.Y = e0;
        this.Z = modifier0;
        this.b0 = w0;
        this.c0 = function00;
        this.d0 = function20;
        this.e0 = v1;
        this.f0 = v2;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Integer)object1).getClass();
        m.f(this.X, this.Y, this.Z, this.b0, this.c0, this.d0, ((p)object0), d.O(this.e0 | 1), this.f0);
        return t.a;
    }
}

