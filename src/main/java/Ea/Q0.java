package Ea;

import Aa.K;
import Aa.P;
import Aa.Q;
import Aa.S;
import Aa.p;
import Ab.t;
import C3.i;
import D.h;
import Fa.C;
import Nb.j;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.paging.compose.a;
import c0.b;
import dc.e;
import k2.O;
import kotlin.jvm.functions.Function1;
import l2.c;

public final class q0 implements Function1 {
    public final P0 X;
    public final c Y;
    public final boolean Z;
    public final float b0;
    public final f0 c0;
    public final i d0;
    public final e e0;
    public final C f0;

    public q0(P0 p00, c c0, boolean z, float f, f0 f00, i i0, e e0, C c1) {
        this.X = p00;
        this.Y = c0;
        this.Z = z;
        this.b0 = f;
        this.c0 = f00;
        this.d0 = i0;
        this.e0 = e0;
        this.f0 = c1;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        j.f(((h)object0), "$this$LazyVerticalGrid");
        A3.e.p(((h)object0), new p(8), new b(0x4030BB02, new t0(this.X, this.b0, this.c0), true));
        A3.e.p(((h)object0), new p(9), new b(0x2BE6B4F9, new K(2, this.X), true));
        A3.e.p(((h)object0), new p(10), Ea.h.a);
        P p0 = new P(new p(11), 6, this.X.g);
        Q q0 = new Q(this.X.g, 1, false);
        b b0 = new b(0x29B3C0FE, new S(this.X.g, this.c0, this.d0, 1), true);
        ((h)object0).e(this.X.g.size(), p0, null, q0, b0);
        P p1 = new P(new p(12), 7, this.X.h);
        Q q1 = new Q(this.X.h, 2, false);
        e e0 = this.e0;
        i i0 = this.d0;
        f0 f00 = this.c0;
        b b1 = new b(0x29B3C0FE, new w0(this.X.h, e0, this.c0, this.f0, i0), true);
        C c0 = this.f0;
        ((h)object0).e(this.X.h.size(), p1, null, q1, b1);
        c c1 = this.Y;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = c1.d;
        if(((O)parcelableSnapshotMutableState0.getValue()).a() != 0) {
            int v = ((O)parcelableSnapshotMutableState0.getValue()).a();
            a a0 = new a(new p(13), c1);
            b b2 = new b(314180804, new s0(c1, e0, f00, c0, i0, 0), true);
            ((h)object0).e(v, a0, null, D.p.Z, b2);
        }
        if(this.Z) {
            A3.e.p(((h)object0), new p(14), Ea.h.b);
        }
        return t.a;
    }
}

