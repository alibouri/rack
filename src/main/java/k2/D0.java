package k2;

import m5.b;

public final class d0 extends e0 {
    public static final d0 b;
    public static final d0 c;

    static {
        d0.b = new d0(true);  // initializer: Lk2/e0;-><init>(Z)V
        d0.c = new d0(false);  // initializer: Lk2/e0;-><init>(Z)V
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof d0 && this.a == ((d0)object0).a;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final int hashCode() {
        return this.a ? 0x4CF : 0x4D5;
    }

    @Override
    public final String toString() {
        return b.z(new StringBuilder("NotLoading(endOfPaginationReached="), this.a, ')');
    }
}

