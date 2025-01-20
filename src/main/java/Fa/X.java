package Fa;

import Ab.t;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;

public final class x implements Function1 {
    public final int X;
    public final ParcelableSnapshotMutableIntState Y;

    public x(ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState0, int v) {
        this.X = v;
        this.Y = parcelableSnapshotMutableIntState0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                this.Y.m(((int)(((IntSize)object0).a & 0xFFFFFFFFL)));
                return t.a;
            }
            case 1: {
                this.Y.m(((int)(((IntSize)object0).a & 0xFFFFFFFFL)));
                return t.a;
            }
            default: {
                this.Y.m(((int)(((IntSize)object0).a & 0xFFFFFFFFL)));
                return t.a;
            }
        }
    }
}

