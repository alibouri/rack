package Y8;

import Ab.t;
import Eb.a;
import Fb.j;
import I.w;
import M3.b;
import N2.l;
import N3.H;
import N3.I;
import N3.M;
import N3.o;
import W5.f;
import ac.i;
import ac.o0;
import com.apollographql.apollo.api.Query;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class c6 extends j implements Function2 {
    public int c0;
    public Object d0;
    public final e6 e0;
    public final Query f0;
    public final H6 g0;
    public final H6 h0;
    public final String i0;
    public final Throwable j0;

    public c6(e6 e60, Query query0, H6 h60, H6 h61, String s, Throwable throwable0, g g0) {
        this.e0 = e60;
        this.f0 = query0;
        this.g0 = h60;
        this.h0 = h61;
        this.i0 = s;
        this.j0 = throwable0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((c6)this.t(((i)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        c6 c60 = new c6(this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, g0);
        c60.d0 = object0;
        return c60;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        i i1;
        Object object1 = a.X;
        String s = this.i0;
        Object object2 = t.a;
        e6 e60 = this.e0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                i i0 = (i)this.d0;
                e60.h.getClass();
                b b0 = new b(e60.h, this.f0);
                b0.addExecutionContext(new o(I.d(this.g0.X)));
                b0.addExecutionContext(new M(I.d(this.h0.X)));
                this.d0 = i0;
                this.c0 = 1;
                Object object3 = e60.k(b0, s, G6.X, this);
                if(object3 == object1) {
                    return object1;
                }
                i1 = i0;
                object0 = object3;
                break;
            }
            case 1: {
                i i2 = (i)this.d0;
                f.b0(object0);
                i1 = i2;
                break;
            }
            case 2: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Nb.j.f(((b)object0), "<this>");
        l l0 = new l(new H(((b)object0), null));
        this.d0 = null;
        this.c0 = 2;
        o0.r(i1);
        Object object4 = l0.d(new w(i1, this.j0, e60, s, 2), this);
        if(object4 != object1) {
            object4 = object2;
        }
        if(object4 != object1) {
            object4 = object2;
        }
        return object4 == object1 ? object1 : object2;
    }
}

