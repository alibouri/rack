package y5;

import r5.h;
import r5.i;

public final class b {
    public final long a;
    public final i b;
    public final h c;

    public b(long v, i i0, h h0) {
        this.a = v;
        this.b = i0;
        this.c = h0;
    }

    // Deobfuscation rating: LOW(40)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof b && (this.a == ((b)object0).a && this.b.equals(((b)object0).b) && this.c.equals(((b)object0).c));
    }

    @Override
    public final int hashCode() {
        return ((((int)(this.a >>> 0x20 ^ this.a)) ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}

