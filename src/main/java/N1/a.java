package n1;

import F0.A;
import h1.c;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import o1.d;
import o1.e;
import o1.k;

public final class a extends k {
    public e C0;
    public d[] D0;
    public boolean E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public String L0;
    public String M0;
    public String N0;
    public String O0;
    public int P0;
    public int Q0;
    public boolean[][] R0;
    public HashSet S0;
    public int[][] T0;
    public int U0;
    public int[][] V0;
    public int W0;

    @Override  // o1.k
    public final void X(int v, int v1, int v2, int v3) {
        this.C0 = this.U;
        if(this.F0 >= 1 && this.H0 >= 1) {
            this.Q0 = 0;
            if(this.O0 != null && !this.O0.trim().isEmpty()) {
                int[][] arr2_v = this.h0(this.O0, false);
                if(arr2_v != null) {
                    this.d0(arr2_v);
                }
            }
            if(this.N0 != null && !this.N0.trim().isEmpty()) {
                this.V0 = this.h0(this.N0, true);
            }
            int v5 = Math.max(this.F0, this.H0);
            d[] arr_d = this.D0;
            if(arr_d == null) {
                this.D0 = new d[v5];
                for(int v6 = 0; true; ++v6) {
                    d[] arr_d1 = this.D0;
                    if(v6 >= arr_d1.length) {
                        break;
                    }
                    d d0 = new d();
                    d0.q0[0] = 3;
                    d0.q0[1] = 3;
                    d0.k = String.valueOf(d0.hashCode());
                    arr_d1[v6] = d0;
                }
            }
            else if(v5 != arr_d.length) {
                d[] arr_d2 = new d[v5];
                for(int v7 = 0; v7 < v5; ++v7) {
                    d[] arr_d3 = this.D0;
                    if(v7 < arr_d3.length) {
                        arr_d2[v7] = arr_d3[v7];
                    }
                    else {
                        d d1 = new d();
                        d1.q0[0] = 3;
                        d1.q0[1] = 3;
                        d1.k = String.valueOf(d1.hashCode());
                        arr_d2[v7] = d1;
                    }
                }
                while(true) {
                    d[] arr_d4 = this.D0;
                    if(v5 >= arr_d4.length) {
                        break;
                    }
                    d d2 = arr_d4[v5];
                    this.C0.r0.remove(d2);
                    d2.D();
                    ++v5;
                }
                this.D0 = arr_d2;
            }
            int[][] arr2_v1 = this.V0;
            if(arr2_v1 != null) {
                this.e0(arr2_v1);
            }
        }
        e e0 = this.C0;
        d[] arr_d5 = this.D0;
        e0.getClass();
        for(int v4 = 0; v4 < arr_d5.length; ++v4) {
            e0.V(arr_d5[v4]);
        }
    }

    public static void Z(d d0) {
        d0.l0[1] = -1.0f;
        d0.K.j();
        d0.M.j();
        d0.N.j();
    }

    public final void a0(int v, int v1, int v2, int v3, d d0) {
        d0.J.a(this.D0[v1].J, 0);
        d0.K.a(this.D0[v].K, 0);
        d0.L.a(this.D0[v1 + v3 - 1].L, 0);
        d0.M.a(this.D0[v + v2 - 1].M, 0);
    }

    public final int b0(int v) {
        return this.P0 == 1 ? v / this.F0 : v % this.H0;
    }

