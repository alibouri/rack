package a9;

import A3.e;
import Nb.j;
import com.sendwave.backend.fragment.TooltipsFragment;

public final class v6 {
    public final String a;
    public final String b;
    public final t6 c;
    public final s6 d;
    public final TooltipsFragment e;

    public v6(String s, String s1, t6 t60, s6 s60, TooltipsFragment tooltipsFragment0) {
        this.a = s;
        this.b = s1;
        this.c = t60;
        this.d = s60;
        this.e = tooltipsFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof v6)) {
            return false;
        }
        if(!j.a(this.a, ((v6)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((v6)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((v6)object0).c)) {
            return false;
        }
        return j.a(this.d, ((v6)object0).d) ? j.a(this.e, ((v6)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() + (this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b)) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "User(__typename=" + this.a + ", id=" + this.b + ", savingsWallet=" + this.c + ", appProps=" + this.d + ", tooltipsFragment=" + this.e + ")";
    }
}

