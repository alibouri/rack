package k2;

import Nb.j;

public final class b0 extends e0 {
    public final Exception b;

    public b0(Exception exception0) {
        j.f(exception0, "error");
        super(false);
        this.b = exception0;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof b0 && this.a == ((b0)object0).a && j.a(this.b, ((b0)object0).b);
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final int hashCode() {
        return this.a ? this.b.hashCode() + 0x4CF : this.b.hashCode() + 0x4D5;
    }

    @Override
    public final String toString() {
        return "Error(endOfPaginationReached=" + this.a + ", error=" + this.b + ')';
    }
}

