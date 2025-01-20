package G0;

import B.L0;
import Bb.F;
import Bb.a;
import D0.a0;
import F0.h0;
import J2.w;
import a1.g;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import b4.s;
import n0.G;
import n0.H;
import n0.I;
import n0.J;
import n0.K;
import n0.M;
import n0.O;
import n0.W;
import n0.d;
import n0.h;
import n0.j;
import n0.t;
import n0.v;
import q0.b;

public final class o0 implements h0 {
    public b X;
    public final GraphicsContext Y;
    public final AndroidComposeView Z;
    public L0 b0;
    public a0 c0;
    public long d0;
    public boolean e0;
    public final float[] f0;
    public float[] g0;
    public boolean h0;
    public Density i0;
    public LayoutDirection j0;
    public final p0.b k0;
    public int l0;
    public long m0;
    public K n0;
    public j o0;
    public h p0;
    public boolean q0;
    public final a r0;

    public o0(b b0, GraphicsContext graphicsContext0, AndroidComposeView androidComposeView0, L0 l00, a0 a00) {
        this.X = b0;
        this.Y = graphicsContext0;
        this.Z = androidComposeView0;
        this.b0 = l00;
        this.c0 = a00;
        this.d0 = io.sentry.config.a.d(0x7FFFFFFF, 0x7FFFFFFF);
        this.f0 = G.a();
        this.i0 = Z6.b.b();
        this.j0 = LayoutDirection.X;
        this.k0 = new p0.b();
        this.m0 = W.b;
        this.r0 = new a(11, this);
    }

    @Override  // F0.h0
    public final long a(long v, boolean z) {
        if(z) {
            float[] arr_f = this.m();
            return arr_f == null ? 0x7F8000007F800000L : G.b(v, arr_f);
        }
        return G.b(v, this.n());
    }

    @Override  // F0.h0
    public final void b(long v) {
        if(!IntSize.a(v, this.d0)) {
            this.d0 = v;
            if(!this.h0 && !this.e0) {
                AndroidComposeView androidComposeView0 = this.Z;
                androidComposeView0.invalidate();
                if(!this.h0) {
                    this.h0 = true;
                    androidComposeView0.w(this, true);
                }
            }
        }
    }

    @Override  // F0.h0
    public final void c(s s0, boolean z) {
        if(z) {
            float[] arr_f = this.m();
            if(arr_f == null) {
                s0.b = 0.0f;
                s0.c = 0.0f;
                s0.d = 0.0f;
                s0.e = 0.0f;
                return;
            }
            G.c(arr_f, s0);
            return;
        }
        G.c(this.n(), s0);
    }

    @Override  // F0.h0
    public final void d(float[] arr_f) {
        G.g(arr_f, this.n());
    }

    @Override  // F0.h0
    public final void e(float[] arr_f) {
        float[] arr_f1 = this.m();
        if(arr_f1 != null) {
            G.g(arr_f, arr_f1);
        }
    }

    @Override  // F0.h0
    public final void f(t t0, b b0) {
        Canvas canvas0 = d.a(t0);
        boolean z = true;
        if(canvas0.isHardwareAccelerated()) {
            this.i();
            if(this.X.a.F() <= 0.0f) {
                z = false;
            }
            this.q0 = z;
            this.k0.Y.P(t0);
            this.k0.Y.Z = b0;
            yc.d.j(this.k0, this.X);
            return;
        }
        float f = (float)(((int)(this.X.s >> 0x20)));
        float f1 = (float)(((int)(this.X.s & 0xFFFFFFFFL)));
        float f2 = ((float)(((int)(this.d0 >> 0x20)))) + f;
        float f3 = f1 + ((float)(((int)(this.d0 & 0xFFFFFFFFL))));
        if(this.X.a.a() < 1.0f) {
            h h0 = this.p0;
            if(h0 == null) {
                h0 = M.g();
                this.p0 = h0;
            }
            h0.u(this.X.a.a());
            canvas0.saveLayer(f, f1, f2, f3, ((Paint)h0.c));
        }
        else {
            t0.n();
        }
        t0.k(f, f1);
        t0.r(this.n());
        b b1 = this.X;
        if(b1.v) {
            K k0 = b1.c();
            if(k0 instanceof I) {
                t0.s(((I)k0).a, 1);
            }
            else if(k0 instanceof J) {
                j j0 = this.o0;
                if(j0 == null) {
                    j0 = M.h();
                    this.o0 = j0;
                }
                j0.reset();
                j0.m(((J)k0).a, 1);
                t0.j(j0, 1);
            }
            else if(k0 instanceof H) {
                t0.j(((H)k0).a, 1);
            }
        }
        L0 l00 = this.b0;
        if(l00 != null) {
            l00.j(t0, null);
        }
        t0.l();
    }

