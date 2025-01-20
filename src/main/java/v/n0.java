package v;

import I.V0;
import Nb.j;

public final class n0 implements x {
    public final int a;
    public final int b;
    public final y c;

    public n0(int v, int v1, y y0) {
        this.a = v;
        this.b = v1;
        this.c = y0;
    }

    public n0(int v, y y0, int v1) {
        if((v1 & 1) != 0) {
            v = 300;
        }
        if((v1 & 4) != 0) {
            y0 = z.a;
        }
        this(v, 0, y0);
    }

    @Override  // v.k
    public final q0 a(o0 o00) {
        return new V0(this.a, this.b, this.c);
    }

    @Override  // v.x
    public final r0 a(o0 o00) {
        return new V0(this.a, this.b, this.c);
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof n0 && ((n0)object0).a == this.a && ((n0)object0).b == this.b && j.a(((n0)object0).c, this.c);
    }

    @Override
    public final int hashCode() {
        return (this.c.hashCode() + this.a * 0x1F) * 0x1F + this.b;
    }
}

