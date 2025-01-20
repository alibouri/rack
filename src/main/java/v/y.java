package v;

import Ab.t;
import M.Q;
import Nb.k;
import Nb.w;
import kotlin.jvm.functions.Function1;

public final class Y extends k implements Function1 {
    public final w X;
    public final Object Y;
    public final g Z;
    public final q b0;
    public final l c0;
    public final float d0;
    public final Function1 e0;

    public Y(w w0, Object object0, g g0, q q0, l l0, float f, Function1 function10) {
        this.X = w0;
        this.Y = object0;
        this.Z = g0;
        this.b0 = q0;
        this.c0 = l0;
        this.d0 = f;
        this.e0 = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        long v = ((Number)object0).longValue();
        o0 o00 = this.Z.e();
        Object object1 = this.Z.f();
        Q q0 = new Q(this.c0, 1);
        j j0 = new j(this.Y, o00, this.b0, v, object1, v, q0);
        b0.f(j0, v, this.d0, this.Z, this.c0, this.e0);
        this.X.X = j0;
        return t.a;
    }
}

