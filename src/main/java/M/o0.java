package M;

import B3.d;
import I.K;
import I.P0;
import I.X0;
import I.Y0;
import I.Y;
import I.j0;
import Nb.j;
import Nb.k;
import O0.L;
import O0.N;
import O0.c;
import O0.f;
import O0.n;
import U.Z;
import U0.B;
import U0.v;
import a.a;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import kotlin.jvm.functions.Function1;
import l0.m;
import m0.b;

public final class o0 {
    public final X0 a;
    public v b;
    public k c;
    public j0 d;
    public final ParcelableSnapshotMutableState e;
    public ClipboardManager f;
    public TextToolbar g;
    public HapticFeedback h;
    public m i;
    public final ParcelableSnapshotMutableState j;
    public final ParcelableSnapshotMutableState k;
    public long l;
    public Integer m;
    public long n;
    public final ParcelableSnapshotMutableState o;
    public final ParcelableSnapshotMutableState p;
    public int q;
    public B r;
    public l0 s;
    public final n0 t;
    public final d u;

    public o0(X0 x00) {
        this.a = x00;
        this.b = Y0.a;
        this.c = P.c0;
        this.e = U.d.D(new B(7, 0L, null), Z.e);
        Boolean boolean0 = Boolean.TRUE;
        this.j = U.d.D(boolean0, Z.e);
        this.k = U.d.D(boolean0, Z.e);
        this.l = 0L;
        this.n = 0L;
        this.o = U.d.D(null, Z.e);
        this.p = U.d.D(null, Z.e);
        this.q = -1;
        this.r = new B(7, 0L, null);
        this.t = new n0(this, 1);
        this.u = new d(9, this);
    }

    public static final long a(o0 o00, B b0, long v, boolean z, boolean z1, r r0, boolean z2) {
        int v8;
        long v7;
        q q0;
        int v6;
        j0 j00 = o00.d;
        if(j00 != null) {
            P0 p00 = j00.d();
            if(p00 != null) {
                int v1 = o00.b.l(((int)(b0.b >> 0x20)));
                long v2 = b0.b;
                long v3 = n.b(v1, o00.b.l(((int)(v2 & 0xFFFFFFFFL))));
                int v4 = p00.b(v, false);
                l0 l00 = o00.s;
                if(z || l00 == null) {
                    v6 = -1;
                }
                else {
                    int v5 = o00.q;
                    v6 = v5 == -1 ? -1 : v5;
                }
                L l0 = p00.a;
                if(z) {
                    q0 = null;
                    v7 = v2;
                    v8 = v4;
                }
                else {
                    v8 = v4;
                    v7 = v2;
                    q0 = new q(new p(c0.u(l0, ((int)(v3 >> 0x20))), ((int)(v3 >> 0x20)), 1L), new p(c0.u(l0, ((int)(v3 & 0xFFFFFFFFL))), ((int)(v3 & 0xFFFFFFFFL)), 1L), N.f(v3));
                }
                new l0(z1, 1, 1, q0, new o(1L, 1, (z1 || z ? v4 : ((int)(v3 >> 0x20))), (!z1 || z ? v4 : ((int)(v3 & 0xFFFFFFFFL))), v6, l0));
                if(!null.b(l00)) {
                    return v7;
                }
                o00.s = null;
                o00.q = v8;
                q q1 = r0.a(null);
                long v9 = n.b(o00.b.k(q1.a.b), o00.b.k(q1.b.b));
                if(N.a(v9, v7)) {
                    return v7;
                }
                f f0 = b0.a;
                if(z2 && f0.X.length() > 0 && (N.f(v9) != N.f(v7) || !N.a(n.b(((int)(v9 & 0xFFFFFFFFL)), ((int)(v9 >> 0x20))), v7)) && (!N.b(v9) || !N.b(v7))) {
                    HapticFeedback hapticFeedback0 = o00.h;
                    if(hapticFeedback0 != null) {
                        hapticFeedback0.a(9);
                    }
                }
                B b1 = o0.c(f0, v9);
                ((Function1)o00.c).n(b1);
                if(!z2) {
                    o00.p(!N.b(v9));
                }
                j0 j01 = o00.d;
                if(j01 != null) {
                    j01.q.setValue(Boolean.valueOf(z2));
                }
                j0 j02 = o00.d;
                if(j02 != null) {
                    j02.m.setValue(Boolean.valueOf(!N.b(v9) && c0.w(o00, true)));
                }
                j0 j03 = o00.d;
                if(j03 != null) {
                    j03.n.setValue(Boolean.valueOf(!N.b(v9) && c0.w(o00, false)));
                }
                j0 j04 = o00.d;
                if(j04 != null) {
                    j04.o.setValue(Boolean.valueOf(N.b(v9) && c0.w(o00, true)));
                }
                return v9;
            }
        }
        return N.b;
    }

