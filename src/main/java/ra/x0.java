package ra;

import Ab.t;
import Bb.F;
import E9.b;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import ac.o0;
import com.sendwave.backend.type.PaymentCardState;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import o9.U0;

public final class x0 extends j implements Function2 {
    public c0 c0;
    public int d0;
    public final L0 e0;

    public x0(L0 l00, g g0) {
        this.e0 = l00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((x0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new x0(this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        String s;
        c0 c00;
        Object object1 = a.X;
        Object object2 = t.a;
        L0 l00 = this.e0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                Na.f f0 = ((t0)l00.e0).e();
                this.d0 = 1;
                object0 = o0.v(f0, this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_12;
            }
            case 1: {
                f.b0(object0);
            label_12:
                if(((c0)object0) == null) {
                    return object2;
                }
                U0 u00 = l00.f0.a();
                this.c0 = (c0)object0;
                this.d0 = 2;
                Object object3 = o0.v(u00, this);
                if(object3 == object1) {
                    return object1;
                }
                c00 = (c0)object0;
                object0 = object3;
                break;
            }
            case 2: {
                c00 = this.c0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((O0)object0) == null) {
            return object2;
        }
        b b0 = l00.b0;
        PaymentCardState paymentCardState0 = c00.g;
        Nb.j.f(b0, "<this>");
        if(paymentCardState0 == null) {
            s = "null";
        }
        else {
            s = paymentCardState0.a();
            if(s == null) {
                s = "null";
            }
        }
        b0.d("view virtual card screen", F.Q(com.apollographql.apollo.api.b.t("card state", s), a.a.s(((O0)object0))));
        return object2;
    }
}

