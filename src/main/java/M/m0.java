package M;

import Bb.q;
import I.P0;
import I.f0;
import J2.w;
import Nb.j;
import O0.L;
import O0.N;
import O0.f;
import O0.n;
import O0.s;
import U0.A;
import U0.B;
import U0.a;
import U0.i;
import U0.v;
import Z0.h;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.jvm.functions.Function1;
import m0.c;
import m0.e;
import yc.d;

public final class m0 {
    public final f a;
    public final long b;
    public final L c;
    public final v d;
    public final t0 e;
    public long f;
    public final f g;
    public final B h;
    public final P0 i;

    public m0(B b0, v v0, P0 p00, t0 t00) {
        this.a = b0.a;
        this.b = b0.b;
        this.c = p00 == null ? null : p00.a;
        this.d = v0;
        this.e = t00;
        this.f = b0.b;
        this.g = b0.a;
        this.h = b0;
        this.i = p00;
    }

    public final List a(Function1 function10) {
        if(N.b(this.f)) {
            i i0 = (i)function10.n(this);
            return i0 == null ? null : q.K(i0);
        }
        return q.L(new i[]{new a("", 0), new A(N.e(this.f), N.e(this.f))});
    }

    public final Integer b() {
        L l0 = this.c;
        if(l0 != null) {
            int v = l0.e(l0.f(this.d.l(N.d(this.f))), true);
            return this.d.k(v);
        }
        return null;
    }

    public final Integer c() {
        L l0 = this.c;
        if(l0 != null) {
            int v = l0.i(l0.f(this.d.l(N.e(this.f))));
            return this.d.k(v);
        }
        return null;
    }

    public final Integer d() {
        int v1;
        L l0 = this.c;
        if(l0 != null) {
            for(int v = this.q(); true; ++v) {
                f f0 = this.a;
                if(v >= f0.X.length()) {
                    return f0.X.length();
                }
                v1 = (int)(l0.l((v > this.g.X.length() - 1 ? this.g.X.length() - 1 : v)) & 0xFFFFFFFFL);
                if(v1 > v) {
                    break;
                }
            }
            return this.d.k(v1);
        }
        return null;
    }

    public final Integer e() {
        int v1;
        L l0 = this.c;
        if(l0 != null) {
            for(int v = this.q(); true; --v) {
                if(v <= 0) {
                    return 0;
                }
                v1 = (int)(l0.l((v > this.g.X.length() - 1 ? this.g.X.length() - 1 : v)) >> 0x20);
                if(v1 < v) {
                    break;
                }
            }
            return this.d.k(v1);
        }
        return null;
    }

    public final boolean f() {
        return (this.c == null ? null : this.c.j(this.q())) != h.Y;
    }

    public final int g(L l0, int v) {
        int v1 = this.q();
        t0 t00 = this.e;
        if(t00.a == null) {
            t00.a = (float)l0.c(v1).a;
        }
        int v2 = l0.f(v1) + v;
        if(v2 < 0) {
            return 0;
        }
        s s0 = l0.b;
        if(v2 >= s0.f) {
            return this.g.X.length();
        }
        float f = s0.b(v2);
        Float float0 = t00.a;
        j.c(float0);
        float f1 = float0.floatValue();
        if(this.f() && f1 < l0.h(v2) || !this.f() && f1 > l0.g(v2)) {
            return l0.e(v2, true);
        }
        int v3 = s0.e(d.d(float0.floatValue(), f - 1.0f));
        return this.d.k(v3);
    }

    public final int h(P0 p00, int v) {
        c c0;
        LayoutCoordinates layoutCoordinates0 = p00.b;
        if(layoutCoordinates0 == null) {
            c0 = c.e;
        }
        else {
            c0 = p00.c == null ? null : p00.c.x(layoutCoordinates0, true);
            if(c0 == null) {
                c0 = c.e;
            }
        }
        int v1 = this.d.l(((int)(this.h.b & 0xFFFFFFFFL)));
        c c1 = p00.a.c(v1);
        return this.d.k(p00.a.b.e(d.d(c1.a, e.b(w.m(c0.d(), c0.c())) * ((float)v) + c1.b)));
    }

    public final void i() {
        f f0 = this.g;
        t0 t00 = this.e;
        t00.a = null;
        if(f0.X.length() > 0) {
            if(this.f()) {
                t00.a = null;
                if(f0.X.length() > 0) {
                    int v = f0.u(((int)(this.f & 0xFFFFFFFFL)), f0.X);
                    if(v != -1) {
                        this.p(v, v);
                    }
                }
            }
            else {
                t00.a = null;
                if(f0.X.length() > 0) {
                    int v1 = f0.r(((int)(this.f & 0xFFFFFFFFL)), f0.X);
                    if(v1 != -1) {
                        this.p(v1, v1);
                    }
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        f f0 = this.g;
        if(f0.X.length() > 0) {
            String s = f0.X;
            int v = f0.s(N.d(this.f), s);
            if(v == N.d(this.f) && v != s.length()) {
                v = f0.s(v + 1, s);
            }
            this.p(v, v);
        }
    }

    public final void k() {
        this.e.a = null;
        f f0 = this.g;
        if(f0.X.length() > 0) {
            String s = f0.X;
            int v = f0.t(N.e(this.f), s);
            if(v == N.e(this.f) && v != 0) {
                v = f0.t(v - 1, s);
            }
            this.p(v, v);
        }
    }

    public final void l() {
        f f0 = this.g;
        t0 t00 = this.e;
        t00.a = null;
        if(f0.X.length() > 0) {
            if(this.f()) {
                t00.a = null;
                if(f0.X.length() > 0) {
                    int v = f0.r(((int)(this.f & 0xFFFFFFFFL)), f0.X);
                    if(v != -1) {
                        this.p(v, v);
                    }
                }
            }
            else {
                t00.a = null;
                if(f0.X.length() > 0) {
                    int v1 = f0.u(((int)(this.f & 0xFFFFFFFFL)), f0.X);
                    if(v1 != -1) {
                        this.p(v1, v1);
                    }
                }
            }
        }
    }

    public final void m() {
        this.e.a = null;
        if(this.g.X.length() > 0) {
            Integer integer0 = this.b();
            if(integer0 != null) {
                int v = integer0.intValue();
                this.p(v, v);
            }
        }
    }

    public final void n() {
        this.e.a = null;
        if(this.g.X.length() > 0) {
            Integer integer0 = this.c();
            if(integer0 != null) {
                int v = integer0.intValue();
                this.p(v, v);
            }
        }
    }

    public final void o() {
        if(this.g.X.length() > 0) {
            this.f = n.b(((int)(this.b >> 0x20)), ((int)(this.f & 0xFFFFFFFFL)));
        }
    }

    public final void p(int v, int v1) {
        this.f = n.b(v, v1);
    }

    public final int q() {
        return this.d.l(((int)(this.f & 0xFFFFFFFFL)));
    }
}

