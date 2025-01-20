package a3;

import Ab.t;
import Eb.a;
import Fb.c;
import N4.j;
import R9.F2;
import Xb.J;
import Xb.k;
import Xb.o0;
import hc.f;
import i3.m;
import kotlin.coroutines.g;

public final class e implements i {
    public final p a;
    public final m b;
    public final hc.i c;
    public final l d;

    public e(p p0, m m0, hc.i i0, l l0) {
        this.a = p0;
        this.b = m0;
        this.c = i0;
        this.d = l0;
    }

    @Override  // a3.i
    public final Object a(g g0) {
        Object object5;
        Throwable throwable2;
        f f0;
        Object object4;
        e e0;
        hc.i i0;
        d d0;
        if(g0 instanceof d) {
            d0 = (d)g0;
            int v = d0.f0;
            if((v & 0x80000000) == 0) {
                d0 = new d(this, ((c)g0));
            }
            else {
                d0.f0 = v ^ 0x80000000;
            }
        }
        else {
            d0 = new d(this, ((c)g0));
        }
        Object object0 = d0.d0;
        Object object1 = a.X;
        switch(d0.f0) {
            case 0: {
                W5.f.b0(object0);
                d0.b0 = this;
                i0 = this.c;
                d0.c0 = i0;
                d0.f0 = 1;
                i0.getClass();
                do {
                    int v1 = hc.i.g.getAndDecrement(i0);
                    int v2 = i0.a;
                }
                while(v1 > v2);
                Object object2 = t.a;
                if(v1 <= 0) {
                    k k0 = J.l(j.w(d0));
                    try {
                        if(!i0.a(k0)) {
                            while(true) {
                                do {
                                    int v3 = hc.i.g.getAndDecrement(i0);
                                }
                                while(v3 > v2);
                                if(v3 > 0) {
                                    k0.k(object2, i0.b);
                                    break;
                                }
                                if(i0.a(k0)) {
                                    break;
                                }
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                        k0.E();
                        throw throwable0;
                    }
                    Object object3 = k0.u();
                    if(object3 != object1) {
                        object3 = object2;
                    }
                    if(object3 == object1) {
                        object2 = object3;
                    }
                }
                if(object2 == object1) {
                    return object1;
                }
                e0 = this;
                goto label_50;
            }
            case 1: {
                hc.i i1 = d0.c0;
                e0 = (e)d0.b0;
                W5.f.b0(object0);
                i0 = i1;
                try {
                label_50:
                    F2 f20 = new F2(12, e0);
                    d0.b0 = i0;
                    d0.c0 = null;
                    d0.f0 = 2;
                    o0 o00 = new o0(f20, null);
                    object4 = J.y(kotlin.coroutines.j.X, o00, d0);
                }
                catch(Throwable throwable1) {
                    f0 = i0;
                    throwable2 = throwable1;
                    break;
                }
                if(object4 == object1) {
                    return object1;
                }
                f0 = i0;
                object0 = object4;
                object5 = (a3.g)object0;
                goto label_73;
            }
            case 2: {
                f0 = (f)d0.b0;
                try {
                    W5.f.b0(object0);
                    object5 = (a3.g)object0;
                    goto label_73;
                }
                catch(Throwable throwable2) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((hc.i)f0).b();
        throw throwable2;
    label_73:
        ((hc.i)f0).b();
        return object5;
    }
}

