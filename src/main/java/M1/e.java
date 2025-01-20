package m1;

import g1.k;
import java.util.ArrayList;
import java.util.HashMap;
import l1.g;
import o1.i;

public final class e extends g {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;
    public o1.g n0;
    public HashMap o0;
    public HashMap p0;
    public HashMap q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public e(k k0, int v) {
        super(k0, v);
        this.r0 = 0;
        this.s0 = -1;
        this.t0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.y0 = 2;
        this.z0 = 2;
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = 0;
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = -1;
        this.H0 = 0;
        this.I0 = 0.5f;
        this.J0 = 0.5f;
        this.K0 = 0.5f;
        this.L0 = 0.5f;
        if(v == 8) {
            this.H0 = 1;
        }
    }

    @Override  // l1.g
    public final void apply() {
        this.s();
        this.b(this.n0);
        o1.g g0 = this.n0;
        g0.U0 = this.H0;
        g0.S0 = this.r0;
        int v = this.G0;
        if(v != -1) {
            g0.T0 = v;
        }
        int v1 = this.C0;
        if(v1 != 0) {
            g0.v0 = v1;
        }
        int v2 = this.E0;
        if(v2 != 0) {
            g0.t0 = v2;
        }
        int v3 = this.D0;
        if(v3 != 0) {
            g0.w0 = v3;
        }
        int v4 = this.F0;
        if(v4 != 0) {
            g0.u0 = v4;
        }
        int v5 = this.B0;
        if(v5 != 0) {
            g0.O0 = v5;
        }
        int v6 = this.A0;
        if(v6 != 0) {
            g0.P0 = v6;
        }
        float f = this.h;
        if(f != 0.5f) {
            g0.I0 = f;
        }
        float f1 = this.K0;
        if(f1 != 0.5f) {
            g0.K0 = f1;
        }
        float f2 = this.L0;
        if(f2 != 0.5f) {
            g0.M0 = f2;
        }
        float f3 = this.i;
        if(f3 != 0.5f) {
            g0.J0 = f3;
        }
        float f4 = this.I0;
        if(f4 != 0.5f) {
            g0.L0 = f4;
        }
        float f5 = this.J0;
        if(f5 != 0.5f) {
            g0.N0 = f5;
        }
        int v7 = this.z0;
        if(v7 != 2) {
            g0.Q0 = v7;
        }
        int v8 = this.y0;
        if(v8 != 2) {
            g0.R0 = v8;
        }
        int v9 = this.s0;
        if(v9 != -1) {
            g0.D0 = v9;
        }
        int v10 = this.t0;
        if(v10 != -1) {
            g0.F0 = v10;
        }
        int v11 = this.u0;
        if(v11 != -1) {
            g0.H0 = v11;
        }
        int v12 = this.v0;
        if(v12 != -1) {
            g0.C0 = v12;
        }
        int v13 = this.w0;
        if(v13 != -1) {
            g0.E0 = v13;
        }
        int v14 = this.x0;
        if(v14 != -1) {
            g0.G0 = v14;
        }
        this.r();
    }

    @Override  // l1.g
    public final i s() {
        if(this.n0 == null) {
            o1.g g0 = new o1.g();  // initializer: Lo1/k;-><init>()V
            g0.C0 = -1;
            g0.D0 = -1;
            g0.E0 = -1;
            g0.F0 = -1;
            g0.G0 = -1;
            g0.H0 = -1;
            g0.I0 = 0.5f;
            g0.J0 = 0.5f;
            g0.K0 = 0.5f;
            g0.L0 = 0.5f;
            g0.M0 = 0.5f;
            g0.N0 = 0.5f;
            g0.O0 = 0;
            g0.P0 = 0;
            g0.Q0 = 2;
            g0.R0 = 2;
            g0.S0 = 0;
            g0.T0 = -1;
            g0.U0 = 0;
            g0.V0 = new ArrayList();
            g0.W0 = null;
            g0.X0 = null;
            g0.Y0 = null;
            g0.a1 = 0;
            this.n0 = g0;
        }
        return this.n0;
    }
}

