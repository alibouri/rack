package o1;

import java.util.ArrayList;
import java.util.Arrays;

public final class g extends k {
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
    public float M0;
    public float N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public ArrayList V0;
    public d[] W0;
    public d[] X0;
    public int[] Y0;
    public d[] Z0;
    public int a1;

    @Override  // o1.k
    public final void X(int v, int v1, int v2, int v3) {
        int v103;
        int v96;
        c c17;
        ArrayList arrayList4;
        c c16;
        int v95;
        ArrayList arrayList3;
        d[] arr_d5;
        int v78;
        int v77;
        d d13;
        int v76;
        int v75;
        int v71;
        int v54;
        int v52;
        int v45;
        ArrayList arrayList2;
        int[] arr_v2;
        int v30;
        int v29;
        d d3;
        int[] arr_v1;
        int v25;
        int v23;
        int v22;
        int v21;
        int v20;
        f f8;
        int v17;
        if(this.s0 > 0) {
            p1.c c0 = this.U == null ? null : this.U.v0;
            if(c0 == null) {
                this.y0 = 0;
                this.z0 = 0;
                this.x0 = false;
                return;
            }
            for(int v4 = 0; v4 < this.s0; ++v4) {
                d d0 = this.r0[v4];
                if(d0 != null && !(d0 instanceof h)) {
                    int v5 = d0.k(0);
                    int v6 = d0.k(1);
                    if(v5 != 3 || d0.s == 1 || v6 != 3 || d0.t == 1) {
                        if(v5 == 3) {
                            v5 = 2;
                        }
                        if(v6 == 3) {
                            v6 = 2;
                        }
                        this.A0.a = v5;
                        this.A0.b = v6;
                        this.A0.c = d0.r();
                        this.A0.d = d0.l();
                        c0.b(d0, this.A0);
                        d0.S(this.A0.e);
                        d0.N(this.A0.f);
                        d0.J(this.A0.g);
                    }
                }
            }
        }
        int v7 = this.v0;
        int v8 = this.w0;
        int v9 = this.t0;
        int v10 = this.u0;
        int v11 = 0;
        int v12 = 0;
        int v13 = v1 - v7 - v8;
        int v14 = this.U0;
        if(v14 == 1) {
            v13 = v3 - v9 - v10;
        }
        if(v14 == 0) {
            if(this.C0 == -1) {
                this.C0 = 0;
            }
            if(this.D0 == -1) {
                this.D0 = 0;
            }
        }
        else {
            if(this.C0 == -1) {
                this.C0 = 0;
            }
            if(this.D0 == -1) {
                this.D0 = 0;
            }
        }
        d[] arr_d = this.r0;
        int v16 = 0;
        for(int v15 = 0; true; ++v15) {
            v17 = this.s0;
            if(v15 >= v17) {
                break;
            }
            if(this.r0[v15].h0 == 8) {
                ++v16;
            }
        }
        if(v16 > 0) {
            arr_d = new d[v17 - v16];
            int v18 = 0;
            v17 = 0;
            while(v18 < this.s0) {
                d d1 = this.r0[v18];
                if(d1.h0 != 8) {
                    arr_d[v17] = d1;
                    ++v17;
                }
                ++v18;
                v13 = v13;
            }
        }
        d[] arr_d1 = arr_d;
        this.Z0 = arr_d1;
        this.a1 = v17;
        int v19 = this.S0;
        ArrayList arrayList0 = this.V0;
        if(v19 == 0) {
            v20 = v10;
            v21 = v9;
            v22 = v8;
            v23 = v7;
            int v99 = this.U0;
            if(v17 != 0) {
                if(arrayList0.size() == 0) {
                    f8 = new f(this, v99, this.J, this.K, this.L, this.M, v13);
                    arrayList0.add(f8);
                }
                else {
                    f8 = (f)arrayList0.get(0);
                    f8.c = 0;
                    f8.b = null;
                    f8.l = 0;
                    f8.m = 0;
                    f8.n = 0;
                    f8.o = 0;
                    f8.p = 0;
                    f8.f(v99, this.J, this.K, this.L, this.M, this.v0, this.t0, this.w0, this.u0, v13);
                }
                for(int v100 = 0; v100 < v17; ++v100) {
                    f8.a(arr_d1[v100]);
                }
                v11 = f8.d();
                v12 = f8.c();
            }
        }
        else {
            c c1 = this.J;
            c c2 = this.L;
            c c3 = this.M;
            int[] arr_v = this.q0;
            c c4 = this.K;
            switch(v19) {
                case 1: {
                    v20 = v10;
                    v21 = v9;
                    v22 = v8;
                    v23 = v7;
                    ArrayList arrayList1 = arrayList0;
                    int v24 = this.U0;
                    if(v17 != 0) {
                        arrayList1.clear();
                        f f0 = new f(this, v24, this.J, this.K, this.L, this.M, v13);
                        arrayList1.add(f0);
                        if(v24 == 0) {
                            v25 = 0;
                            int v26 = 0;
                            int v27 = 0;
                            while(v27 < v17) {
                                d d2 = arr_d1[v27];
                                int v28 = this.a0(d2, v13);
                                if(d2.q0[0] == 3) {
                                    ++v25;
                                }
                                if(((v26 == v13 || this.O0 + v26 + v28 > v13) && f0.b != null || v27 <= 0 || (this.T0 <= 0 || v27 % this.T0 != 0) ? (v26 == v13 || this.O0 + v26 + v28 > v13) && f0.b != null : true)) {
                                    arr_v1 = arr_v;
                                    d3 = d2;
                                    v29 = v27;
                                    f0 = new f(this, 0, this.J, this.K, this.L, this.M, v13);
                                    f0.n = v29;
                                    arrayList1.add(f0);
                                }
                                else {
                                    arr_v1 = arr_v;
                                    d3 = d2;
                                    v29 = v27;
                                    if(v29 > 0) {
                                        v26 = this.O0 + v28 + v26;
                                        goto label_116;
                                    }
                                }
                                v26 = v28;
                            label_116:
                                f0.a(d3);
                                v27 = v29 + 1;
                                v25 = v25;
                                arr_v = arr_v1;
                            }
                            v30 = 0;
                            arr_v2 = arr_v;
                        }
                        else {
                            v30 = v24;
                            arr_v2 = arr_v;
                            v25 = 0;
                            int v31 = 0;
                            int v32 = 0;
                            while(v32 < v17) {
                                d d4 = arr_d1[v32];
                                int v33 = this.Z(d4, v13);
                                if(d4.q0[1] == 3) {
                                    ++v25;
                                }
                                if(((v31 == v13 || this.P0 + v31 + v33 > v13) && f0.b != null || v32 <= 0 || (this.T0 <= 0 || v32 % this.T0 != 0) ? (v31 == v13 || this.P0 + v31 + v33 > v13) && f0.b != null : true)) {
                                    f0 = new f(this, v30, this.J, this.K, this.L, this.M, v13);
                                    f0.n = v32;
                                    arrayList1.add(f0);
                                }
                                else if(v32 > 0) {
                                    v31 = this.P0 + v33 + v31;
                                    goto label_143;
                                }
                                v31 = v33;
                            label_143:
                                f0.a(d4);
                                ++v32;
                                v25 = v25;
                            }
                        }
                        int v34 = arrayList1.size();
                        int v35 = this.v0;
                        int v36 = this.t0;
                        int v37 = this.w0;
                        int v38 = this.u0;
                        if(v25 > 0 && (arr_v2[0] == 2 || arr_v2[1] == 2)) {
                            for(int v39 = 0; v39 < v34; ++v39) {
                                f f1 = (f)arrayList1.get(v39);
                                if(v30 == 0) {
                                    f1.e(v13 - f1.d());
                                }
                                else {
                                    f1.e(v13 - f1.c());
                                }
                            }
                        }
                        int v40 = v36;
                        c c5 = c1;
                        c c6 = c2;
                        c c7 = c3;
                        int v41 = 0;
                        int v42 = 0;
                        int v43 = 0;
                        int v44 = v35;
                        c c8 = c4;
                        while(v41 < v34) {
                            f f2 = (f)arrayList1.get(v41);
                            if(v30 == 0) {
                                if(v41 < v34 - 1) {
                                    c7 = ((f)arrayList1.get(v41 + 1)).b.K;
                                    arrayList2 = arrayList1;
                                    v38 = 0;
                                }
                                else {
                                    v38 = this.u0;
                                    arrayList2 = arrayList1;
                                    c7 = c3;
                                }
                                c c9 = f2.b.M;
                                f2.f(0, c5, c8, c6, c7, v44, v40, v37, v38, v13);
                                v45 = v34;
                                v42 = Math.max(v42, f2.d());
                                v43 = v41 <= 0 ? f2.c() + v43 : f2.c() + v43 + this.P0;
                                c8 = c9;
                                arrayList1 = arrayList2;
                                v40 = 0;
                            }
                            else {
                                if(v41 < v34 - 1) {
                                    arrayList1 = arrayList1;
                                    v45 = v34;
                                    c6 = ((f)arrayList1.get(v41 + 1)).b.J;
                                    v37 = 0;
                                }
                                else {
                                    arrayList1 = arrayList1;
                                    v37 = this.w0;
                                    v45 = v34;
                                    c6 = c2;
                                }
                                c c10 = f2.b.L;
                                f2.f(v30, c5, c8, c6, c7, v44, v40, v37, v38, v13);
                                int v46 = f2.d() + v42;
                                int v47 = Math.max(v43, f2.c());
                                if(v41 > 0) {
                                    v46 += this.O0;
                                }
                                v42 = v46;
                                c5 = c10;
                                v43 = v47;
                                v44 = 0;
                            }
                            ++v41;
                            v34 = v45;
                        }
                        v11 = v42;
                        v12 = v43;
                    }
                    break;
                }
                case 2: {
                    v20 = v10;
                    v21 = v9;
                    v22 = v8;
                    v23 = v7;
                    d[] arr_d2 = arr_d1;
                    int v48 = this.U0;
                    if(v48 == 0) {
                        int v49 = this.T0;
                        if(v49 <= 0) {
                            int v51 = 0;
                            v52 = 0;
                            for(int v50 = 0; v50 < v17; ++v50) {
                                if(v50 > 0) {
                                    v51 += this.O0;
                                }
                                d d5 = arr_d2[v50];
                                if(d5 != null) {
                                    int v53 = this.a0(d5, v13) + v51;
                                    if(v53 > v13) {
                                        break;
                                    }
                                    ++v52;
                                    v51 = v53;
                                }
                            }
                        }
                        else {
                            v52 = v49;
                        }
                        v54 = 0;
                    }
                    else {
                        v54 = this.T0;
                        if(v54 <= 0) {
                            int v56 = 0;
                            int v57 = 0;
                            for(int v55 = 0; v55 < v17; ++v55) {
                                if(v55 > 0) {
                                    v56 += this.P0;
                                }
                                d d6 = arr_d2[v55];
                                if(d6 != null) {
                                    int v58 = this.Z(d6, v13) + v56;
                                    if(v58 > v13) {
                                        break;
                                    }
                                    ++v57;
                                    v56 = v58;
                                }
                            }
                            v54 = v57;
                        }
                        v52 = 0;
                    }
                    if(this.Y0 == null) {
                        this.Y0 = new int[2];
                    }
                    boolean z = v54 == 0 && v48 == 1 || v52 == 0 && v48 == 0;
                    while(!z) {
                        if(v48 == 0) {
                            v54 = (int)Math.ceil(((float)v17) / ((float)v52));
                        }
                        else {
                            v52 = (int)Math.ceil(((float)v17) / ((float)v54));
                        }
                        d[] arr_d3 = this.X0;
                        if(arr_d3 == null || arr_d3.length < v52) {
                            this.X0 = new d[v52];
                        }
                        else {
                            Arrays.fill(arr_d3, null);
                        }
                        d[] arr_d4 = this.W0;
                        if(arr_d4 == null || arr_d4.length < v54) {
                            this.W0 = new d[v54];
                        }
                        else {
                            Arrays.fill(arr_d4, null);
                        }
                        for(int v59 = 0; v59 < v52; ++v59) {
                            int v60 = 0;
                            while(v60 < v54) {
                                int v61 = v48 == 1 ? v59 * v54 + v60 : v60 * v52 + v59;
                                if(v61 < arr_d2.length) {
                                    d d7 = arr_d2[v61];
                                    if(d7 != null) {
                                        int v62 = this.a0(d7, v13);
                                        d d8 = this.X0[v59];
                                        if(d8 == null || d8.r() < v62) {
                                            this.X0[v59] = d7;
                                        }
                                        int v63 = this.Z(d7, v13);
                                        d d9 = this.W0[v60];
                                        if(d9 == null || d9.l() < v63) {
                                            this.W0[v60] = d7;
                                        }
                                    }
                                }
                                ++v60;
                                arr_d2 = arr_d2;
                            }
                        }
                        int v65 = 0;
                        for(int v64 = 0; v64 < v52; ++v64) {
                            d d10 = this.X0[v64];
                            if(d10 != null) {
                                if(v64 > 0) {
                                    v65 += this.O0;
                                }
                                v65 = this.a0(d10, v13) + v65;
                            }
                        }
                        int v67 = 0;
                        for(int v66 = 0; v66 < v54; ++v66) {
                            d d11 = this.W0[v66];
                            if(d11 != null) {
                                if(v66 > 0) {
                                    v67 += this.P0;
                                }
                                v67 = this.Z(d11, v13) + v67;
                            }
                        }
                        v11 = v65;
                        v12 = v67;
                        if(v48 != 0) {
                            if(v67 > v13 && v54 > 1) {
                                --v54;
                            }
                        }
                        else if(v65 > v13 && v52 > 1) {
                            --v52;
                        }
                        else {
                            z = true;
                        }
                        arr_d2 = arr_d2;
                    }
                    int[] arr_v3 = this.Y0;
                    arr_v3[0] = v52;
                    arr_v3[1] = v54;
                    break;
                }
                case 3: {
                    int v68 = this.U0;
                    if(v17 == 0) {
                    label_490:
                        v20 = v10;
                        v21 = v9;
                        v22 = v8;
                        v23 = v7;
                    }
                    else {
                        arrayList0.clear();
                        int v69 = v13;
                        v20 = v10;
                        v21 = v9;
                        v22 = v8;
                        v23 = v7;
                        f f3 = new f(this, v68, this.J, this.K, this.L, this.M, v69);
                        arrayList0.add(f3);
                        if(v68 == 0) {
                            int v70 = 0;
                            v71 = 0;
                            int v72 = 0;
                            int v73 = 0;
                            while(v73 < v17) {
                                ++v70;
                                d d12 = arr_d1[v73];
                                int v74 = this.a0(d12, v69);
                                if(d12.q0[0] == 3) {
                                    ++v71;
                                }
                                if(((v72 == v69 || this.O0 + v72 + v74 > v69) && f3.b != null || v73 <= 0 || (this.T0 <= 0 || v70 <= this.T0) ? (v72 == v69 || this.O0 + v72 + v74 > v69) && f3.b != null : true)) {
                                    v75 = v71;
                                    v76 = v69;
                                    d13 = d12;
                                    v77 = v73;
                                    f f4 = new f(this, 0, this.J, this.K, this.L, this.M, v76);
                                    f4.n = v77;
                                    arrayList0.add(f4);
                                    f3 = f4;
                                    v72 = v74;
                                    v70 = 1;
                                }
                                else {
                                    v76 = v69;
                                    d13 = d12;
                                    v77 = v73;
                                    v75 = v71;
                                    v72 = v77 <= 0 ? v74 : this.O0 + v74 + v72;
                                }
                                f3.a(d13);
                                v73 = v77 + 1;
                                v71 = v75;
                                v69 = v76;
                            }
                            v78 = v69;
                        }
                        else {
                            int v79 = v69;
                            int v80 = 0;
                            v71 = 0;
                            int v81 = 0;
                            int v82 = 0;
                            while(v82 < v17) {
                                d d14 = arr_d1[v82];
                                int v83 = this.Z(d14, v79);
                                if(d14.q0[1] == 3) {
                                    ++v71;
                                }
                                if(((v81 == v79 || this.P0 + v81 + v83 > v79) && f3.b != null || v82 <= 0 || (this.T0 <= 0 || v80 + 1 <= this.T0) ? (v81 == v79 || this.P0 + v81 + v83 > v79) && f3.b != null : true)) {
                                    arr_d5 = arr_d1;
                                    f f5 = new f(this, v68, this.J, this.K, this.L, this.M, v79);
                                    f5.n = v82;
                                    arrayList0.add(f5);
                                    f3 = f5;
                                    v81 = v83;
                                    v80 = 1;
                                }
                                else {
                                    arr_d5 = arr_d1;
                                    if(v82 > 0) {
                                        v81 = this.P0 + v83 + v81;
                                        ++v80;
                                    }
                                    else {
                                        ++v80;
                                        v81 = v83;
                                    }
                                }
                                f3.a(d14);
                                ++v82;
                                v71 = v71;
                                arr_d1 = arr_d5;
                                v79 = v79;
                            }
                            v78 = v79;
                        }
                        int v84 = arrayList0.size();
                        int v85 = this.v0;
                        int v86 = this.t0;
                        int v87 = this.w0;
                        int v88 = this.u0;
                        if(v71 > 0 && (arr_v[0] == 2 || arr_v[1] == 2)) {
                            for(int v89 = 0; v89 < v84; ++v89) {
                                f f6 = (f)arrayList0.get(v89);
                                if(v68 == 0) {
                                    f6.e(v78 - f6.d());
                                }
                                else {
                                    f6.e(v78 - f6.c());
                                }
                            }
                        }
                        int v90 = v86;
                        c c11 = c4;
                        c c12 = c2;
                        c c13 = c3;
                        int v91 = 0;
                        int v92 = 0;
                        int v93 = 0;
                        int v94 = v85;
                        c c14 = c1;
                        while(v91 < v84) {
                            f f7 = (f)arrayList0.get(v91);
                            if(v68 == 0) {
                                if(v91 < v84 - 1) {
                                    c13 = ((f)arrayList0.get(v91 + 1)).b.K;
                                    arrayList3 = arrayList0;
                                    v88 = 0;
                                }
                                else {
                                    v88 = this.u0;
                                    arrayList3 = arrayList0;
                                    c13 = c3;
                                }
                                c c15 = f7.b.M;
                                f7.f(0, c14, c11, c12, c13, v94, v90, v87, v88, v78);
                                v95 = v84;
                                v92 = Math.max(v92, f7.d());
                                v93 = v91 <= 0 ? f7.c() + v93 : f7.c() + v93 + this.P0;
                                c16 = c12;
                                c11 = c15;
                                arrayList4 = arrayList3;
                                v90 = 0;
                            }
                            else {
                                if(v91 < v84 - 1) {
                                    arrayList4 = arrayList0;
                                    c17 = ((f)arrayList4.get(v91 + 1)).b.J;
                                    v95 = v84;
                                    v96 = 0;
                                }
                                else {
                                    arrayList4 = arrayList0;
                                    v95 = v84;
                                    v96 = this.w0;
                                    c17 = c2;
                                }
                                c c18 = f7.b.L;
                                f7.f(v68, c14, c11, c17, c13, v94, v90, v96, v88, v78);
                                int v97 = f7.d() + v92;
                                int v98 = Math.max(v93, f7.c());
                                if(v91 > 0) {
                                    v97 += this.O0;
                                }
                                v92 = v97;
                                v93 = v98;
                                v94 = 0;
                                c14 = c18;
                                c16 = c17;
                                v87 = v96;
                            }
                            ++v91;
                            arrayList0 = arrayList4;
                            c12 = c16;
                            v84 = v95;
                        }
                        v11 = v92;
                        v12 = v93;
                    }
                    break;
                }
                default: {
                    goto label_490;
                }
            }
        }
        int v101 = v11 + v23 + v22;
        int v102 = v12 + v21 + v20;
        if(v == 0x40000000) {
            v101 = v1;
        }
        else if(v == 0x80000000) {
            v101 = Math.min(v101, v1);
        }
        else if(v != 0) {
            v101 = 0;
        }
        if(v2 == 0x40000000) {
            v103 = v3;
        }
        else if(v2 == 0x80000000) {
            v103 = Math.min(v102, v3);
        }
        else {
            v103 = v2 == 0 ? v102 : 0;
        }
        this.y0 = v101;
        this.z0 = v103;
        this.S(v101);
        this.N(v103);
        this.x0 = this.s0 > 0;
    }

