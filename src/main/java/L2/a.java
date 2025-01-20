package l2;

import Ab.t;
import Fb.j;
import W5.f;
import k2.h1;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class a extends j implements Function2 {
    public int c0;
    public Object d0;
    public final c e0;

    public a(c c0, g g0) {
        this.e0 = c0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((a)this.t(((h1)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new a(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = Eb.a.X;
        Object object2 = t.a;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                h1 h10 = (h1)this.d0;
                this.c0 = 1;
                this.e0.c.getClass();
                Ma.t t0 = new Ma.t(this.e0.c, h10, null, 6);
                Object object3 = this.e0.c.f.y(0, t0, this);
                if(object3 != object1) {
                    object3 = object2;
                }
                return object3 == object1 ? object1 : object2;
            }
            case 1: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

