package w;

import A.k;
import Ab.t;
import Fb.c;
import K.v;
import U.C;
import U.d;
import V2.a;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import kotlin.jvm.functions.Function2;
import y.J;
import y.P0;

public final class C0 implements P0 {
    public final ParcelableSnapshotMutableIntState a;
    public final ParcelableSnapshotMutableIntState b;
    public final k c;
    public final ParcelableSnapshotMutableIntState d;
    public float e;
    public final J f;
    public final C g;
    public final C h;
    public static final v i;

    static {
        C0.i = new v(A0.X, 11, r.d0);
    }

    public C0(int v) {
        this.a = d.C(v);
        this.b = d.C(0);
        this.c = new k();
        this.d = d.C(0x7FFFFFFF);
        this.f = new J(new a(27, this));
        this.g = d.w(new B0(this, 1));
        this.h = d.w(new B0(this, 0));
    }

    @Override  // y.P0
    public final boolean a() {
        return ((Boolean)this.h.getValue()).booleanValue();
    }

    @Override  // y.P0
    public final Object b(h0 h00, Function2 function20, c c0) {
        Object object0 = this.f.b(h00, function20, c0);
        return object0 == Eb.a.X ? object0 : t.a;
    }

    @Override  // y.P0
    public final boolean c() {
        return this.f.c();
    }

    @Override  // y.P0
    public final boolean d() {
        return ((Boolean)this.g.getValue()).booleanValue();
    }

    @Override  // y.P0
    public final float e(float f) {
        return this.f.e(f);
    }
}

