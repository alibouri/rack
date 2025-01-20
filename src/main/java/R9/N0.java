package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import R2.m;
import W5.f;
import Y8.m2;
import android.net.Uri;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import com.sendwave.backend.fragment.ReferralFragment;
import com.wave.customer.CustomerApp;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class n0 extends j implements Function2 {
    public int c0;
    public final m d0;

    public n0(m m0, g g0) {
        this.d0 = m0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((n0)this.t(((Uri)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new n0(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        m m0 = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                object0 = m0.j(this);
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
        ReferralFragment referralFragment0 = ((CustomerHomeFragment)((m2)object0).a).h.b.e.b;
        return w2.c(((CustomerApp)m0.X), referralFragment0.c, referralFragment0.b);
    }
}

