package m0;

import Bb.F;

public final class e {
    public final long a;

    public e(long v) {
        this.a = v;
    }

    public static final boolean a(long v, long v1) {
        return v == v1;
    }

    public static final float b(long v) {
        if(v == 0x7FC000007FC00000L) {
            throw new IllegalStateException("Size is unspecified");
        }
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    public static final float c(long v) {
        if(v == 0x7FC000007FC00000L) {
            throw new IllegalStateException("Size is unspecified");
        }
        return Math.min(Float.intBitsToFloat(((int)(v >> 0x20 & 0x7FFFFFFFL))), Float.intBitsToFloat(((int)(v & 0x7FFFFFFFL))));
    }

    public static final float d(long v) {
        if(v == 0x7FC000007FC00000L) {
            throw new IllegalStateException("Size is unspecified");
        }
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    public static final boolean e(long v) {
        if(v == 0x7FC000007FC00000L) {
            throw new IllegalStateException("Size is unspecified");
        }
        long v1 = v & ~(((0x8000000080000000L & v) >>> 0x1F) * -1L);
        return (v1 & 0xFFFFFFFFL & v1 >>> 0x20) == 0L;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof e && this.a == ((e)object0).a;
    }

    public static String f(long v) {
        return v == 0x7FC000007FC00000L ? "Size.Unspecified" : "Size(" + F.c0(e.d(v)) + ", " + F.c0(e.b(v)) + ')';
    }

    @Override
    public final int hashCode() {
        return (int)(this.a ^ this.a >>> 0x20);
    }

    @Override
    public final String toString() {
        return e.f(this.a);
    }
}

