package k2;

import Bb.v;
import F1.c;
import I2.J;
import Nb.j;
import androidx.recyclerview.widget.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p2.A;

public final class b implements Runnable {
    public final g X;
    public final int Y;
    public final c1 Z;
    public final c1 b0;
    public final c c0;
    public final C1 d0;
    public final c1 e0;

    public b(g g0, int v, c1 c10, c1 c11, c c0, C1 c12, c1 c13) {
        this.X = g0;
        this.Y = v;
        this.Z = c10;
        this.b0 = c11;
        this.c0 = c0;
        this.d0 = c12;
        this.e0 = c13;
    }

    @Override
    public final void run() {
        int v32;
        androidx.recyclerview.widget.c c3;
        int v8;
        androidx.recyclerview.widget.c c2;
        c1 c14;
        g g0 = this.X;
        j.f(g0, "this$0");
        c1 c10 = this.b0;
        c c0 = this.c0;
        C1 c11 = this.d0;
        if(g0.f == this.Y) {
            int v = this.e0.b0.Y + this.e0.b0.e0;
            c1 c12 = this.Z;
            j.f(c12, "newList");
            c1 c13 = g0.e;
            if(c13 == null || g0.d != null) {
                throw new IllegalStateException("must be in snapshot state to apply diff");
            }
            g0.d = c12;
            j.f(g0.h, "listener");
            v.i0(c12.e0, k2.v.b0);
            WeakReference weakReference0 = new WeakReference(g0.h);
            c12.e0.add(weakReference0);
            c12.c(g0.h);
            g0.e = null;
            A a0 = g0.a();
            e1 e10 = c13.b0;
            j.f(e10, "<this>");
            e1 e11 = c10.b0;
            j.f(e11, "newList");
            androidx.recyclerview.widget.c c1 = (androidx.recyclerview.widget.c)c0.Y;
            boolean z = c0.X;
            if(z) {
                j0 j00 = new j0(e10, e11, a0);
                c1.b(j00);
                int v1 = Math.min(e10.Y, j00.c);
                int v2 = e11.Y - j00.c;
                x x0 = x.Z;
                if(v2 > 0) {
                    if(v1 > 0) {
                        ((a)a0).d(0, v1, x0);
                    }
                    ((a)a0).c(0, v2);
                    c14 = c13;
                }
                else if(v2 < 0) {
                    c14 = c13;
                    ((a)a0).a(0, -v2);
                    int v3 = v1 + v2;
                    if(v3 > 0) {
                        ((a)a0).d(0, v3, x0);
                    }
                }
                else {
                    c14 = c13;
                }
                j00.c = e11.Y;
                int v4 = Math.min(e10.Z, j00.d);
                int v5 = e11.Z - j00.d;
                int v6 = j00.c + j00.e + j00.d;
                int v7 = v6 - v4;
                boolean z1 = v7 != e10.e() - v4;
                if(v5 > 0) {
                    c2 = c1;
                    ((a)a0).c(v6, v5);
                    v8 = v;
                }
                else {
                    c2 = c1;
                    if(v5 < 0) {
                        v8 = v;
                        ((a)a0).a(v6 + v5, -v5);
                        v4 += v5;
                    }
                    else {
                        v8 = v;
                    }
                }
                if(v4 > 0 && z1) {
                    ((a)a0).d(v7, v4, x0);
                }
                j00.d = e11.Z;
            }
            else {
                v8 = v;
                c2 = c1;
                c14 = c13;
                int v9 = Math.max(e10.Y, e11.Y);
                int v10 = Math.min(e10.d0 + e10.Y, e11.d0 + e11.Y);
                int v11 = v10 - v9;
                if(v11 > 0) {
                    ((a)a0).a(v9, v11);
                    ((a)a0).c(v9, v11);
                }
                int v12 = Math.min(v9, v10);
                int v13 = Math.max(v9, v10);
                int v14 = e10.Y;
                int v15 = e11.e();
                if(v14 > v15) {
                    v14 = v15;
                }
                int v16 = e10.d0 + e10.Y;
                int v17 = e11.e();
                if(v16 > v17) {
                    v16 = v17;
                }
                x x1 = x.X;
                int v18 = v12 - v14;
                if(v18 > 0) {
                    ((a)a0).d(v14, v18, x1);
                }
                int v19 = v16 - v13;
                if(v19 > 0) {
                    ((a)a0).d(v13, v19, x1);
                }
                int v20 = e11.Y;
                int v21 = e10.e();
                if(v20 > v21) {
                    v20 = v21;
                }
                int v22 = e11.d0 + e11.Y;
                int v23 = e10.e();
                if(v22 > v23) {
                    v22 = v23;
                }
                x x2 = x.Y;
                int v24 = v12 - v20;
                if(v24 > 0) {
                    ((a)a0).d(v20, v24, x2);
                }
                int v25 = v22 - v13;
                if(v25 > 0) {
                    ((a)a0).d(v13, v25, x2);
                }
                int v26 = e11.e() - e10.e();
                if(v26 > 0) {
                    ((a)a0).c(e10.e(), v26);
                }
                else if(v26 < 0) {
                    ((a)a0).a(e10.e() + v26, -v26);
                }
            }
            f f0 = g0.j;
            j.f(f0, "other");
            ArrayList arrayList0 = c11.a;
            Sb.b b0 = J.Q(3, J.R(0, arrayList0.size()));
            int v27 = b0.X;
            int v28 = b0.Y;
            int v29 = b0.Z;
            if(v29 > 0 && v27 <= v28 || v29 < 0 && v28 <= v27) {
                while(true) {
                    switch(((Number)arrayList0.get(v27)).intValue()) {
                        case 0: {
                            f0.a(((Number)arrayList0.get(v27 + 1)).intValue(), ((Number)arrayList0.get(v27 + 2)).intValue());
                            break;
                        }
                        case 1: {
                            f0.b(((Number)arrayList0.get(v27 + 1)).intValue(), ((Number)arrayList0.get(v27 + 2)).intValue());
                            break;
                        }
                        case 2: {
                            int v30 = ((Number)arrayList0.get(v27 + 1)).intValue();
                            int v31 = ((Number)arrayList0.get(v27 + 2)).intValue();
                            ((a)f0.a.a()).a(v30, v31);
                            break;
                        }
                        default: {
                            throw new IllegalStateException("Unexpected recording value");
                        }
                    }
                    if(v27 == v28) {
                        break;
                    }
                    v27 += v29;
                }
            }
            arrayList0.clear();
            c12.a(f0);
            if(!c12.isEmpty()) {
                if(z) {
                    int v33 = v8 - e10.Y;
                    if(v33 >= 0 && v33 < e10.d0) {
                        int v34 = 0;
                        while(v34 < 30) {
                            int v35 = v34 / 2 * (v34 % 2 == 1 ? -1 : 1) + v33;
                            if(v35 >= 0 && v35 < e10.d0) {
                                c3 = c2;
                                int v36 = c3.a(v35);
                                if(v36 != -1) {
                                    v32 = e11.Y + v36;
                                    c12.l(J.r(v32, 0, c12.b0.e() - 1));
                                    g0.b(c14, g0.d);
                                    return;
                                }
                            }
                            else {
                                c3 = c2;
                            }
                            ++v34;
                            c2 = c3;
                        }
                    }
                }
                v32 = J.s(v8, J.R(0, e11.e()));
                c12.l(J.r(v32, 0, c12.b0.e() - 1));
            }
            g0.b(c14, g0.d);
        }
    }
}

