package Y8;

import A3.e;
import Nb.j;
import com.sendwave.backend.fragment.CustomerHomeFragment;

public final class h1 {
    public final String a;
    public final String b;
    public final CustomerHomeFragment c;

    public h1(String s, String s1, CustomerHomeFragment customerHomeFragment0) {
        this.a = s;
        this.b = s1;
        this.c = customerHomeFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h1)) {
            return false;
        }
        if(!j.a(this.a, ((h1)object0).a)) {
            return false;
        }
        return j.a(this.b, ((h1)object0).b) ? j.a(this.c, ((h1)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    @Override
    public final String toString() {
        return "Session(__typename=" + this.a + ", id=" + this.b + ", customerHomeFragment=" + this.c + ")";
    }
}

