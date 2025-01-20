package a1;

import Y8.o;

public final class g {
    public final long a;

    public g(long v) {
        this.a = v;
    }

    public static long a(int v, int v1, int v2, long v3) {
        if((v2 & 1) != 0) {
            v = (int)(v3 >> 0x20);
        }
        if((v2 & 2) != 0) {
            v1 = (int)(v3 & 0xFFFFFFFFL);
        }
        return ((long)v1) & 0xFFFFFFFFL | ((long)v) << 0x20;
    }

    public static final boolean b(long v, long v1) {
        return v == v1;
    }

    public static final long c(long v, long v1) {
        return ((long)(((int)(v >> 0x20)) - ((int)(v1 >> 0x20)))) << 0x20 | ((long)(((int)(v & 0xFFFFFFFFL)) - ((int)(v1 & 0xFFFFFFFFL)))) & 0xFFFFFFFFL;
    }

    public static final long d(long v, long v1) {
        return ((long)(((int)(v >> 0x20)) + ((int)(v1 >> 0x20)))) << 0x20 | ((long)(((int)(v & 0xFFFFFFFFL)) + ((int)(v1 & 0xFFFFFFFFL)))) & 0xFFFFFFFFL;
    }

    public static String e(long v) {
        StringBuilder stringBuilder0 = new StringBuilder("(");
        stringBuilder0.append(((int)(v >> 0x20)));
        stringBuilder0.append(", ");
        return o.z(stringBuilder0, ((int)(v & 0xFFFFFFFFL)), ')');
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof g && this.a == ((g)object0).a;
    }

    @Override
    public final int hashCode() {
        return (int)(this.a ^ this.a >>> 0x20);
    }

    @Override
    public final String toString() {
        return g.e(this.a);
    }
}

