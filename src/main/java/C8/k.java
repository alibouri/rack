package c8;

import Ab.t;
import Bb.F;
import Eb.a;
import Fb.j;
import W1.b;
import W5.f;
import Xb.G;
import ac.h;
import ac.o0;
import java.util.Collections;
import java.util.Map;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class k extends j implements Function2 {
    public n c0;
    public int d0;
    public final n e0;

    public k(n n0, g g0) {
        this.e0 = n0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((k)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new k(this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        n n1;
        Object object1 = a.X;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                n n0 = this.e0;
                h h0 = n0.a.b();
                this.c0 = n0;
                this.d0 = 1;
                Object object2 = o0.s(h0, this);
                if(object2 == object1) {
                    return object1;
                }
                n1 = n0;
                object0 = object2;
                break;
            }
            case 1: {
                n1 = this.c0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Map map0 = Collections.unmodifiableMap(((b)object0).a);
        Nb.j.e(map0, "unmodifiableMap(preferencesMap)");
        n.a(n1, new b(F.a0(map0), true));
        return t.a;
    }
}

