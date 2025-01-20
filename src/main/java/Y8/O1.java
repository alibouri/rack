package Y8;

import A3.e;
import Nb.j;
import com.sendwave.backend.fragment.OverdraftFragment;

public final class o1 {
    public final String a;
    public final String b;
    public final j1 c;
    public final OverdraftFragment d;

    public o1(String s, String s1, j1 j10, OverdraftFragment overdraftFragment0) {
        this.a = s;
        this.b = s1;
        this.c = j10;
        this.d = overdraftFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof o1)) {
            return false;
        }
        if(!j.a(this.a, ((o1)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((o1)object0).b)) {
            return false;
        }
        return j.a(this.c, ((o1)object0).c) ? j.a(this.d, ((o1)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b)) * 0x1F;
    }

    @Override
    public final String toString() {
        return "User(__typename=" + this.a + ", id=" + this.b + ", customerAnnouncements=" + this.c + ", overdraftFragment=" + this.d + ")";
    }
}

