package s;

import Y8.o;

public final class h {
    public final long a;

    public h(long v) {
        this.a = v;
    }

    public static long a(int v, int v1) {
        return ((long)v1) & 0xFFFFFFFFL | ((long)v) << 0x20;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof h && this.a == ((h)object0).a;
    }

    @Override
    public final int hashCode() {
        return (int)(this.a ^ this.a >>> 0x20);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("(");
        stringBuilder0.append(((int)(this.a >> 0x20)));
        stringBuilder0.append(", ");
        return o.z(stringBuilder0, ((int)(this.a & 0xFFFFFFFFL)), ')');
    }
}

