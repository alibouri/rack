package j6;

import N5.r;

public final class p {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Boolean k;

    public p(long v, String s, String s1) {
        this(s, s1, 0L, 0L, 0L, v, 0L, null, null, null, null);
    }

    public p(String s, String s1, long v, long v1, long v2, long v3, long v4, Long long0, Long long1, Long long2, Boolean boolean0) {
        r.f(s);
        r.f(s1);
        boolean z = false;
        r.b(Long.compare(v, 0L) >= 0);
        r.b(v1 >= 0L);
        r.b(v2 >= 0L);
        if(v4 >= 0L) {
            z = true;
        }
        r.b(z);
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.f = v3;
        this.g = v4;
        this.h = long0;
        this.i = long1;
        this.j = long2;
        this.k = boolean0;
    }

    public final p a(long v) {
        return new p(this.a, this.b, this.c, this.d, this.e, v, this.g, this.h, this.i, this.j, this.k);
    }

    public final p b(Long long0, Long long1, Boolean boolean0) {
        return boolean0 == null || boolean0.booleanValue() ? new p(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, long0, long1, boolean0) : new p(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, long0, long1, null);
    }
}

