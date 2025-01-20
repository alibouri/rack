package z0;

import F0.f;
import Fb.a;
import J2.w;
import Xb.I0;
import Xb.J;
import Xb.k;
import Y8.o;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.coroutines.j;
import kotlin.jvm.functions.Function2;
import m0.e;
import y.Y0;

public final class x implements Density, g {
    public final k X;
    public final z Y;
    public k Z;
    public z0.g b0;
    public final z c0;

    public x(z z0, k k0) {
        this.c0 = z0;
        this.X = k0;
        this.Y = z0;
        this.b0 = z0.g.Y;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float E(long v) {
        this.Y.getClass();
        return o.f(v, this.Y);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final int I(float f) {
        this.Y.getClass();
        return o.e(f, this.Y);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long P(long v) {
        this.Y.getClass();
        return o.i(v, this.Y);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float T(long v) {
        this.Y.getClass();
        return o.h(v, this.Y);
    }

    @Override  // kotlin.coroutines.g
    public final CoroutineContext a() {
        return j.X;
    }

    public final Object c(z0.g g0, a a0) {
        k k0 = new k(1, N4.j.w(a0));
        k0.v();
        this.b0 = g0;
        this.Z = k0;
        return k0.u();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long d0(float f) {
        return this.Y.d0(f);
    }

    public final long e() {
        this.c0.getClass();
        long v = o.i(f.v(this.c0).r0.g(), this.c0);
        long v1 = this.c0.u0;
        return w.m(Math.max(0.0f, e.d(v) - ((float)(((int)(v1 >> 0x20))))) / 2.0f, Math.max(0.0f, e.b(v) - ((float)(((int)(v1 & 0xFFFFFFFFL))))) / 2.0f);
    }

    public final ViewConfiguration f() {
        this.c0.getClass();
        return f.v(this.c0).r0;
    }

    public final Object g(long v, Function2 function20, a a0) {
        I0 i00;
        u u0;
        if(a0 instanceof u) {
            u0 = (u)a0;
            int v1 = u0.e0;
            if((v1 & 0x80000000) == 0) {
                u0 = new u(this, a0);
            }
            else {
                u0.e0 = v1 ^ 0x80000000;
            }
        }
        else {
            u0 = new u(this, a0);
        }
        Object object0 = u0.c0;
        Object object1 = Eb.a.X;
        switch(u0.e0) {
            case 0: {
                W5.f.b0(object0);
                if(v <= 0L) {
                    k k0 = this.Z;
                    if(k0 != null) {
                        k0.i(W5.f.v(new h(v)));
                    }
                }
                i00 = J.q(this.c0.l0(), null, null, new v(v, this, null), 3);
                try {
                    u0.b0 = i00;
                    u0.e0 = 1;
                    object0 = function20.j(this, u0);
                    if(object0 == object1) {
                        return object1;
                    label_24:
                        i00 = u0.b0;
                        W5.f.b0(object0);
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    i00.f(b.X);
                    throw throwable0;
                }
            }
            case 1: {
                goto label_24;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        i00.f(b.X);
        return object0;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.Y.getDensity();
    }

    public final Object h(long v, Y0 y00, a a0) {
        z0.w w0;
        if(a0 instanceof z0.w) {
            w0 = (z0.w)a0;
            int v1 = w0.d0;
            if((v1 & 0x80000000) == 0) {
                w0 = new z0.w(this, a0);
            }
            else {
                w0.d0 = v1 ^ 0x80000000;
            }
        }
        else {
            w0 = new z0.w(this, a0);
        }
        Object object0 = w0.b0;
        Object object1 = Eb.a.X;
        switch(w0.d0) {
            case 0: {
                W5.f.b0(object0);
                try {
                    w0.d0 = 1;
                    object0 = this.g(v, y00, w0);
                    return object0 == object1 ? object1 : object0;
                label_19:
                    W5.f.b0(object0);
                    return object0;
                }
                catch(h unused_ex) {
                    return null;
                }
            }
            case 1: {
                goto label_19;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // kotlin.coroutines.g
    public final void i(Object object0) {
        synchronized(this.c0.r0) {
            this.c0.r0.o(this);
        }
        this.X.i(object0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float i0(int v) {
        return this.Y.i0(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float j0(float f) {
        return f / this.Y.getDensity();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float n() {
        return this.Y.n();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long u(float f) {
        this.Y.getClass();
        return o.j(f, this.Y);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long v(long v) {
        this.Y.getClass();
        return o.g(v, this.Y);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float w(float f) {
        return this.Y.getDensity() * f;
    }
}

