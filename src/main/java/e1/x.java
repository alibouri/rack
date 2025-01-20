package e1;

public final class x {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public x(int v, boolean z) {
        this(((v & 1) == 0 ? z : false), (v & 2) != 0, (v & 4) != 0, 1, true, true);
    }

    public x(boolean z, boolean z1, boolean z2, int v, boolean z3, boolean z4) {
        int v1 = z ? 0x40000 : 0x40008;
        if(v == 2) {
            v1 |= 0x2000;
        }
        if(!z4) {
            v1 |= 0x200;
        }
        super();
        this.a = v1;
        this.b = v == 1;
        this.c = z1;
        this.d = z2;
        this.e = z3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof x)) {
            return false;
        }
        if(this.a != ((x)object0).a) {
            return false;
        }
        if(this.b != ((x)object0).b) {
            return false;
        }
        if(this.c != ((x)object0).c) {
            return false;
        }
        return this.d == ((x)object0).d ? this.e == ((x)object0).e : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a * 0x1F;
        int v1 = 0x4CF;
        int v2 = this.b ? 0x4CF : 0x4D5;
        int v3 = this.c ? 0x4CF : 0x4D5;
        int v4 = this.d ? 0x4CF : 0x4D5;
        if(!this.e) {
            v1 = 0x4D5;
        }
        return ((((v + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v1) * 0x1F + 0x4D5;
    }
}

