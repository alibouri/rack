package a9;

import A3.e;
import Nb.j;

public final class i5 {
    public final String a;
    public final String b;
    public final String c;
    public final n5 d;

    public i5(String s, String s1, String s2, n5 n50) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = n50;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i5)) {
            return false;
        }
        if(!j.a(this.a, ((i5)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((i5)object0).b)) {
            return false;
        }
        return j.a(this.c, ((i5)object0).c) ? j.a(this.d, ((i5)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
        int v1 = 0;
        int v2 = this.c == null ? 0 : this.c.hashCode();
        n5 n50 = this.d;
        if(n50 != null) {
            v1 = n50.a.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "Deal(__typename=" + this.a + ", id=" + this.b + ", shortDescription=" + this.c + ", onDealWithDetail=" + this.d + ")";
    }
}

