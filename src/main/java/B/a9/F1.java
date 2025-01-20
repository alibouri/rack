package a9;

import Nb.j;
import m5.b;

public final class f1 {
    public final String a;
    public final String b;
    public final String c;

    public f1(String s, String s1, String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f1)) {
            return false;
        }
        if(!j.a(this.a, ((f1)object0).a)) {
            return false;
        }
        return j.a(this.b, ((f1)object0).b) ? j.a(this.c, ((f1)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        String s = this.c;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("OnPurchaseEntry(merchantName=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", qrUrl=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", iconUrl=");
        return b.y(stringBuilder0, this.c, ")");
    }
}

