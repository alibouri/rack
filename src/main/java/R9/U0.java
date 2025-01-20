package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import R2.m;
import W5.f;
import Y8.m2;
import android.net.Uri;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import com.wave.customer.settings.SettingsParams;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class u0 extends j implements Function2 {
    public int c0;
    public final m d0;

    public u0(m m0, g g0) {
        this.d0 = m0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((u0)this.t(((Uri)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new u0(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                object0 = this.d0.j(this);
                return object0 == object1 ? object1 : new SettingsParams(((m2)object0).a(((CustomerHomeFragment)((m2)object0).a).h));
            }
            case 1: {
                f.b0(object0);
                return new SettingsParams(((m2)object0).a(((CustomerHomeFragment)((m2)object0).a).h));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

