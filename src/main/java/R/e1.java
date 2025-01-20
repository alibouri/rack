package R;

import A.k;
import A3.e;
import Bb.A;
import D0.J;
import D0.L;
import D0.M;
import D0.V;
import F0.O;
import F0.x;
import I.c;
import T.i;
import W5.f;
import a1.a;
import a5.w;
import g0.n;
import v.b;

public final class e1 extends n implements x {
    public k l0;
    public boolean m0;
    public boolean n0;
    public b o0;
    public b p0;
    public float q0;
    public float r0;

    @Override  // F0.x
    public final int a(O o0, J j0, int v) {
        return e.f(this, o0, j0, v);
    }

    @Override  // F0.x
    public final int b(O o0, J j0, int v) {
        return e.c(this, o0, j0, v);
    }

    @Override  // F0.x
    public final L e(M m0, J j0, long v) {
        float f;
        boolean z = false;
        boolean z1 = j0.b(a.h(v)) != 0 && j0.N(a.g(v)) != 0;
        if(this.n0) {
            f = i.a;
        }
        else {
            f = z1 || this.m0 ? androidx.compose.material3.a.a : androidx.compose.material3.a.b;
        }
        float f1 = m0.w(f);
        int v1 = (int)(this.p0 == null ? f1 : ((Number)this.p0.d()).floatValue());
        if(v1 >= 0) {
            z = true;
        }
        if(z) {
            V v2 = j0.a(f.u(v1, v1, v1, v1));
            float f2 = m0.j0(f1);
            float f3 = m0.w((androidx.compose.material3.a.d - f2) / 2.0f);
            float f4 = m0.w(androidx.compose.material3.a.c - androidx.compose.material3.a.a - androidx.compose.material3.a.e);
            boolean z2 = this.n0;
            if(z2 && this.m0) {
                f3 = f4 - m0.w(i.e);
            }
            else if(z2 && !this.m0) {
                f3 = m0.w(i.e);
            }
            else if(this.m0) {
                f3 = f4;
            }
            Float float0 = this.p0 == null ? null : ((Float)this.p0.e.getValue());
            if(float0 == null || ((float)float0) == f1) {
                Xb.J.q(this.l0(), null, null, new b1(this, f1, null), 3);
            }
            Float float1 = this.o0 == null ? null : ((Float)this.o0.e.getValue());
            if(float1 == null || ((float)float1) == f3) {
                Xb.J.q(this.l0(), null, null, new c1(this, f3, null), 3);
            }
            if(Float.isNaN(this.r0) && Float.isNaN(this.q0)) {
                this.r0 = f1;
                this.q0 = f3;
            }
            c c0 = new c(v2, this, f3);
            return m0.L(v1, v1, A.X, c0);
        }
        w.k0(("width(" + v1 + ") and height(" + v1 + ") must be >= 0"));
        throw null;
    }

    @Override  // F0.x
    public final int f(O o0, J j0, int v) {
        return e.i(this, o0, j0, v);
    }

    @Override  // F0.x
    public final int g(O o0, J j0, int v) {
        return e.l(this, o0, j0, v);
    }

    @Override  // g0.n
    public final boolean m0() {
        return false;
    }

    @Override  // g0.n
    public final void p0() {
        Xb.J.q(this.l0(), null, null, new d1(this, null), 3);
    }
}

