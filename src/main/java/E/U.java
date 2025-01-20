package E;

import D0.a0;
import U.Z;
import U.d;
import Xb.J;
import a1.g;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.graphics.GraphicsContext;
import dc.e;
import q0.b;
import v.A;
import v.p0;

public final class u {
    public final e a;
    public final GraphicsContext b;
    public final a0 c;
    public A d;
    public boolean e;
    public final ParcelableSnapshotMutableState f;
    public final ParcelableSnapshotMutableState g;
    public final ParcelableSnapshotMutableState h;
    public final ParcelableSnapshotMutableState i;
    public long j;
    public long k;
    public b l;
    public final v.b m;
    public final v.b n;
    public final ParcelableSnapshotMutableState o;
    public long p;
    public static final long q;
    public static final int r;

    static {
        u.q = 0x7FFFFFFF7FFFFFFFL;
    }

    public u(e e0, GraphicsContext graphicsContext0, a0 a00) {
        this.a = e0;
        this.b = graphicsContext0;
        this.c = a00;
        Boolean boolean0 = Boolean.FALSE;
        this.f = d.D(boolean0, Z.e);
        this.g = d.D(boolean0, Z.e);
        this.h = d.D(boolean0, Z.e);
        this.i = d.D(boolean0, Z.e);
        this.j = u.q;
        this.k = 0L;
        this.l = graphicsContext0 == null ? null : graphicsContext0.a();
        this.m = new v.b(new g(0L), p0.g, null, 12);
        this.n = new v.b(1.0f, p0.a, null, 12);
        this.o = d.D(new g(0L), Z.e);
        this.p = u.q;
    }

    public final void a() {
        b b0 = this.l;
        Boolean boolean0 = (Boolean)this.g.getValue();
        if(this.b()) {
            if(b0 != null) {
                b0.f(1.0f);
            }
            n n0 = new n(this, null);
            J.q(this.a, null, null, n0, 3);
        }
    }

    public final boolean b() {
        return ((Boolean)this.h.getValue()).booleanValue();
    }

    public final void c() {
        boolean z = ((Boolean)this.f.getValue()).booleanValue();
        e e0 = this.a;
        if(z) {
            this.d(false);
            J.q(e0, null, null, new r(this, null), 3);
        }
        if(((Boolean)this.g.getValue()).booleanValue()) {
            this.g.setValue(Boolean.valueOf(false));
            J.q(e0, null, null, new s(this, null), 3);
        }
        if(this.b()) {
            this.h.setValue(Boolean.valueOf(false));
            J.q(e0, null, null, new t(this, null), 3);
        }
        this.e = false;
        this.e(0L);
        this.j = u.q;
        b b0 = this.l;
        if(b0 != null) {
            GraphicsContext graphicsContext0 = this.b;
            if(graphicsContext0 != null) {
                graphicsContext0.b(b0);
            }
        }
        this.l = null;
        this.d = null;
    }

    public final void d(boolean z) {
        this.f.setValue(Boolean.valueOf(z));
    }

    public final void e(long v) {
        g g0 = new g(v);
        this.o.setValue(g0);
    }
}

