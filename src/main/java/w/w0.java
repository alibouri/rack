package w;

import Ab.t;
import I2.J;
import M0.f;
import M0.j;
import M0.q;
import M0.s;
import Nb.k;
import Sb.a;
import Tb.e;
import kotlin.jvm.functions.Function1;

public final class w0 extends k implements Function1 {
    public final float X;
    public final a Y;
    public final int Z;

    public w0(float f, a a0, int v) {
        this.X = f;
        this.Y = a0;
        this.Z = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        e e0 = s.a[1];
        q.c.a(((j)object0), new f(((Number)J.u(((float)this.X), this.Y)).floatValue(), this.Y, this.Z));
        return t.a;
    }
}

