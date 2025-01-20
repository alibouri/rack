package G0;

import Ab.t;
import Eb.a;
import Fb.j;
import Nb.w;
import U.T;
import U.V;
import U.p0;
import U.s0;
import W5.f;
import Xb.G;
import Xb.I0;
import Xb.J;
import Xb.r0;
import ac.z0;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class b1 extends j implements Function2 {
    public int c0;
    public Object d0;
    public final w e0;
    public final s0 f0;
    public final LifecycleOwner g0;
    public final c1 h0;
    public final View i0;

    public b1(w w0, s0 s00, LifecycleOwner lifecycleOwner0, c1 c10, View view0, g g0) {
        this.e0 = w0;
        this.f0 = s00;
        this.g0 = lifecycleOwner0;
        this.h0 = c10;
        this.i0 = view0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((b1)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        b1 b10 = new b1(this.e0, this.f0, this.g0, this.h0, this.i0, g0);
        b10.d0 = object0;
        return b10;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object3;
        r0 r00;
        I0 i00;
        Object object1 = a.X;
        LifecycleOwner lifecycleOwner0 = this.g0;
        Object object2 = t.a;
        c1 c10 = this.h0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                G g0 = (G)this.d0;
                try {
                    u0 u00 = (u0)this.e0.X;
                    if(u00 == null) {
                        i00 = null;
                    }
                    else {
                        z0 z00 = f1.a(this.i0.getContext().getApplicationContext());
                        float f = ((Number)z00.getValue()).floatValue();
                        u00.X.m(f);
                        i00 = J.q(g0, null, null, new a1(z00, u00, null), 3);
                    }
                }
                catch(Throwable throwable0) {
                    r00 = null;
                    goto label_44;
                }
                try {
                    this.d0 = i00;
                    this.c0 = 1;
                    U.r0 r01 = new U.r0(this.f0, null);
                    Nb.j.c(this.Y);
                    T t0 = V.a(this.Y);
                    p0 p00 = new p0(this.f0, r01, t0, null);
                    object3 = J.y(this.f0.a, p00, this);
                }
                catch(Throwable throwable1) {
                    r00 = i00;
                    throwable0 = throwable1;
                    goto label_44;
                }
                if(object3 != object1) {
                    object3 = object2;
                }
                if(object3 != object1) {
                    object3 = object2;
                }
                if(object3 == object1) {
                    return object1;
                }
                r00 = i00;
                break;
            }
            case 1: {
                r00 = (r0)this.d0;
                try {
                    f.b0(object0);
                    break;
                }
                catch(Throwable throwable0) {
                }
            label_44:
                if(r00 != null) {
                    r00.f(null);
                }
                lifecycleOwner0.a().c(c10);
                throw throwable0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(r00 != null) {
            r00.f(null);
        }
        lifecycleOwner0.a().c(c10);
        return object2;
    }
}

