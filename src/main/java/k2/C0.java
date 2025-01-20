package k2;

import m5.b;

public final class c0 extends e0 {
    public static final c0 b;

    static {
        c0.b = new c0(false);  // initializer: Lk2/e0;-><init>(Z)V
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof c0 && this.a == ((c0)object0).a;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final int hashCode() {
        return this.a ? 0x4CF : 0x4D5;
    }

    @Override
    public final String toString() {
        return b.z(new StringBuilder("Loading(endOfPaginationReached="), this.a, ')');
    }
}

