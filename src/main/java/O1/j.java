package o1;

import h1.c;
import java.util.ArrayList;

public abstract class j {
    public static final boolean[] a;

    static {
        j.a = new boolean[3];
    }

    public static void a(e e0, c c0, ArrayList arrayList0, int v) {
        int v10;
        b[] arr_b1;
        int v9;
        int v30;
        d d30;
        h1.e e15;
        d d29;
        h1.e e14;
        o1.c c22;
        d d24;
        d d23;
        d d22;
        h1.e e10;
        o1.c c20;
        int v22;
        d d18;
        float f6;
        d d17;
        int v21;
        ArrayList arrayList3;
        d d14;
        b b1;
        d d13;
        d d12;
        o1.c[] arr_c1;
        int v12;
        d d11;
        float f2;
        boolean z2;
        int v11;
        int v8;
        d d4;
        int v7;
        int v2;
        b[] arr_b;
        int v1;
        e e1 = e0;
        ArrayList arrayList1 = arrayList0;
        if(v == 0) {
            v1 = e1.A0;
            arr_b = e1.D0;
            v2 = 0;
        }
        else {
            v1 = e1.B0;
            arr_b = e1.C0;
            v2 = 2;
        }
        int v3 = 0;
        while(v3 < v1) {
            b b0 = arr_b[v3];
            d d0 = b0.a;
            h1.e e2 = null;
            if(b0.q) {
                v8 = v3;
            }
            else {
                int v4 = b0.l;
                int v5 = v4 * 2;
                d d1 = d0;
                d d2 = d1;
                boolean z = false;
                while(!z) {
                    ++b0.i;
                    d1.n0[v4] = null;
                    d1.m0[v4] = null;
                    o1.c[] arr_c = d1.R;
                    if(d1.h0 == 8) {
                        v7 = v3;
                    }
                    else {
                        o1.c c1 = arr_c[v5];
                        o1.c c2 = arr_c[v5 + 1];
                        o1.c c3 = arr_c[v5];
                        o1.c c4 = arr_c[v5 + 1];
                        if(b0.b == null) {
                            b0.b = d1;
                        }
                        b0.d = d1;
                        if(d1.q0[v4] == 3) {
                            int v6 = d1.u[v4];
                            if(v6 == 0 || v6 == 2 || v6 == 3) {
                                ++b0.j;
                                float f = d1.l0[v4];
                                if(f > 0.0f) {
                                    b0.k += f;
                                }
                                v7 = v3;
                                if(d1.h0 != 8 && (v6 == 0 || v6 == 3)) {
                                    if(f < 0.0f) {
                                        b0.n = true;
                                    }
                                    else {
                                        b0.o = true;
                                    }
                                    if(b0.h == null) {
                                        b0.h = new ArrayList();
                                    }
                                    b0.h.add(d1);
                                }
                                if(b0.f == null) {
                                    b0.f = d1;
                                }
                                d d3 = b0.g;
                                if(d3 != null) {
                                    d3.m0[v4] = d1;
                                }
                                b0.g = d1;
                            }
                            else {
                                v7 = v3;
                            }
                        }
                    }
                    if(d2 != d1) {
                        d2.n0[v4] = d1;
                    }
                    o1.c c5 = arr_c[v5 + 1].f;
                    if(c5 == null) {
                        d4 = null;
                    }
                    else {
                        d4 = c5.d;
                        o1.c c6 = d4.R[v5].f;
                        if(c6 == null || c6.d != d1) {
                            d4 = null;
                        }
                    }
                    if(d4 == null) {
                        d4 = d1;
                        z = true;
                    }
                    d2 = d1;
                    v3 = v7;
                    d1 = d4;
                }
                v8 = v3;
                d d5 = b0.b;
                if(d5 != null) {
                    o1.c c7 = d5.R[v5];
                }
                d d6 = b0.d;
                if(d6 != null) {
                    o1.c c8 = d6.R[v5 + 1];
                }
                b0.c = d1;
                b0.e = v4 != 0 || !b0.m ? d0 : d1;
                b0.p = b0.o && b0.n;
            }
            b0.q = true;
            if(arrayList1 == null || arrayList1.contains(d0)) {
                d d7 = b0.c;
                d d8 = b0.b;
                d d9 = b0.d;
                d d10 = b0.e;
                float f1 = b0.k;
                boolean z1 = e1.q0[v] == 2;
                if(v == 0) {
                    v11 = d10.j0 == 1 ? 1 : 0;
                    z2 = d10.j0 == 2;
                    f2 = f1;
                    d11 = d0;
                    v12 = d10.j0 == 0 ? 1 : 0;
                }
                else {
                    z2 = d10.k0 == 2;
                    f2 = f1;
                    d11 = d0;
                    v12 = d10.k0 == 0 ? 1 : 0;
                    v11 = d10.k0 == 1 ? 1 : 0;
                }
                boolean z3 = false;
                while(true) {
                    arr_c1 = e1.R;
                    if(z3) {
                        break;
                    }
                    o1.c c9 = d11.R[v2];
                    int v13 = z2 ? 1 : 4;
                    int v14 = c9.e();
                    int[] arr_v = d11.q0;
                    boolean z4 = arr_v[v] == 3 && d11.u[v] == 0;
                    o1.c c10 = c9.f;
                    if(c10 != null && d11 != d0) {
                        v14 = c10.e() + v14;
                    }
                    if(!z2 || d11 == d0 || d11 == d8) {
                        d12 = d10;
                    }
                    else {
                        d12 = d10;
                        v13 = 8;
                    }
                    o1.c c11 = c9.f;
                    if(c11 == null) {
                        b1 = b0;
                        d13 = d0;
                    }
                    else {
                        if(d11 == d8) {
                            d13 = d0;
                            b1 = b0;
                            c0.f(c9.i, c11.i, v14, 6);
                        }
                        else {
                            b1 = b0;
                            d13 = d0;
                            c0.f(c9.i, c11.i, v14, 8);
                        }
                        if(z4 && !z2) {
                            v13 = 5;
                        }
                        c0.e(c9.i, c9.f.i, v14, (d11 != d8 || !z2 || !d11.T[v] ? v13 : 5));
                    }
                    o1.c[] arr_c2 = d11.R;
                    if(z1) {
                        if(d11.h0 != 8 && arr_v[v] == 3) {
                            c0.f(arr_c2[v2 + 1].i, arr_c2[v2].i, 0, 5);
                        }
                        c0.f(arr_c2[v2].i, arr_c1[v2].i, 0, 8);
                    }
                    o1.c c12 = arr_c2[v2 + 1].f;
                    if(c12 == null) {
                        d14 = null;
                    }
                    else {
                        d14 = c12.d;
                        o1.c c13 = d14.R[v2].f;
                        if(c13 == null || c13.d != d11) {
                            d14 = null;
                        }
                    }
                    if(d14 == null) {
                        z3 = true;
                    }
                    else {
                        d11 = d14;
                        z3 = false;
                    }
                    d10 = d12;
                    v1 = v1;
                    arr_b = arr_b;
                    d0 = d13;
                    b0 = b1;
                }
                v9 = v1;
                arr_b1 = arr_b;
                if(d9 != null && d7.R[v2 + 1].f != null) {
                    o1.c c14 = d9.R[v2 + 1];
                    if(d9.q0[v] == 3 && d9.u[v] == 0 && !z2) {
                        o1.c c15 = c14.f;
                        if(c15.d == e1) {
                            int v15 = c14.e();
                            c0.e(c14.i, c15.i, -v15, 5);
                        }
                    }
                    else if(z2) {
                        o1.c c16 = c14.f;
                        if(c16.d == e1) {
                            int v16 = c14.e();
                            c0.e(c14.i, c16.i, -v16, 4);
                        }
                    }
                    int v17 = c14.e();
                    c0.g(c14.i, d7.R[v2 + 1].f.i, -v17, 6);
                }
                if(z1) {
                    h1.e e3 = arr_c1[v2 + 1].i;
                    o1.c c17 = d7.R[v2 + 1];
                    int v18 = c17.e();
                    c0.f(e3, c17.i, v18, 8);
                }
                ArrayList arrayList2 = b0.h;
                if(arrayList2 != null) {
                    int v19 = arrayList2.size();
                    if(v19 > 1) {
                        float f3 = !b0.n || b0.p ? f2 : ((float)b0.j);
                        d d15 = null;
                        float f4 = 0.0f;
                        int v20 = 0;
                        while(v20 < v19) {
                            d d16 = (d)arrayList2.get(v20);
                            float f5 = d16.l0[v];
                            o1.c[] arr_c3 = d16.R;
                            if(Float.compare(f5, 0.0f) < 0) {
                                if(b0.p) {
                                    c0.e(arr_c3[v2 + 1].i, arr_c3[v2].i, 0, 4);
                                    arrayList3 = arrayList2;
                                    v21 = v19;
                                    goto label_254;
                                }
                                else {
                                    f5 = 1.0f;
                                }
                            }
                            if(Float.compare(f5, 0.0f) == 0) {
                                c0.e(arr_c3[v2 + 1].i, arr_c3[v2].i, 0, 8);
                                arrayList3 = arrayList2;
                                v21 = v19;
                            }
                            else {
                                if(d15 == null) {
                                    arrayList3 = arrayList2;
                                    v21 = v19;
                                    f6 = f5;
                                    d17 = d16;
                                }
                                else {
                                    h1.e e4 = d15.R[v2].i;
                                    h1.e e5 = d15.R[v2 + 1].i;
                                    arrayList3 = arrayList2;
                                    h1.e e6 = arr_c3[v2].i;
                                    h1.e e7 = arr_c3[v2 + 1].i;
                                    v21 = v19;
                                    h1.b b2 = c0.l();
                                    d17 = d16;
                                    b2.b = 0.0f;
                                    if(Float.compare(f3, 0.0f) == 0 || f4 == f5) {
                                        f6 = f5;
                                        b2.d.g(e4, 1.0f);
                                        b2.d.g(e5, -1.0f);
                                        b2.d.g(e7, 1.0f);
                                        b2.d.g(e6, -1.0f);
                                    }
                                    else if(f4 == 0.0f) {
                                        b2.d.g(e4, 1.0f);
                                        b2.d.g(e5, -1.0f);
                                        f6 = f5;
                                    }
                                    else {
                                        float f7 = f4 / f3 / (f5 / f3);
                                        f6 = f5;
                                        b2.d.g(e4, 1.0f);
                                        b2.d.g(e5, -1.0f);
                                        b2.d.g(e7, f7);
                                        b2.d.g(e6, -f7);
                                    }
                                    c0.c(b2);
                                }
                                f4 = f6;
                                d15 = d17;
                            }
                        label_254:
                            ++v20;
                            v19 = v21;
                            arrayList2 = arrayList3;
                        }
                    }
                }
                if(d8 != null && (d8 == d9 || z2)) {
                    o1.c c29 = d0.R[v2];
                    o1.c c30 = d7.R[v2 + 1];
                    h1.e e16 = c29.f == null ? null : c29.f.i;
                    h1.e e17 = c30.f == null ? null : c30.f.i;
                    o1.c c31 = d8.R[v2];
                    if(d9 != null) {
                        c30 = d9.R[v2 + 1];
                    }
                    if(e16 == null || e17 == null) {
                        d18 = d9;
                        v22 = v8;
                    }
                    else {
                        int v35 = c31.e();
                        int v36 = c30.e();
                        d18 = d9;
                        v22 = v8;
                        c0.b(c31.i, e16, v35, (v == 0 ? d10.e0 : d10.f0), e17, c30.i, v36, 7);
                    }
                    v10 = v22;
                }
                else {
                    d18 = d9;
                    v22 = v8;
                    if(v12 != 0 && d8 != null) {
                        boolean z5 = b0.j > 0 && b0.i == b0.j;
                        d d19 = d8;
                        for(d d20 = d19; d20 != null; d20 = d23) {
                            d d21;
                            for(d21 = d20.n0[v]; d21 != null && d21.h0 == 8; d21 = d21.n0[v]) {
                            }
                            if(d21 == null && d20 != d18) {
                                d23 = d21;
                                d22 = d19;
                                d24 = d20;
                            }
                            else {
                                o1.c[] arr_c4 = d20.R;
                                o1.c c18 = arr_c4[v2];
                                h1.e e8 = c18.i;
                                h1.e e9 = c18.f == null ? null : c18.f.i;
                                if(d19 != d20) {
                                    e9 = d19.R[v2 + 1].i;
                                }
                                else if(d20 == d8) {
                                    o1.c c19 = d0.R[v2].f;
                                    e9 = c19 == null ? null : c19.i;
                                }
                                int v23 = c18.e();
                                int v24 = arr_c4[v2 + 1].e();
                                if(d21 == null) {
                                    c20 = d7.R[v2 + 1].f;
                                    e10 = c20 == null ? null : c20.i;
                                }
                                else {
                                    c20 = d21.R[v2];
                                    e10 = c20.i;
                                }
                                h1.e e11 = arr_c4[v2 + 1].i;
                                if(c20 != null) {
                                    v24 = c20.e() + v24;
                                }
                                int v25 = d19.R[v2 + 1].e() + v23;
                                if(e8 != null && e9 != null && e10 != null && e11 != null) {
                                    if(d20 == d8) {
                                        v25 = d8.R[v2].e();
                                    }
                                    if(d20 == d18) {
                                        v24 = d18.R[v2 + 1].e();
                                    }
                                    d22 = d19;
                                    d23 = d21;
                                    d24 = d20;
                                    c0.b(e8, e9, v25, 0.5f, e10, e11, v24, (z5 ? 8 : 5));
                                }
                            }
                            d19 = d24.h0 == 8 ? d22 : d24;
                        }
                        v10 = v22;
                    }
                    else if(v11 == 0 || d8 == null) {
                        v10 = v22;
                    }
                    else {
                        boolean z6 = b0.j > 0 && b0.i == b0.j;
                        d d25 = d8;
                        d d26 = d25;
                        while(d26 != null) {
                            d d27;
                            for(d27 = d26.n0[v]; d27 != null && d27.h0 == 8; d27 = d27.n0[v]) {
                            }
                            if(d26 == d8 || d26 == d18 || d27 == null) {
                                d30 = d25;
                                v30 = v22;
                            }
                            else {
                                d d28 = d27 == d18 ? null : d27;
                                o1.c[] arr_c5 = d26.R;
                                o1.c c21 = arr_c5[v2];
                                h1.e e12 = c21.i;
                                h1.e e13 = d25.R[v2 + 1].i;
                                int v26 = c21.e();
                                int v27 = arr_c5[v2 + 1].e();
                                if(d28 == null) {
                                    d29 = null;
                                    o1.c c24 = d18.R[v2];
                                    e14 = c24 == null ? null : c24.i;
                                    e15 = arr_c5[v2 + 1].i;
                                    c22 = c24;
                                }
                                else {
                                    c22 = d28.R[v2];
                                    e14 = c22.i;
                                    d29 = d28;
                                    o1.c c23 = c22.f;
                                    e15 = c23 == null ? null : c23.i;
                                }
                                int v28 = c22 == null ? v27 : c22.e() + v27;
                                int v29 = d25.R[v2 + 1].e() + v26;
                                if(e12 == null || e13 == null || e14 == null || e15 == null) {
                                    d30 = d25;
                                    v30 = v22;
                                }
                                else {
                                    d30 = d25;
                                    v30 = v22;
                                    c0.b(e12, e13, v29, 0.5f, e14, e15, v28, (z6 ? 8 : 4));
                                }
                                d27 = d29;
                            }
                            d25 = d26.h0 == 8 ? d30 : d26;
                            d26 = d27;
                            v22 = v30;
                        }
                        v10 = v22;
                        o1.c c25 = d8.R[v2];
                        o1.c c26 = d0.R[v2].f;
                        o1.c c27 = d18.R[v2 + 1];
                        o1.c c28 = d7.R[v2 + 1].f;
                        if(c26 != null) {
                            if(d8 != d18) {
                                int v31 = c25.e();
                                c0.e(c25.i, c26.i, v31, 5);
                            }
                            else if(c28 != null) {
                                int v32 = c25.e();
                                int v33 = c27.e();
                                c0.b(c25.i, c26.i, v32, 0.5f, c27.i, c28.i, v33, 5);
                            }
                        }
                        if(c28 != null && d8 != d18) {
                            int v34 = c27.e();
                            c0.e(c27.i, c28.i, -v34, 5);
                        }
                    }
                }
                if((v12 != 0 || v11 != 0) && d8 != null && d8 != d18) {
                    o1.c[] arr_c6 = d8.R;
                    o1.c c32 = arr_c6[v2];
                    d d31 = d18 == null ? d8 : d18;
                    o1.c[] arr_c7 = d31.R;
                    o1.c c33 = arr_c7[v2 + 1];
                    h1.e e18 = c32.f == null ? null : c32.f.i;
                    h1.e e19 = c33.f == null ? null : c33.f.i;
                    if(d7 != d31) {
                        o1.c c34 = d7.R[v2 + 1].f;
                        if(c34 != null) {
                            e2 = c34.i;
                        }
                        e19 = e2;
                    }
                    if(d8 == d31) {
                        c33 = arr_c6[v2 + 1];
                    }
                    if(e18 != null && e19 != null) {
                        int v37 = c32.e();
                        int v38 = arr_c7[v2 + 1].e();
                        c0.b(c32.i, e18, v37, 0.5f, e19, c33.i, v38, 5);
                    }
                }
            }
            else {
                v9 = v1;
                arr_b1 = arr_b;
                v10 = v8;
            }
            v3 = v10 + 1;
            e1 = e0;
            arrayList1 = arrayList0;
            v1 = v9;
            arr_b = arr_b1;
        }
    }

