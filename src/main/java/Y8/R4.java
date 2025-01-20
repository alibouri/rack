package Y8;

import Nb.j;
import java.util.List;

public final class r4 {
    public final String a;
    public final v4 b;
    public final List c;

    public r4(String s, v4 v40, List list0) {
        this.a = s;
        this.b = v40;
        this.c = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof r4)) {
            return false;
        }
        if(!j.a(this.a, ((r4)object0).a)) {
            return false;
        }
        return j.a(this.b, ((r4)object0).b) ? j.a(this.c, ((r4)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        return this.c == null ? (v1 + v * 0x1F) * 0x1F : (v1 + v * 0x1F) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "PayBill2(__typename=" + this.a + ", response=" + this.b + ", responses=" + this.c + ")";
    }
}

