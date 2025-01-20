package s2;

import Ab.t;
import Eb.a;
import Fb.j;
import Ma.o;
import W5.f;
import Xb.G;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.t1;
import k2.u1;
import k2.x1;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q2.q;
import q2.v;
import q2.z;

public final class b extends j implements Function2 {
    public int c0;
    public final o d0;
    public final t1 e0;

    public b(o o0, t1 t10, g g0) {
        this.d0 = o0;
        this.e0 = t10;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((b)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new b(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1;
        try {
            object1 = a.X;
            switch(this.c0) {
                case 0: {
                    goto label_3;
                }
                case 1: {
                    goto label_24;
                }
                case 2: {
                    goto label_26;
                }
            }
        }
        catch(Exception exception0) {
            return new u1(exception0);
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_3:
        f.b0(object0);
        o o0 = this.d0;
        q q0 = o0.e;
        q0.getClass();
        v v0 = o0.c;
        Nb.j.f(v0, "db");
        if(((AtomicBoolean)q0.d).compareAndSet(false, true)) {
            v0.e.getClass();
            q q1 = new q(v0.e, q0);
            v0.e.a(q1);
        }
        int v1 = o0.d.get();
        t1 t10 = this.e0;
        try {
            if(v1 == -1) {
                this.c0 = 1;
                object0 = z.a(v0, new s2.a(o0, t10, null, 0), this);
                return object0 != object1 ? ((x1)object0) : object1;
            }
            this.c0 = 2;
            object0 = o.e(o0, t10, v1);
            if(object0 == object1) {
                return object1;
            label_24:
                f.b0(object0);
                return (x1)object0;
            label_26:
                f.b0(object0);
            }
            return (x1)object0;
        }
        catch(Exception exception0) {
            return new u1(exception0);
        }
    }
}

