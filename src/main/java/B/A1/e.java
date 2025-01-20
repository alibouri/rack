package a1;

public final class e {
    public final long a;

    public e(long v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof e && this.a == ((e)object0).a;
    }

    @Override
    public final int hashCode() {
        return (int)(this.a ^ this.a >>> 0x20);
    }

    @Override
    public final String toString() {
        return this.a == 0x7FC000007FC00000L ? "DpOffset.Unspecified" : "(" + d.b(Float.intBitsToFloat(((int)(this.a >> 0x20)))) + ", " + d.b(Float.intBitsToFloat(((int)(this.a & 0xFFFFFFFFL)))) + ')';
    }
}

