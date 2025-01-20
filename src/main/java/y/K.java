package y;

import Ab.t;
import N.v;
import kotlin.jvm.functions.Function1;
import m0.b;
import v1.r;
import w.p0;
import yc.d;

public final class k extends Nb.k implements Function1 {
    public final int X;
    public final n Y;
    public final s Z;

    public k(n n0, s s0, int v) {
        this.X = v;
        this.Y = n0;
        this.Z = s0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            n n0 = this.Y;
            p0 p00 = n0.y0;
            s s0 = this.Z;
            if(p00 == null) {
                v v0 = n0.v0;
                long v1 = ((L)object0).a;
                long v2 = n0.J0() ? b.j(-1.0f, v1) : b.j(1.0f, v1);
                r.b(s0, v0.j((n0.w0 == q0.X ? b.e(v2) : b.d(v2))));
                return t.a;
            }
            long v3 = ((L)object0).a;
            p00.e((n0.J0() ? b.j(-1.0f, v3) : b.j(1.0f, v3)), 1, new k(n0, s0, 0));
            return t.a;
        }
        long v4 = ((b)object0).a;
        float f = this.Y.v0.j((this.Y.w0 == q0.X ? b.e(v4) : b.d(v4)));
        float f1 = f - this.Y.v0.l();
        float f2 = this.Y.w0 == q0.Y ? f1 : 0.0f;
        if(this.Y.w0 != q0.X) {
            f1 = 0.0f;
        }
        r.b(this.Z, f);
        return new b(d.d(f2, f1));
    }
}

