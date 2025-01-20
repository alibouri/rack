package a1;

public final class k {
    public final long a;

    public k(long v) {
        this.a = v;
    }

    public static final boolean a(long v, long v1) {
        return v == v1;
    }

    public static String b(long v) {
        if(k.a(v, 0L)) {
            return "Unspecified";
        }
        if(k.a(v, 0x100000000L)) {
            return "Sp";
        }
        return k.a(v, 0x200000000L) ? "Em" : "Invalid";
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof k && this.a == ((k)object0).a;
    }

    @Override
    public final int hashCode() {
        return (int)(this.a ^ this.a >>> 0x20);
    }

    @Override
    public final String toString() {
        return k.b(this.a);
    }
}

