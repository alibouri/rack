package n0;

public final class W {
    public final long a;
    public static final long b;
    public static final int c;

    static {
        W.b = M.i(0.5f, 0.5f);
    }

    public W(long v) {
        this.a = v;
    }

    public static final boolean a(long v, long v1) {
        return v == v1;
    }

    public static final float b(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    public static final float c(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    public static String d(long v) {
        return "TransformOrigin(packedValue=" + v + ')';
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof W && this.a == ((W)object0).a;
    }

    @Override
    public final int hashCode() {
        return (int)(this.a ^ this.a >>> 0x20);
    }

    @Override
    public final String toString() {
        return W.d(this.a);
    }
}

