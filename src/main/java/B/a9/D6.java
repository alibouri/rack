package a9;

import A3.e;
import Nb.j;

public final class d6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final b6 e;

    public d6(String s, String s1, String s2, String s3, b6 b60) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = b60;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d6)) {
            return false;
        }
        if(!j.a(this.a, ((d6)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((d6)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((d6)object0).c)) {
            return false;
        }
        return j.a(this.d, ((d6)object0).d) ? j.a(this.e, ((d6)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
        return this.c == null ? this.e.hashCode() + e.s(v * 0x1F, 0x1F, this.d) : this.e.hashCode() + e.s((v + this.c.hashCode()) * 0x1F, 0x1F, this.d);
    }

    @Override
    public final String toString() {
        return "OnDealWithDetail(dealId=" + this.a + ", name=" + this.b + ", shortDescription=" + this.c + ", dealIconUrl=" + this.d + ", detail=" + this.e + ")";
    }
}

