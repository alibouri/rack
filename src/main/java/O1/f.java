package o1;

public final class f {
    public int a;
    public d b;
    public int c;
    public c d;
    public c e;
    public c f;
    public c g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public final g r;

    public f(g g0, int v, c c0, c c1, c c2, c c3, int v1) {
        this.r = g0;
        this.b = null;
        this.c = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.a = v;
        this.d = c0;
        this.e = c1;
        this.f = c2;
        this.g = c3;
        this.h = g0.v0;
        this.i = g0.t0;
        this.j = g0.w0;
        this.k = g0.u0;
        this.q = v1;
    }

    public final void a(d d0) {
        int v = 0;
        g g0 = this.r;
        if(this.a == 0) {
            int v1 = g0.a0(d0, this.q);
            if(d0.q0[0] == 3) {
                ++this.p;
                v1 = 0;
            }
            int v2 = g0.O0;
            if(d0.h0 != 8) {
                v = v2;
            }
            this.l = v1 + v + this.l;
            int v3 = g0.Z(d0, this.q);
            if(this.b == null || this.c < v3) {
                this.b = d0;
                this.c = v3;
                this.m = v3;
            }
        }
        else {
            int v4 = g0.a0(d0, this.q);
            int v5 = g0.Z(d0, this.q);
            if(d0.q0[1] == 3) {
                ++this.p;
                v5 = 0;
            }
            int v6 = g0.P0;
            if(d0.h0 != 8) {
                v = v6;
            }
            this.m = v5 + v + this.m;
            if(this.b == null || this.c < v4) {
                this.b = d0;
                this.c = v4;
                this.l = v4;
            }
        }
        ++this.o;
    }

