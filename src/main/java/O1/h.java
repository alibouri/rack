package o1;

import h1.b;
import java.util.ArrayList;

public final class h extends d {
    public float r0;
    public int s0;
    public int t0;
    public c u0;
    public int v0;
    public boolean w0;

    public h() {
        this.r0 = -1.0f;
        this.s0 = -1;
        this.t0 = -1;
        this.u0 = this.K;
        this.v0 = 0;
        this.S.clear();
        this.S.add(this.u0);
        for(int v = 0; v < this.R.length; ++v) {
            this.R[v] = this.u0;
        }
    }

    @Override  // o1.d
    public final boolean B() {
        return this.w0;
    }

    @Override  // o1.d
    public final boolean C() {
        return this.w0;
    }

    @Override  // o1.d
    public final void U(h1.c c0, boolean z) {
        if(this.U == null) {
            return;
        }
        c c1 = this.u0;
        c0.getClass();
        int v = h1.c.n(c1);
        if(this.v0 == 1) {
            this.Z = v;
            this.a0 = 0;
            this.N(this.U.l());
            this.S(0);
            return;
        }
        this.Z = 0;
        this.a0 = v;
        this.S(this.U.r());
        this.N(0);
    }

    public final void V(int v) {
        this.u0.l(v);
        this.w0 = true;
    }

    public final void W(int v) {
        if(this.v0 == v) {
            return;
        }
        this.v0 = v;
        ArrayList arrayList0 = this.S;
        arrayList0.clear();
        this.u0 = this.v0 == 1 ? this.J : this.K;
        arrayList0.add(this.u0);
        c[] arr_c = this.R;
        for(int v1 = 0; v1 < arr_c.length; ++v1) {
            arr_c[v1] = this.u0;
        }
    }

    @Override  // o1.d
    public final void c(h1.c c0, boolean z) {
        e e0 = this.U;
        if(e0 == null) {
            return;
        }
        c c1 = e0.j(2);
        c c2 = e0.j(4);
        int v = 1;
        int v1 = this.U == null || this.U.q0[0] != 2 ? 0 : 1;
        if(this.v0 == 0) {
            c1 = e0.j(3);
            c2 = e0.j(5);
            if(this.U == null || this.U.q0[1] != 2) {
                v = 0;
            }
            v1 = v;
        }
        if(this.w0) {
            c c3 = this.u0;
            if(c3.c) {
                h1.e e1 = c0.k(c3);
                c0.d(e1, this.u0.d());
                if(this.s0 == -1) {
                    if(this.t0 != -1 && v1 != 0) {
                        h1.e e2 = c0.k(c2);
                        c0.f(e1, c0.k(c1), 0, 5);
                        c0.f(e2, e1, 0, 5);
                    }
                }
                else if(v1 != 0) {
                    c0.f(c0.k(c2), e1, 0, 5);
                }
                this.w0 = false;
                return;
            }
        }
        if(this.s0 != -1) {
            h1.e e3 = c0.k(this.u0);
            c0.e(e3, c0.k(c1), this.s0, 8);
            if(v1 != 0) {
                c0.f(c0.k(c2), e3, 0, 5);
            }
        }
        else if(this.t0 != -1) {
            h1.e e4 = c0.k(this.u0);
            h1.e e5 = c0.k(c2);
            c0.e(e4, e5, -this.t0, 8);
            if(v1 != 0) {
                c0.f(e4, c0.k(c1), 0, 5);
                c0.f(e5, e4, 0, 5);
            }
        }
        else if(this.r0 != -1.0f) {
            h1.e e6 = c0.k(this.u0);
            h1.e e7 = c0.k(c2);
            float f = this.r0;
            b b0 = c0.l();
            b0.d.g(e6, -1.0f);
            b0.d.g(e7, f);
            c0.c(b0);
        }
    }

    @Override  // o1.d
    public final boolean d() {
        return true;
    }

    @Override  // o1.d
    public final c j(int v) {
        switch(v.h.d(v)) {
            case 1: 
            case 3: {
                return this.v0 == 1 ? this.u0 : null;
            }
            case 2: 
            case 4: {
                return this.v0 == 0 ? this.u0 : null;
            }
            default: {
                return null;
            }
        }
    }
}

