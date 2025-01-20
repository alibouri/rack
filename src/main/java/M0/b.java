package m0;

import Bb.F;
import yc.d;

public final class b {
    public final long a;

    public b(long v) {
        this.a = v;
    }

    public static long a(long v, float f, int v1) {
        float f1 = (v1 & 1) == 0 ? 0.0f : Float.intBitsToFloat(((int)(v >> 0x20)));
        if((v1 & 2) != 0) {
            f = Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
        }
        return ((long)Float.floatToRawIntBits(f1)) << 0x20 | ((long)Float.floatToRawIntBits(f)) & 0xFFFFFFFFL;
    }

    public static final boolean b(long v, long v1) {
        return v == v1;
    }

    public static final float c(long v) {
        float f = Float.intBitsToFloat(((int)(v >> 0x20)));
        float f1 = Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
        return (float)Math.sqrt(f1 * f1 + f * f);
    }

    public static final float d(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    public static final float e(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof b && this.a == ((b)object0).a;
    }

    public static int f(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static final boolean g(long v) {
        return (~(v & 0x7FFFFFFF7FFFFFFFL) & (v & 0x7FFFFFFF7FFFFFFFL) - 0x7F8000017F800001L & 0x8000000080000000L) == 0x8000000080000000L;
    }

    public static final long h(long v, long v1) {
        return ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v >> 0x20))) - Float.intBitsToFloat(((int)(v1 >> 0x20))))) << 0x20 | ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) - Float.intBitsToFloat(((int)(v1 & 0xFFFFFFFFL))))) & 0xFFFFFFFFL;
    }

    @Override
    public final int hashCode() {
        return b.f(this.a);
    }

    public static final long i(long v, long v1) {
        return ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v1 & 0xFFFFFFFFL))) + Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v1 >> 0x20))) + Float.intBitsToFloat(((int)(v >> 0x20))))) << 0x20;
    }

    public static final long j(float f, long v) {
        return ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) * f)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v >> 0x20))) * f)) << 0x20;
    }

    // Deobfuscation rating: LOW(20)
    public static String k(long v) {
        return d.o(v) ? "Offset(" + F.c0(b.d(v)) + ", " + F.c0(b.e(v)) + ')' : "Offset.Unspecified";
    }

    @Override
    public final String toString() {
        return b.k(this.a);
    }
}

