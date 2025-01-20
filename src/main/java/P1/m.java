package p1;

import o1.c;
import o1.d;
import o1.i;
import v.h;

public final class m extends o {
    public f k;
    public a l;

    @Override  // p1.e
    public final void a(e e0) {
        int v;
        if(h.d(this.j) != 3) {
            g g0 = this.e;
            if(g0.c && !g0.j && this.d == 3) {
                d d0 = this.b;
                switch(d0.t) {
                    case 2: {
                        o1.e e1 = d0.U;
                        if(e1 != null) {
                            g g1 = e1.e.e;
                            if(g1.j) {
                                g0.d(((int)(((float)g1.g) * d0.A + 0.5f)));
                            }
                        }
                        break;
                    }
                    case 3: {
                        g g2 = d0.d.e;
                        if(g2.j) {
                            switch(d0.Y) {
                                case -1: {
                                    v = (int)(((float)g2.g) / d0.X + 0.5f);
                                    break;
                                }
                                case 0: {
                                    v = (int)(((float)g2.g) * d0.X + 0.5f);
                                    break;
                                }
                                case 1: {
                                    v = (int)(((float)g2.g) / d0.X + 0.5f);
                                    break;
                                }
                                default: {
                                    v = 0;
                                }
                            }
                            g0.d(v);
                        }
                    }
                }
            }
            f f0 = this.h;
            if(f0.c) {
                f f1 = this.i;
                if(!f1.c || f0.j && f1.j && g0.j) {
                    return;
                }
                if(!g0.j && this.d == 3 && (this.b.s == 0 && !this.b.z())) {
                    f f2 = (f)f0.l.get(0);
                    f f3 = (f)f1.l.get(0);
                    int v1 = f2.g + f0.f;
                    int v2 = f3.g + f1.f;
                    f0.d(v1);
                    f1.d(v2);
                    g0.d(v2 - v1);
                    return;
                }
                if(!g0.j && this.d == 3 && this.a == 1 && f0.l.size() > 0 && f1.l.size() > 0) {
                    f f4 = (f)f0.l.get(0);
                    int v3 = ((f)f1.l.get(0)).g + f1.f - (f4.g + f0.f);
                    int v4 = g0.m;
                    if(v3 < v4) {
                        g0.d(v3);
                    }
                    else {
                        g0.d(v4);
                    }
                }
                if(!g0.j) {
                    return;
                }
                if(f0.l.size() > 0 && f1.l.size() > 0) {
                    f f5 = (f)f0.l.get(0);
                    f f6 = (f)f1.l.get(0);
                    int v5 = f5.g;
                    int v6 = f0.f + v5;
                    int v7 = f6.g;
                    int v8 = f1.f + v7;
                    float f7 = this.b.f0;
                    if(f5 == f6) {
                        f7 = 0.5f;
                    }
                    else {
                        v5 = v6;
                        v7 = v8;
                    }
                    f0.d(((int)(((float)(v7 - v5 - g0.g)) * f7 + (((float)v5) + 0.5f))));
                    f1.d(f0.g + g0.g);
                }
            }
            return;
        }
        this.l(this.b.K, this.b.M, 1);
    }

