package R9;

import Aa.s;
import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.R9;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.o0;

public final class q3 extends j implements Function2 {
    public int c0;
    public final y3 d0;

    public q3(y3 y30, g g0) {
        this.d0 = y30;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((q3)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new q3(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                s s0 = new s(1, this.d0, y3.class, "onContactSupportClicked", "onContactSupportClicked(Lcom/sendwave/backend/SupportQuery$Data;)Lkotlinx/coroutines/Job;", 0, 15);
                this.c0 = 1;
                return o0.N(this.d0.g0, this.d0.c0, this.d0.Y, this.d0.j0.f, this.d0.d0, this.d0.e0, s0, this.d0.l0, this.d0.b0.X, null, null, this.d0.f0, this, 0x601) == object1 ? object1 : t.a;
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

