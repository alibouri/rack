package v7;

import Q4.i;
import android.content.Context;
import h7.d;
import java.util.Set;
import java.util.concurrent.Executor;
import o6.k;
import x7.a;

public final class c implements e, f {
    public final d a;
    public final Context b;
    public final a c;
    public final Set d;
    public final Executor e;

    public c(Context context0, String s, Set set0, a a0, Executor executor0) {
        d d0 = new d(1, context0, s);
        super();
        this.a = d0;
        this.d = set0;
        this.e = executor0;
        this.c = a0;
        this.b = context0;
    }

    public final int a() {
        synchronized(this) {
            g g0 = (g)this.a.get();
            if(g0.i(System.currentTimeMillis())) {
                g0.g();
                return 3;
            }
            return 1;
        }
    }

    public final void b() {
        if(this.d.size() <= 0) {
            k.e(null);
            return;
        }
        if(!i.E(this.b)) {
            k.e(null);
            return;
        }
        b b0 = new b(this, 1);
        k.c(this.e, b0);
    }
}

