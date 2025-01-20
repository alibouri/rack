package Y8;

import Nb.j;

public final class u4 {
    public final String a;
    public final p4 b;
    public final n4 c;

    public u4(String s, p4 p40, n4 n40) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = p40;
        this.c = n40;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof u4)) {
            return false;
        }
        if(!j.a(this.a, ((u4)object0).a)) {
            return false;
        }
        return j.a(this.b, ((u4)object0).b) ? j.a(this.c, ((u4)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        n4 n40 = this.c;
        if(n40 != null) {
            v1 = n40.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "Response1(__typename=" + this.a + ", onPayBill=" + this.b + ", onAsyncPending=" + this.c + ")";
    }
}

