package w;

import A.k;
import A.l;
import A.m;
import A.n;
import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Xb.J;
import Xb.r0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import y.t0;

public final class d extends j implements Function2 {
    public boolean c0;
    public int d0;
    public Object e0;
    public final t0 f0;
    public final long g0;
    public final k h0;
    public final w.j i0;

    public d(t0 t00, long v, k k0, w.j j0, g g0) {
        this.f0 = t00;
        this.g0 = v;
        this.h0 = k0;
        this.i0 = j0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((d)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        d d0 = new d(this.f0, this.g0, this.h0, this.i0, g0);
        d0.e0 = object0;
        return d0;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        n n0;
        boolean z;
        Object object2;
        r0 r00;
        Object object1 = a.X;
        w.j j0 = this.i0;
        k k0 = this.h0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                r00 = J.q(((G)this.e0), null, null, new c(this.i0, this.g0, this.h0, null), 3);
                this.e0 = r00;
                this.d0 = 1;
                object2 = this.f0.b(this);
                if(object2 == object1) {
                    return object1;
                }
            label_24:
                boolean z1 = ((Boolean)object2).booleanValue();
                if(r00.b()) {
                    this.e0 = null;
                    this.c0 = z1;
                    this.d0 = 2;
                    if(J.g(r00, this) == object1) {
                        return object1;
                    }
                    z = z1;
                label_32:
                    if(z) {
                        m m0 = new m(this.g0);
                        n n1 = new n(m0);
                        this.e0 = n1;
                        this.d0 = 3;
                        if(k0.a(m0, this) == object1) {
                            return object1;
                        }
                        n0 = n1;
                    label_40:
                        this.e0 = null;
                        this.d0 = 4;
                        if(k0.a(n0, this) == object1) {
                            return object1;
                        }
                    }
                }
                else {
                    m m1 = j0.x0;
                    if(m1 != null) {
                        n n2 = z1 ? new n(m1) : new l(m1);
                        this.e0 = null;
                        this.d0 = 5;
                        if(k0.a(n2, this) == object1) {
                            return object1;
                        }
                    }
                }
                break;
            }
            case 1: {
                r00 = (r0)this.e0;
                f.b0(object0);
                object2 = object0;
                goto label_24;
            }
            case 2: {
                z = this.c0;
                f.b0(object0);
                goto label_32;
            }
            case 3: {
                n0 = (n)this.e0;
                f.b0(object0);
                goto label_40;
            }
            case 4: 
            case 5: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        j0.x0 = null;
        return t.a;
    }
}

