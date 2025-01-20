package o9;

import Ab.t;
import Eb.a;
import Fb.j;
import Ma.v;
import W5.f;
import Xb.G;
import Y8.N;
import Y8.R6;
import com.sendwave.backend.fragment.PayableWalletFragment;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class o1 extends j implements Function2 {
    public int c0;
    public final R6 d0;
    public final PayableWalletFragment e0;
    public final c f0;

    public o1(R6 r60, PayableWalletFragment payableWalletFragment0, c c0, g g0) {
        this.d0 = r60;
        this.e0 = payableWalletFragment0;
        this.f0 = c0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((o1)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new o1(this.d0, this.e0, this.f0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                v v0 = new v(this.d0, this.e0, this.f0, null, 6);
                this.c0 = 1;
                return N.o(v0, this) == object1 ? object1 : t.a;
            }
            case 1: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

