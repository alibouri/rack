package Y8;

import Nb.j;
import com.sendwave.backend.fragment.CustomerHistoryNodeFragment;

public final class c3 {
    public final String a;
    public final CustomerHistoryNodeFragment b;

    public c3(String s, CustomerHistoryNodeFragment customerHistoryNodeFragment0) {
        this.a = s;
        this.b = customerHistoryNodeFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c3)) {
            return false;
        }
        return j.a(this.a, ((c3)object0).a) ? j.a(this.b, ((c3)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "HistoryEntry(__typename=" + this.a + ", customerHistoryNodeFragment=" + this.b + ")";
    }
}

