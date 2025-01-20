package k4;

public final class a {
    public final String a;
    public final int b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final a n;

    static {
        a.c = new a("BYTE", 1);
        a.d = new a("STRING", 1);
        a.e = new a("USHORT", 2);
        a.f = new a("ULONG", 4);
        a.g = new a("URATIONAL", 8);
        a.h = new a("SBYTE", 1);
        a.i = new a("UNDEFINED", 1);
        a.j = new a("SSHORT", 2);
        a.k = new a("SLONG", 4);
        a.l = new a("SRATIONAL", 8);
        a.m = new a("SINGLE", 4);
        a.n = new a("DOUBLE", 8);
    }

    public a(String s, int v) {
        this.a = s;
        this.b = v;
    }

    @Override
    public final String toString() {
        return this.a;
    }
}

