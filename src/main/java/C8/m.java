package c8;

import Ab.t;
import Fb.j;
import W1.b;
import W1.e;
import W5.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class m extends j implements Function2 {
    public Object c0;
    public final Object d0;
    public final e e0;
    public final n f0;

    public m(Object object0, e e0, n n0, g g0) {
        this.d0 = object0;
        this.e0 = e0;
        this.f0 = n0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((m)this.t(((b)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new m(this.d0, this.e0, this.f0, g0);
        g1.c0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        b b0 = (b)this.c0;
        e e0 = this.e0;
        Object object1 = this.d0;
        if(object1 == null) {
            b0.getClass();
            Nb.j.f(e0, "key");
            if(b0.b.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            b0.a.remove(e0);
        }
        else {
            b0.getClass();
            Nb.j.f(e0, "key");
            b0.b(e0, object1);
        }
        n.a(this.f0, b0);
        return t.a;
    }
}

