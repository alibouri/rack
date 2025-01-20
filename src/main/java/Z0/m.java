package z0;

public final class m {
    public final long a;

    public m(long v) {
        this.a = v;
    }

    public static final boolean a(long v, long v1) {
        return v == v1;
    }

    public static String b(long v) {
        return "PointerId(value=" + v + ')';
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof m && this.a == ((m)object0).a;
    }

    @Override
    public final int hashCode() {
        return (int)(this.a ^ this.a >>> 0x20);
    }

    @Override
    public final String toString() {
        return m.b(this.a);
    }
}

