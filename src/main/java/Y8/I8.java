package Y8;

import Nb.j;
import com.sendwave.backend.fragment.ScratchCardsFragment;

public final class i8 {
    public final String a;
    public final ScratchCardsFragment b;

    public i8(String s, ScratchCardsFragment scratchCardsFragment0) {
        this.a = s;
        this.b = scratchCardsFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i8)) {
            return false;
        }
        return j.a(this.a, ((i8)object0).a) ? j.a(this.b, ((i8)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "User(__typename=" + this.a + ", scratchCardsFragment=" + this.b + ")";
    }
}

