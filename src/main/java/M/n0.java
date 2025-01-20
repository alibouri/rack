package M;

import I.P0;
import I.X;
import I.Y;
import I.j0;
import I.v0;
import Nb.j;
import O0.N;
import O0.n;
import U0.B;
import U0.v;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import kotlin.jvm.functions.Function1;
import m0.b;

public final class n0 implements v0 {
    public final int a;
    public final o0 b;

    public n0(o0 o00, int v) {
        this.a = v;
        this.b = o00;
        super();
    }

    @Override  // I.v0
    public final void a() {
        if(this.a != 0) {
            this.i();
            return;
        }
        this.b.o.setValue(null);
        this.b.p.setValue(null);
    }

    @Override  // I.v0
    public final void b() {
        if(this.a != 0) {
            return;
        }
        this.b.o.setValue(null);
        this.b.p.setValue(null);
    }

    @Override  // I.v0
    public final void c(long v) {
        if(this.a != 0) {
            o0 o00 = this.b;
            if(o00.h()) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = o00.o;
                if(((X)parcelableSnapshotMutableState0.getValue()) == null) {
                    parcelableSnapshotMutableState0.setValue(X.Z);
                    o00.q = -1;
                    o00.k();
                    j0 j00 = o00.d;
                    if(j00 == null) {
                    label_16:
                        j0 j01 = o00.d;
                        if(j01 != null) {
                            P0 p01 = j01.d();
                            if(p01 != null) {
                                int v1 = p01.b(v, true);
                                int v2 = o00.b.k(v1);
                                B b0 = o00.j();
                                long v3 = n.b(v2, v2);
                                B b1 = o0.c(b0.a, v3);
                                o00.f(false);
                                HapticFeedback hapticFeedback0 = o00.h;
                                if(hapticFeedback0 != null) {
                                    hapticFeedback0.a(9);
                                }
                                ((Function1)o00.c).n(b1);
                            }
                        }
                    label_30:
                        o00.n(Y.X);
                        o00.l = v;
                        b b2 = new b(v);
                        o00.p.setValue(b2);
                        o00.n = 0L;
                    }
                    else {
                        P0 p00 = j00.d();
                        if(p00 == null || !p00.c(v)) {
                            goto label_16;
                        }
                        else if(o00.j().a.X.length() != 0) {
                            o00.f(false);
                            o00.m = (int)(o0.a(o00, B.a(o00.j(), null, N.b, 5), v, true, false, s.e, true) >> 0x20);
                            goto label_30;
                        }
                    }
                }
            }
            return;
        }
        o0 o01 = this.b;
        long v4 = L.a(o01.i(true));
        j0 j02 = o01.d;
        if(j02 != null) {
            P0 p02 = j02.d();
            if(p02 != null) {
                long v5 = p02.e(v4);
                o01.l = v5;
                b b3 = new b(v5);
                o01.p.setValue(b3);
                o01.n = 0L;
                o01.o.setValue(X.X);
                o01.p(false);
            }
        }
    }

    @Override  // I.v0
    public final void d() {
    }

    @Override  // I.v0
    public final void e(long v) {
        if(this.a != 0) {
            o0 o00 = this.b;
            if(o00.h() && o00.j().a.X.length() != 0) {
                o00.n = b.i(o00.n, v);
                j0 j00 = o00.d;
                if(j00 == null) {
                    o00.p(false);
                }
                else {
                    P0 p00 = j00.d();
                    if(p00 == null) {
                        o00.p(false);
                        return;
                    }
                    b b0 = new b(b.i(o00.l, o00.n));
                    o00.p.setValue(b0);
                    r r0 = s.e;
                    if(o00.m == null) {
                        b b1 = o00.g();
                        j.c(b1);
                        if(!p00.c(b1.a)) {
                            int v1 = o00.b.k(p00.b(o00.l, true));
                            v v2 = o00.b;
                            b b2 = o00.g();
                            j.c(b2);
                            if(v1 == v2.k(p00.b(b2.a, true))) {
                                r0 = s.d;
                            }
                            B b3 = o00.j();
                            b b4 = o00.g();
                            j.c(b4);
                            o0.a(o00, b3, b4.a, false, false, r0, true);
                            o00.p(false);
                            return;
                        }
                    }
                    Integer integer0 = o00.m;
                    int v3 = integer0 == null ? p00.b(o00.l, false) : ((int)integer0);
                    b b5 = o00.g();
                    j.c(b5);
                    int v4 = p00.b(b5.a, false);
                    if(o00.m != null || v3 != v4) {
                        B b6 = o00.j();
                        b b7 = o00.g();
                        j.c(b7);
                        o0.a(o00, b6, b7.a, false, false, r0, true);
                        o00.p(false);
                        return;
                    }
                }
            }
            return;
        }
        o0 o01 = this.b;
        o01.n = b.i(o01.n, v);
        j0 j01 = o01.d;
        if(j01 != null) {
            P0 p01 = j01.d();
            if(p01 != null) {
                b b8 = new b(b.i(o01.l, o01.n));
                o01.p.setValue(b8);
                v v5 = o01.b;
                b b9 = o01.g();
                j.c(b9);
                int v6 = v5.k(p01.b(b9.a, true));
                long v7 = n.b(v6, v6);
                if(!N.a(v7, o01.j().b)) {
                    if(o01.d == null || ((Boolean)o01.d.q.getValue()).booleanValue()) {
                        HapticFeedback hapticFeedback0 = o01.h;
                        if(hapticFeedback0 != null) {
                            hapticFeedback0.a(9);
                        }
                    }
                    ((Function1)o01.c).n(o0.c(o01.j().a, v7));
                }
            }
        }
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    public void i() {
        o0 o00 = this.b;
        o00.o.setValue(null);
        o00.p.setValue(null);
        boolean z = true;
        o00.p(true);
        o00.m = null;
        boolean z1 = N.b(o00.j().b);
        o00.n((z1 ? Y.Z : Y.Y));
        j0 j00 = o00.d;
        if(j00 != null) {
            boolean z2 = !z1 && c0.w(o00, true);
            j00.m.setValue(Boolean.valueOf(z2));
        }
        j0 j01 = o00.d;
        if(j01 != null) {
            boolean z3 = !z1 && c0.w(o00, false);
            j01.n.setValue(Boolean.valueOf(z3));
        }
        j0 j02 = o00.d;
        if(j02 != null) {
            if(!z1 || !c0.w(o00, true)) {
                z = false;
            }
            j02.o.setValue(Boolean.valueOf(z));
        }
    }

    private final void j() {
    }

    @Override  // I.v0
    public final void onCancel() {
        if(this.a != 0) {
            this.i();
        }
    }
}

