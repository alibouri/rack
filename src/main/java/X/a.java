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

public final class a extends k implements Function2 {
    public final int X;
    public final n Y;
    public final Function0 Z;
    public final Modifier b0;
    public final k c0;
    public final int d0;

    public a(n n0, Function0 function00, Modifier modifier0, Function1 function10, int v, int v1) {
        this.X = v1;
        if(v1 != 1) {
            this.Y = n0;
            this.Z = function00;
            this.b0 = modifier0;
            this.c0 = (k)function10;
            this.d0 = v;
            super(2);
            return;
        }
        this.Y = n0;
        this.Z = function00;
        this.b0 = modifier0;
        this.c0 = (k)function10;
        this.d0 = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if(this.X != 0) {
            ((Number)object1).intValue();
            i.f(this.Y, this.Z, this.b0, ((Function1)this.c0), ((p)object0), d.O(this.d0 | 1));
            return t.a;
        }
        ((Number)object1).intValue();
        i.f(this.Y, this.Z, this.b0, ((Function1)this.c0), ((p)object0), d.O(this.d0 | 1));
        return t.a;
    }
}

