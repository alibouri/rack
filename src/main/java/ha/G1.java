package ha;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.R9;
import com.sendwave.backend.fragment.PayableWalletFragment;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class g1 extends j implements Function2 {
    public int c0;
    public Object d0;
    public final S2 e0;
    public final PayableWalletFragment f0;

    public g1(S2 s20, PayableWalletFragment payableWalletFragment0, g g0) {
        this.e0 = s20;
        this.f0 = payableWalletFragment0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((g1)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new g1(this.e0, this.f0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                R9 r90 = (R9)this.d0;
                this.c0 = 1;
                return this.e0.B(this.f0, this) == object1 ? object1 : t.a;
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

