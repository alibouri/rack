package I;

import O0.N;
import O0.f;
import O0.g;
import R2.k;
import U.Z;
import U.d;
import U.l0;
import U0.B;
import U0.H;
import U0.j;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.jvm.functions.Function1;
import n0.M;
import n0.h;
import n0.v;

public final class j0 {
    public u0 a;
    public final l0 b;
    public final SoftwareKeyboardController c;
    public final k d;
    public H e;
    public final ParcelableSnapshotMutableState f;
    public final ParcelableSnapshotMutableState g;
    public LayoutCoordinates h;
    public final ParcelableSnapshotMutableState i;
    public f j;
    public final ParcelableSnapshotMutableState k;
    public final ParcelableSnapshotMutableState l;
    public final ParcelableSnapshotMutableState m;
    public final ParcelableSnapshotMutableState n;
    public final ParcelableSnapshotMutableState o;
    public boolean p;
    public final ParcelableSnapshotMutableState q;
    public final g0 r;
    public Function1 s;
    public final F t;
    public final F u;
    public final h v;
    public long w;
    public final ParcelableSnapshotMutableState x;
    public final ParcelableSnapshotMutableState y;

    public j0(u0 u00, l0 l00, SoftwareKeyboardController softwareKeyboardController0) {
        this.a = u00;
        this.b = l00;
        this.c = softwareKeyboardController0;
        k k0 = new k(7, false);
        B b0 = new B(g.a, N.b, null);
        k0.Y = b0;
        k0.Z = new j(g.a, b0.b);
        this.d = k0;
        Boolean boolean0 = Boolean.FALSE;
        this.f = d.D(boolean0, Z.e);
        this.g = d.D(new a1.d(0.0f), Z.e);
        this.i = d.D(null, Z.e);
        this.k = d.D(Y.X, Z.e);
        this.l = d.D(boolean0, Z.e);
        this.m = d.D(boolean0, Z.e);
        this.n = d.D(boolean0, Z.e);
        this.o = d.D(boolean0, Z.e);
        this.p = true;
        this.q = d.D(Boolean.TRUE, Z.e);
        this.r = new g0(softwareKeyboardController0);
        this.s = i.e0;
        this.t = new F(this, 5);
        this.u = new F(this, 4);
        this.v = M.g();
        this.w = v.i;
        this.x = d.D(new N(N.b), Z.e);
        this.y = d.D(new N(N.b), Z.e);
    }

    public final Y a() {
        return (Y)this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean)this.f.getValue()).booleanValue();
    }

    public final LayoutCoordinates c() {
        LayoutCoordinates layoutCoordinates0 = this.h;
        return layoutCoordinates0 != null && layoutCoordinates0.r() ? layoutCoordinates0 : null;
    }

    public final P0 d() {
        return (P0)this.i.getValue();
    }

    public final void e(long v) {
        N n0 = new N(v);
        this.y.setValue(n0);
    }

    public final void f(long v) {
        N n0 = new N(v);
        this.x.setValue(n0);
    }
}

