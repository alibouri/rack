package Y8;

import A3.e;
import Nb.j;
import com.sendwave.backend.fragment.CustomerHomeFragment;

public final class r1 {
    public final String a;
    public final String b;
    public final String c;
    public final CustomerHomeFragment d;

    public r1(String s, String s1, String s2, CustomerHomeFragment customerHomeFragment0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = customerHomeFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof r1)) {
            return false;
        }
        if(!j.a(this.a, ((r1)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((r1)object0).b)) {
            return false;
        }
        return j.a(this.c, ((r1)object0).c) ? j.a(this.d, ((r1)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + e.s(e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c);
    }

    @Override
    public final String toString() {
        return "Session(__typename=" + this.a + ", id=" + this.b + ", opaqueId=" + this.c + ", customerHomeFragment=" + this.d + ")";
    }
}

