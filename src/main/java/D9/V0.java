package d9;

import A3.e;
import M.J;
import Nb.j;
import java.util.List;

public final class v0 {
    public final String a;
    public final String b;
    public final List c;

    public v0(String s, String s1, List list0) {
        j.f(s, "billTypeId");
        super();
        this.a = s;
        this.b = s1;
        this.c = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof v0)) {
            return false;
        }
        if(!j.a(this.a, ((v0)object0).a)) {
            return false;
        }
        return j.a(this.b, ((v0)object0).b) ? j.a(this.c, ((v0)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("CreateBillFavoriteInput(billTypeId=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", name=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", fields=");
        return J.h(stringBuilder0, this.c, ")");
    }
}

