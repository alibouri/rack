package v9;

import Ab.t;
import U.d;
import U.p;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import u9.j;

public final class b implements Function2 {
    public final int X;
    public final Modifier Y;
    public final j Z;
    public final Object b0;
    public final Function1 c0;
    public final Function1 d0;
    public final Function2 e0;
    public final c0.b f0;
    public final int g0;

    public b(Modifier modifier0, j j0, Object object0, Function1 function10, Function1 function11, Function2 function20, c0.b b0, int v, int v1) {
        this.X = v1;
        this.Y = modifier0;
        this.Z = j0;
        this.b0 = object0;
        this.c0 = function10;
        this.d0 = function11;
        this.e0 = function20;
        this.f0 = b0;
        this.g0 = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if(this.X != 0) {
            ((Integer)object1).getClass();
            h.a(this.Y, this.Z, this.b0, this.c0, this.d0, this.e0, this.f0, ((p)object0), d.O(this.g0 | 1));
            return t.a;
        }
        ((Integer)object1).getClass();
        h.a(this.Y, this.Z, this.b0, this.c0, this.d0, this.e0, this.f0, ((p)object0), d.O(this.g0 | 1));
        return t.a;
    }
}

