package y;

import N.v;
import Nb.j;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class s {
    public Object a;
    public Object b;
    public float c;
    public final v d;

    public s(v v0) {
        this.d = v0;
        this.c = NaNf;
    }

    public final void a(float f, float f1) {
        v v0 = this.d;
        float f2 = v0.g.k();
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState0 = v0.g;
        parcelableSnapshotMutableFloatState0.m(f);
        v0.h.m(f1);
        if(Float.isNaN(f2)) {
            return;
        }
        boolean z = Float.compare(f, f2) >= 0;
        p0 p00 = v0.i();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = v0.d;
        float f3 = p00.e(parcelableSnapshotMutableState0.getValue());
        if(parcelableSnapshotMutableFloatState0.k() == f3) {
            float f4 = parcelableSnapshotMutableFloatState0.k();
            Object object0 = v0.i().b(f4 + (z ? 1.0f : -1.0f), z);
            if(object0 == null) {
                object0 = parcelableSnapshotMutableState0.getValue();
            }
            if(z) {
                this.a = parcelableSnapshotMutableState0.getValue();
                this.b = object0;
            }
            else {
                this.a = object0;
                this.b = parcelableSnapshotMutableState0.getValue();
            }
        }
        else {
            Object object1 = v0.i().b(parcelableSnapshotMutableFloatState0.k(), false);
            if(object1 == null) {
                object1 = parcelableSnapshotMutableState0.getValue();
            }
            Object object2 = v0.i().b(parcelableSnapshotMutableFloatState0.k(), true);
            if(object2 == null) {
                object2 = parcelableSnapshotMutableState0.getValue();
            }
            this.a = object1;
            this.b = object2;
        }
        p0 p01 = v0.i();
        Object object3 = this.a;
        j.c(object3);
        float f5 = p01.e(object3);
        p0 p02 = v0.i();
        Object object4 = this.b;
        j.c(object4);
        this.c = Math.abs(f5 - p02.e(object4));
        if(Math.abs(parcelableSnapshotMutableFloatState0.k() - v0.i().e(parcelableSnapshotMutableState0.getValue())) >= this.c / 2.0f) {
            Object object5 = z ? this.b : this.a;
            if(object5 == null) {
                object5 = parcelableSnapshotMutableState0.getValue();
            }
            if(((Boolean)v0.c.n(object5)).booleanValue()) {
                v0.m(object5);
            }
        }
    }
}