    @Override  // F0.h0
    public final void g() {
        this.b0 = null;
        this.c0 = null;
        this.e0 = true;
        AndroidComposeView androidComposeView0 = this.Z;
        if(this.h0) {
            this.h0 = false;
            androidComposeView0.w(this, false);
        }
        GraphicsContext graphicsContext0 = this.Y;
        if(graphicsContext0 != null) {
            graphicsContext0.b(this.X);
            androidComposeView0.E(this);
        }
    }

    @Override  // F0.h0
    public final void h(long v) {
        b b0 = this.X;
        if(!g.b(b0.s, v)) {
            b0.s = v;
            b0.a.w(((int)(v >> 0x20)), b0.t, ((int)(v & 0xFFFFFFFFL)));
        }
        AndroidComposeView androidComposeView0 = this.Z;
        if(Build.VERSION.SDK_INT >= 26) {
            j1.a.a(androidComposeView0);
            return;
        }
        androidComposeView0.invalidate();
    }

    @Override  // F0.h0
    public final void i() {
        if(this.h0) {
            if(!W.a(this.m0, W.b) && !IntSize.a(this.X.t, this.d0)) {
                b b0 = this.X;
                long v = yc.d.d(W.b(this.m0) * ((float)(((int)(this.d0 >> 0x20)))), W.c(this.m0) * ((float)(((int)(this.d0 & 0xFFFFFFFFL)))));
                if(!m0.b.b(b0.u, v)) {
                    b0.u = v;
                    b0.a.J(v);
                }
            }
            b b1 = this.X;
            Density density0 = this.i0;
            LayoutDirection layoutDirection0 = this.j0;
            long v1 = this.d0;
            if(!IntSize.a(b1.t, v1)) {
                b1.t = v1;
                b1.a.w(((int)(b1.s >> 0x20)), v1, ((int)(0xFFFFFFFFL & b1.s)));
                if(b1.i == 0x7FC000007FC00000L) {
                    b1.g = true;
                    b1.a();
                }
            }
            b1.b = density0;
            b1.c = layoutDirection0;
            b1.d = this.r0;
            b1.e();
            if(this.h0) {
                this.h0 = false;
                this.Z.w(this, false);
            }
        }
    }

    @Override  // F0.h0
    public final void invalidate() {
        if(!this.h0 && !this.e0) {
            AndroidComposeView androidComposeView0 = this.Z;
            androidComposeView0.invalidate();
            if(!this.h0) {
                this.h0 = true;
                androidComposeView0.w(this, true);
            }
        }
    }

