package e1;

import Ab.t;
import Nb.k;
import U.d;
import U.p;
import c0.b;
import g0.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class f extends k implements Function2 {
    public final c X;
    public final long Y;
    public final Function0 Z;
    public final x b0;
    public final b c0;
    public final int d0;

    public f(c c0, long v, Function0 function00, x x0, b b0, int v1) {
        this.X = c0;
        this.Y = v;
        this.Z = function00;
        this.b0 = x0;
        this.c0 = b0;
        this.d0 = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Number)object1).intValue();
        e1.k.b(this.X, this.Y, this.Z, this.b0, this.c0, ((p)object0), d.O(this.d0 | 1));
        return t.a;
    }
}

