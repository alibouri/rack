package x;

import Ab.t;
import Fb.i;
import V2.a;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import y.v1;
import z0.n;
import z0.x;

public final class f extends i implements Function2 {
    public int Z;
    public Object b0;
    public final a c0;

    public f(a a0, g g0) {
        this.c0 = a0;
        super(g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((f)this.t(((x)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new f(this.c0, g0);
        g1.b0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        x x0;
        Object object1 = Eb.a.X;
        switch(this.Z) {
            case 0: {
                W5.f.b0(object0);
                x0 = (x)this.b0;
                this.b0 = x0;
                this.Z = 1;
                object0 = R2.f.o(x0, this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_12;
            }
            case 1: {
                x0 = (x)this.b0;
                W5.f.b0(object0);
            label_12:
                ((n)object0).a();
                l l0 = new l(((n)object0).c);
                ((x.n)this.c0.Y).a.setValue(l0);
                this.b0 = null;
                this.Z = 2;
                object0 = v1.e(x0, z0.g.Y, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                W5.f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((n)object0) != null) {
            ((n)object0).a();
        }
        return t.a;
    }
}

