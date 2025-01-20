package l1;

import o1.d;

public final class f {
    public int a;
    public int b;
    public float c;
    public int d;
    public String e;
    public String f;
    public boolean g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;

    static {
        f.h = new String("FIXED_DIMENSION");
        f.i = new String("WRAP_DIMENSION");
        f.j = new String("SPREAD_DIMENSION");
        f.k = new String("PARENT_DIMENSION");
        f.l = new String("PERCENT_DIMENSION");
        f.m = new String("RATIO_DIMENSION");
    }

    public f(String s) {
        this.a = 0;
        this.b = 0x7FFFFFFF;
        this.c = 1.0f;
        this.d = 0;
        this.e = null;
        this.g = false;
        this.f = s;
    }

    public final void a(d d0, int v) {
        String s = this.e;
        if(s != null) {
            d0.K(s);
        }
        String s1 = f.k;
        String s2 = f.l;
        String s3 = f.i;
        int v1 = 2;
        if(v == 0) {
            if(this.g) {
                d0.O(3);
                String s4 = this.f;
                if(s4 == s3) {
                    v1 = 1;
                }
                else if(s4 != s2) {
                    v1 = 0;
                }
                d0.P(v1, this.a, this.b, this.c);
                return;
            }
            int v2 = this.a;
            if(v2 > 0) {
                d0.c0 = v2;
            }
            int v3 = this.b;
            if(v3 < 0x7FFFFFFF) {
                d0.D[0] = v3;
            }
            String s5 = this.f;
            if(s5 == s3) {
                d0.O(2);
                return;
            }
            if(s5 == s1) {
                d0.O(4);
                return;
            }
            if(s5 == null) {
                d0.O(1);
                d0.S(this.d);
            }
        }
        else {
            if(this.g) {
                d0.Q(3);
                String s6 = this.f;
                if(s6 == s3) {
                    v1 = 1;
                }
                else if(s6 != s2) {
                    v1 = 0;
                }
                d0.R(v1, this.a, this.b, this.c);
                return;
            }
            int v4 = this.a;
            if(v4 > 0) {
                d0.d0 = v4;
            }
            int v5 = this.b;
            if(v5 < 0x7FFFFFFF) {
                d0.D[1] = v5;
            }
            String s7 = this.f;
            if(s7 == s3) {
                d0.Q(2);
                return;
            }
            if(s7 == s1) {
                d0.Q(4);
                return;
            }
            if(s7 == null) {
                d0.Q(1);
                d0.N(this.d);
            }
        }
    }

    public static f b(int v) {
        f f0 = new f(f.h);
        f0.f = null;
        f0.d = v;
        return f0;
    }

    public static f c(String s) {
        f f0 = new f();  // initializer: Ljava/lang/Object;-><init>()V
        f0.a = 0;
        f0.b = 0x7FFFFFFF;
        f0.c = 1.0f;
        f0.d = 0;
        f0.e = null;
        f0.f = s;
        f0.g = true;
        return f0;
    }
}

