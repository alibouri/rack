package k2;

import Nb.j;

public final class f0 {
    public final e0 a;
    public final e0 b;
    public final e0 c;
    public static final f0 d;

    static {
        f0.d = new f0(d0.c, d0.c, d0.c);
    }

    public f0(e0 e00, e0 e01, e0 e02) {
        this.a = e00;
        this.b = e01;
        this.c = e02;
    }

    public static f0 a(f0 f00, d0 d00, d0 d01, d0 d02, int v) {
        if((v & 1) != 0) {
            d00 = f00.a;
        }
        if((v & 2) != 0) {
            d01 = f00.b;
        }
        if((v & 4) != 0) {
            d02 = f00.c;
        }
        f00.getClass();
        j.f(d00, "refresh");
        j.f(d01, "prepend");
        j.f(d02, "append");
        return new f0(d00, d01, d02);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f0)) {
            return false;
        }
        if(!j.a(this.a, ((f0)object0).a)) {
            return false;
        }
        return j.a(this.b, ((f0)object0).b) ? j.a(this.c, ((f0)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "LoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ')';
    }
}