    @Override  // o1.d
    public final void c(c c0, boolean z) {
        int v5;
        int v2;
        super.c(c0, z);
        int v = Math.max(this.F0, this.H0);
        d d0 = this.D0[0];
        float[] arr_f = a.i0(this.F0, this.L0);
        o1.c c1 = this.M;
        o1.c c2 = this.K;
        if(this.F0 == 1) {
            a.Z(d0);
            d0.K.a(c2, 0);
            d0.M.a(c1, 0);
        }
        else {
            for(int v1 = 0; true; ++v1) {
                v2 = this.F0;
                if(v1 >= v2) {
                    break;
                }
                d d1 = this.D0[v1];
                a.Z(d1);
                if(arr_f != null) {
                    d1.l0[1] = arr_f[v1];
                }
                o1.c c3 = d1.K;
                if(v1 > 0) {
                    c3.a(this.D0[v1 - 1].M, 0);
                }
                else {
                    c3.a(c2, 0);
                }
                o1.c c4 = d1.M;
                if(v1 < this.F0 - 1) {
                    c4.a(this.D0[v1 + 1].K, 0);
                }
                else {
                    c4.a(c1, 0);
                }
                if(v1 > 0) {
                    c3.g = (int)this.K0;
                }
            }
            while(v2 < v) {
                d d2 = this.D0[v2];
                a.Z(d2);
                d2.K.a(c2, 0);
                d2.M.a(c1, 0);
                ++v2;
            }
        }
        int v3 = Math.max(this.F0, this.H0);
        d d3 = this.D0[0];
        float[] arr_f1 = a.i0(this.H0, this.M0);
        o1.c c5 = this.L;
        o1.c c6 = this.J;
        if(this.H0 == 1) {
            d3.l0[0] = -1.0f;
            d3.J.j();
            d3.L.j();
            d3.J.a(c6, 0);
            d3.L.a(c5, 0);
        }
        else {
            for(int v4 = 0; true; ++v4) {
                v5 = this.H0;
                if(v4 >= v5) {
                    break;
                }
                d d4 = this.D0[v4];
                d4.l0[0] = -1.0f;
                d4.J.j();
                d4.L.j();
                if(arr_f1 != null) {
                    d4.l0[0] = arr_f1[v4];
                }
                o1.c c7 = d4.J;
                if(v4 > 0) {
                    c7.a(this.D0[v4 - 1].L, 0);
                }
                else {
                    c7.a(c6, 0);
                }
                o1.c c8 = d4.L;
                if(v4 < this.H0 - 1) {
                    c8.a(this.D0[v4 + 1].J, 0);
                }
                else {
                    c8.a(c5, 0);
                }
                if(v4 > 0) {
                    c7.g = (int)this.J0;
                }
            }
            while(v5 < v3) {
                d d5 = this.D0[v5];
                d5.l0[0] = -1.0f;
                d5.J.j();
                d5.L.j();
                d5.J.a(c6, 0);
                d5.L.a(c5, 0);
                ++v5;
            }
        }
        for(int v6 = 0; v6 < this.s0; ++v6) {
            if(!this.S0.contains(this.r0[v6].k)) {
                int v7 = 0;
                boolean z1 = false;
                while(!z1) {
                    v7 = this.Q0;
                    if(v7 >= this.F0 * this.H0) {
                        v7 = -1;
                        break;
                    }
                    int v8 = this.c0(v7);
                    int v9 = this.b0(this.Q0);
                    boolean[] arr_z = this.R0[v8];
                    if(arr_z[v9]) {
                        arr_z[v9] = false;
                        z1 = true;
                    }
                    ++this.Q0;
                }
                int v10 = this.c0(v7);
                int v11 = this.b0(v7);
                if(v7 == -1) {
                    break;
                }
                if((this.U0 & 2) > 0) {
                    int[][] arr2_v = this.V0;
                    if(arr2_v == null) {
                        this.a0(v10, v11, 1, 1, this.r0[v6]);
                    }
                    else {
                        int v12 = this.W0;
                        if(v12 < arr2_v.length) {
                            int[] arr_v = arr2_v[v12];
                            if(arr_v[0] == v7) {
                                this.R0[v10][v11] = true;
                                if(this.g0(v10, v11, arr_v[1], arr_v[2])) {
                                    d d6 = this.r0[v6];
                                    int[] arr_v1 = this.V0[this.W0];
                                    this.a0(v10, v11, arr_v1[1], arr_v1[2], d6);
                                    ++this.W0;
                                }
                            }
                            else {
                                this.a0(v10, v11, 1, 1, this.r0[v6]);
                            }
                        }
                        else {
                            this.a0(v10, v11, 1, 1, this.r0[v6]);
                        }
                    }
                }
                else {
                    this.a0(v10, v11, 1, 1, this.r0[v6]);
                }
            }
        }
    }

    public final int c0(int v) {
        return this.P0 == 1 ? v % this.F0 : v / this.H0;
    }

    public final void d0(int[][] arr2_v) {
        for(int v = 0; v < arr2_v.length; ++v) {
            int[] arr_v = arr2_v[v];
            if(!this.g0(this.c0(arr_v[0]), this.b0(arr_v[0]), arr_v[1], arr_v[2])) {
                return;
            }
        }
    }

    public final void e0(int[][] arr2_v) {
        if((this.U0 & 2) > 0) {
            return;
        }
        for(int v = 0; v < arr2_v.length; ++v) {
            int v1 = this.c0(arr2_v[v][0]);
            int v2 = this.b0(arr2_v[v][0]);
            int[] arr_v = arr2_v[v];
            if(!this.g0(v1, v2, arr_v[1], arr_v[2])) {
                return;
            }
            d d0 = this.r0[v];
            int[] arr_v1 = arr2_v[v];
            this.a0(v1, v2, arr_v1[1], arr_v1[2], d0);
            this.S0.add(this.r0[v].k);
        }
    }

    public final void f0() {
        int[] arr_v = new int[2];
        arr_v[1] = this.H0;
        arr_v[0] = this.F0;
        boolean[][] arr2_z = (boolean[][])Array.newInstance(Boolean.TYPE, arr_v);
        this.R0 = arr2_z;
        for(int v1 = 0; v1 < arr2_z.length; ++v1) {
            Arrays.fill(arr2_z[v1], true);
        }
        int v2 = this.s0;
        if(v2 > 0) {
            int[][] arr2_v = new int[v2][4];
            this.T0 = arr2_v;
            for(int v = 0; v < arr2_v.length; ++v) {
                Arrays.fill(arr2_v[v], -1);
            }
        }
    }

