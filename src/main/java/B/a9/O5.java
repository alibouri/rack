package a9;

import Nb.j;
import m5.b;

public final class o5 {
    public final String a;
    public final String b;

    public o5(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof o5)) {
            return false;
        }
        return j.a(this.a, ((o5)object0).a) ? j.a(this.b, ((o5)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SearchCategory(name=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", displayName=");
        return b.y(stringBuilder0, this.b, ")");
    }
}

