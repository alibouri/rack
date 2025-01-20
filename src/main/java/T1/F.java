package T1;

import Ab.t;
import E7.B;
import Eb.a;
import Fb.j;
import N4.h;
import S2.d;
import h7.c;
import j6.w;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import l7.b;
import o6.k;
import o6.p;

public final class f extends j implements Function1 {
    public final int c0;
    public int d0;

    public f(int v, g g0, int v1) {
        this.c0 = v1;
        super(v, g0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.c0 != 0) {
            return new f(1, ((g)object0), 1).v(t.a);
        }
        new f(1, ((g)object0), 0).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        p p0;
        if(this.c0 != 0) {
            Object object1 = a.X;
            switch(this.d0) {
                case 0: {
                    W5.f.b0(object0);
                    c c0 = (c)Z6.g.c().b(c.class);
                    Nb.j.e(c0, "getInstance()");
                    l7.c c1 = c0.h;
                    if(c1 == null) {
                        p0 = k.d(new B("No AppCheckProvider installed."));
                    }
                    else {
                        d d0 = new d(c1, new w(26));
                        p p1 = k.c(c1.e, d0);
                        b b0 = new b(c1, 1);
                        p p2 = p1.m(c1.d, b0);
                        b b1 = new b(c1, 0);
                        p p3 = p2.m(c1.d, b1);
                        T9.b b2 = new T9.b(29);
                        p0 = p3.m(c1.d, b2);
                    }
                    this.d0 = 1;
                    object0 = h.k(p0, this);
                    return object0 == object1 ? object1 : object0;
                }
                case 1: {
                    W5.f.b0(object0);
                    return object0;
                }
                default: {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
            }
        }
        switch(this.d0) {
            case 0: {
                W5.f.b0(object0);
                this.d0 = 1;
                throw null;
            }
            case 1: {
                W5.f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

