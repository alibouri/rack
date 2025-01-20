package x0;

import W5.f;

public final class a {
    public final long a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final int n;

    static {
        a.b = f.f(4);
        a.c = f.f(19);
        a.d = f.f(20);
        a.e = f.f(21);
        a.f = f.f(22);
        a.g = f.f(23);
        a.h = f.f(61);
        a.i = f.f(66);
        a.j = f.f(0x6F);
        a.k = f.f(92);
        a.l = f.f(93);
        a.m = f.f(0xA0);
    }

    public a(long v) {
        this.a = v;
    }

    public static final boolean a(long v, long v1) {
        return v == v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof a && this.a == ((a)object0).a;
    }

    @Override
    public final int hashCode() {
        return (int)(this.a ^ this.a >>> 0x20);
    }

    @Override
    public final String toString() {
        return "Key code: " + this.a;
    }
}

