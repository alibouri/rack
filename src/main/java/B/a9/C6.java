package a9;

import Nb.j;

public final class c6 {
    public final String a;
    public final e6 b;
    public final d6 c;

    public c6(String s, e6 e60, d6 d60) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = e60;
        this.c = d60;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c6)) {
            return false;
        }
        if(!j.a(this.a, ((c6)object0).a)) {
            return false;
        }
        return j.a(this.b, ((c6)object0).b) ? j.a(this.c, ((c6)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        d6 d60 = this.c;
        if(d60 != null) {
            v1 = d60.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "Node(__typename=" + this.a + ", onPayableWallet=" + this.b + ", onDealWithDetail=" + this.c + ")";
    }
}