    public final int Z(d d0, int v) {
        if(d0 == null) {
            return 0;
        }
        int[] arr_v = d0.q0;
        if(arr_v[1] == 3) {
            int v1 = d0.t;
            if(v1 == 0) {
                return 0;
            }
            switch(v1) {
                case 1: {
                    return d0.l();
                }
                case 2: {
                    int v2 = (int)(d0.A * ((float)v));
                    if(v2 != d0.l()) {
                        d0.g = true;
                        this.Y(arr_v[0], d0.r(), 1, v2, d0);
                    }
                    return v2;
                }
                case 3: {
                    return (int)(((float)d0.r()) * d0.X + 0.5f);
                }
                default: {
                    return d0.l();
                }
            }
        }
        return d0.l();
    }

    public final int a0(d d0, int v) {
        if(d0 == null) {
            return 0;
        }
        int[] arr_v = d0.q0;
        if(arr_v[0] == 3) {
            int v1 = d0.s;
            if(v1 == 0) {
                return 0;
            }
            switch(v1) {
                case 1: {
                    return d0.r();
                }
                case 2: {
                    int v2 = (int)(d0.x * ((float)v));
                    if(v2 != d0.r()) {
                        d0.g = true;
                        this.Y(1, v2, arr_v[1], d0.l(), d0);
                    }
                    return v2;
                }
                case 3: {
                    return (int)(((float)d0.l()) * d0.X + 0.5f);
                }
                default: {
                    return d0.r();
                }
            }
        }
        return d0.r();
    }

