package n0;

import M.J;
import a.a;
import o0.c;
import o0.d;
import o0.g;
import o0.h;
import o0.j;
import s.s;

public final class v {
    public final long a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final int j;

    static {
        v.b = 0xFF00000000000000L;
        v.c = 0xFF44444400000000L;
        v.d = 0xFF88888800000000L;
        v.e = 0xFFFFFFFF00000000L;
        v.f = 0xFFFF000000000000L;
        v.g = 0xFF0000FF00000000L;
        v.h = M.c(0);
        v.i = M.b(0.0f, 0.0f, 0.0f, 0.0f, d.s);
    }

    public v(long v) {
        this.a = v;
    }

    public static final long a(long v, c c0) {
        c c1 = v.f(v);
        int v1 = c1.c;
        int v2 = c0.c;
        if((v1 | v2) < 0) {
            return j.e(c1, c0, 0).a(v);
        }
        s s0 = h.a;
        int v3 = v1 | v2 << 6;
        Object object0 = s0.f(v3);
        if(object0 == null) {
            object0 = j.e(c1, c0, 0);
            s0.i(v3, object0);
        }
        return ((g)object0).a(v);
    }

    public static long b(float f, long v) {
        return M.b(v.h(v), v.g(v), v.e(v), f, v.f(v));
    }

    public static final boolean c(long v, long v1) {
        return v == v1;
    }

    public static final float d(long v) {
        return (0x3FL & v) == 0L ? ((float)a.C(v >>> 56 & 0xFFL)) / 255.0f : ((float)a.C(v >>> 6 & 0x3FFL)) / 1023.0f;
    }

    public static final float e(long v) {
        if((0x3FL & v) == 0L) {
            return ((float)a.C(v >>> 0x20 & 0xFFL)) / 255.0f;
        }
        int v1 = (short)(((int)(v >>> 16 & 0xFFFFL)));
        int v2 = (0xFFFF & v1) >>> 10 & 0x1F;
        if(v2 == 0) {
            if((v1 & 0x3FF) != 0) {
                float f = Float.intBitsToFloat((v1 & 0x3FF) + 0x3F000000) - C.a;
                return (0x8000 & v1) == 0 ? f : -f;
            }
            return Float.intBitsToFloat((0x8000 & v1) << 16);
        }
        int v3 = (v1 & 0x3FF) << 13;
        if(v2 == 0x1F) {
            if(v3 != 0) {
                v3 |= 0x400000;
            }
            return Float.intBitsToFloat(0x7F800000 | (0x8000 & v1) << 16 | v3);
        }
        return Float.intBitsToFloat(v2 + 0x70 << 23 | (0x8000 & v1) << 16 | v3);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof v && this.a == ((v)object0).a;
    }

    public static final c f(long v) {
        return d.u[((int)(v & 0x3FL))];
    }

    public static final float g(long v) {
        if((0x3FL & v) == 0L) {
            return ((float)a.C(v >>> 40 & 0xFFL)) / 255.0f;
        }
        int v1 = (short)(((int)(v >>> 0x20 & 0xFFFFL)));
        int v2 = (0xFFFF & v1) >>> 10 & 0x1F;
        if(v2 == 0) {
            if((v1 & 0x3FF) != 0) {
                float f = Float.intBitsToFloat((v1 & 0x3FF) + 0x3F000000) - C.a;
                return (0x8000 & v1) == 0 ? f : -f;
            }
            return Float.intBitsToFloat((0x8000 & v1) << 16);
        }
        int v3 = (v1 & 0x3FF) << 13;
        if(v2 == 0x1F) {
            if(v3 != 0) {
                v3 |= 0x400000;
            }
            return Float.intBitsToFloat(0x7F800000 | (0x8000 & v1) << 16 | v3);
        }
        return Float.intBitsToFloat(v2 + 0x70 << 23 | (0x8000 & v1) << 16 | v3);
    }

    public static final float h(long v) {
        if(Long.compare(0x3FL & v, 0L) == 0) {
            return ((float)a.C(v >>> 0x30 & 0xFFL)) / 255.0f;
        }
        int v1 = (short)(((int)(v >>> 0x30 & 0xFFFFL)));
        int v2 = (0xFFFF & v1) >>> 10 & 0x1F;
        if(v2 == 0) {
            if((v1 & 0x3FF) != 0) {
                float f = Float.intBitsToFloat((v1 & 0x3FF) + 0x3F000000) - C.a;
                return (0x8000 & v1) == 0 ? f : -f;
            }
            return Float.intBitsToFloat((0x8000 & v1) << 16);
        }
        int v3 = (v1 & 0x3FF) << 13;
        if(v2 == 0x1F) {
            if(v3 != 0) {
                v3 |= 0x400000;
            }
            return Float.intBitsToFloat(0x7F800000 | (0x8000 & v1) << 16 | v3);
        }
        return Float.intBitsToFloat(v2 + 0x70 << 23 | (0x8000 & v1) << 16 | v3);
    }

    @Override
    public final int hashCode() {
        return v.i(this.a);
    }

    public static int i(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static String j(long v) {
        StringBuilder stringBuilder0 = new StringBuilder("Color(");
        stringBuilder0.append(v.h(v));
        stringBuilder0.append(", ");
        stringBuilder0.append(v.g(v));
        stringBuilder0.append(", ");
        stringBuilder0.append(v.e(v));
        stringBuilder0.append(", ");
        stringBuilder0.append(v.d(v));
        stringBuilder0.append(", ");
        return J.g(stringBuilder0, v.f(v).a, ')');
    }

    @Override
    public final String toString() {
        return v.j(this.a);
    }
}

