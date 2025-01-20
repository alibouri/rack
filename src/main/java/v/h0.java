package v;

import Nb.j;
import U.N0;
import U.Z;
import U.d;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import e0.p;
import java.util.Map;

public final class h0 implements N0 {
    public final o0 X;
    public final ParcelableSnapshotMutableState Y;
    public final ParcelableSnapshotMutableState Z;
    public final ParcelableSnapshotMutableState b0;
    public final ParcelableSnapshotMutableState c0;
    public final ParcelableSnapshotMutableFloatState d0;
    public boolean e0;
    public final ParcelableSnapshotMutableState f0;
    public q g0;
    public final ParcelableSnapshotMutableLongState h0;
    public boolean i0;
    public final U j0;
    public final k0 k0;

    public h0(k0 k00, Object object0, q q0, o0 o00) {
        this.k0 = k00;
        this.X = o00;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = d.D(object0, Z.e);
        this.Y = parcelableSnapshotMutableState0;
        Object object1 = null;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState1 = d.D(c.i(0.0f, 7, null), Z.e);
        this.Z = parcelableSnapshotMutableState1;
        this.b0 = d.D(new c0(((A)parcelableSnapshotMutableState1.getValue()), o00, object0, parcelableSnapshotMutableState0.getValue(), q0), Z.e);
        this.c0 = d.D(Boolean.TRUE, Z.e);
        this.d0 = d.B(-1.0f);
        this.f0 = d.D(object0, Z.e);
        this.g0 = q0;
        this.h0 = new ParcelableSnapshotMutableLongState(this.a().d());
        Float float0 = (Float)((Map)w0.a).get(o00);
        if(float0 != null) {
            float f = float0.floatValue();
            q q1 = (q)o00.a.n(object0);
            int v = q1.b();
            for(int v1 = 0; v1 < v; ++v1) {
                q1.e(v1, f);
            }
            object1 = this.X.b.n(q1);
        }
        this.j0 = c.i(0.0f, 3, object1);
    }

    public final c0 a() {
        return (c0)this.b0.getValue();
    }

    public final void c() {
        if(this.d0.k() == -1.0f) {
            this.i0 = true;
            c0 c00 = this.a();
            c0 c01 = this.a();
            boolean z = j.a(c00.c, c01.d);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = this.f0;
            if(z) {
                parcelableSnapshotMutableState0.setValue(this.a().c);
                return;
            }
            parcelableSnapshotMutableState0.setValue(this.a().c(0L));
            this.g0 = this.a().g(0L);
        }
    }

    public final void d(boolean z, Object object0) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = this.Y;
        boolean z1 = j.a(null, parcelableSnapshotMutableState0.getValue());
        ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState0 = this.h0;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState1 = this.b0;
        A a0 = this.j0;
        if(z1) {
            q q0 = this.g0.c();
            parcelableSnapshotMutableState1.setValue(new c0(a0, this.X, object0, object0, q0));
            this.e0 = true;
            parcelableSnapshotMutableLongState0.m(this.a().d());
            return;
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.Z;
        if(!z || this.i0) {
            a0 = (A)parcelableSnapshotMutableState2.getValue();
        }
        else if(((A)parcelableSnapshotMutableState2.getValue()) instanceof U) {
            a0 = (A)parcelableSnapshotMutableState2.getValue();
        }
        k0 k00 = this.k0;
        long v = 0L;
        A a1 = k00.e() <= 0L ? a0 : new V(a0, k00.e());
        Object object1 = parcelableSnapshotMutableState0.getValue();
        parcelableSnapshotMutableState1.setValue(new c0(a1, this.X, object0, object1, this.g0));
        parcelableSnapshotMutableLongState0.m(this.a().d());
        this.e0 = false;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = k00.h;
        parcelableSnapshotMutableState3.setValue(Boolean.TRUE);
        if(k00.g()) {
            p p0 = k00.i;
            int v2 = p0.size();
            for(int v1 = 0; v1 < v2; ++v1) {
                h0 h00 = (h0)p0.get(v1);
                v = Math.max(v, h00.h0.k());
                h00.c();
            }
            parcelableSnapshotMutableState3.setValue(Boolean.FALSE);
        }
    }

    public final void e(Object object0, Object object1, A a0) {
        this.Y.setValue(object1);
        this.Z.setValue(a0);
        if(j.a(this.a().d, object0) && j.a(this.a().c, object1)) {
            return;
        }
        this.d(false, object0);
    }

    public final void g(Object object0, A a0) {
        if(this.e0 && j.a(object0, null)) {
            return;
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = this.Y;
        boolean z = j.a(parcelableSnapshotMutableState0.getValue(), object0);
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState0 = this.d0;
        if(z && parcelableSnapshotMutableFloatState0.k() == -1.0f) {
            return;
        }
        parcelableSnapshotMutableState0.setValue(object0);
        this.Z.setValue(a0);
        int v = Float.compare(parcelableSnapshotMutableFloatState0.k(), -3.0f);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState1 = this.f0;
        Object object1 = v == 0 ? object0 : parcelableSnapshotMutableState1.getValue();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.c0;
        boolean z1 = true;
        this.d(!((Boolean)parcelableSnapshotMutableState2.getValue()).booleanValue(), object1);
        if(Float.compare(parcelableSnapshotMutableFloatState0.k(), -3.0f) != 0) {
            z1 = false;
        }
        parcelableSnapshotMutableState2.setValue(Boolean.valueOf(z1));
        if(parcelableSnapshotMutableFloatState0.k() >= 0.0f) {
            long v1 = this.a().d();
            parcelableSnapshotMutableState1.setValue(this.a().c(((long)(parcelableSnapshotMutableFloatState0.k() * ((float)v1)))));
        }
        else if(parcelableSnapshotMutableFloatState0.k() == -3.0f) {
            parcelableSnapshotMutableState1.setValue(object0);
        }
        this.e0 = false;
        parcelableSnapshotMutableFloatState0.m(-1.0f);
    }

    @Override  // U.N0
    public final Object getValue() {
        return this.f0.getValue();
    }

    @Override
    public final String toString() {
        return "current value: " + this.f0.getValue() + ", target: " + this.Y.getValue() + ", spec: " + ((A)this.Z.getValue());
    }
}

