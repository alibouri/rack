package o1;

import M.J;
import h1.b;
import h1.c;
import h1.e;

public final class a extends i {
    public int t0;
    public boolean u0;
    public int v0;
    public boolean w0;

    public a() {
        this.t0 = 0;
        this.u0 = true;
        this.v0 = 0;
        this.w0 = false;
    }

    @Override  // o1.d
    public final boolean B() {
        return this.w0;
    }

    @Override  // o1.d
    public final boolean C() {
        return this.w0;
    }

    public final boolean X() {
        boolean z = true;
        for(int v1 = 0; true; ++v1) {
            int v2 = this.s0;
            if(v1 >= v2) {
                break;
            }
            d d0 = this.r0[v1];
            if(this.u0 || d0.d()) {
                if((this.t0 == 0 || this.t0 == 1) && !d0.B()) {
                    z = false;
                }
                else if((this.t0 == 2 || this.t0 == 3) && !d0.C()) {
                    z = false;
                }
            }
        }
        if(z && v2 > 0) {
            int v3 = 0;
            boolean z1 = false;
            for(int v = 0; v < this.s0; ++v) {
                d d1 = this.r0[v];
                if(this.u0 || d1.d()) {
                    if(!z1) {
                        int v4 = this.t0;
                        if(v4 == 0) {
                            v3 = d1.j(2).d();
                        }
                        else if(v4 == 1) {
                            v3 = d1.j(4).d();
                        }
                        else if(v4 == 2) {
                            v3 = d1.j(3).d();
                        }
                        else if(v4 == 3) {
                            v3 = d1.j(5).d();
                        }
                        z1 = true;
                    }
                    int v5 = this.t0;
                    if(v5 == 0) {
                        v3 = Math.min(v3, d1.j(2).d());
                    }
                    else if(v5 == 1) {
                        v3 = Math.max(v3, d1.j(4).d());
                    }
                    else if(v5 == 2) {
                        v3 = Math.min(v3, d1.j(3).d());
                    }
                    else if(v5 == 3) {
                        v3 = Math.max(v3, d1.j(5).d());
                    }
                }
            }
            int v6 = v3 + this.v0;
            if(this.t0 == 0 || this.t0 == 1) {
                this.L(v6, v6);
            }
            else {
                this.M(v6, v6);
            }
            this.w0 = true;
            return true;
        }
        return false;
    }

    public final int Y() {
        switch(this.t0) {
            case 0: 
            case 1: {
                return 0;
            }
            case 2: 
            case 3: {
                return 1;
            }
            default: {
                return -1;
            }
        }
    }

    @Override  // o1.d
    public final void c(c c0, boolean z) {
        boolean z1;
        o1.c[] arr_c = this.R;
        o1.c c1 = this.J;
        arr_c[0] = c1;
        o1.c c2 = this.K;
        arr_c[2] = c2;
        o1.c c3 = this.L;
        arr_c[1] = c3;
        o1.c c4 = this.M;
        arr_c[3] = c4;
        for(int v = 0; v < arr_c.length; ++v) {
            o1.c c5 = arr_c[v];
            c5.i = c0.k(c5);
        }
        int v1 = this.t0;
        if(v1 >= 0 && v1 < 4) {
            o1.c c6 = arr_c[v1];
            if(!this.w0) {
                this.X();
            }
            if(this.w0) {
                this.w0 = false;
                int v2 = this.t0;
                if(v2 == 0 || v2 == 1) {
                    c0.d(c1.i, this.Z);
                    c0.d(c3.i, this.Z);
                }
                else if(v2 == 2 || v2 == 3) {
                    c0.d(c2.i, this.a0);
                    c0.d(c4.i, this.a0);
                    return;
                }
                return;
            }
            for(int v3 = 0; true; ++v3) {
                z1 = false;
                if(v3 >= this.s0) {
                    break;
                }
                d d0 = this.r0[v3];
                if((this.u0 || d0.d()) && ((this.t0 == 0 || this.t0 == 1) && d0.q0[0] == 3 && d0.J.f != null && d0.L.f != null || (this.t0 == 2 || this.t0 == 3) && d0.q0[1] == 3 && d0.K.f != null && d0.M.f != null)) {
                    z1 = true;
                    break;
                }
            }
            boolean z2 = c1.g() || c3.g();
            boolean z3 = c2.g() || c4.g();
            int v4 = z1 || (this.t0 != 0 || !z2) && (this.t0 != 2 || !z3) && (this.t0 != 1 || !z2) && (this.t0 != 3 || !z3) ? 4 : 5;
            for(int v5 = 0; v5 < this.s0; ++v5) {
                d d1 = this.r0[v5];
                if(this.u0 || d1.d()) {
                    e e0 = c0.k(d1.R[this.t0]);
                    int v6 = this.t0;
                    o1.c c7 = d1.R[v6];
                    c7.i = e0;
                    int v7 = c7.f == null || c7.f.d != this ? 0 : c7.g;
                    if(v6 == 0 || v6 == 2) {
                        e e3 = c6.i;
                        int v9 = this.v0 - v7;
                        b b1 = c0.l();
                        e e4 = c0.m();
                        e4.b0 = 0;
                        b1.c(e3, e0, e4, v9);
                        c0.c(b1);
                    }
                    else {
                        e e1 = c6.i;
                        int v8 = this.v0 + v7;
                        b b0 = c0.l();
                        e e2 = c0.m();
                        e2.b0 = 0;
                        b0.b(e1, e0, e2, v8);
                        c0.c(b0);
                    }
                    c0.e(c6.i, e0, this.v0 + v7, v4);
                }
            }
            int v10 = this.t0;
            if(v10 == 0) {
                c0.e(c3.i, c1.i, 0, 8);
                c0.e(c1.i, this.U.L.i, 0, 4);
                c0.e(c1.i, this.U.J.i, 0, 0);
                return;
            }
            switch(v10) {
                case 1: {
                    c0.e(c1.i, c3.i, 0, 8);
                    c0.e(c1.i, this.U.J.i, 0, 4);
                    c0.e(c1.i, this.U.L.i, 0, 0);
                    return;
                }
                case 2: {
                    c0.e(c4.i, c2.i, 0, 8);
                    c0.e(c2.i, this.U.M.i, 0, 4);
                    c0.e(c2.i, this.U.K.i, 0, 0);
                    return;
                }
                case 3: {
                    c0.e(c2.i, c4.i, 0, 8);
                    c0.e(c2.i, this.U.K.i, 0, 4);
                    c0.e(c2.i, this.U.M.i, 0, 0);
                    break;
                }
            }
        }
    }

    @Override  // o1.d
    public final boolean d() {
        return true;
    }

    @Override  // o1.d
    public final String toString() {
        String s = m5.b.y(new StringBuilder("[Barrier] "), this.i0, " {");
        for(int v = 0; v < this.s0; ++v) {
            d d0 = this.r0[v];
            if(v > 0) {
                s = s + ", ";
            }
            StringBuilder stringBuilder0 = J.i(s);
            stringBuilder0.append(d0.i0);
            s = stringBuilder0.toString();
        }
        return s + "}";
    }
}