    @Override  // p1.o
    public final void d() {
        d d0 = this.b;
        g g0 = this.e;
        if(d0.a) {
            g0.d(d0.l());
        }
        f f0 = this.i;
        f f1 = this.h;
        if(!g0.j) {
            d d1 = this.b;
            this.d = d1.q0[1];
            if(d1.F) {
                this.l = new a(this);  // initializer: Lp1/g;-><init>(Lp1/o;)V
            }
            int v = this.d;
            if(v != 3) {
                if(v == 4) {
                    o1.e e0 = this.b.U;
                    if(e0 != null && e0.q0[1] == 1) {
                        int v1 = this.b.K.e();
                        int v2 = this.b.M.e();
                        int v3 = this.b.K.e();
                        o.b(f1, e0.e.h, v3);
                        int v4 = this.b.M.e();
                        o.b(f0, e0.e.i, -v4);
                        g0.d(e0.l() - v1 - v2);
                        return;
                    }
                }
                if(v == 1) {
                    g0.d(this.b.l());
                }
            }
        }
        else if(this.d == 4) {
            d d2 = this.b;
            o1.e e1 = d2.U;
            if(e1 != null && e1.q0[1] == 1) {
                int v5 = d2.K.e();
                o.b(f1, e1.e.h, v5);
                int v6 = this.b.M.e();
                o.b(f0, e1.e.i, -v6);
                return;
            }
        }
        boolean z = g0.j;
        f f2 = this.k;
        if(z) {
            d d3 = this.b;
            if(d3.a) {
                c[] arr_c = d3.R;
                c c0 = arr_c[2];
                c c1 = c0.f;
                if(c1 != null && arr_c[3].f != null) {
                    if(d3.z()) {
                        f1.f = this.b.R[2].e();
                        f0.f = -this.b.R[3].e();
                    }
                    else {
                        f f3 = o.h(this.b.R[2]);
                        if(f3 != null) {
                            o.b(f1, f3, this.b.R[2].e());
                        }
                        f f4 = o.h(this.b.R[3]);
                        if(f4 != null) {
                            o.b(f0, f4, -this.b.R[3].e());
                        }
                        f1.b = true;
                        f0.b = true;
                    }
                    d d4 = this.b;
                    if(d4.F) {
                        o.b(f2, f1, d4.b0);
                    }
                }
                else if(c1 != null) {
                    f f5 = o.h(c0);
                    if(f5 != null) {
                        o.b(f1, f5, this.b.R[2].e());
                        o.b(f0, f1, g0.g);
                        d d5 = this.b;
                        if(d5.F) {
                            o.b(f2, f1, d5.b0);
                        }
                    }
                }
                else {
                    c c2 = arr_c[3];
                    if(c2.f == null) {
                        c c3 = arr_c[4];
                        if(c3.f != null) {
                            f f7 = o.h(c3);
                            if(f7 != null) {
                                o.b(f2, f7, 0);
                                o.b(f1, f2, -this.b.b0);
                                o.b(f0, f1, g0.g);
                            }
                        }
                        else if(!(d3 instanceof i) && d3.U != null && d3.j(7).f == null) {
                            o.b(f1, this.b.U.e.h, this.b.t());
                            o.b(f0, f1, g0.g);
                            d d7 = this.b;
                            if(d7.F) {
                                o.b(f2, f1, d7.b0);
                            }
                        }
                    }
                    else {
                        f f6 = o.h(c2);
                        if(f6 != null) {
                            o.b(f0, f6, -this.b.R[3].e());
                            o.b(f1, f0, -g0.g);
                        }
                        d d6 = this.b;
                        if(d6.F) {
                            o.b(f2, f1, d6.b0);
                        }
                    }
                }
            }
            else {
                goto label_95;
            }
        }
        else {
        label_95:
            if(z || this.d != 3) {
                g0.b(this);
            }
            else {
                d d8 = this.b;
                switch(d8.t) {
                    case 2: {
                        o1.e e2 = d8.U;
                        if(e2 != null) {
                            g g1 = e2.e.e;
                            g0.l.add(g1);
                            g1.k.add(g0);
                            g0.b = true;
                            g0.k.add(f1);
                            g0.k.add(f0);
                        }
                        break;
                    }
                    case 3: {
                        if(!d8.z()) {
                            d d9 = this.b;
                            if(d9.s != 3) {
                                g g2 = d9.d.e;
                                g0.l.add(g2);
                                g2.k.add(g0);
                                g0.b = true;
                                g0.k.add(f1);
                                g0.k.add(f0);
                            }
                        }
                    }
                }
            }
            d d10 = this.b;
            c[] arr_c1 = d10.R;
            c c4 = arr_c1[2];
            c c5 = c4.f;
            if(c5 != null && arr_c1[3].f != null) {
                if(d10.z()) {
                    f1.f = this.b.R[2].e();
                    f0.f = -this.b.R[3].e();
                }
                else {
                    f f8 = o.h(this.b.R[2]);
                    f f9 = o.h(this.b.R[3]);
                    if(f8 != null) {
                        f8.b(this);
                    }
                    if(f9 != null) {
                        f9.b(this);
                    }
                    this.j = 4;
                }
                if(this.b.F) {
                    this.c(f2, f1, 1, this.l);
                }
            }
            else if(c5 == null) {
                c c6 = arr_c1[3];
                if(c6.f == null) {
                    c c7 = arr_c1[4];
                    if(c7.f != null) {
                        f f12 = o.h(c7);
                        if(f12 != null) {
                            o.b(f2, f12, 0);
                            this.c(f1, f2, -1, this.l);
                            this.c(f0, f1, 1, g0);
                        }
                    }
                    else if(!(d10 instanceof i)) {
                        o1.e e3 = d10.U;
                        if(e3 != null) {
                            o.b(f1, e3.e.h, d10.t());
                            this.c(f0, f1, 1, g0);
                            if(this.b.F) {
                                this.c(f2, f1, 1, this.l);
                            }
                            if(this.d == 3) {
                                d d12 = this.b;
                                if(d12.X > 0.0f) {
                                    k k1 = d12.d;
                                    if(k1.d == 3) {
                                        k1.e.k.add(g0);
                                        g0.l.add(this.b.d.e);
                                        g0.a = this;
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                    f f11 = o.h(c6);
                    if(f11 != null) {
                        o.b(f0, f11, -this.b.R[3].e());
                        this.c(f1, f0, -1, g0);
                        if(this.b.F) {
                            this.c(f2, f1, 1, this.l);
                        }
                    }
                }
            }
            else {
                f f10 = o.h(c4);
                if(f10 != null) {
                    o.b(f1, f10, this.b.R[2].e());
                    this.c(f0, f1, 1, g0);
                    if(this.b.F) {
                        this.c(f2, f1, 1, this.l);
                    }
                    if(this.d == 3) {
                        d d11 = this.b;
                        if(d11.X > 0.0f) {
                            k k0 = d11.d;
                            if(k0.d == 3) {
                                k0.e.k.add(g0);
                                g0.l.add(this.b.d.e);
                                g0.a = this;
                            }
                        }
                    }
                }
            }
            if(g0.l.size() == 0) {
                g0.c = true;
            }
        }
    }

    @Override  // p1.o
    public final void e() {
        f f0 = this.h;
        if(f0.j) {
            this.b.a0 = f0.g;
        }
    }

    @Override  // p1.o
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override  // p1.o
    public final boolean k() {
        return this.d != 3 || this.b.t == 0;
    }

    public final void m() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        f f0 = this.k;
        f0.c();
        f0.j = false;
        this.e.j = false;
    }

    @Override
    public final String toString() {
        return "VerticalRun " + this.b.i0;
    }
}

