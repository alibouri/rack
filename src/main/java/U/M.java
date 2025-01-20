package u;

import Ab.t;
import Nb.k;
import U.d;
import U.p;
import androidx.compose.animation.a;
import androidx.compose.ui.Modifier;
import c0.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import v.k0;

public final class m extends k implements Function2 {
    public final k0 X;
    public final Function1 Y;
    public final Modifier Z;
    public final C b0;
    public final D c0;
    public final Function2 d0;
    public final b e0;
    public final int f0;

    public m(k0 k00, Function1 function10, Modifier modifier0, C c0, D d0, Function2 function20, b b0, int v) {
        this.X = k00;
        this.Y = function10;
        this.Z = modifier0;
        this.b0 = c0;
        this.c0 = d0;
        this.d0 = function20;
        this.e0 = b0;
        this.f0 = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Number)object1).intValue();
        a.a(this.X, this.Y, this.Z, this.b0, this.c0, this.d0, this.e0, ((p)object0), d.O(this.f0 | 1));
        return t.a;
    }
}

