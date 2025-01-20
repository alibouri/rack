package ha;

import Ab.t;
import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Y8.N;
import Y8.R9;
import Y8.m2;
import a9.D0;
import ac.o0;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import com.wave.customer.BuyAirtimeSelectActivity;
import com.wave.customer.BuyAirtimeSelectParams;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.r1;

public final class y0 extends j implements Function2 {
    public Object c0;
    public Object d0;
    public int e0;
    public Object f0;
    public final S2 g0;

    public y0(S2 s20, g g0) {
        this.g0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((y0)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new y0(this.g0, g0);
        g1.f0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        m2 m20;
        Class class1;
        w w0;
        R9 r91;
        D0 d00;
        R9 r90;
        Object object1 = a.X;
        S2 s20 = this.g0;
        switch(this.e0) {
            case 0: {
                f.b0(object0);
                r90 = (R9)this.f0;
                s20.i0.d("click airtime button", null);
                this.f0 = r90;
                this.e0 = 1;
                object0 = o0.v(s20.s0, this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_16;
            }
            case 1: {
                r90 = (R9)this.f0;
                f.b0(object0);
            label_16:
                if(((m2)object0) == null) {
                    d00 = null;
                }
                else {
                    CustomerHomeFragment customerHomeFragment0 = (CustomerHomeFragment)((m2)object0).a;
                    d00 = customerHomeFragment0 == null ? null : customerHomeFragment0.g.b.a;
                }
                if(d00 == null) {
                    this.f0 = null;
                    this.e0 = 2;
                    object0 = s20.r0.e(this);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_36;
                }
                else {
                    this.f0 = r90;
                    this.e0 = 4;
                    object0 = s20.r0.e(this);
                    if(object0 != object1) {
                        goto label_44;
                    }
                    return object1;
                }
                return t.a;
            }
            case 2: {
                f.b0(object0);
            label_36:
                String s = r1.d(0x7F1200C5, new Object[0]);  // string:coming_soon "Coming soon!"
                String s1 = r1.d(0x7F120075, new Object[0]);  // string:buy_airtime_coming_soon "Buying airtime on Orange, Free and Expresso coming 
                                                              // soon!"
                String s2 = r1.d(0x7F1202DC, new Object[0]);  // string:ok "OK"
                this.e0 = 3;
                return Pb.a.O(((d)object0), s, s1, s2, null, false, null, null, this, 504) == object1 ? object1 : t.a;
            }
            case 3: {
                f.b0(object0);
                return t.a;
            }
            case 4: {
                r90 = (R9)this.f0;
                f.b0(object0);
            label_44:
                r91 = r90;
                this.f0 = r91;
                this.c0 = (w)object0;
                Class class0 = BuyAirtimeSelectActivity.class;
                this.d0 = class0;
                this.e0 = 5;
                Object object2 = N.f(s20.s0, r91.a, this);
                if(object2 == object1) {
                    return object1;
                }
                w0 = (w)object0;
                object0 = object2;
                class1 = class0;
                goto label_61;
            }
            case 5: {
                class1 = (Class)this.d0;
                w0 = (w)this.c0;
                r91 = (R9)this.f0;
                f.b0(object0);
            label_61:
                this.f0 = w0;
                this.c0 = class1;
                this.d0 = (m2)object0;
                this.e0 = 6;
                Object object3 = N.f(s20.s0, r91.a, this);
                if(object3 == object1) {
                    return object1;
                }
                m20 = (m2)object0;
                object0 = object3;
                w0.V(class1, new BuyAirtimeSelectParams(m20.a(((CustomerHomeFragment)((m2)object0).a).g)));
                return t.a;
            }
            case 6: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        m20 = (m2)this.d0;
        class1 = (Class)this.c0;
        w0 = (w)this.f0;
        f.b0(object0);
        w0.V(class1, new BuyAirtimeSelectParams(m20.a(((CustomerHomeFragment)((m2)object0).a).g)));
        return t.a;
    }
}

