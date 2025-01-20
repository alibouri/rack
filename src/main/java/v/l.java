package v;

import U.N0;
import U.Z;
import U.d;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class l implements N0 {
    public final o0 X;
    public final ParcelableSnapshotMutableState Y;
    public q Z;
    public long b0;
    public long c0;
    public boolean d0;

    public l(o0 o00, Object object0, q q0, int v) {
        if((v & 4) != 0) {
            q0 = null;
        }
        this(o00, object0, q0, 0x8000000000000000L, 0x8000000000000000L, false);
    }

    public l(o0 o00, Object object0, q q0, long v, long v1, boolean z) {
        q q1;
        this.X = o00;
        this.Y = d.D(object0, Z.e);
        if(q0 == null) {
            q1 = (q)o00.a.n(object0);
            q1.d();
        }
        else {
            q1 = c.f(q0);
        }
        this.Z = q1;
        this.b0 = v;
        this.c0 = v1;
        this.d0 = z;
    }

    @Override  // U.N0
    public final Object getValue() {
        return this.Y.getValue();
    }

    @Override
    public final String toString() {
        return "AnimationState(value=" + this.Y.getValue() + ", velocity=" + this.X.b.n(this.Z) + ", isRunning=" + this.d0 + ", lastFrameTimeNanos=" + this.b0 + ", finishedTimeNanos=" + this.c0 + ')';
    }
}

