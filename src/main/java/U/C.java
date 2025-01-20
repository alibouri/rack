package u;

import Nb.k;
import kotlin.jvm.functions.Function1;
import n0.M;
import n0.W;
import n0.v;
import o0.d;
import v.f0;
import v.n0;
import v.n;
import v.p;

public final class c extends k implements Function1 {
    public final int X;
    public static final c Y;
    public static final c Z;
    public static final c b0;
    public static final c c0;
    public static final c d0;
    public static final c e0;
    public static final c f0;
    public static final c g0;
    public static final c h0;

    static {
        c.Y = new c(1, 0);
        c.Z = new c(1, 1);
        c.b0 = new c(1, 2);
        c.c0 = new c(1, 3);
        c.d0 = new c(1, 4);
        c.e0 = new c(1, 5);
        c.f0 = new c(1, 6);
        c.g0 = new c(1, 7);
        c.h0 = new c(1, 8);
    }

    public c(int v, int v1) {
        this.X = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                u.k k0 = (u.k)object0;
                C c0 = x.a(v.c.j(220, 90, null, 4), 2);
                n0 n00 = v.c.j(220, 90, null, 4);
                return new r(c0.a(new C(new Q(null, null, null, new H(0.92f, W.b, n00), false, null, 55))), x.b(v.c.j(90, 0, null, 6), 2));
            }
            case 1: {
                return object0;
            }
            case 2: {
                ((Boolean)object0).booleanValue();
                return (Boolean)object0;
            }
            case 3: {
                long v = v.a(((v)object0).a, d.t);
                return new p(v.d(v), v.h(v), v.g(v), v.e(v));
            }
            case 4: {
                return object0;
            }
            case 5: {
                return new n(W.b(((W)object0).a), W.c(((W)object0).a));
            }
            case 6: {
                return new W(M.i(((n)object0).a, ((n)object0).b));
            }
            case 7: {
                f0 f01 = (f0)object0;
                return v.c.i(0.0f, 7, null);
            }
            default: {
                f0 f00 = (f0)object0;
                return x.c;
            }
        }
    }
}

