package p1;

import java.util.ArrayList;
import o1.c;
import o1.d;
import o1.i;
import v.h;

public final class k extends o {
    public static final int[] k;

    static {
        k.k = new int[2];
    }

    @Override  // p1.e
    public final void a(e e0) {
        int v;
        if(h.d(this.j) != 3) {
            g g0 = this.e;
            f f0 = this.h;
            f f1 = this.i;
            if(!g0.j && this.d == 3) {
                d d0 = this.b;
                switch(d0.s) {
                    case 2: {
                        o1.e e1 = d0.U;
                        if(e1 != null) {
                            g g1 = e1.d.e;
                            if(g1.j) {
                                g0.d(((int)(((float)g1.g) * d0.x + 0.5f)));
                            }
                        }
                        break;
                    }
                    case 3: {
                        if(d0.t == 0 || d0.t == 3) {
                            f f2 = d0.e.h;
                            f f3 = d0.e.i;
                            boolean z = d0.J.f != null;
                            boolean z1 = d0.K.f != null;
                            boolean z2 = d0.L.f != null;
                            boolean z3 = d0.M.f != null;
                            int v1 = d0.Y;
                            if(z && z1 && z2 && z3) {
                                float f4 = d0.X;
                                int[] arr_v = k.k;
                                if(f2.j && f3.j) {
                                    if(f0.c && f1.c) {
                                        k.m(arr_v, ((f)f0.l.get(0)).g + f0.f, ((f)f1.l.get(0)).g - f1.f, f2.g + f2.f, f3.g - f3.f, f4, v1);
                                        g0.d(arr_v[0]);
                                        this.b.e.e.d(arr_v[1]);
                                    }
                                    return;
                                }
                                ArrayList arrayList0 = f2.l;
                                if(f0.j && f1.j) {
                                    if(f2.c && f3.c) {
                                        k.m(arr_v, f0.g + f0.f, f1.g - f1.f, ((f)arrayList0.get(0)).g + f2.f, ((f)f3.l.get(0)).g - f3.f, f4, v1);
                                        g0.d(arr_v[0]);
                                        this.b.e.e.d(arr_v[1]);
                                        goto label_49;
                                    }
                                    return;
                                }
                            label_49:
                                if(f0.c && f1.c && f2.c && f3.c) {
                                    k.m(arr_v, ((f)f0.l.get(0)).g + f0.f, ((f)f1.l.get(0)).g - f1.f, ((f)arrayList0.get(0)).g + f2.f, ((f)f3.l.get(0)).g - f3.f, f4, v1);
                                    g0.d(arr_v[0]);
                                    this.b.e.e.d(arr_v[1]);
                                    break;
                                }
                                return;
                            }
                            else if(z && z2) {
                                if(!f0.c || !f1.c) {
                                    return;
                                }
                                float f5 = d0.X;
                                int v2 = ((f)f0.l.get(0)).g + f0.f;
                                int v3 = ((f)f1.l.get(0)).g - f1.f;
                                switch(v1) {
                                    case -1: 
                                    case 0: {
                                        int v4 = this.g(v3 - v2, 0);
                                        int v5 = (int)(((float)v4) * f5 + 0.5f);
                                        int v6 = this.g(v5, 1);
                                        if(v5 != v6) {
                                            v4 = (int)(((float)v6) / f5 + 0.5f);
                                        }
                                        g0.d(v4);
                                        this.b.e.e.d(v6);
                                        break;
                                    }
                                    case 1: {
                                        int v7 = this.g(v3 - v2, 0);
                                        int v8 = (int)(((float)v7) / f5 + 0.5f);
                                        int v9 = this.g(v8, 1);
                                        if(v8 != v9) {
                                            v7 = (int)(((float)v9) * f5 + 0.5f);
                                        }
                                        g0.d(v7);
                                        this.b.e.e.d(v9);
                                        break;
                                    }
                                }
                            }
                            else if(z1 && z3) {
                                if(!f2.c || !f3.c) {
                                    return;
                                }
                                float f6 = d0.X;
                                int v10 = ((f)f2.l.get(0)).g + f2.f;
                                int v11 = ((f)f3.l.get(0)).g - f3.f;
                                switch(v1) {
                                    case 0: {
                                        int v15 = this.g(v11 - v10, 1);
                                        int v16 = (int)(((float)v15) * f6 + 0.5f);
                                        int v17 = this.g(v16, 0);
                                        if(v16 != v17) {
                                            v15 = (int)(((float)v17) / f6 + 0.5f);
                                        }
                                        g0.d(v17);
                                        this.b.e.e.d(v15);
                                        break;
                                    }
                                    case -1: 
                                    case 1: {
                                        int v12 = this.g(v11 - v10, 1);
                                        int v13 = (int)(((float)v12) / f6 + 0.5f);
                                        int v14 = this.g(v13, 0);
                                        if(v13 != v14) {
                                            v12 = (int)(((float)v14) * f6 + 0.5f);
                                        }
                                        g0.d(v14);
                                        this.b.e.e.d(v12);
                                    }
                                }
                            }
                        }
                        else {
                            switch(d0.Y) {
                                case -1: {
                                    v = (int)(((float)d0.e.e.g) * d0.X + 0.5f);
                                    break;
                                }
                                case 0: {
                                    v = (int)(((float)d0.e.e.g) / d0.X + 0.5f);
                                    break;
                                }
                                case 1: {
                                    v = (int)(((float)d0.e.e.g) * d0.X + 0.5f);
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
            if(!f0.c || !f1.c || f0.j && f1.j && g0.j) {
                return;
            }
            if(!g0.j && this.d == 3 && (this.b.s == 0 && !this.b.y())) {
                f f7 = (f)f0.l.get(0);
                f f8 = (f)f1.l.get(0);
                int v18 = f7.g + f0.f;
                int v19 = f8.g + f1.f;
                f0.d(v18);
                f1.d(v19);
                g0.d(v19 - v18);
                return;
            }
            if(!g0.j && this.d == 3 && this.a == 1 && f0.l.size() > 0 && f1.l.size() > 0) {
                f f9 = (f)f0.l.get(0);
                int v20 = Math.min(((f)f1.l.get(0)).g + f1.f - (f9.g + f0.f), g0.m);
                int v21 = this.b.w;
                g0.d((v21 <= 0 ? Math.max(this.b.v, v20) : Math.min(v21, Math.max(this.b.v, v20))));
            }
            if(!g0.j) {
                return;
            }
            f f10 = (f)f0.l.get(0);
            f f11 = (f)f1.l.get(0);
            int v22 = f10.g;
            int v23 = f0.f + v22;
            int v24 = f11.g;
            int v25 = f1.f + v24;
            float f12 = this.b.e0;
            if(f10 == f11) {
                f12 = 0.5f;
            }
            else {
                v22 = v23;
                v24 = v25;
            }
            f0.d(((int)(((float)(v24 - v22 - g0.g)) * f12 + (((float)v22) + 0.5f))));
            f1.d(f0.g + g0.g);
            return;
        }
        this.l(this.b.J, this.b.L, 0);
    }

    @Override  // p1.o
    public final void d() {
        d d0 = this.b;
        g g0 = this.e;
        if(d0.a) {
            g0.d(d0.r());
        }
        f f0 = this.i;
        f f1 = this.h;
        if(!g0.j) {
            d d1 = this.b;
            int v = d1.q0[0];
            this.d = v;
            if(v != 3) {
                if(v == 4) {
                    o1.e e0 = d1.U;
                    if(e0 != null) {
                        switch(e0.q0[0]) {
                            case 1: 
                            case 4: {
                                int v1 = this.b.J.e();
                                int v2 = this.b.L.e();
                                int v3 = this.b.J.e();
                                o.b(f1, e0.d.h, v3);
                                int v4 = this.b.L.e();
                                o.b(f0, e0.d.i, -v4);
                                g0.d(e0.r() - v1 - v2);
                                return;
                            }
                        }
                    }
                }
                if(v == 1) {
                    g0.d(d1.r());
                }
            }
        }
        else if(this.d == 4) {
            d d2 = this.b;
            o1.e e1 = d2.U;
            if(e1 != null) {
                switch(e1.q0[0]) {
                    case 1: 
                    case 4: {
                        int v5 = d2.J.e();
                        o.b(f1, e1.d.h, v5);
                        int v6 = this.b.L.e();
                        o.b(f0, e1.d.i, -v6);
                        return;
                    }
                }
            }
        }
        if(g0.j) {
            d d3 = this.b;
            if(d3.a) {
                c[] arr_c = d3.R;
                c c0 = arr_c[0];
                c c1 = c0.f;
                if(c1 != null && arr_c[1].f != null) {
                    if(d3.y()) {
                        f1.f = this.b.R[0].e();
                        f0.f = -this.b.R[1].e();
                        return;
                    }
                    f f2 = o.h(this.b.R[0]);
                    if(f2 != null) {
                        o.b(f1, f2, this.b.R[0].e());
                    }
                    f f3 = o.h(this.b.R[1]);
                    if(f3 != null) {
                        o.b(f0, f3, -this.b.R[1].e());
                    }
                    f1.b = true;
                    f0.b = true;
                    return;
                }
                if(c1 == null) {
                    c c2 = arr_c[1];
                    if(c2.f != null) {
                        f f5 = o.h(c2);
                        if(f5 != null) {
                            o.b(f0, f5, -this.b.R[1].e());
                            o.b(f1, f0, -g0.g);
                        }
                    }
                    else if(!(d3 instanceof i) && d3.U != null && d3.j(7).f == null) {
                        o.b(f1, this.b.U.d.h, this.b.s());
                        o.b(f0, f1, g0.g);
                    }
                }
                else {
                    f f4 = o.h(c0);
                    if(f4 != null) {
                        o.b(f1, f4, this.b.R[0].e());
                        o.b(f0, f1, g0.g);
                    }
                }
            }
            else {
                goto label_75;
            }
        }
        else {
        label_75:
            if(this.d == 3) {
                d d4 = this.b;
                switch(d4.s) {
                    case 2: {
                        o1.e e2 = d4.U;
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
                        if(d4.t == 3) {
                            f1.a = this;
                            f0.a = this;
                            d4.e.h.a = this;
                            d4.e.i.a = this;
                            g0.a = this;
                            if(d4.z()) {
                                g0.l.add(this.b.e.e);
                                this.b.e.e.k.add(g0);
                                this.b.e.e.a = this;
                                g0.l.add(this.b.e.h);
                                g0.l.add(this.b.e.i);
                                this.b.e.h.k.add(g0);
                                this.b.e.i.k.add(g0);
                            }
                            else if(this.b.y()) {
                                this.b.e.e.l.add(g0);
                                g0.k.add(this.b.e.e);
                            }
                            else {
                                this.b.e.e.l.add(g0);
                            }
                        }
                        else {
                            g g2 = d4.e.e;
                            g0.l.add(g2);
                            g2.k.add(g0);
                            this.b.e.h.k.add(g0);
                            this.b.e.i.k.add(g0);
                            g0.b = true;
                            g0.k.add(f1);
                            g0.k.add(f0);
                            f1.l.add(g0);
                            f0.l.add(g0);
                        }
                    }
                }
            }
            d d5 = this.b;
            c[] arr_c1 = d5.R;
            c c3 = arr_c1[0];
            c c4 = c3.f;
            if(c4 != null && arr_c1[1].f != null) {
                if(d5.y()) {
                    f1.f = this.b.R[0].e();
                    f0.f = -this.b.R[1].e();
                    return;
                }
                f f6 = o.h(this.b.R[0]);
                f f7 = o.h(this.b.R[1]);
                if(f6 != null) {
                    f6.b(this);
                }
                if(f7 != null) {
                    f7.b(this);
                }
                this.j = 4;
                return;
            }
            if(c4 == null) {
                c c5 = arr_c1[1];
                if(c5.f != null) {
                    f f9 = o.h(c5);
                    if(f9 != null) {
                        o.b(f0, f9, -this.b.R[1].e());
                        this.c(f1, f0, -1, g0);
                    }
                }
                else if(!(d5 instanceof i)) {
                    o1.e e3 = d5.U;
                    if(e3 != null) {
                        o.b(f1, e3.d.h, d5.s());
                        this.c(f0, f1, 1, g0);
                    }
                }
            }
            else {
                f f8 = o.h(c3);
                if(f8 != null) {
                    o.b(f1, f8, this.b.R[0].e());
                    this.c(f0, f1, 1, g0);
                }
            }
        }
    }

    @Override  // p1.o
    public final void e() {
        f f0 = this.h;
        if(f0.j) {
            this.b.Z = f0.g;
        }
    }

    @Override  // p1.o
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override  // p1.o
    public final boolean k() {
        return this.d != 3 || this.b.s == 0;
    }

    public static void m(int[] arr_v, int v, int v1, int v2, int v3, float f, int v4) {
        int v5 = v1 - v;
        int v6 = v3 - v2;
        switch(v4) {
            case -1: {
                int v7 = (int)(((float)v6) * f + 0.5f);
                int v8 = (int)(((float)v5) / f + 0.5f);
                if(v7 <= v5) {
                    arr_v[0] = v7;
                    arr_v[1] = v6;
                    return;
                }
                if(v8 <= v6) {
                    arr_v[0] = v5;
                    arr_v[1] = v8;
                }
                return;
            }
            case 0: {
                arr_v[0] = (int)(((float)v6) * f + 0.5f);
                arr_v[1] = v6;
                return;
            }
            case 1: {
                arr_v[0] = v5;
                arr_v[1] = (int)(((float)v5) * f + 0.5f);
            }
        }
    }

    public final void n() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.e.j = false;
    }

    @Override
    public final String toString() {
        return "HorizontalRun " + this.b.i0;
    }
}

