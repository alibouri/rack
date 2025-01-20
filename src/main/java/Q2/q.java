package q2;

import Nb.j;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import pa.m;

public final class q extends o {
    public final int b;
    public final Object c;
    public final Object d;

    public q(r r0, o o0) {
        this.b = 0;
        j.f(r0, "tracker");
        j.f(o0, "delegate");
        super(o0.a);
        this.c = r0;
        this.d = new WeakReference(o0);
    }

    public q(String[] arr_s, m m0) {
        this.b = 1;
        super(arr_s);
        this.c = m0;
        this.d = new AtomicBoolean(false);
    }

    @Override  // q2.o
    public final void a(Set set0) {
        if(this.b != 0) {
            j.f(set0, "tables");
            ((m)this.c).invoke();
            return;
        }
        j.f(set0, "tables");
        o o0 = (o)((WeakReference)this.d).get();
        if(o0 == null) {
            ((r)this.c).c(this);
            return;
        }
        o0.a(set0);
    }
}

