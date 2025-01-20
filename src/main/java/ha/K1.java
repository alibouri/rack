package ha;

import Ab.t;
import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Y8.N;
import Y8.R9;
import Y8.m2;
import ac.o0;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import com.sendwave.util.UNIT;
import com.wave.customer.paymentcards.PaymentCardsActivity;
import com.wave.customer.paymentcards.PaymentCardsParams;
import com.wave.customer.transactions.ui.TransactionsParams;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class k1 extends j implements Function2 {
    public Object c0;
    public FragmentHandle d0;
    public int e0;
    public Object f0;
    public final S2 g0;

    public k1(S2 s20, g g0) {
        this.g0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((k1)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new k1(this.g0, g0);
        g1.f0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        PaymentCardsParams paymentCardsParams1;
        FragmentHandle fragmentHandle3;
        R9 r93;
        FragmentHandle fragmentHandle1;
        String s;
        m2 m20;
        R9 r91;
        R9 r90;
        Object object1 = a.X;
        Object object2 = t.a;
        S2 s20 = this.g0;
        switch(this.e0) {
            case 0: {
                f.b0(object0);
                r90 = (R9)this.f0;
                this.f0 = r90;
                this.e0 = 1;
                object0 = N.f(s20.s0, r90.a, this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_16;
            }
            case 1: {
                r90 = (R9)this.f0;
                f.b0(object0);
            label_16:
                this.f0 = r90;
                this.c0 = (m2)object0;
                this.e0 = 2;
                Object object3 = o0.v(s20.F0, this);
                if(object3 == object1) {
                    return object1;
                }
                r91 = r90;
                m20 = (m2)object0;
                object0 = object3;
                goto label_30;
            }
            case 2: {
                m20 = (m2)this.c0;
                R9 r92 = (R9)this.f0;
                f.b0(object0);
                r91 = r92;
            label_30:
                if(((String)object0) == null) {
                    return object2;
                }
                FragmentHandle fragmentHandle0 = m20.a(((CustomerHomeFragment)m20.a).h.b.i);
                this.f0 = r91;
                this.c0 = (String)object0;
                this.d0 = fragmentHandle0;
                this.e0 = 3;
                Object object4 = S2.x(s20, r91, this);
                if(object4 == object1) {
                    return object1;
                }
                s = (String)object0;
                object0 = object4;
                fragmentHandle1 = fragmentHandle0;
                r93 = r91;
                goto label_52;
            }
            case 3: {
                FragmentHandle fragmentHandle2 = this.d0;
                String s1 = (String)this.c0;
                R9 r94 = (R9)this.f0;
                f.b0(object0);
                fragmentHandle1 = fragmentHandle2;
                r93 = r94;
                s = s1;
            label_52:
                this.f0 = s;
                this.c0 = fragmentHandle1;
                this.d0 = (FragmentHandle)object0;
                this.e0 = 4;
                Object object5 = S2.y(s20, r93, this);
                if(object5 == object1) {
                    return object1;
                }
                fragmentHandle3 = (FragmentHandle)object0;
                object0 = object5;
                goto label_66;
            }
            case 4: {
                fragmentHandle3 = this.d0;
                fragmentHandle1 = (FragmentHandle)this.c0;
                s = (String)this.f0;
                f.b0(object0);
            label_66:
                PaymentCardsParams paymentCardsParams0 = new PaymentCardsParams(s, fragmentHandle1, fragmentHandle3, ((TransactionsParams)object0));
                this.f0 = paymentCardsParams0;
                this.c0 = null;
                this.d0 = null;
                this.e0 = 5;
                object0 = s20.r0.e(this);
                if(object0 == object1) {
                    return object1;
                }
                paymentCardsParams1 = paymentCardsParams0;
                break;
            }
            case 5: {
                paymentCardsParams1 = (PaymentCardsParams)this.f0;
                f.b0(object0);
                break;
            }
            case 6: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.f0 = null;
        this.e0 = 6;
        return ((d)object0).l(PaymentCardsActivity.class, paymentCardsParams1, UNIT.class, this) == object1 ? object1 : object2;
    }
}