    @Override  // F0.h0
    public final void j(L0 l00, a0 a00) {
        GraphicsContext graphicsContext0 = this.Y;
        if(graphicsContext0 == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
        }
        if(!this.X.r) {
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
        this.X = graphicsContext0.a();
        this.e0 = false;
        this.b0 = l00;
        this.c0 = a00;
        this.m0 = W.b;
        this.q0 = false;
        this.d0 = io.sentry.config.a.d(0x7FFFFFFF, 0x7FFFFFFF);
        this.n0 = null;
        this.l0 = 0;
    }

    @Override  // F0.h0
    public final void k(O o0) {
        int v = o0.X | this.l0;
        this.j0 = o0.r0;
        this.i0 = o0.q0;
        if((v & 0x1000) != 0) {
            this.m0 = o0.l0;
        }
        if((v & 1) != 0) {
            float f = o0.Y;
            q0.d d0 = this.X.a;
            if(d0.l() != f) {
                d0.h(f);
            }
        }
        if((v & 2) != 0) {
            float f1 = o0.Z;
            q0.d d1 = this.X.a;
            if(d1.G() != f1) {
                d1.k(f1);
            }
        }
        if((v & 4) != 0) {
            this.X.f(o0.b0);
        }
        if((v & 8) != 0) {
            float f2 = o0.c0;
            q0.d d2 = this.X.a;
            if(d2.x() != f2) {
                d2.j(f2);
            }
        }
        if((v & 16) != 0) {
            float f3 = o0.d0;
            q0.d d3 = this.X.a;
            if(d3.r() != f3) {
                d3.g(f3);
            }
        }
        boolean z = true;
        if((v & 0x20) != 0) {
            b b0 = this.X;
            float f4 = o0.e0;
            q0.d d4 = b0.a;
            if(d4.F() != f4) {
                d4.q(f4);
                b0.g = true;
                b0.a();
            }
            if(o0.e0 <= 0.0f && !this.q0) {
                a0 a00 = this.c0;
                if(a00 != null) {
                    a00.invoke();
                }
            }
        }
        if((v & 0x40) != 0) {
            long v1 = o0.f0;
            q0.d d5 = this.X.a;
            if(!v.c(v1, d5.K())) {
                d5.t(v1);
            }
        }
        if((v & 0x80) != 0) {
            long v2 = o0.g0;
            q0.d d6 = this.X.a;
            if(!v.c(v2, d6.s())) {
                d6.C(v2);
            }
        }
        if((v & 0x400) != 0) {
            float f5 = o0.j0;
            q0.d d7 = this.X.a;
            if(d7.H() != f5) {
                d7.f(f5);
            }
        }
        if((v & 0x100) != 0) {
            float f6 = o0.h0;
            q0.d d8 = this.X.a;
            if(d8.A() != f6) {
                d8.o(f6);
            }
        }
        if((v & 0x200) != 0) {
            float f7 = o0.i0;
            q0.d d9 = this.X.a;
            if(d9.E() != f7) {
                d9.b(f7);
            }
        }
        if((v & 0x800) != 0) {
            float f8 = o0.k0;
            q0.d d10 = this.X.a;
            if(d10.v() != f8) {
                d10.m(f8);
            }
        }
        if((v & 0x1000) != 0) {
            if(W.a(this.m0, W.b)) {
                b b1 = this.X;
                if(!m0.b.b(b1.u, 0x7FC000007FC00000L)) {
                    b1.u = 0x7FC000007FC00000L;
                    b1.a.J(0x7FC000007FC00000L);
                }
            }
            else {
                b b2 = this.X;
                long v3 = yc.d.d(W.b(this.m0) * ((float)(((int)(this.d0 >> 0x20)))), W.c(this.m0) * ((float)(((int)(this.d0 & 0xFFFFFFFFL)))));
                if(!m0.b.b(b2.u, v3)) {
                    b2.u = v3;
                    b2.a.J(v3);
                }
            }
        }
        if((v & 0x4000) != 0) {
            b b3 = this.X;
            boolean z1 = o0.n0;
            if(b3.v != z1) {
                b3.v = z1;
                b3.g = true;
                b3.a();
            }
        }
        if((0x20000 & v) != 0) {
            q0.d d11 = this.X.a;
            if(!Nb.j.a(null, null)) {
                d11.d();
            }
        }
        if((0x8000 & v) != 0) {
            int v4 = 2;
            b b4 = this.X;
            int v5 = o0.o0;
            if(v5 == 0) {
                v4 = 0;
            }
            else if(v5 == 1) {
                v4 = 1;
            }
            else if(v5 != 2) {
                throw new IllegalStateException("Not supported composition strategy");
            }
            q0.d d12 = b4.a;
            if(!F.p(d12.z(), v4)) {
                d12.B(v4);
            }
        }
        if(Nb.j.a(this.n0, o0.s0)) {
            z = false;
        }
        else {
            K k0 = o0.s0;
            this.n0 = k0;
            if(k0 != null) {
                b b5 = this.X;
                if(k0 instanceof I) {
                    long v6 = w.m(((I)k0).a.d(), ((I)k0).a.c());
                    b5.g(0.0f, yc.d.d(((I)k0).a.a, ((I)k0).a.b), v6);
                }
                else if(k0 instanceof H) {
                    b5.k = null;
                    b5.i = 0x7FC000007FC00000L;
                    b5.h = 0L;
                    b5.j = 0.0f;
                    b5.g = true;
                    b5.n = false;
                    b5.l = ((H)k0).a;
                    b5.a();
                }
                else if(k0 instanceof J) {
                    j j0 = ((J)k0).b;
                    if(j0 == null) {
                        b5.g(m0.a.b(((J)k0).a.h), yc.d.d(((J)k0).a.a, ((J)k0).a.b), w.m(((J)k0).a.b(), ((J)k0).a.a()));
                    }
                    else {
                        b5.k = null;
                        b5.i = 0x7FC000007FC00000L;
                        b5.h = 0L;
                        b5.j = 0.0f;
                        b5.g = true;
                        b5.n = false;
                        b5.l = j0;
                        b5.a();
                    }
                }
                if(k0 instanceof H && Build.VERSION.SDK_INT < 33) {
                    a0 a01 = this.c0;
                    if(a01 != null) {
                        a01.invoke();
                    }
                }
            }
        }
        this.l0 = o0.X;
        if(v != 0 || z) {
            AndroidComposeView androidComposeView0 = this.Z;
            if(Build.VERSION.SDK_INT >= 26) {
                j1.a.a(androidComposeView0);
                return;
            }
            androidComposeView0.invalidate();
        }
    }

    // Deobfuscation rating: LOW(20)
    @Override  // F0.h0
    public final boolean l(long v) {
        return this.X.v ? G0.G.k(this.X.c(), m0.b.d(v), m0.b.e(v), null, null) : true;
    }

    public final float[] m() {
        float[] arr_f = this.n();
        float[] arr_f1 = this.g0;
        if(arr_f1 == null) {
            arr_f1 = G.a();
            this.g0 = arr_f1;
        }
        return G0.G.i(arr_f, arr_f1) ? arr_f1 : null;
    }

    public final float[] n() {
        b b0 = this.X;
        long v = yc.d.q(b0.u) ? w.G(io.sentry.config.a.a0(this.d0)) : b0.u;
        G.d(this.f0);
        float[] arr_f = G.a();
        G.h(arr_f, -m0.b.d(v), -m0.b.e(v), 0.0f);
        G.g(this.f0, arr_f);
        float[] arr_f1 = G.a();
        G.h(arr_f1, b0.a.x(), b0.a.r(), 0.0f);
        double f = ((double)b0.a.A()) * 3.141593 / 180.0;
        float f1 = (float)Math.cos(f);
        float f2 = (float)Math.sin(f);
        float f3 = arr_f1[1];
        float f4 = f3 * f1 - arr_f1[2] * f2;
        float f5 = arr_f1[2] * f1 + f3 * f2;
        float f6 = arr_f1[5];
        float f7 = f6 * f1 - arr_f1[6] * f2;
        float f8 = arr_f1[6] * f1 + f6 * f2;
        float f9 = arr_f1[9];
        float f10 = f9 * f1 - arr_f1[10] * f2;
        float f11 = arr_f1[10] * f1 + f9 * f2;
        float f12 = arr_f1[13];
        float f13 = f12 * f1 - arr_f1[14] * f2;
        float f14 = arr_f1[14] * f1 + f12 * f2;
        arr_f1[1] = f4;
        arr_f1[2] = f5;
        arr_f1[5] = f7;
        arr_f1[6] = f8;
        arr_f1[9] = f10;
        arr_f1[10] = f11;
        arr_f1[13] = f13;
        arr_f1[14] = f14;
        double f15 = ((double)b0.a.E()) * 3.141593 / 180.0;
        float f16 = (float)Math.cos(f15);
        float f17 = (float)Math.sin(f15);
        float f18 = arr_f1[0];
        float f19 = arr_f1[2] * f17 + f18 * f16;
        float f20 = arr_f1[2] * f16 + -f18 * f17;
        float f21 = arr_f1[4];
        float f22 = arr_f1[6] * f17 + f21 * f16;
        float f23 = arr_f1[6] * f16 + -f21 * f17;
        float f24 = arr_f1[8];
        float f25 = arr_f1[10] * f17 + f24 * f16;
        float f26 = arr_f1[10] * f16 + -f24 * f17;
        float f27 = arr_f1[12];
        float f28 = arr_f1[14] * f17 + f27 * f16;
        float f29 = arr_f1[14] * f16 + -f27 * f17;
        arr_f1[0] = f19;
        arr_f1[2] = f20;
        arr_f1[4] = f22;
        arr_f1[6] = f23;
        arr_f1[8] = f25;
        arr_f1[10] = f26;
        arr_f1[12] = f28;
        arr_f1[14] = f29;
        G.e(arr_f1, b0.a.H());
        G.f(arr_f1, b0.a.l(), b0.a.G(), 1.0f);
        G.g(this.f0, arr_f1);
        float[] arr_f2 = G.a();
        G.h(arr_f2, m0.b.d(v), m0.b.e(v), 0.0f);
        G.g(this.f0, arr_f2);
        return this.f0;
    }
}

