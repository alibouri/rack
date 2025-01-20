package Y8;

import A3.e;
import Nb.j;
import com.sendwave.backend.fragment.LockScreenPropsFragment;

public final class w3 {
    public final String a;
    public final String b;
    public final LockScreenPropsFragment c;

    public w3(String s, String s1, LockScreenPropsFragment lockScreenPropsFragment0) {
        this.a = s;
        this.b = s1;
        this.c = lockScreenPropsFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof w3)) {
            return false;
        }
        if(!j.a(this.a, ((w3)object0).a)) {
            return false;
        }
        return j.a(this.b, ((w3)object0).b) ? j.a(this.c, ((w3)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    @Override
    public final String toString() {
        return "User(__typename=" + this.a + ", id=" + this.b + ", lockScreenPropsFragment=" + this.c + ")";
    }
}