    @Override  // o1.d
    public final void c(h1.c c0, boolean z) {
        float f1;
        int v6;
        super.c(c0, z);
        boolean z1 = this.U != null && this.U.w0;
        ArrayList arrayList0 = this.V0;
        switch(this.S0) {
            case 0: {
                if(arrayList0.size() > 0) {
                    ((f)arrayList0.get(0)).b(0, z1, true);
                }
                break;
            }
            case 1: {
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((f)arrayList0.get(v1)).b(v1, z1, v1 == v - 1);
                }
                break;
            }
            case 2: {
                if(this.Y0 != null && this.X0 != null && this.W0 != null) {
                    for(int v2 = 0; v2 < this.a1; ++v2) {
                        this.Z0[v2].E();
                    }
                    int[] arr_v = this.Y0;
                    int v3 = arr_v[0];
                    int v4 = arr_v[1];
                    float f = this.I0;
                    d d0 = null;
                    int v5 = 0;
                    while(v5 < v3) {
                        if(z1) {
                            v6 = v3 - v5 - 1;
                            f1 = 1.0f - this.I0;
                        }
                        else {
                            f1 = f;
                            v6 = v5;
                        }
                        d d1 = this.X0[v6];
                        if(d1 != null && d1.h0 != 8) {
                            c c1 = d1.J;
                            if(v5 == 0) {
                                d1.g(c1, this.J, this.v0);
                                d1.j0 = this.C0;
                                d1.e0 = f1;
                            }
                            if(v5 == v3 - 1) {
                                d1.g(d1.L, this.L, this.w0);
                            }
                            if(v5 > 0 && d0 != null) {
                                d1.g(c1, d0.L, this.O0);
                                d0.g(d0.L, c1, 0);
                            }
                            d0 = d1;
                        }
                        ++v5;
                        f = f1;
                    }
                    for(int v7 = 0; v7 < v4; ++v7) {
                        d d2 = this.W0[v7];
                        if(d2 != null && d2.h0 != 8) {
                            c c2 = d2.K;
                            if(v7 == 0) {
                                d2.g(c2, this.K, this.t0);
                                d2.k0 = this.D0;
                                d2.f0 = this.J0;
                            }
                            if(v7 == v4 - 1) {
                                d2.g(d2.M, this.M, this.u0);
                            }
                            if(v7 > 0 && d0 != null) {
                                d2.g(c2, d0.M, this.P0);
                                d0.g(d0.M, c2, 0);
                            }
                            d0 = d2;
                        }
                    }
                    for(int v8 = 0; v8 < v3; ++v8) {
                        for(int v9 = 0; v9 < v4; ++v9) {
                            int v10 = this.U0 == 1 ? v8 * v4 + v9 : v9 * v3 + v8;
                            d[] arr_d = this.Z0;
                            if(v10 < arr_d.length) {
                                d d3 = arr_d[v10];
                                if(d3 != null && d3.h0 != 8) {
                                    d d4 = this.X0[v8];
                                    d d5 = this.W0[v9];
                                    if(d3 != d4) {
                                        d3.g(d3.J, d4.J, 0);
                                        d3.g(d3.L, d4.L, 0);
                                    }
                                    if(d3 != d5) {
                                        d3.g(d3.K, d5.K, 0);
                                        d3.g(d3.M, d5.M, 0);
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 3: {
                int v11 = arrayList0.size();
                for(int v12 = 0; v12 < v11; ++v12) {
                    ((f)arrayList0.get(v12)).b(v12, z1, v12 == v11 - 1);
                }
            }
        }
        this.x0 = false;
    }
}

