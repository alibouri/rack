package J2;

import Ab.t;
import Fb.j;
import W5.f;
import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class n extends j implements Function2 {
    public boolean c0;
    public final Context d0;

    public n(Context context0, g g0) {
        this.d0 = context0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((n)this.t(((Boolean)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new n(this.d0, g0);
        g1.c0 = ((Boolean)object0).booleanValue();
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        S2.f.a(this.d0, RescheduleReceiver.class, this.c0);
        return t.a;
    }
}

