package R;

import Bb.p;
import a1.l;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import java.util.Map;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import m0.b;
import y0.a;
import yc.d;

public final class w0 implements a {
    public final z0 X;
    public final Function1 Y;

    public w0(z0 z00, Function1 function10) {
        this.X = z00;
        this.Y = function10;
    }

    @Override  // y0.a
    public final Object B(long v, g g0) {
        float f = l.c(v);
        float f1 = this.X.c.l();
        Float float0 = p.B0(((Map)this.X.c.h().a).values());
        if(f >= 0.0f && f1 <= (float0 == null ? NaNf : ((float)float0))) {
            this.Y.n(new Float(f));
            return new l(v);
        }
        return new l(0L);
    }

    @Override  // y0.a
    public final long Q(long v, long v1, int v2) {
        if(v2 == 1) {
            float f = this.X.c.k(b.e(v1));
            ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState0 = this.X.c.g;
            float f1 = Float.isNaN(parcelableSnapshotMutableFloatState0.k()) ? 0.0f : parcelableSnapshotMutableFloatState0.k();
            parcelableSnapshotMutableFloatState0.m(f);
            return d.d(0.0f, f - f1);
        }
        return 0L;
    }

    @Override  // y0.a
    public final long e0(int v, long v1) {
        float f = b.e(v1);
        if(f >= 0.0f && v == 1) {
            float f1 = this.X.c.k(f);
            ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState0 = this.X.c.g;
            float f2 = Float.isNaN(parcelableSnapshotMutableFloatState0.k()) ? 0.0f : parcelableSnapshotMutableFloatState0.k();
            parcelableSnapshotMutableFloatState0.m(f1);
            return d.d(0.0f, f1 - f2);
        }
        return 0L;
    }

    @Override  // y0.a
    public final Object t(long v, long v1, g g0) {
        this.Y.n(new Float(l.c(v1)));
        return new l(v1);
    }
}

