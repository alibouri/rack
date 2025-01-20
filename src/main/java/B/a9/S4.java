package a9;

import Nb.j;
import com.sendwave.backend.fragment.HistoryNodeFragment;

public final class s4 {
    public final String a;
    public final HistoryNodeFragment b;

    public s4(String s, HistoryNodeFragment historyNodeFragment0) {
        this.a = s;
        this.b = historyNodeFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof s4)) {
            return false;
        }
        return j.a(this.a, ((s4)object0).a) ? j.a(this.b, ((s4)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Node(__typename=" + this.a + ", historyNodeFragment=" + this.b + ")";
    }
}

