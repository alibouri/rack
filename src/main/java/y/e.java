package y;

import I2.J;
import Nb.k;
import Nb.t;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function1;
import v.j;

public final class e extends k implements Function1 {
    public final float X;
    public final s Y;
    public final t Z;
    public final t b0;

    public e(float f, s s0, t t0, t t1) {
        this.X = f;
        this.Y = s0;
        this.Z = t0;
        this.b0 = t1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        float f4;
        float f = Math.abs(((Number)((j)object0).e.getValue()).floatValue());
        float f1 = this.X;
        t t0 = this.b0;
        t t1 = this.Z;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = ((j)object0).e;
        s s0 = this.Y;
        if(Float.compare(f, Math.abs(f1)) >= 0) {
            float f2 = ((Number)parcelableSnapshotMutableState0.getValue()).floatValue();
            float f3 = 0.0f;
            if(f1 == 0.0f) {
                f4 = 0.0f;
            }
            else {
                f4 = f1 > 0.0f ? J.o(f2, f1) : J.m(f2, f1);
            }
            s0.a(f4, ((Number)((j)object0).b()).floatValue());
            if(!Float.isNaN(((Number)((j)object0).b()).floatValue())) {
                f3 = ((Number)((j)object0).b()).floatValue();
            }
            t1.X = f3;
            t0.X = f4;
            ((j)object0).a();
            return Ab.t.a;
        }
        s0.a(((Number)parcelableSnapshotMutableState0.getValue()).floatValue(), ((Number)((j)object0).b()).floatValue());
        t1.X = ((Number)((j)object0).b()).floatValue();
        t0.X = ((Number)parcelableSnapshotMutableState0.getValue()).floatValue();
        return Ab.t.a;
    }
}

