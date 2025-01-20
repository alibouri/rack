package Y8;

import Nb.j;
import com.sendwave.backend.fragment.ClaimedScratchCardsFragment;

public final class n0 {
    public final String a;
    public final ClaimedScratchCardsFragment b;

    public n0(String s, ClaimedScratchCardsFragment claimedScratchCardsFragment0) {
        this.a = s;
        this.b = claimedScratchCardsFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof n0)) {
            return false;
        }
        return j.a(this.a, ((n0)object0).a) ? j.a(this.b, ((n0)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "ClaimedCards(__typename=" + this.a + ", claimedScratchCardsFragment=" + this.b + ")";
    }
}

