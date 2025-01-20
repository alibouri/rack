package v3;

import I2.J;
import U.C;
import U.N0;
import U.Z;
import U.d;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import r3.a;
import w.l0;

public final class h implements N0 {
    public final ParcelableSnapshotMutableState X;
    public final ParcelableSnapshotMutableState Y;
    public final ParcelableSnapshotMutableState Z;
    public final ParcelableSnapshotMutableState b0;
    public final ParcelableSnapshotMutableState c0;
    public final ParcelableSnapshotMutableState d0;
    public final ParcelableSnapshotMutableState e0;
    public final C f0;
    public final ParcelableSnapshotMutableState g0;
    public final ParcelableSnapshotMutableState h0;
    public final ParcelableSnapshotMutableState i0;
    public final ParcelableSnapshotMutableState j0;
    public final C k0;
    public final l0 l0;

    public h() {
        Boolean boolean0 = Boolean.FALSE;
        this.X = d.D(boolean0, Z.e);
        Integer integer0 = 1;
        this.Y = d.D(integer0, Z.e);
        this.Z = d.D(integer0, Z.e);
        this.b0 = d.D(boolean0, Z.e);
        this.c0 = d.D(null, Z.e);
        this.d0 = d.D(1.0f, Z.e);
        this.e0 = d.D(boolean0, Z.e);
        this.f0 = d.w(new f(this, 1));
        this.g0 = d.D(null, Z.e);
        Float float0 = 0.0f;
        this.h0 = d.D(float0, Z.e);
        this.i0 = d.D(float0, Z.e);
        this.j0 = d.D(0x8000000000000000L, Z.e);
        this.k0 = d.w(new f(this, 0));
        d.w(new f(this, 2));
        this.l0 = new l0();
    }

    public static final boolean a(h h0, int v, long v1) {
        a a0 = (a)h0.g0.getValue();
        if(a0 != null) {
            long v2 = ((Number)h0.j0.getValue()).longValue() == 0x8000000000000000L ? 0L : v1 - ((Number)h0.j0.getValue()).longValue();
            h0.j0.setValue(v1);
            if(h0.c0.getValue() != null || h0.c0.getValue() != null) {
                throw new ClassCastException();
            }
            float f = a0.b();
            C c0 = h0.f0;
            float f1 = ((Number)c0.getValue()).floatValue() * (((float)(v2 / 1000000L)) / f);
            int v3 = Float.compare(((Number)c0.getValue()).floatValue(), 0.0f);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = h0.h0;
            float f2 = v3 >= 0 ? ((Number)parcelableSnapshotMutableState0.getValue()).floatValue() + f1 - 1.0f : 0.0f - (((Number)parcelableSnapshotMutableState0.getValue()).floatValue() + f1);
            if(f2 < 0.0f) {
                h0.h(J.q(((Number)parcelableSnapshotMutableState0.getValue()).floatValue(), 0.0f, 1.0f) + f1);
                return true;
            }
            int v4 = ((int)(f2 / 1.0f)) + 1;
            if(h0.e() + v4 > v) {
                h0.h(h0.d());
                h0.g(v);
                return false;
            }
            h0.g(h0.e() + v4);
            float f3 = f2 - ((float)(((int)(f2 / 1.0f)))) * 1.0f;
            h0.h((((Number)c0.getValue()).floatValue() < 0.0f ? 1.0f - f3 : 0.0f + f3));
            return true;
        }
        return true;
    }

    public static final void c(h h0, boolean z) {
        h0.X.setValue(Boolean.valueOf(z));
    }

    public final float d() {
        return ((Number)this.k0.getValue()).floatValue();
    }

    public final int e() {
        return ((Number)this.Y.getValue()).intValue();
    }

    public final void g(int v) {
        this.Y.setValue(v);
    }

    @Override  // U.N0
    public final Object getValue() {
        return ((Number)this.i0.getValue()).floatValue();
    }

    public final void h(float f) {
        this.h0.setValue(f);
        if(((Boolean)this.e0.getValue()).booleanValue()) {
            a a0 = (a)this.g0.getValue();
            if(a0 != null) {
                f -= f % (1.0f / a0.n);
            }
        }
        this.i0.setValue(f);
    }
}

