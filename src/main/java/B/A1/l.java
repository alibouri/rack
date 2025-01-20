package a1;

public final class l {
    public final long a;

    public l(long v) {
        this.a = v;
    }

    public static long a(float f, float f1, int v, long v1) {
        if((v & 1) != 0) {
            f = Float.intBitsToFloat(((int)(v1 >> 0x20)));
        }
        if((v & 2) != 0) {
            f1 = Float.intBitsToFloat(((int)(v1 & 0xFFFFFFFFL)));
        }
        return ((long)Float.floatToRawIntBits(f1)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f)) << 0x20;
    }

    public static final float b(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    public static final float c(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    public static final long d(long v, long v1) {
        return ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v >> 0x20))) - Float.intBitsToFloat(((int)(v1 >> 0x20))))) << 0x20 | ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) - Float.intBitsToFloat(((int)(v1 & 0xFFFFFFFFL))))) & 0xFFFFFFFFL;
    }

    public static final long e(long v, long v1) {
        return ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v1 & 0xFFFFFFFFL))) + Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v1 >> 0x20))) + Float.intBitsToFloat(((int)(v >> 0x20))))) << 0x20;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof l && this.a == ((l)object0).a;
    }

    public static final long f(float f, long v) {
        return ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) * f)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v >> 0x20))) * f)) << 0x20;
    }

    public static String g(long v) {
        return "(" + l.b(v) + ", " + l.c(v) + ") px/sec";
    }

    @Override
    public final int hashCode() {
        return (int)(this.a ^ this.a >>> 0x20);
    }

    @Override
    public final String toString() {
        return l.g(this.a);
    }
}

