package p1;

import o1.c;
import o1.d;
import v.h;

public abstract class o implements e {
    public int a;
    public d b;
    public l c;
    public int d;
    public final g e;
    public int f;
    public boolean g;
    public final f h;
    public final f i;
    public int j;

    public o(d d0) {
        this.e = new g(this);
        this.f = 0;
        this.g = false;
        this.h = new f(this);
        this.i = new f(this);
        this.j = 1;
        this.b = d0;
    }

    public static void b(f f0, f f1, int v) {
        f0.l.add(f1);
        f0.f = v;
        f1.k.add(f0);
    }

    public final void c(f f0, f f1, int v, g g0) {
        f0.l.add(f1);
        f0.l.add(this.e);
        f0.h = v;
        f0.i = g0;
        f1.k.add(f0);
        g0.k.add(f0);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int v, int v1) {
        int v3;
        if(v1 == 0) {
            int v2 = this.b.w;
            v3 = v2 <= 0 ? Math.max(this.b.v, v) : Math.min(v2, v);
            return v3 == v ? v : v3;
        }
        int v4 = this.b.z;
        v3 = v4 <= 0 ? Math.max(this.b.y, v) : Math.min(v4, v);
        return v3 == v ? v : v3;
    }

    public static f h(c c0) {
        c c1 = c0.f;
        if(c1 == null) {
            return null;
        }
        d d0 = c1.d;
        switch(h.d(c1.e)) {
            case 1: {
                return d0.d.h;
            }
            case 2: {
                return d0.e.h;
            }
            case 3: {
                return d0.d.i;
            }
            case 4: {
                return d0.e.i;
            }
            case 5: {
                return d0.e.k;
            }
            default: {
                return null;
            }
        }
    }

    public static f i(c c0, int v) {
        c c1 = c0.f;
        if(c1 == null) {
            return null;
        }
        d d0 = c1.d;
        k k0 = v == 0 ? d0.d : d0.e;
        switch(h.d(c1.e)) {
            case 1: 
            case 2: {
                return k0.h;
            }
            case 3: 
            case 4: {
                return k0.i;
            }
            default: {
                return null;
            }
        }
    }

    // Deobfuscation rating: LOW(20)
    public long j() {
        return this.e.j ? ((long)this.e.g) : 0L;
    }

    public abstract boolean k();

    public final void l(c c0, c c1, int v) {
        f f0 = o.h(c0);
        f f1 = o.h(c1);
        if(f0.j && f1.j) {
            int v1 = c0.e() + f0.g;
            int v2 = c1.e();
            int v3 = f1.g - v2;
            int v4 = v3 - v1;
            g g0 = this.e;
            if(!g0.j && this.d == 3) {
                switch(this.a) {
                    case 0: {
                        g0.d(this.g(v4, v));
                        break;
                    }
                    case 1: {
                        g0.d(Math.min(this.g(g0.m, v), v4));
                        break;
                    }
                    case 2: {
                        d d0 = this.b;
                        o1.e e0 = d0.U;
                        if(e0 != null) {
                            k k0 = v == 0 ? e0.d : e0.e;
                            g g1 = k0.e;
                            if(g1.j) {
                                g0.d(this.g(((int)(((float)g1.g) * (v == 0 ? d0.x : d0.A) + 0.5f)), v));
                            }
                        }
                        break;
                    }
                    case 3: {
                        d d1 = this.b;
                        k k1 = d1.d;
                        if(k1.d != 3 || k1.a != 3 || (d1.e.d != 3 || d1.e.a != 3)) {
                            if(v == 0) {
                                k1 = d1.e;
                            }
                            g g2 = k1.e;
                            if(g2.j) {
                                g0.d((v == 1 ? ((int)(((float)g2.g) / d1.X + 0.5f)) : ((int)(d1.X * ((float)g2.g) + 0.5f))));
                            }
                        }
                    }
                }
            }
            if(!g0.j) {
                return;
            }
            int v5 = g0.g;
            f f2 = this.i;
            f f3 = this.h;
            if(v5 == v4) {
                f3.d(v1);
                f2.d(v3);
                return;
            }
            float f4 = v == 0 ? this.b.e0 : this.b.f0;
            if(f0 == f1) {
                v1 = f0.g;
                v3 = f1.g;
                f4 = 0.5f;
            }
            f3.d(((int)(((float)(v3 - v1 - v5)) * f4 + (((float)v1) + 0.5f))));
            f2.d(f3.g + g0.g);
        }
    }
}

