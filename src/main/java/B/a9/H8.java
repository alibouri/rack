package a9;

import Nb.j;
import m5.b;

public final class h8 {
    public final String a;
    public final String b;

    public h8(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h8)) {
            return false;
        }
        return j.a(this.a, ((h8)object0).a) ? j.a(this.b, ((h8)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Wednesday(openingTime=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", closingTime=");
        return b.y(stringBuilder0, this.b, ")");
    }
}

