package k2;

import Ab.t;
import Fb.j;
import W5.f;
import android.os.Build;
import android.util.Log;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class t0 extends j implements Function2 {
    public Object c0;

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((t0)this.t(((q0)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new t0(2, g0);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
        g1.c0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        q0 q00 = (q0)this.c0;
        if(Build.ID != null && Log.isLoggable("Paging", 2)) {
            Nb.j.f(("Sent " + q00), "message");
            Log.v("Paging", "Sent " + q00, null);
        }
        return t.a;
    }
}

