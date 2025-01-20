package Y8;

import Nb.j;
import com.sendwave.backend.fragment.AppActionFragment;

public final class w1 {
    public final String a;
    public final AppActionFragment b;

    public w1(String s, AppActionFragment appActionFragment0) {
        this.a = s;
        this.b = appActionFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof w1)) {
            return false;
        }
        return j.a(this.a, ((w1)object0).a) ? j.a(this.b, ((w1)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Action(__typename=" + this.a + ", appActionFragment=" + this.b + ")";
    }
}

