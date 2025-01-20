package p0;

import J2.w;
import Nb.j;
import Y8.o;
import a8.Q;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.LayoutDirection;
import n0.M;
import n0.g;
import n0.h;
import n0.k;
import n0.n;
import n0.r;
import n0.t;
import n0.v;

public final class b implements d {
    public final a X;
    public final Q Y;
    public h Z;
    public h b0;

    public b() {
        f f0 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        a a0 = new a();  // initializer: Ljava/lang/Object;-><init>()V
        a0.a = c.a;
        a0.b = LayoutDirection.X;
        a0.c = f0;
        a0.d = 0L;
        this.X = a0;
        this.Y = new Q(this);
    }

    @Override  // p0.d
    public final Q A() {
        return this.Y;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final int D(long v) {
        throw null;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float E(long v) {
        return o.f(v, this);
    }

    @Override  // p0.d
    public final void G(r r0, long v, long v1, float f, e e0, n n0, int v2) {
        this.X.c.m(m0.b.d(v), m0.b.e(v), m0.e.d(v1) + m0.b.d(v), m0.e.b(v1) + m0.b.e(v), this.b(r0, e0, f, n0, v2, 1));
    }

    @Override  // androidx.compose.ui.unit.Density
    public final int I(float f) {
        return o.e(f, this);
    }

    @Override  // p0.d
    public final void K(long v, float f, long v1, float f1, e e0, n n0, int v2) {
        this.X.c.e(f, v1, b.a(this, v, e0, f1, n0, v2));
    }

    @Override  // p0.d
    public final long M() {
        return w.G(this.Y.A());
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long P(long v) {
        return o.i(v, this);
    }

    @Override  // p0.d
    public final void S(Path path0, long v, float f, e e0, n n0, int v1) {
        this.X.c.q(path0, b.a(this, v, e0, f, n0, v1));
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float T(long v) {
        return o.h(v, this);
    }

    @Override  // p0.d
    public final void U(long v, long v1, long v2, float f, e e0, n n0, int v3) {
        this.X.c.m(m0.b.d(v1), m0.b.e(v1), m0.e.d(v2) + m0.b.d(v1), m0.e.b(v2) + m0.b.e(v1), b.a(this, v, e0, f, n0, v3));
    }

    @Override  // p0.d
    public final void V(long v, float f, float f1, long v1, long v2, float f2, e e0, n n0, int v3) {
        this.X.c.h(m0.b.d(v1), m0.b.e(v1), m0.e.d(v2) + m0.b.d(v1), m0.e.b(v2) + m0.b.e(v1), f, f1, b.a(this, v, e0, f2, n0, v3));
    }

    @Override  // p0.d
    public final void W(Path path0, r r0, float f, e e0, n n0, int v) {
        this.X.c.q(path0, this.b(r0, e0, f, n0, v, 1));
    }

    public static h a(b b0, long v, e e0, float f, n n0, int v1) {
        h h0 = b0.e(e0);
        if(f != 1.0f) {
            v = v.b(v.d(v) * f, v);
        }
        if(!v.c(M.c(((Paint)h0.c).getColor()), v)) {
            h0.w(v);
        }
        if(((Shader)h0.d) != null) {
            h0.A(null);
        }
        if(!j.a(((n)h0.e), n0)) {
            h0.x(n0);
        }
        if(h0.b != v1) {
            h0.v(v1);
        }
        if(!M.r(((int)((Paint)h0.c).isFilterBitmap()), 1)) {
            h0.y(1);
        }
        return h0;
    }

    @Override  // p0.d
    public final void a0(g g0, long v, long v1, long v2, long v3, float f, e e0, n n0, int v4, int v5) {
        this.X.c.a(g0, v, v1, v2, v3, this.b(null, e0, f, n0, v4, v5));
    }

    public final h b(r r0, e e0, float f, n n0, int v, int v1) {
        h h0 = this.e(e0);
        if(r0 == null) {
            if(((Shader)h0.d) != null) {
                h0.A(null);
            }
            long v2 = M.c(((Paint)h0.c).getColor());
            long v3 = v.b;
            if(!v.c(v2, v3)) {
                h0.w(v3);
            }
            if(((float)((Paint)h0.c).getAlpha()) / 255.0f != f) {
                h0.u(f);
            }
        }
        else {
            r0.a(f, this.Y.A(), h0);
        }
        if(!j.a(((n)h0.e), n0)) {
            h0.x(n0);
        }
        if(h0.b != v) {
            h0.v(v);
        }
        if(!M.r(((int)((Paint)h0.c).isFilterBitmap()), v1)) {
            h0.y(v1);
        }
        return h0;
    }

    public final h c() {
        h h0 = this.b0;
        if(h0 == null) {
            h0 = M.g();
            h0.E(1);
            this.b0 = h0;
        }
        return h0;
    }

    @Override  // p0.d
    public final long d() {
        return this.Y.A();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final long d0(float f) {
        return this.u(this.j0(f));
    }

    public final h e(e e0) {
        if(j.a(e0, p0.g.a)) {
            h h0 = this.Z;
            if(h0 == null) {
                h0 = M.g();
                h0.E(0);
                this.Z = h0;
                return h0;
            }
            return h0;
        }
        if(!(e0 instanceof p0.h)) {
            throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
        }
        h h1 = this.c();
        Paint paint0 = (Paint)h1.c;
        float f = paint0.getStrokeWidth();
        float f1 = ((p0.h)e0).a;
        if(f != f1) {
            h1.D(f1);
        }
        int v = h1.k();
        int v1 = ((p0.h)e0).c;
        if(v != v1) {
            h1.B(v1);
        }
        float f2 = paint0.getStrokeMiter();
        float f3 = ((p0.h)e0).b;
        if(f2 != f3) {
            ((Paint)h1.c).setStrokeMiter(f3);
        }
        int v2 = h1.l();
        int v3 = ((p0.h)e0).d;
        if(v2 != v3) {
            h1.C(v3);
        }
        k k0 = (k)h1.f;
        k k1 = ((p0.h)e0).e;
        if(!j.a(k0, k1)) {
            h1.z(k1);
        }
        return h1;
    }

    @Override  // p0.d
    public final void g0(long v, long v1, long v2, float f, int v3, k k0, float f1, n n0, int v4) {
        t t0 = this.X.c;
        h h0 = this.c();
        long v5 = f1 == 1.0f ? v : v.b(v.d(v) * f1, v);
        if(!v.c(M.c(((Paint)h0.c).getColor()), v5)) {
            h0.w(v5);
        }
        if(((Shader)h0.d) != null) {
            h0.A(null);
        }
        if(!j.a(((n)h0.e), n0)) {
            h0.x(n0);
        }
        if(h0.b != v4) {
            h0.v(v4);
        }
        Paint paint0 = (Paint)h0.c;
        if(paint0.getStrokeWidth() != f) {
            h0.D(f);
        }
        if(paint0.getStrokeMiter() != 4.0f) {
            ((Paint)h0.c).setStrokeMiter(4.0f);
        }
        if(!M.s(h0.k(), v3)) {
            h0.B(v3);
        }
        if(!M.t(h0.l(), 0)) {
            h0.C(0);
        }
        if(!j.a(((k)h0.f), k0)) {
            h0.z(k0);
        }
        if(!M.r(((int)paint0.isFilterBitmap()), 1)) {
            h0.y(1);
        }
        t0.o(v1, v2, h0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.X.a.getDensity();
    }

    @Override  // p0.d
    public final LayoutDirection getLayoutDirection() {
        return this.X.b;
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float i0(int v) {
        return ((float)v) / this.getDensity();
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float j0(float f) {
        return f / this.getDensity();
    }

    @Override  // p0.d
    public final void k0(long v, long v1, long v2, long v3, e e0, float f, n n0, int v4) {
        this.X.c.f(m0.b.d(v1), m0.b.e(v1), m0.e.d(v2) + m0.b.d(v1), m0.e.b(v2) + m0.b.e(v1), m0.a.b(v3), m0.a.c(v3), b.a(this, v, e0, f, n0, v4));
    }

    @Override  // androidx.compose.ui.unit.Density
    public final float n() {
        return this.X.a.n();
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
}

