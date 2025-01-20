package v;

import Nb.k;
import U.Z;
import U.d;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function1;

public final class e0 {
    public final o0 a;
    public final ParcelableSnapshotMutableState b;
    public final k0 c;

    public e0(k0 k00, o0 o00, String s) {
        this.c = k00;
        this.a = o00;
        this.b = d.D(null, Z.e);
    }

    public final d0 a(Function1 function10, Function1 function11) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = this.b;
        d0 d00 = (d0)parcelableSnapshotMutableState0.getValue();
        k0 k00 = this.c;
        if(d00 == null) {
            Object object0 = function11.n(k00.c());
            Object object1 = function11.n(k00.c());
            q q0 = (q)this.a.a.n(object1);
            q0.d();
            h0 h00 = new h0(k00, object0, q0, this.a);
            d00 = new d0(this, h00, function10, function11);
            parcelableSnapshotMutableState0.setValue(d00);
            k00.i.add(h00);
        }
        d00.Z = (k)function11;
        d00.Y = (k)function10;
        d00.a(k00.f());
        return d00;
    }
}

