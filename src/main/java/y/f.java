package y;

import Eb.a;
import Fb.j;
import Mb.e;
import N.v;
import Nb.t;
import kotlin.coroutines.g;
import v.b0;
import v.c;
import v.l;
import v.w;

public final class f extends j implements e {
    public int c0;
    public s d0;
    public p0 e0;
    public Object f0;
    public final v g0;
    public final float h0;
    public final t i0;

    public f(v v0, float f, t t0, g g0) {
        this.g0 = v0;
        this.h0 = f;
        this.i0 = t0;
        super(4, g0);
    }

    @Override  // Mb.e
    public final Object r(Object object0, Object object1, Object object2, Object object3) {
        f f0 = new f(this.g0, this.h0, this.i0, ((g)object3));
        f0.d0 = (s)object0;
        f0.e0 = (p0)object1;
        f0.f0 = object2;
        return f0.v(Ab.t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        t t0 = this.i0;
        switch(this.c0) {
            case 0: {
                W5.f.b0(object0);
                s s0 = this.d0;
                p0 p00 = this.e0;
                Object object2 = this.f0;
                float f = p00.e(object2);
                if(Float.isNaN(f)) {
                    return Ab.t.a;
                }
                t t1 = new t();  // initializer: Ljava/lang/Object;-><init>()V
                v v0 = this.g0;
                float f1 = Float.isNaN(v0.g.k()) ? 0.0f : v0.g.k();
                t1.X = f1;
                if(f1 == f) {
                    return Ab.t.a;
                }
                float f2 = this.h0;
                if(Float.compare((f - f1) * f2, 0.0f) < 0 || f2 == 0.0f) {
                    goto label_38;
                }
                w w0 = (w)v0.m;
                float f3 = c.e(w0, f1, f2);
                float f4 = this.h0;
                if(f4 <= 0.0f) {
                    if(f3 <= f) {
                    label_26:
                        l l0 = c.b(t1.X, f4);
                        y.e e0 = new y.e(f, s0, t0, t1);
                        this.d0 = null;
                        this.e0 = null;
                        this.c0 = 2;
                        return b0.d(l0, w0, e0, this) != object1 ? Ab.t.a : object1;
                    }
                }
                else if(f3 >= f) {
                    goto label_26;
                }
                this.d0 = null;
                this.e0 = null;
                this.c0 = 3;
                if(androidx.compose.foundation.gestures.a.a(this.g0, f4, s0, p00, object2, this) == object1) {
                    return object1;
                label_38:
                    this.d0 = null;
                    this.e0 = null;
                    this.c0 = 1;
                    if(androidx.compose.foundation.gestures.a.a(this.g0, f2, s0, p00, object2, this) == object1) {
                        return object1;
                    }
                    t0.X = 0.0f;
                    return Ab.t.a;
                }
                break;
            }
            case 1: {
                W5.f.b0(object0);
                t0.X = 0.0f;
                return Ab.t.a;
            }
            case 2: {
                W5.f.b0(object0);
                return Ab.t.a;
            }
            case 3: {
                W5.f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        t0.X = 0.0f;
        return Ab.t.a;
    }
}