    public final void b(int v, boolean z, boolean z1) {
        int v26;
        int v25;
        int v17;
        float f2;
        float f1;
        float f;
        int v15;
        int v13;
        d d4;
        g g0;
        int v1 = this.o;
        for(int v2 = 0; true; ++v2) {
            g0 = this.r;
            if(v2 >= v1) {
                break;
            }
            int v3 = this.n + v2;
            if(v3 >= g0.a1) {
                break;
            }
            d d0 = g0.Z0[v3];
            if(d0 != null) {
                d0.E();
            }
        }
        if(v1 != 0 && this.b != null) {
            boolean z2 = z1 && v == 0;
            int v5 = -1;
            int v6 = -1;
            for(int v4 = 0; v4 < v1; ++v4) {
                int v7 = this.n + (z ? v1 - 1 - v4 : v4);
                if(v7 >= g0.a1) {
                    break;
                }
                d d1 = g0.Z0[v7];
                if(d1 != null && d1.h0 == 0) {
                    if(v5 == -1) {
                        v5 = v4;
                    }
                    v6 = v4;
                }
            }
            if(this.a == 0) {
                d d2 = this.b;
                d2.k0 = g0.D0;
                c c0 = d2.K;
                c0.a(this.e, (v <= 0 ? this.i : this.i + g0.P0));
                c c1 = d2.M;
                if(z1) {
                    c1.a(this.g, this.k);
                }
                if(v > 0) {
                    this.e.d.M.a(c0, 0);
                }
                if(g0.R0 == 3 && !d2.F) {
                    int v8 = 0;
                    while(v8 < v1) {
                        int v9 = this.n + (z ? v1 - 1 - v8 : v8);
                        if(v9 >= g0.a1) {
                            break;
                        }
                        d d3 = g0.Z0[v9];
                        if(d3.F) {
                            d4 = d3;
                            goto label_48;
                        }
                        ++v8;
                    }
                }
                d4 = d2;
            label_48:
                int v10 = 0;
                d d5 = null;
                while(v10 < v1) {
                    int v11 = z ? v1 - 1 - v10 : v10;
                    int v12 = this.n + v11;
                    if(v12 >= g0.a1) {
                        return;
                    }
                    d d6 = g0.Z0[v12];
                    if(d6 == null) {
                        v13 = v1;
                    }
                    else {
                        c c2 = d6.J;
                        if(v10 == 0) {
                            d6.g(c2, this.d, this.h);
                        }
                        if(v11 == 0) {
                            int v14 = g0.C0;
                            if(z) {
                                v15 = v14;
                                f = 1.0f - g0.I0;
                            }
                            else {
                                v15 = v14;
                                f = g0.I0;
                            }
                            if(this.n == 0) {
                                int v16 = g0.E0;
                                if(v16 == -1) {
                                    f1 = f;
                                    goto label_78;
                                }
                                else {
                                    f2 = z ? 1.0f - g0.K0 : g0.K0;
                                    v17 = v16;
                                    goto label_88;
                                }
                                goto label_77;
                            }
                            else {
                            label_77:
                                f1 = f;
                            }
                        label_78:
                            if(z1) {
                                v17 = g0.G0;
                                if(v17 != -1) {
                                    f2 = z ? 1.0f - g0.M0 : g0.M0;
                                }
                            }
                            else {
                                v17 = v15;
                                f2 = f1;
                            }
                        label_88:
                            d6.j0 = v17;
                            d6.e0 = f2;
                        }
                        if(v10 == v1 - 1) {
                            v13 = v1;
                            d6.g(d6.L, this.f, this.j);
                        }
                        else {
                            v13 = v1;
                        }
                        if(d5 != null) {
                            c c3 = d5.L;
                            c2.a(c3, g0.O0);
                            if(v10 == v5) {
                                int v18 = this.h;
                                if(c2.h()) {
                                    c2.h = v18;
                                }
                            }
                            c3.a(c2, 0);
                            if(v10 == v6 + 1) {
                                int v19 = this.j;
                                if(c3.h()) {
                                    c3.h = v19;
                                }
                            }
                        }
                        if(d6 != d2) {
                            int v20 = g0.R0;
                            if(v20 != 3 || !d4.F || d6 == d4 || !d6.F) {
                                c c4 = d6.K;
                                if(v20 == 0) {
                                    c4.a(c0, 0);
                                }
                                else {
                                    c c5 = d6.M;
                                    if(v20 == 1) {
                                        c5.a(c1, 0);
                                    }
                                    else if(z2) {
                                        c4.a(this.e, this.i);
                                        c5.a(this.g, this.k);
                                    }
                                    else {
                                        c4.a(c0, 0);
                                        c5.a(c1, 0);
                                    }
                                }
                            }
                            else {
                                d6.N.a(d4.N, 0);
                            }
                        }
                        d5 = d6;
                    }
                    ++v10;
                    v1 = v13;
                }
            }
            else {
                d d7 = this.b;
                d7.j0 = g0.C0;
                int v21 = v <= 0 ? this.h : this.h + g0.O0;
                c c6 = d7.J;
                c c7 = d7.L;
                if(z) {
                    c7.a(this.f, v21);
                    if(z1) {
                        c6.a(this.d, this.j);
                    }
                    if(v > 0) {
                        this.f.d.J.a(c7, 0);
                    }
                }
                else {
                    c6.a(this.d, v21);
                    if(z1) {
                        c7.a(this.f, this.j);
                    }
                    if(v > 0) {
                        this.d.d.L.a(c6, 0);
                    }
                }
                int v22 = 0;
                d d8 = null;
                while(v22 < v1) {
                    int v23 = this.n + v22;
                    if(v23 >= g0.a1) {
                        break;
                    }
                    d d9 = g0.Z0[v23];
                    if(d9 != null) {
                        c c8 = d9.K;
                        if(v22 == 0) {
                            d9.g(c8, this.e, this.i);
                            int v24 = g0.D0;
                            float f3 = g0.J0;
                            if(this.n == 0) {
                                v25 = g0.F0;
                                if(v25 == -1) {
                                    v26 = v24;
                                    goto label_168;
                                }
                                else {
                                    f3 = g0.L0;
                                    goto label_174;
                                }
                                goto label_167;
                            }
                            else {
                            label_167:
                                v26 = v24;
                            }
                        label_168:
                            if(z1) {
                                v25 = g0.H0;
                                if(v25 != -1) {
                                    f3 = g0.N0;
                                }
                            }
                            else {
                                v25 = v26;
                            }
                        label_174:
                            d9.k0 = v25;
                            d9.f0 = f3;
                        }
                        if(v22 == v1 - 1) {
                            d9.g(d9.M, this.g, this.k);
                        }
                        if(d8 != null) {
                            c c9 = d8.M;
                            c8.a(c9, g0.P0);
                            if(v22 == v5) {
                                int v27 = this.i;
                                if(c8.h()) {
                                    c8.h = v27;
                                }
                            }
                            c9.a(c8, 0);
                            if(v22 == v6 + 1) {
                                int v28 = this.k;
                                if(c9.h()) {
                                    c9.h = v28;
                                }
                            }
                        }
                        if(d9 != d7) {
                            c c10 = d9.L;
                            c c11 = d9.J;
                            if(z) {
                                int v29 = g0.Q0;
                                if(v29 == 0) {
                                    c10.a(c7, 0);
                                }
                                else {
                                    switch(v29) {
                                        case 1: {
                                            c11.a(c6, 0);
                                            break;
                                        }
                                        case 2: {
                                            c11.a(c6, 0);
                                            c10.a(c7, 0);
                                        }
                                    }
                                }
                            }
                            else {
                                int v30 = g0.Q0;
                                if(v30 == 0) {
                                    c11.a(c6, 0);
                                }
                                else {
                                    switch(v30) {
                                        case 1: {
                                            c10.a(c7, 0);
                                            break;
                                        }
                                        case 2: {
                                            if(z2) {
                                                c11.a(this.d, this.h);
                                                c10.a(this.f, this.j);
                                            }
                                            else {
                                                c11.a(c6, 0);
                                                c10.a(c7, 0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        d8 = d9;
                    }
                    ++v22;
                }
            }
        }
    }

    public final int c() {
        return this.a == 1 ? this.m - this.r.P0 : this.m;
    }

    public final int d() {
        return this.a == 0 ? this.l - this.r.O0 : this.l;
    }

    public final void e(int v) {
        g g0;
        int v1 = this.p;
        if(v1 == 0) {
            return;
        }
        int v2 = this.o;
        int v3 = v / v1;
        for(int v4 = 0; true; ++v4) {
            g0 = this.r;
            if(v4 >= v2) {
                break;
            }
            int v5 = this.n + v4;
            if(v5 >= g0.a1) {
                break;
            }
            d d0 = g0.Z0[v5];
            if(this.a != 0) {
                if(d0 != null) {
                    int[] arr_v1 = d0.q0;
                    if(arr_v1[1] == 3 && d0.t == 0) {
                        g0.Y(arr_v1[0], d0.r(), 1, v3, d0);
                    }
                }
            }
            else if(d0 != null) {
                int[] arr_v = d0.q0;
                if(arr_v[0] == 3 && d0.s == 0) {
                    g0.Y(1, v3, arr_v[1], d0.l(), d0);
                }
            }
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int v6 = this.o;
        for(int v7 = 0; v7 < v6; ++v7) {
            int v8 = this.n + v7;
            if(v8 >= g0.a1) {
                break;
            }
            d d1 = g0.Z0[v8];
            if(this.a == 0) {
                this.l = d1.r() + (d1.h0 == 8 ? 0 : g0.O0) + this.l;
                int v9 = g0.Z(d1, this.q);
                if(this.b == null || this.c < v9) {
                    this.b = d1;
                    this.c = v9;
                    this.m = v9;
                }
            }
            else {
                int v10 = g0.a0(d1, this.q);
                this.m = g0.Z(d1, this.q) + (d1.h0 == 8 ? 0 : g0.P0) + this.m;
                if(this.b == null || this.c < v10) {
                    this.b = d1;
                    this.c = v10;
                    this.l = v10;
                }
            }
        }
    }

    public final void f(int v, c c0, c c1, c c2, c c3, int v1, int v2, int v3, int v4, int v5) {
        this.a = v;
        this.d = c0;
        this.e = c1;
        this.f = c2;
        this.g = c3;
        this.h = v1;
        this.i = v2;
        this.j = v3;
        this.k = v4;
        this.q = v5;
    }
}

