package x;

import Nb.j;
import U.Z;
import U.d;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class n {
    public final ParcelableSnapshotMutableState a;

    public n() {
        this.a = d.D(k.a, Z.e);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof n ? j.a(((m)((n)object0).a.getValue()), ((m)this.a.getValue())) : false;
    }

    @Override
    public final int hashCode() {
        return ((m)this.a.getValue()).hashCode();
    }

    @Override
    public final String toString() {
        return "ContextMenuState(status=" + ((m)this.a.getValue()) + ')';
    }
}

