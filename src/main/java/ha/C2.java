package ha;

import Ab.t;
import B9.b;
import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Y8.R9;
import a5.w;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.backend.type.n2;
import com.sendwave.util.UNIT;
import com.wave.customer.terms.NewTermsAndConditionsActivity;
import com.wave.customer.terms.NewTermsAndConditionsParams;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.z1;

public final class c2 extends j implements Function2 {
    public PartnerOrg c0;
    public PartnerOrg d0;
    public int e0;
    public final S2 f0;

    public c2(S2 s20, g g0) {
        this.f0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((c2)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new c2(this.f0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        PartnerOrg partnerOrg4;
        PartnerOrg partnerOrg3;
        PartnerOrg partnerOrg2;
        PartnerOrg partnerOrg1;
        PartnerOrg partnerOrg0;
        Object object1 = a.X;
        Object object2 = t.a;
        switch(this.e0) {
            case 0: {
                f.b0(object0);
                S2 s20 = this.f0;
                b b0 = s20.p0.c();
                if(b0 != null) {
                    z1 z10 = w.X(b0).a;
                    String s = z10.a(Ja.g.c);
                    if(s == null) {
                        partnerOrg0 = null;
                    }
                    else {
                        PartnerOrg.B.getClass();
                        partnerOrg0 = n2.a(s);
                    }
                    if(partnerOrg0 == null) {
                        return object2;
                    }
                    String s1 = z10.a(Ja.g.b);
                    if(s1 == null) {
                        partnerOrg1 = null;
                    }
                    else {
                        PartnerOrg.B.getClass();
                        partnerOrg1 = n2.a(s1);
                    }
                    if(partnerOrg1 == null) {
                        return object2;
                    }
                    String s2 = z10.a(Ja.g.d);
                    if(s2 == null) {
                        partnerOrg2 = null;
                    }
                    else {
                        PartnerOrg.B.getClass();
                        partnerOrg2 = n2.a(s2);
                    }
                    if(!Nb.j.a(partnerOrg2, partnerOrg0)) {
                        this.c0 = partnerOrg0;
                        this.d0 = partnerOrg1;
                        this.e0 = 1;
                        object0 = s20.r0.e(this);
                        if(object0 == object1) {
                            return object1;
                        }
                        partnerOrg3 = partnerOrg0;
                        partnerOrg4 = partnerOrg1;
                        break;
                    }
                }
                return object2;
            }
            case 1: {
                partnerOrg4 = this.d0;
                partnerOrg3 = this.c0;
                f.b0(object0);
                break;
            }
            case 2: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        NewTermsAndConditionsParams newTermsAndConditionsParams0 = new NewTermsAndConditionsParams(partnerOrg4, partnerOrg3);
        this.c0 = null;
        this.d0 = null;
        this.e0 = 2;
        return ((d)object0).l(NewTermsAndConditionsActivity.class, newTermsAndConditionsParams0, UNIT.class, this) == object1 ? object1 : object2;
    }
}

