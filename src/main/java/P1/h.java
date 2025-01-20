package p1;

import java.util.ArrayList;
import java.util.HashSet;
import o1.c;
import o1.d;
import o1.e;
import o1.i;

public abstract class h {
    public static final b a;

    static {
        h.a = new b();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public static boolean a(d d0) {
        int v = d0.q0[0];
        int v1 = d0.q0[1];
        e e0 = d0.U == null ? null : d0.U;
        if(e0 != null) {
            int v2 = e0.q0[0];
        }
        if(e0 != null) {
            int v3 = e0.q0[1];
        }
        boolean z = v == 1 || d0.B() || v == 2 || v == 3 && d0.s == 0 && d0.X == 0.0f && d0.u(0) || v == 3 && d0.s == 1 && d0.v(0, d0.r());
        boolean z1 = v1 == 1 || d0.C() || v1 == 2 || v1 == 3 && d0.t == 0 && d0.X == 0.0f && d0.u(1) || v1 == 3 && d0.t == 1 && d0.v(1, d0.l());
        return d0.X <= 0.0f || !z && !z1 ? z && z1 : true;
    }

    public static n b(d d0, int v, ArrayList arrayList0, n n0) {
        int v1 = v == 0 ? d0.o0 : d0.p0;
        int v2 = 0;
        if(v1 != -1 && (n0 == null || v1 != n0.b)) {
            for(int v3 = 0; v3 < arrayList0.size(); ++v3) {
                n n1 = (n)arrayList0.get(v3);
                if(n1.b == v1) {
                    if(n0 != null) {
                        n0.c(v, n1);
                        arrayList0.remove(n0);
                    }
                    n0 = n1;
                    break;
                }
            }
        }
        else if(v1 != -1) {
            return n0;
        }
        if(n0 == null) {
            if(d0 instanceof i) {
                for(int v4 = 0; true; ++v4) {
                    int v5 = -1;
                    if(v4 >= ((i)d0).s0) {
                        break;
                    }
                    d d1 = ((i)d0).r0[v4];
                    if(v == 0) {
                        int v6 = d1.o0;
                        if(v6 != -1) {
                            v5 = v6;
                            break;
                        }
                    }
                    if(v == 1) {
                        int v7 = d1.p0;
                        if(v7 != -1) {
                            v5 = v7;
                            break;
                        }
                    }
                }
                if(v5 != -1) {
                    for(int v8 = 0; v8 < arrayList0.size(); ++v8) {
                        n n2 = (n)arrayList0.get(v8);
                        if(n2.b == v5) {
                            n0 = n2;
                            break;
                        }
                    }
                }
            }
            if(n0 == null) {
                n0 = new n();  // initializer: Ljava/lang/Object;-><init>()V
                n0.a = new ArrayList();
                n0.d = null;
                n0.e = -1;
                int v9 = n.f;
                n.f = v9 + 1;
                n0.b = v9;
                n0.c = v;
            }
            arrayList0.add(n0);
        }
        ArrayList arrayList1 = n0.a;
        if(!arrayList1.contains(d0)) {
            arrayList1.add(d0);
            if(d0 instanceof o1.h) {
                c c0 = ((o1.h)d0).u0;
                if(((o1.h)d0).v0 == 0) {
                    v2 = 1;
                }
                c0.c(v2, arrayList0, n0);
            }
            int v10 = n0.b;
            if(v == 0) {
                d0.o0 = v10;
                d0.J.c(0, arrayList0, n0);
                d0.L.c(0, arrayList0, n0);
            }
            else {
                d0.p0 = v10;
                d0.K.c(v, arrayList0, n0);
                d0.N.c(v, arrayList0, n0);
                d0.M.c(v, arrayList0, n0);
            }
            d0.Q.c(v, arrayList0, n0);
        }
        return n0;
    }

    public static void c(int v, d d0, p1.c c0, boolean z) {
        if(d0.n) {
            return;
        }
        if(!(d0 instanceof e) && d0.A() && h.a(d0)) {
            e.b0(d0, c0, new b());  // initializer: Ljava/lang/Object;-><init>()V
        }
        c c1 = d0.j(2);
        c c2 = d0.j(4);
        int v1 = c1.d();
        int v2 = c2.d();
        HashSet hashSet0 = c1.a;
        if(hashSet0 != null && c1.c) {
            for(Object object0: hashSet0) {
                c c3 = (c)object0;
                d d1 = c3.d;
                boolean z1 = h.a(d1);
                if(d1.A() && z1) {
                    e.b0(d1, c0, new b());  // initializer: Ljava/lang/Object;-><init>()V
                }
                c c4 = d1.J;
                c c5 = d1.L;
                boolean z2 = c3 != c4 && (c5.f == null && c5.f.c) || c3 == c5 && (c4.f != null && c4.f.c);
                if(d1.q0[0] == 3 && !z1) {
                    if(d1.w < 0 || d1.v < 0 || d1.h0 != 8 && (d1.s != 0 || d1.X != 0.0f) || d1.y() || d1.G || !z2 || d1.y()) {
                        continue;
                    }
                    h.e(v + 1, d0, c0, d1, z);
                }
                else if(d1.A()) {
                }
                else if(c3 == c4 && c5.f == null) {
                    int v3 = c4.e();
                    d1.L(v3 + v1, d1.r() + (v3 + v1));
                    h.c(v + 1, d1, c0, z);
                }
                else if(c3 == c5 && c4.f == null) {
                    int v4 = c5.e();
                    d1.L(v1 - v4 - d1.r(), v1 - v4);
                    h.c(v + 1, d1, c0, z);
                }
                else if(z2 && !d1.y()) {
                    h.d(v + 1, d1, c0, z);
                }
            }
        }
        if(d0 instanceof o1.h) {
            return;
        }
        HashSet hashSet1 = c2.a;
        if(hashSet1 != null && c2.c) {
            for(Object object1: hashSet1) {
                c c6 = (c)object1;
                d d2 = c6.d;
                boolean z3 = h.a(d2);
                if(d2.A() && z3) {
                    e.b0(d2, c0, new b());  // initializer: Ljava/lang/Object;-><init>()V
                }
                c c7 = d2.J;
                c c8 = d2.L;
                boolean z4 = c6 != c7 && (c8.f == null && c8.f.c) || c6 == c8 && (c7.f != null && c7.f.c);
                if(d2.q0[0] == 3 && !z3) {
                    if(d2.w < 0 || d2.v < 0 || d2.h0 != 8 && (d2.s != 0 || d2.X != 0.0f) || d2.y() || d2.G || !z4 || d2.y()) {
                        continue;
                    }
                    h.e(v + 1, d0, c0, d2, z);
                }
                else if(d2.A()) {
                }
                else if(c6 == c7 && c8.f == null) {
                    int v5 = c7.e();
                    d2.L(v5 + v2, d2.r() + (v5 + v2));
                    h.c(v + 1, d2, c0, z);
                }
                else if(c6 == c8 && c7.f == null) {
                    int v6 = c8.e();
                    d2.L(v2 - v6 - d2.r(), v2 - v6);
                    h.c(v + 1, d2, c0, z);
                }
                else if(z4 && !d2.y()) {
                    h.d(v + 1, d2, c0, z);
                }
            }
        }
        d0.n = true;
    }

    public static void d(int v, d d0, p1.c c0, boolean z) {
        float f = d0.e0;
        int v1 = d0.J.f.d();
        int v2 = d0.L.f.d();
        int v3 = d0.J.e();
        int v4 = d0.L.e();
        if(v1 == v2) {
            f = 0.5f;
        }
        else {
            v1 = v3 + v1;
            v2 -= v4;
        }
        int v5 = d0.r();
        int v6 = v1 <= v2 ? v2 - v1 - v5 : v1 - v2 - v5;
        int v7 = ((int)(v6 <= 0 ? f * ((float)v6) : f * ((float)v6) + 0.5f)) + v1;
        d0.L(v7, (v1 <= v2 ? v7 + v5 : v7 - v5));
        h.c(v + 1, d0, c0, z);
    }

    public static void e(int v, d d0, p1.c c0, d d1, boolean z) {
        float f = d1.e0;
        int v1 = d1.J.e() + d1.J.f.d();
        int v2 = d1.L.e();
        int v3 = d1.L.f.d() - v2;
        if(v3 >= v1) {
            int v4 = d1.r();
            if(d1.h0 != 8) {
                int v5 = d1.s;
                if(v5 == 2) {
                    v4 = (int)(d1.e0 * 0.5f * ((float)(d0 instanceof e ? d0.r() : d0.U.r())));
                }
                else if(v5 == 0) {
                    v4 = v3 - v1;
                }
                v4 = Math.max(d1.v, v4);
                int v6 = d1.w;
                if(v6 > 0) {
                    v4 = Math.min(v6, v4);
                }
            }
            int v7 = v1 + ((int)(f * ((float)(v3 - v1 - v4)) + 0.5f));
            d1.L(v7, v4 + v7);
            h.c(v + 1, d1, c0, z);
        }
    }

    public static void f(int v, d d0, p1.c c0) {
        float f = d0.f0;
        int v1 = d0.K.f.d();
        int v2 = d0.M.f.d();
        int v3 = d0.K.e();
        int v4 = d0.M.e();
        if(v1 == v2) {
            f = 0.5f;
        }
        else {
            v1 = v3 + v1;
            v2 -= v4;
        }
        int v5 = d0.l();
        int v6 = v1 <= v2 ? v2 - v1 - v5 : v1 - v2 - v5;
        float f1 = v6 <= 0 ? f * ((float)v6) : f * ((float)v6) + 0.5f;
        int v7 = v1 + ((int)f1);
        int v8 = v7 + v5;
        if(v1 > v2) {
            v7 = v1 - ((int)f1);
            v8 = v7 - v5;
        }
        d0.M(v7, v8);
        h.i(v + 1, d0, c0);
    }

    public static void g(int v, d d0, p1.c c0, d d1) {
        float f = d1.f0;
        int v1 = d1.K.e() + d1.K.f.d();
        int v2 = d1.M.e();
        int v3 = d1.M.f.d() - v2;
        if(v3 >= v1) {
            int v4 = d1.l();
            if(d1.h0 != 8) {
                int v5 = d1.t;
                if(v5 == 2) {
                    v4 = (int)(f * 0.5f * ((float)(d0 instanceof e ? d0.l() : d0.U.l())));
                }
                else if(v5 == 0) {
                    v4 = v3 - v1;
                }
                v4 = Math.max(d1.y, v4);
                int v6 = d1.z;
                if(v6 > 0) {
                    v4 = Math.min(v6, v4);
                }
            }
            int v7 = v1 + ((int)(f * ((float)(v3 - v1 - v4)) + 0.5f));
            d1.M(v7, v4 + v7);
            h.i(v + 1, d1, c0);
        }
    }

    public static boolean h(int v, int v1, int v2, int v3) {
        boolean z;
        switch(v2) {
            case 1: 
            case 2: {
                z = true;
                break;
            }
            case 4: {
                z = v != 2;
                break;
            }
            default: {
                z = false;
            }
        }
        switch(v3) {
            case 1: 
            case 2: {
                return true;
            }
            case 4: {
                return v1 == 2 ? z : true;
            }
            default: {
                return z;
            }
        }
    }

    public static void i(int v, d d0, p1.c c0) {
        if(d0.o) {
            return;
        }
        if(!(d0 instanceof e) && d0.A() && h.a(d0)) {
            e.b0(d0, c0, new b());  // initializer: Ljava/lang/Object;-><init>()V
        }
        c c1 = d0.j(3);
        c c2 = d0.j(5);
        int v1 = c1.d();
        int v2 = c2.d();
        HashSet hashSet0 = c1.a;
        if(hashSet0 != null && c1.c) {
            for(Object object0: hashSet0) {
                c c3 = (c)object0;
                d d1 = c3.d;
                boolean z = h.a(d1);
                if(d1.A() && z) {
                    e.b0(d1, c0, new b());  // initializer: Ljava/lang/Object;-><init>()V
                }
                c c4 = d1.K;
                c c5 = d1.M;
                boolean z1 = c3 != c4 && (c5.f == null && c5.f.c) || c3 == c5 && (c4.f != null && c4.f.c);
                if(d1.q0[1] == 3 && !z) {
                    if(d1.z < 0 || d1.y < 0 || d1.h0 != 8 && (d1.t != 0 || d1.X != 0.0f) || d1.z() || d1.G || !z1 || d1.z()) {
                        continue;
                    }
                    h.g(v + 1, d0, c0, d1);
                }
                else if(d1.A()) {
                }
                else if(c3 == c4 && c5.f == null) {
                    int v3 = c4.e();
                    d1.M(v3 + v1, d1.l() + (v3 + v1));
                    h.i(v + 1, d1, c0);
                }
                else if(c3 == c5 && c4.f == null) {
                    int v4 = c5.e();
                    d1.M(v1 - v4 - d1.l(), v1 - v4);
                    h.i(v + 1, d1, c0);
                }
                else if(z1 && !d1.z()) {
                    h.f(v + 1, d1, c0);
                }
            }
        }
        if(d0 instanceof o1.h) {
            return;
        }
        HashSet hashSet1 = c2.a;
        if(hashSet1 != null && c2.c) {
            for(Object object1: hashSet1) {
                c c6 = (c)object1;
                d d2 = c6.d;
                boolean z2 = h.a(d2);
                if(d2.A() && z2) {
                    e.b0(d2, c0, new b());  // initializer: Ljava/lang/Object;-><init>()V
                }
                c c7 = d2.K;
                c c8 = d2.M;
                boolean z3 = c6 != c7 && (c8.f == null && c8.f.c) || c6 == c8 && (c7.f != null && c7.f.c);
                if(d2.q0[1] == 3 && !z2) {
                    if(d2.z < 0 || d2.y < 0 || d2.h0 != 8 && (d2.t != 0 || d2.X != 0.0f) || d2.z() || d2.G || !z3 || d2.z()) {
                        continue;
                    }
                    h.g(v + 1, d0, c0, d2);
                }
                else if(d2.A()) {
                }
                else if(c6 == c7 && c8.f == null) {
                    int v5 = c7.e();
                    d2.M(v5 + v2, d2.l() + (v5 + v2));
                    h.i(v + 1, d2, c0);
                }
                else if(c6 == c8 && c7.f == null) {
                    int v6 = c8.e();
                    d2.M(v2 - v6 - d2.l(), v2 - v6);
                    h.i(v + 1, d2, c0);
                }
                else if(z3 && !d2.z()) {
                    h.f(v + 1, d2, c0);
                }
            }
        }
        c c9 = d0.j(6);
        if(c9.a != null && c9.c) {
            int v7 = c9.d();
            for(Object object2: c9.a) {
                c c10 = (c)object2;
                d d3 = c10.d;
                boolean z4 = h.a(d3);
                if(d3.A() && z4) {
                    e.b0(d3, c0, new b());  // initializer: Ljava/lang/Object;-><init>()V
                }
                if((d3.q0[1] != 3 || z4) && !d3.A()) {
                    c c11 = d3.N;
                    if(c10 == c11) {
                        int v8 = c10.e() + v7;
                        if(d3.F) {
                            int v9 = v8 - d3.b0;
                            int v10 = d3.W + v9;
                            d3.a0 = v9;
                            d3.K.l(v9);
                            d3.M.l(v10);
                            c11.l(v8);
                            d3.m = true;
                        }
                        h.i(v + 1, d3, c0);
                    }
                }
            }
        }
        d0.o = true;
    }
}

