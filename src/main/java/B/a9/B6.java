package a9;

import Nb.j;
import com.sendwave.backend.fragment.DealDetailFragment;

public final class b6 {
    public final String a;
    public final DealDetailFragment b;

    public b6(String s, DealDetailFragment dealDetailFragment0) {
        this.a = s;
        this.b = dealDetailFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof b6)) {
            return false;
        }
        return j.a(this.a, ((b6)object0).a) ? j.a(this.b, ((b6)object0).b) : false;
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

