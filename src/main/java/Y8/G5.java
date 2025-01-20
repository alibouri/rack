package Y8;

import A3.e;
import Nb.j;
import m5.b;

public final class g5 {
    public final String a;
    public final String b;
    public final String c;

    public g5(String s, String s1, String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof g5)) {
            return false;
        }
        if(!j.a(this.a, ((g5)object0).a)) {
            return false;
        }
        return j.a(this.b, ((g5)object0).b) ? j.a(this.c, ((g5)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("OnPaymentCardRestrictedData(encryptedPan=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", encryptedCvv=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", iv=");
        return b.y(stringBuilder0, this.c, ")");
    }
}

