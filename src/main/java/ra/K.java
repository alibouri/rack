package ra;

import A3.e;
import Nb.j;
import java.util.Date;
import m5.b;

public final class k {
    public final String a;
    public final Date b;
    public final String c;
    public final String d;
    public final String e;

    public k(String s, Date date0, String s1, String s2, String s3) {
        this.a = s;
        this.b = date0;
        this.c = s1;
        this.d = s2;
        this.e = s3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k)) {
            return false;
        }
        if(!j.a(this.a, ((k)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((k)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((k)object0).c)) {
            return false;
        }
        return j.a(this.d, ((k)object0).d) ? j.a(this.e, ((k)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return this.e.hashCode() + e.s(e.s((this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F, 0x1F, this.c), 0x1F, this.d);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("PaymentCardRestrictedData(number=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", expires=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", cvv=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", bankIcon=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", name=");
        return b.y(stringBuilder0, this.e, ")");
    }
}

