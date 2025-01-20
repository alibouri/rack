package a9;

import A3.e;
import M.J;
import Nb.j;
import java.util.List;

public final class d {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public d(String s, String s1, String s2, List list0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d)) {
            return false;
        }
        if(!j.a(this.a, ((d)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((d)object0).b)) {
            return false;
        }
        return j.a(this.c, ((d)object0).c) ? j.a(this.d, ((d)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
        int v1 = 0;
        int v2 = this.c == null ? 0 : this.c.hashCode();
        List list0 = this.d;
        if(list0 != null) {
            v1 = list0.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Detail(title=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", message=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", imageUrl=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", actions=");
        return J.h(stringBuilder0, this.d, ")");
    }
}

