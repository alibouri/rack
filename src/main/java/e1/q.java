package e1;

import v.h;

public final class q {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public q(int v, boolean z) {
        if((v & 1) != 0) {
            z = true;
        }
        super();
        this.a = z;
        this.b = (v & 2) != 0;
        this.c = true;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof q)) {
            return false;
        }
        if(this.a != ((q)object0).a) {
            return false;
        }
        return this.b == ((q)object0).b ? this.c == ((q)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = this.a ? 0x4CF : 0x4D5;
        int v2 = this.b ? 0x4CF : 0x4D5;
        int v3 = h.d(1);
        if(this.c) {
            v = 0x4CF;
        }
        return ((v3 + (v1 * 0x1F + v2) * 0x1F) * 0x1F + v) * 0x1F + 0x4CF;
    }
}

