package ha;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Y8.R6;
import Y8.m2;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import com.wave.customer.SignupSuccess;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class c1 extends j implements Function2 {
    public int c0;
    public final S2 d0;
    public final SignupSuccess e0;

    public c1(SignupSuccess signupSuccess0, S2 s20, g g0) {
        this.d0 = s20;
        this.e0 = signupSuccess0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((c1)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new c1(this.e0, this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                R6 r60 = this.d0.q0.q();
                this.c0 = 1;
                object0 = r60.e(this.e0.Z, CustomerHomeFragment.class, this);
                return object0 == object1 ? object1 : ((m2)object0).a;
            }
            case 1: {
                f.b0(object0);
                return ((m2)object0).a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

