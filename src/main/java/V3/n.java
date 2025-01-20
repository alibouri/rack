package v3;

import U.C;
import U.N0;
import U.Z;
import U.d;
import Xb.J;
import Xb.q;
import Xb.s;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import r3.a;

public final class n implements N0 {
    public final q X;
    public final ParcelableSnapshotMutableState Y;
    public final ParcelableSnapshotMutableState Z;
    public final C b0;
    public final C c0;

    public n() {
        this.X = J.a();
        this.Y = d.D(null, Z.e);
        this.Z = d.D(null, Z.e);
        d.w(new m(this, 2));
        this.b0 = d.w(new m(this, 0));
        d.w(new m(this, 1));
        this.c0 = d.w(new m(this, 3));
    }

    public final void a(Throwable throwable0) {
        synchronized(this) {
            if(((Boolean)this.b0.getValue()).booleanValue()) {
                return;
            }
            this.Z.setValue(throwable0);
            this.X.getClass();
            s s0 = new s(throwable0, false);
            this.X.b0(s0);
        }
    }

    @Override  // U.N0
    public final Object getValue() {
        return (a)this.Y.getValue();
    }
}

