package ra;

import Ab.t;
import C.i;
import D0.X;
import Nb.j;
import T0.G;
import c0.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class s implements Function1 {
    public final N X;
    public final Function0 Y;
    public final Function0 Z;
    public final Function0 b0;
    public final Function0 c0;
    public final Function0 d0;
    public final Function0 e0;
    public final Function0 f0;
    public final Function1 g0;
    public final Function1 h0;
    public final Function1 i0;
    public final Function0 j0;

    public s(N n0, Function0 function00, Function0 function01, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function1 function10, Function1 function11, Function1 function12, Function0 function07) {
        this.X = n0;
        this.Y = function00;
        this.Z = function01;
        this.b0 = function02;
        this.c0 = function03;
        this.d0 = function04;
        this.e0 = function05;
        this.f0 = function06;
        this.g0 = function10;
        this.h0 = function11;
        this.i0 = function12;
        this.j0 = function07;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        j.f(((i)object0), "$this$LazyColumn");
        lb.j j0 = new lb.j(15);
        X x0 = new X(this.X.u);
        G g0 = new G(j0, 20, this.X.u);
        b b0 = new b(0xDA480CDF, new v(this.X.u, this.Y, this.Z, this.b0, this.c0, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0), true);
        ((i)object0).f(this.X.u.size(), x0, g0, b0);
        return t.a;
    }
}

