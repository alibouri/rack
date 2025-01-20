package P;

import U.C;
import U.Z;
import U.d;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import dc.e;
import w.l0;

public final class n {
    public final e a;
    public final MutableState b;
    public final C c;
    public final ParcelableSnapshotMutableState d;
    public final ParcelableSnapshotMutableFloatState e;
    public final ParcelableSnapshotMutableFloatState f;
    public final ParcelableSnapshotMutableFloatState g;
    public final ParcelableSnapshotMutableFloatState h;
    public final l0 i;

    public n(e e0, MutableState mutableState0, float f, float f1) {
        this.a = e0;
        this.b = mutableState0;
        this.c = d.w(new P.d(this, 1));
        this.d = d.D(Boolean.FALSE, Z.e);
        this.e = d.B(0.0f);
        this.f = d.B(0.0f);
        this.g = d.B(f1);
        this.h = d.B(f);
        this.i = new l0();
    }

    public final float a() {
        return ((Number)this.c.getValue()).floatValue();
    }

    public final boolean b() {
        return ((Boolean)this.d.getValue()).booleanValue();
    }
}

