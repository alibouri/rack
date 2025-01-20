package ga;

import A3.e;
import Nb.j;
import java.util.List;
import m5.b;

public final class f {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final d e;

    public f(String s, String s1, String s2, List list0, d d0) {
        j.f(s1, "imageUrl");
        j.f(s2, "description");
        j.f(list0, "terms");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = list0;
        this.e = d0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f)) {
            return false;
        }
        if(!j.a(this.a, ((f)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((f)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((f)object0).c)) {
            return false;
        }
        return j.a(this.d, ((f)object0).d) ? j.a(this.e, ((f)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = b.q(this.d, e.s(e.s((this.a == null ? 0 : this.a.hashCode()) * 0x1F, 0x1F, this.b), 0x1F, this.c), 0x1F);
        d d0 = this.e;
        if(d0 != null) {
            v = d0.hashCode();
        }
        return v1 + v;
    }

    @Override
    public final String toString() {
        return "DealDetailUIState(animationUrl=" + this.a + ", imageUrl=" + this.b + ", description=" + this.c + ", terms=" + this.d + ", action=" + this.e + ")";
    }
}

