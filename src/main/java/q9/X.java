package q9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import a8.Q;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import o9.m0;

public final class x extends j implements Function2 {
    public int c0;
    public final Q d0;
    public final String e0;

    public x(Q q0, String s, g g0) {
        this.d0 = q0;
        this.e0 = s;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((x)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new x(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        Q q0 = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                q0.getClass();
                this.c0 = 1;
                if(Xb.Q.b(10000L, this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((m0)q0.Z).n(this.e0);
        return t.a;
    }
}

