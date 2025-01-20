package z0;

import Eb.a;
import F0.m0;
import N4.j;
import U.Q;
import W.d;
import Xb.G;
import Xb.I0;
import Xb.I;
import Xb.J;
import Xb.k;
import Y8.o;
import androidx.compose.ui.unit.Density;
import g0.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import y.F0;

public final class z extends n implements m0, Density {
    public Object l0;
    public Object m0;
    public Object[] n0;
    public Function2 o0;
    public I0 p0;
    public f q0;
    public final d r0;
    public final d s0;
    public f t0;
    public long u0;

    public z(Object object0, Object object1, Object[] arr_object, Function2 function20) {
        this.l0 = object0;
        this.m0 = object1;
        this.n0 = arr_object;
        this.o0 = function20;
        this.q0 = t.a;
        this.r0 = new d(new x[16]);
        this.s0 = new d(new x[16]);
        this.u0 = 0L;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final int D(long v) {
        throw null;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float E(long v) {
        return o.f(v, this);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final int I(float f) {
        return o.e(f, this);
    }

    @Override  // F0.m0
    public final boolean N() {
        return false;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long P(long v) {
        return o.i(v, this);
    }

    @Override  // F0.m0
    public final void R() {
        this.z0();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float T(long v) {
        return o.h(v, this);
    }

    @Override  // F0.m0
    public final void Y() {
        f f0 = this.t0;
        if(f0 == null) {
            return;
        }
        Object object0 = f0.a;
        int v = ((List)object0).size();
        for(int v2 = 0; v2 < v; ++v2) {
            if(((z0.n)((List)object0).get(v2)).d) {
                ArrayList arrayList0 = new ArrayList(((List)object0).size());
                int v3 = ((List)object0).size();
                for(int v1 = 0; v1 < v3; ++v1) {
                    z0.n n0 = (z0.n)((List)object0).get(v1);
                    new z0.n(n0.a, n0.b, n0.c, false, n0.e, n0.b, n0.c, n0.d, n0.d, 1, 0L);
                    arrayList0.add(null);
                }
                f f1 = new f(arrayList0, null);
                this.q0 = f1;
                this.y0(f1, g.X);
                this.y0(f1, g.Y);
                this.y0(f1, g.Z);
                this.t0 = null;
                return;
            }
        }
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long d0(float f) {
        return this.u(this.j0(f));
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return F0.f.v(this).p0.getDensity();
    }

    @Override  // F0.m0
    public final void h0() {
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float i0(int v) {
        return ((float)v) / this.getDensity();
    }

    @Override  // F0.m0
    public final void j() {
        this.z0();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float j0(float f) {
        return f / this.getDensity();
    }

    @Override  // F0.m0
    public final void m(f f0, g g0, long v) {
        this.u0 = v;
        if(g0 == g.X) {
            this.q0 = f0;
        }
        if(this.p0 == null) {
            G g1 = this.l0();
            y y0 = new y(this, null);
            this.p0 = J.q(g1, null, I.b0, y0, 1);
        }
        this.y0(f0, g0);
        Object object0 = f0.a;
        int v1 = ((List)object0).size();
        for(int v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                f0 = null;
                break;
            }
            if(!l.c(((z0.n)((List)object0).get(v2)))) {
                break;
            }
        }
        this.t0 = f0;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float n() {
        return F0.f.v(this).p0.n();
    }

    @Override  // g0.n
    public final void q0() {
        this.z0();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long u(float f) {
        return o.j(f, this);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long v(long v) {
        return o.g(v, this);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float w(float f) {
        return this.getDensity() * f;
    }

    public final Object x0(Function2 function20, kotlin.coroutines.g g0) {
        k k0 = new k(1, j.w(g0));
        k0.v();
        x x0 = new x(this, k0);
        synchronized(this.r0) {
            this.r0.c(x0);
            new kotlin.coroutines.k(j.w(j.k(x0, x0, function20)), a.X).i(Ab.t.a);
        }
        k0.y(new F0(2, x0));
        return k0.u();
    }

    public final void y0(f f0, g g0) {
        synchronized(this.r0) {
            this.s0.d(this.s0.Z, this.r0);
        }
        try {
            switch(g0.ordinal()) {
                case 1: {
                    d d1 = this.s0;
                    int v4 = d1.Z;
                    if(v4 > 0) {
                        int v5 = v4 - 1;
                        Object[] arr_object1 = d1.X;
                        while(true) {
                            x x1 = (x)arr_object1[v5];
                            if(g0 == x1.b0) {
                                k k1 = x1.Z;
                                if(k1 != null) {
                                    x1.Z = null;
                                    k1.i(f0);
                                }
                            }
                            --v5;
                            if(v5 < 0) {
                                break;
                            }
                        }
                    }
                    break;
                }
                case 0: 
                case 2: {
                    d d0 = this.s0;
                    int v2 = d0.Z;
                    if(v2 > 0) {
                        Object[] arr_object = d0.X;
                        int v3 = 0;
                        do {
                            x x0 = (x)arr_object[v3];
                            if(g0 == x0.b0) {
                                k k0 = x0.Z;
                                if(k0 != null) {
                                    x0.Z = null;
                                    k0.i(f0);
                                }
                            }
                            ++v3;
                        }
                        while(v3 < v2);
                    }
                }
            }
        }
        finally {
            this.s0.i();
        }
    }

    public final void z0() {
        I0 i00 = this.p0;
        if(i00 != null) {
            i00.C(new Q("Pointer input was reset", 4));
            this.p0 = null;
        }
    }
}

