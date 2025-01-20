package w;

import Ab.t;
import F0.c0;
import F0.e0;
import F0.n0;
import F0.o;
import F0.p;
import M0.j;
import Nb.k;
import T4.l;
import U.C;
import U.Z;
import U.d;
import Xb.J;
import Zb.i;
import a1.f;
import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import g0.n;
import io.sentry.config.a;
import kotlin.jvm.functions.Function1;
import m0.b;

public final class f0 extends n implements e0, n0, o, p {
    public long A0;
    public IntSize B0;
    public i C0;
    public k l0;
    public Function1 m0;
    public Function1 n0;
    public float o0;
    public boolean p0;
    public long q0;
    public float r0;
    public float s0;
    public boolean t0;
    public r0 u0;
    public View v0;
    public Density w0;
    public q0 x0;
    public final ParcelableSnapshotMutableState y0;
    public C z0;

    public f0(Function1 function10, Function1 function11, Function1 function12, float f, boolean z, long v, float f1, float f2, boolean z1, r0 r00) {
        this.l0 = (k)function10;
        this.m0 = function11;
        this.n0 = function12;
        this.o0 = f;
        this.p0 = z;
        this.q0 = v;
        this.r0 = f1;
        this.s0 = f2;
        this.t0 = z1;
        this.u0 = r00;
        this.y0 = d.D(null, Z.b);
        this.A0 = 0x7FC000007FC00000L;
    }

    public final void A0() {
        q0 q00 = this.x0;
        if(q00 == null) {
            return;
        }
        Density density0 = this.w0;
        if(density0 == null) {
            return;
        }
        long v = ((s0)q00).c();
        if(!(this.B0 instanceof IntSize) || v != this.B0.a) {
            Function1 function10 = this.n0;
            if(function10 != null) {
                function10.n(new f(density0.v(a.a0(((s0)q00).c()))));
            }
            this.B0 = new IntSize(((s0)q00).c());
        }
    }

    @Override  // F0.e0
    public final void F() {
        F0.f.s(this, new d0(this, 2));
    }

    @Override  // F0.p
    public final void O(c0 c00) {
        this.y0.setValue(c00);
    }

    @Override  // F0.n0
    public final boolean Z() {
        return false;
    }

    @Override  // F0.o
    public final void c(LayoutNodeDrawScope layoutNodeDrawScope0) {
        layoutNodeDrawScope0.a();
        i i0 = this.C0;
        if(i0 != null) {
            i0.s(t.a);
        }
    }

    @Override  // F0.n0
    public final boolean c0() {
        return false;
    }

    @Override  // F0.o
    public final void f0() {
    }

    @Override  // F0.n0
    public final void o(j j0) {
        d0 d00 = new d0(this, 1);
        j0.c(g0.a, d00);
    }

    @Override  // g0.n
    public final void p0() {
        this.F();
        this.C0 = l.i(0, 7, null);
        J.q(this.l0(), null, null, new w.e0(this, null), 3);
    }

    @Override  // g0.n
    public final void q0() {
        q0 q00 = this.x0;
        if(q00 != null) {
            ((s0)q00).b();
        }
        this.x0 = null;
    }

    public final long x0() {
        if(this.z0 == null) {
            this.z0 = d.w(new d0(this, 0));
        }
        return this.z0 == null ? 0x7FC000007FC00000L : ((b)this.z0.getValue()).a;
    }

    public final void y0() {
        q0 q00 = this.x0;
        if(q00 != null) {
            ((s0)q00).b();
        }
        View view0 = this.v0 == null ? F0.f.x(this) : this.v0;
        this.v0 = view0;
        Density density0 = this.w0 == null ? F0.f.v(this).p0 : this.w0;
        this.w0 = density0;
        this.x0 = this.u0.a(view0, this.p0, this.q0, this.r0, this.s0, this.t0, density0, this.o0);
        this.A0();
    }

    public final void z0() {
        Density density0 = this.w0;
        if(density0 == null) {
            density0 = F0.f.v(this).p0;
            this.w0 = density0;
        }
        long v = ((b)((Function1)this.l0).n(density0)).a;
        long v1 = 0x7FC000007FC00000L;
        if(yc.d.o(v) && yc.d.o(this.x0())) {
            this.A0 = b.i(this.x0(), v);
            Function1 function10 = this.m0;
            if(function10 != null) {
                long v2 = ((b)function10.n(density0)).a;
                b b0 = new b(v2);
                if(!yc.d.o(v2)) {
                    b0 = null;
                }
                if(b0 != null) {
                    v1 = b.i(this.x0(), b0.a);
                }
            }
            if(this.x0 == null) {
                this.y0();
            }
            q0 q00 = this.x0;
            if(q00 != null) {
                q00.a(this.o0, this.A0, v1);
            }
            this.A0();
            return;
        }
        this.A0 = 0x7FC000007FC00000L;
        q0 q01 = this.x0;
        if(q01 != null) {
            ((s0)q01).b();
        }
    }
}

