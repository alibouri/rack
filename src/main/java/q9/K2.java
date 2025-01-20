package q9;

import A3.e;
import Nb.j;
import Vb.h;
import m5.b;

public final class k2 {
    public final String a;
    public final String b;
    public final String c;
    public final h d;
    public final h e;

    public k2(String s, String s1, String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = new h(s);
        this.e = new h(s1);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k2)) {
            return false;
        }
        if(!j.a(this.a, ((k2)object0).a)) {
            return false;
        }
        return j.a(this.b, ((k2)object0).b) ? j.a(this.c, ((k2)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("NumberFormat(pattern=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", leadingDigits=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", format=");
        return b.y(stringBuilder0, this.c, ")");
    }
}

