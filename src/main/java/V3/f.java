package v3;

import Nb.k;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function0;
import r3.a;

public final class f extends k implements Function0 {
    public final int X;
    public final h Y;

    public f(h h0, int v) {
        this.X = v;
        this.Y = h0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.X) {
            case 0: {
                h h0 = this.Y;
                if(((a)h0.g0.getValue()) != null) {
                    int v = Float.compare(((Number)h0.d0.getValue()).floatValue(), 0.0f);
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = h0.c0;
                    if(v >= 0) {
                        if(parcelableSnapshotMutableState0.getValue() != null) {
                            throw new ClassCastException();
                        }
                        return 1.0f;
                    }
                    else if(parcelableSnapshotMutableState0.getValue() != null) {
                        throw new ClassCastException();
                    }
                }
                return 0.0f;
            }
            case 1: {
                boolean z = ((Boolean)this.Y.b0.getValue()).booleanValue();
                ParcelableSnapshotMutableState parcelableSnapshotMutableState1 = this.Y.d0;
                return !z || this.Y.e() % 2 != 0 ? ((Number)parcelableSnapshotMutableState1.getValue()).floatValue() : ((float)(-((Number)parcelableSnapshotMutableState1.getValue()).floatValue()));
            }
            default: {
                return this.Y.e() != ((Number)this.Y.Z.getValue()).intValue() || ((Number)this.Y.i0.getValue()).floatValue() != this.Y.d() ? Boolean.valueOf(false) : Boolean.valueOf(true);
            }
        }
    }
}

