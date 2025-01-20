package U;

import Ab.t;
import B.L0;
import E7.w;
import Eb.a;
import Fb.j;
import W5.f;
import X.b;
import Xb.G;
import Xb.H;
import Xb.J;
import Z.c;
import ac.B0;
import e0.q;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class p0 extends j implements Function2 {
    public w c0;
    public int d0;
    public Object e0;
    public final s0 f0;
    public final r0 g0;
    public final T h0;

    public p0(s0 s00, r0 r00, T t0, g g0) {
        this.f0 = s00;
        this.g0 = r00;
        this.h0 = t0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((p0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new p0(this.f0, this.g0, this.h0, g0);
        g1.e0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        List list0;
        w w1;
        Throwable throwable1;
        Xb.r0 r01;
        Object object1 = a.X;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                Xb.r0 r00 = J.k(((G)this.e0).getCoroutineContext());
                s0.u(this.f0, r00);
                w w0 = q.f(new L0(13, this.f0));
                Z z0 = this.f0.u;
                do {
                    B0 b00 = s0.v;
                    b b0 = (b)b00.getValue();
                    a0.b b1 = (a0.b)b0;
                    c c0 = b1.Z;
                    if(!c0.containsKey(z0)) {
                        b0.b b2 = b0.b.a;
                        if(b1.isEmpty()) {
                            b1 = new a0.b(z0, z0, c0.a(z0, new a0.a(b2, b2)));
                        }
                        else {
                            Object object2 = c0.get(b1.Y);
                            Nb.j.c(object2);
                            a0.a a0 = new a0.a(((a0.a)object2).a, z0);
                            c c1 = c0.a(b1.Y, a0).a(z0, new a0.a(b1.Y, b2));
                            b1 = new a0.b(b1.X, z0, c1);
                        }
                    }
                }
                while(b0 != b1 && !b00.j(b0, b1));
                try {
                    synchronized(this.f0.b) {
                        list0 = this.f0.A();
                    }
                    int v1 = list0.size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        ((s)list0.get(v2)).q();
                    }
                    o0 o00 = new o0(this.g0, this.h0, null);
                    this.e0 = r00;
                    this.c0 = w0;
                    this.d0 = 1;
                    if(H.c(o00, this) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    r01 = r00;
                    throwable1 = throwable0;
                    w1 = w0;
                    goto label_55;
                }
                r01 = r00;
                w1 = w0;
                break;
            }
            case 1: {
                w1 = this.c0;
                r01 = (Xb.r0)this.e0;
                try {
                    f.b0(object0);
                    break;
                }
                catch(Throwable throwable1) {
                }
            label_55:
                w1.f();
                s0 s00 = this.f0;
                synchronized(s00.b) {
                    if(s00.c == r01) {
                        s00.c = null;
                    }
                    s00.x();
                }
                Z.b(this.f0.u);
                throw throwable1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        w1.f();
        s0 s01 = this.f0;
        synchronized(s01.b) {
            if(s01.c == r01) {
                s01.c = null;
            }
            s01.x();
        }
        Z.b(this.f0.u);
        return t.a;
    }
}