    public final void b(boolean z) {
        if(N.b(this.j().b)) {
            return;
        }
        ClipboardManager clipboardManager0 = this.f;
        if(clipboardManager0 != null) {
            clipboardManager0.b(a.p(this.j()));
        }
        if(!z) {
            return;
        }
        int v = N.d(this.j().b);
        B b0 = this.j();
        long v1 = n.b(v, v);
        B b1 = o0.c(b0.a, v1);
        ((Function1)this.c).n(b1);
        this.n(Y.X);
    }

    public static B c(f f0, long v) {
        return new B(f0, v, null);
    }

    public final void d() {
        if(N.b(this.j().b)) {
            return;
        }
        ClipboardManager clipboardManager0 = this.f;
        if(clipboardManager0 != null) {
            clipboardManager0.b(a.p(this.j()));
        }
        f f0 = a.r(this.j(), this.j().a.X.length());
        f f1 = a.q(this.j(), this.j().a.X.length());
        c c0 = new c(f0);
        c0.c(f1);
        f f2 = c0.g();
        int v = N.e(this.j().b);
        B b0 = o0.c(f2, n.b(v, v));
        ((Function1)this.c).n(b0);
        this.n(Y.X);
        this.a.f = true;
    }

    public final void e(b b0) {
        if(!N.b(this.j().b)) {
            P0 p00 = this.d == null ? null : this.d.d();
            int v = b0 == null || p00 == null ? N.d(this.j().b) : this.b.k(p00.b(b0.a, true));
            B b1 = B.a(this.j(), null, n.b(v, v), 5);
            ((Function1)this.c).n(b1);
        }
        this.n((b0 == null || this.j().a.X.length() <= 0 ? Y.X : Y.Z));
        this.p(false);
    }

    public final void f(boolean z) {
        if(this.d != null && !this.d.b()) {
            m m0 = this.i;
            if(m0 != null) {
                m0.b();
            }
        }
        this.r = this.j();
        this.p(z);
        this.n(Y.Y);
    }

    public final b g() {
        return (b)this.p.getValue();
    }

    public final boolean h() {
        return ((Boolean)this.k.getValue()).booleanValue();
    }

    public final long i(boolean z) {
        j0 j00 = this.d;
        if(j00 != null) {
            P0 p00 = j00.d();
            if(p00 != null) {
                L l0 = p00.a;
                f f0 = this.d == null ? null : this.d.a.a;
                if(f0 == null) {
                    return 0x7FC000007FC00000L;
                }
                if(!j.a(f0.X, l0.a.a.X)) {
                    return 0x7FC000007FC00000L;
                }
                B b0 = this.j();
                return z ? c0.t(l0, this.b.l(((int)(b0.b >> 0x20))), z, N.f(this.j().b)) : c0.t(l0, this.b.l(((int)(b0.b & 0xFFFFFFFFL))), z, N.f(this.j().b));
            }
        }
        return 0x7FC000007FC00000L;
    }

    public final B j() {
        return (B)this.e.getValue();
    }

    public final void k() {
        if((this.g == null ? 0 : this.g.c()) == 1) {
            TextToolbar textToolbar0 = this.g;
            if(textToolbar0 != null) {
                textToolbar0.b();
            }
        }
    }

    public final void l() {
        ClipboardManager clipboardManager0 = this.f;
        if(clipboardManager0 != null) {
            f f0 = clipboardManager0.a();
            if(f0 != null) {
                c c0 = new c(a.r(this.j(), this.j().a.X.length()));
                c0.c(f0);
                f f1 = c0.g();
                f f2 = a.q(this.j(), this.j().a.X.length());
                c c1 = new c(f1);
                c1.c(f2);
                f f3 = c1.g();
                int v = N.e(this.j().b);
                int v1 = f0.X.length();
                B b0 = o0.c(f3, n.b(v1 + v, v1 + v));
                ((Function1)this.c).n(b0);
                this.n(Y.X);
                this.a.f = true;
            }
        }
    }

