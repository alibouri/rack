package Y8;

import Nb.j;

public final class v4 {
    public final String a;
    public final q4 b;
    public final o4 c;

    public v4(String s, q4 q40, o4 o40) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = q40;
        this.c = o40;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof v4)) {
            return false;
        }
        if(!j.a(this.a, ((v4)object0).a)) {
            return false;
        }
        return j.a(this.b, ((v4)object0).b) ? j.a(this.c, ((v4)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        o4 o40 = this.c;
        if(o40 != null) {
            v1 = o40.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "Response(__typename=" + this.a + ", onPayBill=" + this.b + ", onAsyncPending=" + this.c + ")";
    }
}

