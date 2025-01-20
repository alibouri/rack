package Y8;

import Nb.j;
import com.sendwave.backend.fragment.TxHistoryOfflineSyncPropsFragment;

public final class c9 {
    public final String a;
    public final TxHistoryOfflineSyncPropsFragment b;

    public c9(String s, TxHistoryOfflineSyncPropsFragment txHistoryOfflineSyncPropsFragment0) {
        this.a = s;
        this.b = txHistoryOfflineSyncPropsFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c9)) {
            return false;
        }
        return j.a(this.a, ((c9)object0).a) ? j.a(this.b, ((c9)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Session(__typename=" + this.a + ", txHistoryOfflineSyncPropsFragment=" + this.b + ")";
    }
}

