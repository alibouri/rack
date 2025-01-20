package K;

import F0.c0;
import F0.l;
import F0.m;
import F0.p;
import I.j0;
import M.o0;
import U.Z;
import U.d;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import g0.n;

public final class x extends n implements l, m, p {
    public f l0;
    public j0 m0;
    public o0 n0;
    public final ParcelableSnapshotMutableState o0;

    public x(f f0, j0 j00, o0 o00) {
        this.l0 = f0;
        this.m0 = j00;
        this.n0 = o00;
        this.o0 = d.D(null, Z.e);
    }

    @Override  // F0.p
    public final void O(c0 c00) {
        this.o0.setValue(c00);
    }

    @Override  // g0.n
    public final void p0() {
        f f0 = this.l0;
        if(f0.a != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null");
        }
        f0.a = this;
    }

    @Override  // g0.n
    public final void q0() {
        this.l0.k(this);
    }
}

