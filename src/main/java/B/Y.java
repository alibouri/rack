package B;

import D0.f0;
import Nb.j;
import a1.a;

public final class y implements v {
    public final f0 a;
    public final long b;

    public y(f0 f00, long v) {
        this.a = f00;
        this.b = v;
    }

    // Deobfuscation rating: LOW(20)
    public final float a() {
        return a.c(this.b) ? this.a.i0(a.g(this.b)) : Infinityf;
    }

    // Deobfuscation rating: LOW(20)
    public final float b() {
        return a.d(this.b) ? this.a.i0(a.h(this.b)) : Infinityf;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof y)) {
            return false;
        }
        return j.a(this.a, ((y)object0).a) ? a.b(this.b, ((y)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return ((int)(this.b ^ this.b >>> 0x20)) + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + a.l(this.b) + ')';
    }
}

