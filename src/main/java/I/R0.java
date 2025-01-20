package I;

import Ab.t;
import Eb.a;
import Fb.i;
import W5.f;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import v1.r;
import y.v1;
import z0.m;
import z0.n;
import z0.x;

public final class r0 extends i implements Function2 {
    public n Z;
    public int b0;
    public Object c0;
    public final v0 d0;

    public r0(v0 v00, g g0) {
        this.d0 = v00;
        super(g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((r0)this.t(((x)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new r0(this.d0, g0);
        g1.c0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        n n0;
        x x1;
        x x0;
        Object object1 = a.X;
        v0 v00 = this.d0;
        switch(this.b0) {
            case 0: {
                f.b0(object0);
                x0 = (x)this.c0;
                this.c0 = x0;
                this.b0 = 1;
                object0 = v1.c(x0, this, 2);
                if(object0 == object1) {
                    return object1;
                }
                v00.d();
                x1 = x0;
                n0 = (n)object0;
                goto label_28;
            }
            case 1: {
                x0 = (x)this.c0;
                f.b0(object0);
                v00.d();
                x1 = x0;
                n0 = (n)object0;
                goto label_28;
            }
            case 2: {
                n0 = this.Z;
                x1 = (x)this.c0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            Object object2 = ((z0.f)object0).a;
            int v = ((List)object2).size();
            int v1 = 0;
            while(true) {
                if(v1 >= v) {
                    break alab1;
                }
                n n1 = (n)((List)object2).get(v1);
                if(!m.a(n1.a, n0.a) || !n1.d) {
                    ++v1;
                    continue;
                }
            label_28:
                this.c0 = x1;
                this.Z = n0;
                this.b0 = 2;
                object0 = r.a(x1, this);
                if(object0 != object1) {
                    break;
                }
                return object1;
            }
        }
        v00.b();
        return t.a;
    }
}

