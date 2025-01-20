package a9;

import A3.e;
import Nb.j;
import com.sendwave.backend.fragment.TooltipsFragment;
import com.sendwave.backend.fragment.UserAppPropsFragment;

public final class y7 {
    public final String a;
    public final String b;
    public final UserAppPropsFragment c;
    public final TooltipsFragment d;

    public y7(String s, String s1, UserAppPropsFragment userAppPropsFragment0, TooltipsFragment tooltipsFragment0) {
        this.a = s;
        this.b = s1;
        this.c = userAppPropsFragment0;
        this.d = tooltipsFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof y7)) {
            return false;
        }
        if(!j.a(this.a, ((y7)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((y7)object0).b)) {
            return false;
        }
        return j.a(this.c, ((y7)object0).c) ? j.a(this.d, ((y7)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b)) * 0x1F;
    }

    @Override
    public final String toString() {
        return "User(__typename=" + this.a + ", id=" + this.b + ", userAppPropsFragment=" + this.c + ", tooltipsFragment=" + this.d + ")";
    }
}

