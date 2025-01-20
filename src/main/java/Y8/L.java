package Y8;

import A3.e;
import Nb.j;
import m5.b;

public final class l {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public l(String s, String s1, String s2, String s3, String s4) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof l)) {
            return false;
        }
        if(!j.a(this.a, ((l)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((l)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((l)object0).c)) {
            return false;
        }
        return j.a(this.d, ((l)object0).d) ? j.a(this.e, ((l)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return this.e.hashCode() + e.s(e.s(e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c), 0x1F, this.d);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("AgentList2(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", mobile=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", name=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", city=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", subcity=");
        return b.y(stringBuilder0, this.e, ")");
    }
}

