package Y8;

import A3.e;
import Nb.j;
import com.sendwave.backend.fragment.UserAppPropsFragment;

public final class g {
    public final String a;
    public final String b;
    public final UserAppPropsFragment c;

    public g(String s, String s1, UserAppPropsFragment userAppPropsFragment0) {
        this.a = s;
        this.b = s1;
        this.c = userAppPropsFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof g)) {
            return false;
        }
        if(!j.a(this.a, ((g)object0).a)) {
            return false;
        }
        return j.a(this.b, ((g)object0).b) ? j.a(this.c, ((g)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    @Override
    public final String toString() {
        return "User(__typename=" + this.a + ", id=" + this.b + ", userAppPropsFragment=" + this.c + ")";
    }
}

