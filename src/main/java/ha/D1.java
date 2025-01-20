package ha;

import Ab.t;
import B9.b;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.J;
import Y8.R9;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.util.Country;
import com.wave.accounts.AccountEvent.AccountAdded;
import com.wave.customer.CustomerApp;
import com.wave.customer.SignupSuccess;
import hb.A;
import hb.u;
import java.util.LinkedHashMap;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.o0;

public final class d1 extends j implements Function2 {
    public int c0;
    public final SignupSuccess d0;
    public final S2 e0;

    public d1(SignupSuccess signupSuccess0, S2 s20, g g0) {
        this.d0 = signupSuccess0;
        this.e0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((d1)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new d1(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        Object object2 = t.a;
        SignupSuccess signupSuccess0 = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                S2 s20 = this.e0;
                if(signupSuccess0 == null) {
                    LinkedHashMap linkedHashMap0 = s20.j0.a();
                    s20.j0.a.d("add account canceled", linkedHashMap0);
                    b b0 = s20.p0.c();
                    if(b0 != null) {
                        Country country0 = b0.d;
                        if(country0 != null) {
                            s20.q0.t(country0);
                        }
                    }
                    return object2;
                }
                c1 c10 = new c1(signupSuccess0, s20, null);
                CustomerHomeFragment customerHomeFragment0 = (CustomerHomeFragment)J.t(kotlin.coroutines.j.X, c10);
                N4.j.h(s20.q0.i(), customerHomeFragment0);
                Nb.j.c(customerHomeFragment0.d.c);
                s20.p0.d(signupSuccess0.Z, customerHomeFragment0, customerHomeFragment0.d.c, customerHomeFragment0.d.b, signupSuccess0.X, signupSuccess0.Y);
                CustomerApp customerApp0 = s20.q0;
                customerApp0.q().b();
                PartnerOrg partnerOrg0 = signupSuccess0.b0;
                if(partnerOrg0 != null) {
                    o0.P(customerApp0.a(), customerHomeFragment0.e.h.getId(), partnerOrg0);
                }
                this.c0 = 1;
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
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((w)object0).K(signupSuccess0.Z, AccountAdded.X, null);
        u u0 = (u)A.b.get("signup_login");
        if(u0 != null) {
            u0.b("landing", "settings");
        }
        return object2;
    }
}