    public static void b(e e0, c c0, d d0) {
        d0.p = -1;
        d0.q = -1;
        int[] arr_v = d0.q0;
        if(e0.q0[0] != 2 && arr_v[0] == 4) {
            int v = d0.J.g;
            int v1 = e0.r() - d0.L.g;
            d0.J.i = c0.k(d0.J);
            d0.L.i = c0.k(d0.L);
            c0.d(d0.J.i, v);
            c0.d(d0.L.i, v1);
            d0.p = 2;
            d0.Z = v;
            int v2 = v1 - v;
            d0.V = v2;
            int v3 = d0.c0;
            if(v2 < v3) {
                d0.V = v3;
            }
        }
        if(e0.q0[1] != 2 && arr_v[1] == 4) {
            int v4 = d0.K.g;
            int v5 = e0.l() - d0.M.g;
            d0.K.i = c0.k(d0.K);
            d0.M.i = c0.k(d0.M);
            c0.d(d0.K.i, v4);
            c0.d(d0.M.i, v5);
            if(d0.b0 > 0 || d0.h0 == 8) {
                h1.e e1 = c0.k(d0.N);
                d0.N.i = e1;
                c0.d(e1, d0.b0 + v4);
            }
            d0.q = 2;
            d0.a0 = v4;
            int v6 = v5 - v4;
            d0.W = v6;
            int v7 = d0.d0;
            if(v6 < v7) {
                d0.W = v7;
            }
        }
    }

    public static final boolean c(int v, int v1) {
        return (v & v1) == v1;
    }
}

