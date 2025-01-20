package Z2;

import Ab.t;
import B3.c;
import Eb.a;
import W5.f;
import Y2.m;
import android.graphics.drawable.Drawable;
import i3.d;
import i3.e;
import i3.h;
import i3.i;
import i3.p;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class j extends Fb.j implements Function2 {
    public int c0;
    public Object d0;
    public final n e0;

    public j(n n0, g g0) {
        this.e0 = n0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((j)this.t(((i)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new j(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        n n1;
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                i i0 = (i)this.d0;
                n n0 = this.e0;
                m m0 = (m)n0.r0.getValue();
                h h0 = i.a(i0);
                h0.d = new Q9.a(n0);
                h0.b();
                d d0 = i0.C;
                if(d0.a == null) {
                    h0.r = new c(20, n0);
                    h0.b();
                }
                if(d0.b == null) {
                    D0.j j0 = n0.m0;
                    h0.s = Nb.j.a(j0, D0.i.a) || Nb.j.a(j0, D0.i.c) ? j3.g.Y : j3.g.X;
                }
                if(d0.c != j3.d.X) {
                    h0.f = j3.d.Y;
                }
                i i1 = h0.a();
                this.d0 = n0;
                this.c0 = 1;
                object0 = m0.c(i1, this);
                if(object0 == object1) {
                    return object1;
                }
                n1 = n0;
                break;
            }
            case 1: {
                n1 = (n)this.d0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        n1.getClass();
        if(((i3.j)object0) instanceof p) {
            return new Z2.h(n1.j(((p)(((i3.j)object0))).a), ((p)(((i3.j)object0))));
        }
        if(!(((i3.j)object0) instanceof e)) {
            throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
        }
        Drawable drawable0 = ((e)(((i3.j)object0))).a;
        return drawable0 == null ? new Z2.f(null, ((e)(((i3.j)object0)))) : new Z2.f(n1.j(drawable0), ((e)(((i3.j)object0))));
    }
}

