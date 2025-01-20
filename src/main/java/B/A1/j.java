package a1;

import Bb.q;

public final class j {
    public final long a;
    public static final k[] b;
    public static final long c;

    static {
        j.b = new k[]{new k(0L), new k(0x100000000L), new k(0x200000000L)};
        j.c = q.P(NaNf, 0L);
    }

    public j(long v) {
        this.a = v;
    }

    public static final boolean a(long v, long v1) {
        return v == v1;
    }

    public static final long b(long v) {
        return j.b[((int)((v & 0xFF00000000L) >>> 0x20))].a;
    }

    public static final float c(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    public static int d(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static String e(long v) {
        long v1 = j.b(v);
        if(k.a(v1, 0L)) {
            return "Unspecified";
        }
        if(k.a(v1, 0x100000000L)) {
            return j.c(v) + ".sp";
        }
        return k.a(v1, 0x200000000L) ? j.c(v) + ".em" : "Invalid";
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof j && this.a == ((j)object0).a;
    }

    @Override
    public final int hashCode() {
        return j.d(this.a);
    }

    @Override
    public final String toString() {
        return j.e(this.a);
    }
}

