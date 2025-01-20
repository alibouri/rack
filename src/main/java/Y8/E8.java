package Y8;

import A3.e;
import Nb.j;
import com.sendwave.backend.fragment.ScratchCardsFragment;

public final class e8 {
    public final String a;
    public final String b;
    public final d8 c;
    public final ScratchCardsFragment d;

    public e8(String s, String s1, d8 d80, ScratchCardsFragment scratchCardsFragment0) {
        this.a = s;
        this.b = s1;
        this.c = d80;
        this.d = scratchCardsFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e8)) {
            return false;
        }
        if(!j.a(this.a, ((e8)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((e8)object0).b)) {
            return false;
        }
        return j.a(this.c, ((e8)object0).c) ? j.a(this.d, ((e8)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
        return this.c == null ? this.d.hashCode() + v * 0x1F : this.d.hashCode() + (v + this.c.hashCode()) * 0x1F;
    }

    @Override
    public final String toString() {
        return "User(__typename=" + this.a + ", id=" + this.b + ", primaryWallet=" + this.c + ", scratchCardsFragment=" + this.d + ")";
    }
}

