package m0;

import Bb.F;
import Bb.q;

public abstract class a {
    public static final long a;
    public static final int b;

    static {
        a.a = q.a(0.0f, 0.0f);
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
        return Float.compare(a.b(v), a.c(v)) == 0 ? "CornerRadius.circular(" + F.c0(a.b(v)) + ')' : "CornerRadius.elliptical(" + F.c0(a.b(v)) + ", " + F.c0(a.c(v)) + ')';
    }
}

