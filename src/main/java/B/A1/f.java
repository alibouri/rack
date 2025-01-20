package a1;

public final class f {
    public final long a;

    public f(long v) {
        this.a = v;
    }

    public static final float a(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    public static final float b(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof f && this.a == ((f)object0).a;
    }

    @Override
    public final int hashCode() {
        return (int)(this.a ^ this.a >>> 0x20);
    }

    @Override
    public final String toString() {
        return this.a == 0x7FC000007FC00000L ? "DpSize.Unspecified" : d.b(f.b(this.a)) + " x " + d.b(f.a(this.a));
    }
}

