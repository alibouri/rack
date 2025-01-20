package a9;

import Nb.j;
import com.sendwave.backend.fragment.DealDetailFragment;

public final class j5 {
    public final String a;
    public final DealDetailFragment b;

    public j5(String s, DealDetailFragment dealDetailFragment0) {
        this.a = s;
        this.b = dealDetailFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof j5)) {
            return false;
        }
        return j.a(this.a, ((j5)object0).a) ? j.a(this.b, ((j5)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Detail(__typename=" + this.a + ", dealDetailFragment=" + this.b + ")";
    }
}

