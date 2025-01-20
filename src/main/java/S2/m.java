package S2;

import Ab.t;
import Ea.r0;
import Eb.a;
import Fb.j;
import I2.A;
import I2.q;
import I2.u;
import I2.z;
import J2.J;
import J2.w;
import R2.p;
import W5.f;
import Xb.G;
import android.content.Context;
import f1.l;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import m5.b;

public final class m extends j implements Function2 {
    public int c0;
    public final z d0;
    public final p e0;
    public final o f0;
    public final Context g0;

    public m(z z0, p p0, o o0, Context context0, g g0) {
        this.d0 = z0;
        this.e0 = p0;
        this.f0 = o0;
        this.g0 = context0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((m)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new m(this.d0, this.e0, this.f0, this.g0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        z z0 = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                l l0 = z0.a();
                this.c0 = 1;
                object0 = J.a(l0, z0, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            case 2: {
                f.b0(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        p p0 = this.e0;
        if(((q)object0) == null) {
            throw new IllegalStateException(b.y(new StringBuilder("Worker was marked important ("), p0.c, ") but did not provide ForegroundInfo"));
        }
        A.e().a(n.a, "Updating notification for " + p0.c);
        r0 r00 = new r0(this.f0, z0.b.a, ((q)object0), this.g0, 2);
        l l1 = u.a(this.f0.a.a, "setForegroundAsync", r00);
        this.c0 = 2;
        object0 = w.s(l1, this);
        return object0 == object1 ? object1 : object0;
    }
}

