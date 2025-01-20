package q0;

import Ab.t;
import Nb.k;
import kotlin.jvm.functions.Function1;
import m5.b;
import n0.v;
import p0.d;

public final class a extends k implements Function1 {
    public final int X;
    public static final a Y;
    public static final a Z;

    static {
        a.Y = new a(1, 0);
        a.Z = new a(1, 1);
    }

    public a(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            b.l(((d)object0), v.h, 0L, 0L, 0.0f, 0x7E);
            return t.a;
        }
        d d0 = (d)object0;
        return t.a;
    }
}

