package y;

import N.v;
import Nb.k;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function0;

public final class o extends k implements Function0 {
    public final int X;
    public final v Y;

    public o(v v0, int v1) {
        this.X = v1;
        this.Y = v0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.X) {
            case 0: {
                return this.Y.i();
            }
            case 1: {
                return new Ab.k(this.Y.i(), this.Y.e.getValue());
            }
            case 2: {
                v v1 = this.Y;
                float f = v1.i().e(v1.i.getValue());
                float f1 = v1.i().e(v1.e.getValue()) - f;
                float f2 = Math.abs(f1);
                float f3 = 1.0f;
                if(!Float.isNaN(f2) && f2 <= 0.000001f) {
                    float f4 = (v1.l() - f) / f1;
                    if(f4 < 0.000001f) {
                        return 0.0f;
                    }
                    if(f4 <= 0.999999f) {
                        f3 = f4;
                    }
                }
                return f3;
            }
            default: {
                v v0 = this.Y;
                Object object0 = v0.j.getValue();
                if(object0 == null) {
                    ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState0 = v0.g;
                    boolean z = Float.isNaN(parcelableSnapshotMutableFloatState0.k());
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = v0.d;
                    if(!z) {
                        Object object1 = v0.i().a(parcelableSnapshotMutableFloatState0.k());
                        return object1 == null ? parcelableSnapshotMutableState0.getValue() : object1;
                    }
                    return parcelableSnapshotMutableState0.getValue();
                }
                return object0;
            }
        }
    }
}

