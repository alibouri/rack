package Y8;

import Nb.j;

public final class n1 {
    public final String a;
    public final m1 b;
    public final o1 c;

    public n1(String s, m1 m10, o1 o10) {
        this.a = s;
        this.b = m10;
        this.c = o10;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof n1)) {
            return false;
        }
        if(!j.a(this.a, ((n1)object0).a)) {
            return false;
        }
        return j.a(this.b, ((n1)object0).b) ? j.a(this.c, ((n1)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        o1 o10 = this.c;
        if(o10 != null) {
            v1 = o10.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "Transfer(id=" + this.a + ", sourceWallet=" + this.b + ", user=" + this.c + ")";
    }
}

