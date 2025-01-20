package Q;

import A.k;
import A.m;
import F0.f;
import F0.l;
import F0.o;
import F0.w;
import Xb.J;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.unit.Density;
import g0.n;
import io.sentry.config.a;
import kotlin.jvm.functions.Function0;
import s.z;

public abstract class v extends n implements l, o, w {
    public final k l0;
    public final boolean m0;
    public final float n0;
    public final n0.w o0;
    public final Nb.k p0;
    public C q0;
    public float r0;
    public long s0;
    public boolean t0;
    public final z u0;

    public v(k k0, boolean z, float f, n0.w w0, Function0 function00) {
        this.l0 = k0;
        this.m0 = z;
        this.n0 = f;
        this.o0 = w0;
        this.p0 = (Nb.k)function00;
        this.s0 = 0L;
        this.u0 = new z();
    }

    public abstract void A0(m arg1);

    @Override  // F0.w
    public final void C(LayoutCoordinates layoutCoordinates0) {
    }

    @Override  // F0.o
    public final void c(LayoutNodeDrawScope layoutNodeDrawScope0) {
        layoutNodeDrawScope0.a();
        C c0 = this.q0;
        if(c0 != null) {
            c0.d(layoutNodeDrawScope0, this.r0, this.o0.a());
        }
        this.y0(layoutNodeDrawScope0);
    }

    @Override  // F0.o
    public final void f0() {
    }

    @Override  // g0.n
    public final boolean m0() {
        return false;
    }

    @Override  // g0.n
    public final void p0() {
        J.q(this.l0(), null, null, new u(this, null), 3);
    }

    @Override  // F0.w
    public final void r(long v) {
        this.t0 = true;
        Density density0 = f.v(this).p0;
        this.s0 = a.a0(v);
        this.r0 = Float.isNaN(this.n0) ? q.a(density0, this.m0, this.s0) : density0.w(this.n0);
        z z0 = this.u0;
        Object[] arr_object = z0.a;
        int v1 = z0.b;
        for(int v2 = 0; v2 < v1; ++v2) {
            this.z0(((A.o)arr_object[v2]));
        }
        Bb.n.o0(z0.a, null, 0, z0.b);
        z0.b = 0;
    }

    public abstract void x0(m arg1, long arg2, float arg3);

    public abstract void y0(LayoutNodeDrawScope arg1);

    public final void z0(A.o o0) {
        if(o0 instanceof m) {
            this.x0(((m)o0), this.s0, this.r0);
            return;
        }
        if(o0 instanceof A.n) {
            this.A0(((A.n)o0).a);
            return;
        }
        if(o0 instanceof A.l) {
            this.A0(((A.l)o0).a);
        }
    }
}

