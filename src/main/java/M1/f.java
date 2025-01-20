package m1;

import g1.k;
import java.util.HashSet;
import l1.g;
import n1.a;
import o1.i;

public final class f extends g {
    public int A0;
    public a n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public float u0;
    public float v0;
    public String w0;
    public String x0;
    public String y0;
    public String z0;

    public f(k k0, int v) {
        super(k0, v);
        this.o0 = 0;
        this.p0 = 0;
        this.q0 = 0;
        if(v == 10) {
            this.s0 = 1;
            return;
        }
        if(v == 11) {
            this.t0 = 1;
        }
    }

    @Override  // l1.g
    public final void apply() {
        this.s();
        a a0 = this.n0;
        int v = this.r0;
        a0.getClass();
        if((v == 0 || v == 1) && a0.P0 != v) {
            a0.P0 = v;
        }
        int v1 = this.s0;
        if(v1 != 0) {
            a a1 = this.n0;
            if(v1 > 50) {
                a1.getClass();
            }
            else if(a1.G0 != v1) {
                a1.G0 = v1;
                a1.j0();
                a1.f0();
            }
        }
        int v2 = this.t0;
        if(v2 != 0) {
            a a2 = this.n0;
            if(v2 > 50) {
                a2.getClass();
            }
            else if(a2.I0 != v2) {
                a2.I0 = v2;
                a2.j0();
                a2.f0();
            }
        }
        float f = this.u0;
        if(f != 0.0f) {
            a a3 = this.n0;
            if(f < 0.0f) {
                a3.getClass();
            }
            else if(a3.J0 != f) {
                a3.J0 = f;
            }
        }
        float f1 = this.v0;
        if(f1 != 0.0f) {
            a a4 = this.n0;
            if(f1 < 0.0f) {
                a4.getClass();
            }
            else if(a4.K0 != f1) {
                a4.K0 = f1;
            }
        }
        if(this.w0 != null && !this.w0.isEmpty()) {
            a a5 = this.n0;
            String s = this.w0;
            if(a5.L0 == null || !a5.L0.equals(s)) {
                a5.L0 = s;
            }
        }
        if(this.x0 != null && !this.x0.isEmpty()) {
            a a6 = this.n0;
            String s1 = this.x0;
            if(a6.M0 == null || !a6.M0.equals(s1)) {
                a6.M0 = s1;
            }
        }
        if(this.y0 != null && !this.y0.isEmpty()) {
            a a7 = this.n0;
            String s2 = this.y0;
            if(a7.N0 == null || !a7.N0.equals(s2.toString())) {
                a7.E0 = false;
                a7.N0 = s2.toString();
            }
        }
        if(this.z0 != null && !this.z0.isEmpty()) {
            a a8 = this.n0;
            String s3 = this.z0;
            if(a8.O0 == null || !a8.O0.equals(s3)) {
                a8.E0 = false;
                a8.O0 = s3;
            }
        }
        this.n0.U0 = this.A0;
        this.n0.v0 = this.o0;
        this.n0.w0 = this.o0;
        this.n0.t0 = this.p0;
        this.n0.u0 = this.q0;
        this.r();
    }

    @Override  // l1.g
    public final i s() {
        if(this.n0 == null) {
            a a0 = new a();  // initializer: Lo1/k;-><init>()V
            a0.E0 = false;
            a0.Q0 = 0;
            a0.S0 = new HashSet();
            a0.W0 = 0;
            a0.j0();
            boolean z = a0.T0 != null && a0.T0.length == a0.s0 && (a0.R0 != null && a0.R0.length == a0.F0 && a0.R0[0].length == a0.H0);
            if(!z) {
                a0.f0();
            }
            if(z) {
                for(int v = 0; v < a0.R0.length; ++v) {
                    for(int v1 = 0; true; ++v1) {
                        boolean[][] arr2_z = a0.R0;
                        if(v1 >= arr2_z[0].length) {
                            break;
                        }
                        arr2_z[v][v1] = true;
                    }
                }
                for(int v2 = 0; v2 < a0.T0.length; ++v2) {
                    for(int v3 = 0; true; ++v3) {
                        int[][] arr2_v = a0.T0;
                        if(v3 >= arr2_v[0].length) {
                            break;
                        }
                        arr2_v[v2][v3] = -1;
                    }
                }
            }
            a0.Q0 = 0;
            if(a0.O0 != null && !a0.O0.trim().isEmpty()) {
                int[][] arr2_v1 = a0.h0(a0.O0, false);
                if(arr2_v1 != null) {
                    a0.d0(arr2_v1);
                }
            }
            if(a0.N0 != null && !a0.N0.trim().isEmpty()) {
                int[][] arr2_v2 = a0.h0(a0.N0, true);
                if(arr2_v2 != null) {
                    a0.e0(arr2_v2);
                }
            }
            this.n0 = a0;
        }
        return this.n0;
    }
}

