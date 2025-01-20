package ha;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.R9;
import Y8.m2;
import ac.o0;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import com.sendwave.backend.type.PartnerOrg;
import com.wave.customer.receipts.ReceiptActivity;
import com.wave.customer.receipts.ReceiptParams;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class j1 extends j implements Function2 {
    public w c0;
    public Class d0;
    public String e0;
    public PartnerOrg f0;
    public m2 g0;
    public int h0;
    public int i0;
    public final S2 j0;
    public final String k0;

    public j1(S2 s20, String s, g g0) {
        this.j0 = s20;
        this.k0 = s;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((j1)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new j1(this.j0, this.k0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        w w0;
        Class class0;
        String s;
        PartnerOrg partnerOrg0;
        m2 m20;
        int v;
        w w1;
        Class class1;
        String s1;
        PartnerOrg partnerOrg1;
        int v1;
        PartnerOrg partnerOrg2;
        String s2;
        Object object1 = a.X;
        S2 s20 = this.j0;
        switch(this.i0) {
            case 0: {
                f.b0(object0);
                this.i0 = 1;
                object0 = s20.r0.e(this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            case 2: {
                s2 = this.e0;
                class1 = this.d0;
                w1 = this.c0;
                f.b0(object0);
                goto label_50;
            }
            case 3: {
                partnerOrg2 = this.f0;
                s1 = this.e0;
                class1 = this.d0;
                w1 = this.c0;
                f.b0(object0);
                goto label_61;
            }
            case 4: {
                v1 = this.h0;
                partnerOrg1 = this.f0;
                s1 = this.e0;
                class1 = this.d0;
                w1 = this.c0;
                f.b0(object0);
                goto label_74;
            }
            case 5: {
                v = this.h0;
                m20 = this.g0;
                partnerOrg0 = this.f0;
                s = this.e0;
                class0 = this.d0;
                w0 = this.c0;
                f.b0(object0);
                w0.V(class0, new ReceiptParams(s, partnerOrg0, v, m20.a(((CustomerHomeFragment)((m2)object0).a).k)));
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        s2 = this.k0;
        Nb.j.f(s2, "id");
        this.c0 = (w)object0;
        Class class2 = ReceiptActivity.class;
        this.d0 = class2;
        this.e0 = s2;
        this.i0 = 2;
        Object object2 = o0.s(s20.G0, this);
        if(object2 == object1) {
            return object1;
        }
        w1 = (w)object0;
        object0 = object2;
        class1 = class2;
    label_50:
        this.c0 = w1;
        this.d0 = class1;
        this.e0 = s2;
        this.f0 = (PartnerOrg)object0;
        this.i0 = 3;
        Object object3 = o0.s(s20.M0, this);
        if(object3 == object1) {
            return object1;
        }
        partnerOrg2 = (PartnerOrg)object0;
        object0 = object3;
        s1 = s2;
    label_61:
        int v2 = ((Number)object0).intValue();
        this.c0 = w1;
        this.d0 = class1;
        this.e0 = s1;
        this.f0 = partnerOrg2;
        this.h0 = v2;
        this.i0 = 4;
        Object object4 = o0.s(s20.s0, this);
        if(object4 == object1) {
            return object1;
        }
        v1 = v2;
        object0 = object4;
        partnerOrg1 = partnerOrg2;
    label_74:
        this.c0 = w1;
        this.d0 = class1;
        this.e0 = s1;
        this.f0 = partnerOrg1;
        this.g0 = (m2)object0;
        this.h0 = v1;
        this.i0 = 5;
        Object object5 = o0.s(s20.s0, this);
        if(object5 == object1) {
            return object1;
        }
        v = v1;
        m20 = (m2)object0;
        object0 = object5;
        partnerOrg0 = partnerOrg1;
        s = s1;
        class0 = class1;
        w0 = w1;
        w0.V(class0, new ReceiptParams(s, partnerOrg0, v, m20.a(((CustomerHomeFragment)((m2)object0).a).k)));
        return t.a;
    }
}

