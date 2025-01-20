package Y8;

import Nb.j;

public final class y8 {
    public final String a;
    public final v8 b;
    public final u8 c;
    public final w8 d;

    public y8(String s, v8 v80, u8 u80, w8 w80) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = v80;
        this.c = u80;
        this.d = w80;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof y8)) {
            return false;
        }
        if(!j.a(this.a, ((y8)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((y8)object0).b)) {
            return false;
        }
        return j.a(this.c, ((y8)object0).c) ? j.a(this.d, ((y8)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.a.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        w8 w80 = this.d;
        if(w80 != null) {
            v1 = w80.a.hashCode();
        }
        return ((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "State(__typename=" + this.a + ", onLinkedAccountTransferPending=" + this.b + ", onLinkedAccountTransferFailure=" + this.c + ", onLinkedAccountTransferSuccess=" + this.d + ")";
    }
}

