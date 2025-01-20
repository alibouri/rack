package P;

import Nb.k;
import Nb.t;
import Xb.J;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import dc.e;
import kotlin.jvm.functions.Function0;

public final class o extends k implements Function0 {
    public final n X;
    public final boolean Y;
    public final t Z;
    public final t b0;

    public o(n n0, boolean z, t t0, t t1) {
        this.X = n0;
        this.Y = z;
        this.Z = t0;
        this.b0 = t1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        n n0 = this.X;
        boolean z = n0.b();
        e e0 = n0.a;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState0 = n0.h;
        boolean z1 = this.Y;
        if(z != z1) {
            n0.d.setValue(Boolean.valueOf(z1));
            float f = 0.0f;
            n0.f.m(0.0f);
            if(z1) {
                f = parcelableSnapshotMutableFloatState0.k();
            }
            J.q(e0, null, null, new m(n0, f, null), 3);
        }
        n0.g.m(this.Z.X);
        float f1 = this.b0.X;
        if(parcelableSnapshotMutableFloatState0.k() != f1) {
            parcelableSnapshotMutableFloatState0.m(f1);
            if(n0.b()) {
                J.q(e0, null, null, new m(n0, f1, null), 3);
            }
        }
        return Ab.t.a;
    }
}