    public final void m() {
        B b0 = this.j();
        long v = n.b(0, this.j().a.X.length());
        B b1 = o0.c(b0.a, v);
        ((Function1)this.c).n(b1);
        this.r = B.a(this.r, null, b1.b, 5);
        this.f(true);
    }

    public final void n(Y y0) {
        j0 j00 = this.d;
        if(j00 != null) {
            if(j00.a() == y0) {
                j00 = null;
            }
            if(j00 != null) {
                j00.k.setValue(y0);
            }
        }
    }

    public final void o() {
        m0.c c0;
        float f2;
        K k5;
        K k4;
        float f1;
        long v3;
        j0 j00 = null;
        if(this.h() && (this.d == null || ((Boolean)this.d.q.getValue()).booleanValue())) {
            K k0 = N.b(this.j().b) ? null : new K(this, 4);
            K k1 = N.b(this.j().b) || !((Boolean)this.j.getValue()).booleanValue() ? null : new K(this, 5);
            K k2 = !((Boolean)this.j.getValue()).booleanValue() || (this.f == null || !this.f.c()) ? null : new K(this, 6);
            K k3 = N.c(this.j().b) == this.j().a.X.length() ? null : new K(this, 7);
            TextToolbar textToolbar0 = this.g;
            if(textToolbar0 != null) {
                j0 j01 = this.d;
                if(j01 == null) {
                label_57:
                    k4 = k1;
                    k5 = k3;
                    c0 = m0.c.e;
                }
                else {
                    if(!j01.p) {
                        j00 = j01;
                    }
                    if(j00 != null) {
                        int v = this.b.l(((int)(this.j().b >> 0x20)));
                        int v1 = this.b.l(((int)(this.j().b & 0xFFFFFFFFL)));
                        j0 j02 = this.d;
                        long v2 = 0L;
                        if(j02 == null) {
                            v3 = 0L;
                        }
                        else {
                            LayoutCoordinates layoutCoordinates0 = j02.c();
                            v3 = layoutCoordinates0 == null ? 0L : layoutCoordinates0.F(this.i(true));
                        }
                        j0 j03 = this.d;
                        if(j03 != null) {
                            LayoutCoordinates layoutCoordinates1 = j03.c();
                            if(layoutCoordinates1 != null) {
                                v2 = layoutCoordinates1.F(this.i(false));
                            }
                        }
                        j0 j04 = this.d;
                        float f = 0.0f;
                        if(j04 == null) {
                        label_46:
                            k4 = k1;
                            k5 = k3;
                            f2 = 0.0f;
                        }
                        else {
                            LayoutCoordinates layoutCoordinates2 = j04.c();
                            if(layoutCoordinates2 != null) {
                                P0 p00 = j00.d();
                                if(p00 == null) {
                                    k4 = k1;
                                    k5 = k3;
                                    f1 = 0.0f;
                                }
                                else {
                                    f1 = p00.a.c(v).b;
                                    k4 = k1;
                                    k5 = k3;
                                }
                                f2 = b.e(layoutCoordinates2.F(yc.d.d(0.0f, f1)));
                                goto label_49;
                            }
                            goto label_46;
                        }
                    label_49:
                        j0 j05 = this.d;
                        if(j05 != null) {
                            LayoutCoordinates layoutCoordinates3 = j05.c();
                            if(layoutCoordinates3 != null) {
                                P0 p01 = j00.d();
                                f = b.e(layoutCoordinates3.F(yc.d.d(0.0f, (p01 == null ? 0.0f : p01.a.c(v1).b))));
                            }
                        }
                        c0 = new m0.c(Math.min(b.d(v3), b.d(v2)), Math.min(f2, f), Math.max(b.d(v3), b.d(v2)), j00.a.g.getDensity() * 25.0f + Math.max(b.e(v3), b.e(v2)));
                        textToolbar0.a(c0, k0, k2, k4, k5);
                        return;
                    }
                    goto label_57;
                }
                textToolbar0.a(c0, k0, k2, k4, k5);
            }
        }
    }

    public final void p(boolean z) {
        j0 j00 = this.d;
        if(j00 != null) {
            j00.l.setValue(Boolean.valueOf(z));
        }
        if(z) {
            this.o();
            return;
        }
        this.k();
    }
}