    public final boolean g0(int v, int v1, int v2, int v3) {
        int v4 = v;
        while(v4 < v + v2) {
            int v5 = v1;
            while(v5 < v1 + v3) {
                boolean[][] arr2_z = this.R0;
                if(v4 < arr2_z.length && v5 < arr2_z[0].length) {
                    boolean[] arr_z = arr2_z[v4];
                    if(!arr_z[v5]) {
                        return false;
                    }
                    arr_z[v5] = false;
                    ++v5;
                    continue;
                }
                return false;
            }
            ++v4;
        }
        return true;
    }

    public final int[][] h0(String s, boolean z) {
        try {
            String[] arr_s = s.split(",");
            Arrays.sort(arr_s, new A(10));
            int[][] arr2_v = new int[arr_s.length][3];
            if(this.F0 == 1 || this.H0 == 1) {
                int v1 = 0;
                int v2 = 0;
                for(int v = 0; v < arr_s.length; ++v) {
                    String[] arr_s1 = arr_s[v].trim().split(":");
                    int[] arr_v = arr2_v[v];
                    arr_v[0] = Integer.parseInt(arr_s1[0]);
                    int[] arr_v1 = arr2_v[v];
                    arr_v1[1] = 1;
                    arr_v1[2] = 1;
                    if(this.H0 == 1) {
                        arr_v1[1] = Integer.parseInt(arr_s1[1]);
                        v1 += arr2_v[v][1];
                        if(z) {
                            --v1;
                        }
                    }
                    if(this.F0 == 1) {
                        int[] arr_v2 = arr2_v[v];
                        arr_v2[2] = Integer.parseInt(arr_s1[1]);
                        v2 += arr2_v[v][2];
                        if(z) {
                            --v2;
                        }
                    }
                }
                if(v1 != 0 && !this.E0) {
                    int v3 = this.F0 + v1;
                    if(v3 <= 50 && this.G0 != v3) {
                        this.G0 = v3;
                        this.j0();
                        this.f0();
                    }
                }
                if(v2 != 0 && !this.E0) {
                    int v4 = this.H0 + v2;
                    if(v4 <= 50 && this.I0 != v4) {
                        this.I0 = v4;
                        this.j0();
                        this.f0();
                    }
                }
                this.E0 = true;
                return arr2_v;
            }
            for(int v5 = 0; v5 < arr_s.length; ++v5) {
                String[] arr_s2 = arr_s[v5].trim().split(":");
                String[] arr_s3 = arr_s2[1].split("x");
                int[] arr_v3 = arr2_v[v5];
                arr_v3[0] = Integer.parseInt(arr_s2[0]);
                if((this.U0 & 1) > 0) {
                    int[] arr_v4 = arr2_v[v5];
                    arr_v4[1] = Integer.parseInt(arr_s3[1]);
                    int[] arr_v5 = arr2_v[v5];
                    arr_v5[2] = Integer.parseInt(arr_s3[0]);
                }
                else {
                    int[] arr_v6 = arr2_v[v5];
                    arr_v6[1] = Integer.parseInt(arr_s3[0]);
                    int[] arr_v7 = arr2_v[v5];
                    arr_v7[2] = Integer.parseInt(arr_s3[1]);
                }
            }
            return arr2_v;
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public static float[] i0(int v, String s) {
        if(s != null && !s.trim().isEmpty()) {
            String[] arr_s = s.split(",");
            float[] arr_f = new float[v];
            for(int v1 = 0; v1 < v; ++v1) {
                if(v1 < arr_s.length) {
                    try {
                        arr_f[v1] = Float.parseFloat(arr_s[v1]);
                    }
                    catch(Exception exception0) {
                        System.err.println("Error parsing `" + arr_s[v1] + "`: " + exception0.getMessage());
                        arr_f[v1] = 1.0f;
                    }
                }
                else {
                    arr_f[v1] = 1.0f;
                }
            }
            return arr_f;
        }
        return null;
    }

    public final void j0() {
        int v = this.G0;
        if(v != 0) {
            int v1 = this.I0;
            if(v1 != 0) {
                this.F0 = v;
                this.H0 = v1;
                return;
            }
        }
        int v2 = this.I0;
        if(v2 > 0) {
            this.H0 = v2;
            this.F0 = (this.s0 + v2 - 1) / v2;
            return;
        }
        if(v > 0) {
            this.F0 = v;
            this.H0 = (this.s0 + v - 1) / v;
            return;
        }
        double f = Math.sqrt(this.s0);
        this.F0 = (int)(f + 1.5);
        this.H0 = (this.s0 + ((int)(f + 1.5)) - 1) / ((int)(f + 1.5));
    }
}

