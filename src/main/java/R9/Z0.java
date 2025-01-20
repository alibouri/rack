package R9;

import Ab.t;
import Fb.j;
import R2.m;
import W5.f;
import android.net.Uri;
import com.wave.customer.CustomerApp;
import com.wave.customer.risk.magiclinksecuritychallenge.MagicLinkSecurityChallengeContext.Authenticated;
import com.wave.customer.risk.magiclinksecuritychallenge.MagicLinkSecurityChallengeParams;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class z0 extends j implements Function2 {
    public final m c0;

    public z0(m m0, g g0) {
        this.c0 = m0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((z0)this.t(((Uri)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new z0(this.c0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        return new MagicLinkSecurityChallengeParams(new Authenticated(((CustomerApp)this.c0.X).d().i()));
    }
}

