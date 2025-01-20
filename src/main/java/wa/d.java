package Wa;

import Ab.t;
import I2.J;
import U.p;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class d implements Function2 {
    public final String X;
    public final boolean Y;
    public final int Z;
    public final Modifier b0;
    public final Function0 c0;
    public final int d0;
    public final int e0;

    public d(String s, boolean z, int v, Modifier modifier0, Function0 function00, int v1, int v2) {
        this.X = s;
        this.Y = z;
        this.Z = v;
        this.b0 = modifier0;
        this.c0 = function00;
        this.d0 = v1;
        this.e0 = v2;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Integer)object1).getClass();
        J.b(this.X, this.Y, this.Z, this.b0, this.c0, ((p)object0), U.d.O(this.d0 | 1), this.e0);
        return t.a;
    }
}

