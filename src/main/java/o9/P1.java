package o9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.J;
import Y8.R6;
import com.sendwave.backend.fragment.PayableWalletFragment;
import com.sendwave.backend.type.ActionSource;
import d9.G3;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class p1 extends j implements Function2 {
    public int c0;
    public Object d0;
    public final R6 e0;
    public final PayableWalletFragment f0;
    public final c g0;
    public final ActionSource h0;
    public final String i0;
    public final G3 j0;
    public final G9.c k0;
    public final boolean l0;

    public p1(R6 r60, PayableWalletFragment payableWalletFragment0, c c0, ActionSource actionSource0, String s, G3 g30, G9.c c1, boolean z, g g0) {
        this.e0 = r60;
        this.f0 = payableWalletFragment0;
        this.g0 = c0;
        this.h0 = actionSource0;
        this.i0 = s;
        this.j0 = g30;
        this.k0 = c1;
        this.l0 = z;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((p1)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        p1 p10 = new p1(this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, g0);
        p10.d0 = object0;
        return p10;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                J.q(((G)this.d0), null, null, new o1(this.e0, this.f0, this.g0, null), 3);
                this.c0 = 1;
                object0 = s1.a(this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, this);
                return object0 == object1 ? object1 : object0;
            }
            case 1: {
                f.b0(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

