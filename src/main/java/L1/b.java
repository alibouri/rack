package l1;

import D0.J;
import g1.k;
import i1.a;
import java.util.HashMap;
import o1.d;

public class b implements h {
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public int I;
    public Object J;
    public Object K;
    public Object L;
    public Object M;
    public Object N;
    public Object O;
    public Object P;
    public Object Q;
    public Object R;
    public Object S;
    public b T;
    public Object U;
    public Object V;
    public b W;
    public Object X;
    public Object Y;
    public Object Z;
    public Object a;
    public Object a0;
    public final k b;
    public float b0;
    public Object c;
    public float c0;
    public int d;
    public f d0;
    public int e;
    public f e0;
    public float f;
    public J f0;
    public float g;
    public d g0;
    public float h;
    public final HashMap h0;
    public float i;
    public HashMap i0;
    public int j;
    public int j0;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public float x;
    public float y;
    public float z;

    public b(k k0) {
        this.c = null;
        this.d = 0;
        this.e = 0;
        this.f = -1.0f;
        this.g = -1.0f;
        this.h = 0.5f;
        this.i = 0.5f;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = NaNf;
        this.y = NaNf;
        this.z = NaNf;
        this.A = NaNf;
        this.B = NaNf;
        this.C = NaNf;
        this.D = NaNf;
        this.E = NaNf;
        this.F = NaNf;
        this.G = NaNf;
        this.H = NaNf;
        this.I = 0;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.a0 = null;
        this.j0 = 0;
        f f0 = new f(f.h);
        f0.f = f.i;
        this.d0 = f0;
        f f1 = new f(f.h);
        f1.f = f.i;
        this.e0 = f1;
        this.h0 = new HashMap();
        this.i0 = new HashMap();
        this.b = k0;
    }

    @Override  // l1.h
    public d a() {
        if(this.g0 == null) {
            d d0 = new d(this.d0.d, this.e0.d);
            this.g0 = d0;
            d0.g0 = this.f0;
        }
        return this.g0;
    }

    @Override  // l1.h
    public void apply() {
        if(this.g0 == null) {
            return;
        }
        Object object0 = this.c;
        if(object0 != null) {
            ((m1.d)object0).apply();
        }
        this.d0.a(this.g0, 0);
        this.e0.a(this.g0, 1);
        this.J = this.j(this.J);
        this.K = this.j(this.K);
        this.L = this.j(this.L);
        this.M = this.j(this.M);
        this.N = this.j(this.N);
        this.O = this.j(this.O);
        this.P = this.j(this.P);
        this.Q = this.j(this.Q);
        this.R = this.j(this.R);
        this.S = this.j(this.S);
        this.U = this.j(this.U);
        this.V = this.j(this.V);
        this.X = this.j(this.X);
        this.Y = this.j(this.Y);
        this.Z = this.j(this.Z);
        this.d(this.g0, this.J, 1);
        this.d(this.g0, this.K, 2);
        this.d(this.g0, this.L, 3);
        this.d(this.g0, this.M, 4);
        this.d(this.g0, this.N, 5);
        this.d(this.g0, this.O, 6);
        this.d(this.g0, this.P, 7);
        this.d(this.g0, this.Q, 8);
        this.d(this.g0, this.R, 9);
        this.d(this.g0, this.S, 10);
        this.d(this.g0, this.T, 11);
        this.d(this.g0, this.U, 12);
        this.d(this.g0, this.V, 13);
        this.d(this.g0, this.W, 14);
        this.d(this.g0, this.X, 15);
        this.d(this.g0, this.Y, 16);
        this.d(this.g0, this.Z, 17);
        this.d(this.g0, this.a0, 20);
        int v = this.d;
        if(v != 0) {
            this.g0.j0 = v;
        }
        int v1 = this.e;
        if(v1 != 0) {
            this.g0.k0 = v1;
        }
        float f = this.f;
        if(f != -1.0f) {
            this.g0.l0[0] = f;
        }
        float f1 = this.g;
        if(f1 != -1.0f) {
            this.g0.l0[1] = f1;
        }
        this.g0.e0 = this.h;
        this.g0.f0 = this.i;
        l1.k k0 = this.g0.j;
        k0.d = this.x;
        k0.e = this.y;
        k0.f = this.z;
        k0.g = this.A;
        k0.h = this.B;
        k0.i = this.C;
        k0.j = this.D;
        k0.k = this.E;
        k0.l = this.G;
        k0.m = this.H;
        k0.n = this.F;
        k0.o = this.I;
        this.g0.h0 = this.I;
        HashMap hashMap0 = this.h0;
        if(hashMap0 != null) {
            for(Object object1: hashMap0.keySet()) {
                String s = (String)object1;
                int v2 = (int)(((Integer)hashMap0.get(s)));
                HashMap hashMap1 = this.g0.j.p;
                if(hashMap1.containsKey(s)) {
                    ((a)hashMap1.get(s)).c = v2;
                }
                else {
                    a a0 = new a();  // initializer: Ljava/lang/Object;-><init>()V
                    a0.d = NaNf;
                    a0.a = s;
                    a0.b = 902;
                    a0.c = v2;
                    hashMap1.put(s, a0);
                }
            }
        }
        HashMap hashMap2 = this.i0;
        if(hashMap2 != null) {
            for(Object object2: hashMap2.keySet()) {
                String s1 = (String)object2;
                float f2 = (float)(((Float)this.i0.get(s1)));
                HashMap hashMap3 = this.g0.j.p;
                if(hashMap3.containsKey(s1)) {
                    ((a)hashMap3.get(s1)).d = f2;
                }
                else {
                    a a1 = new a();  // initializer: Ljava/lang/Object;-><init>()V
                    a1.c = 0x80000000;
                    a1.a = s1;
                    a1.b = 901;
                    a1.d = f2;
                    hashMap3.put(s1, a1);
                }
            }
        }
    }

    @Override  // l1.h
    public final void b(d d0) {
        if(d0 == null) {
            return;
        }
        this.g0 = d0;
        d0.g0 = this.f0;
    }

    @Override  // l1.h
    public final m1.d c() {
        return this.c;
    }

    public final void d(d d0, Object object0, int v) {
        d d1 = object0 instanceof h ? ((h)object0).a() : null;
        if(d1 == null) {
            return;
        }
        int v1 = l1.a.a[v.h.d(v)];
        int v2 = v.h.d(v);
        if(v2 != 19) {
            switch(v2) {
                case 0: {
                    d0.j(2).b(d1.j(2), this.j, this.p, false);
                    return;
                }
                case 1: {
                    d0.j(2).b(d1.j(4), this.j, this.p, false);
                    return;
                }
                case 2: {
                    d0.j(4).b(d1.j(2), this.k, this.q, false);
                    return;
                }
                case 3: {
                    d0.j(4).b(d1.j(4), this.k, this.q, false);
                    return;
                }
                case 4: {
                    d0.j(2).b(d1.j(2), this.l, this.r, false);
                    return;
                }
                case 5: {
                    d0.j(2).b(d1.j(4), this.l, this.r, false);
                    return;
                }
                case 6: {
                    d0.j(4).b(d1.j(2), this.m, this.s, false);
                    return;
                }
                case 7: {
                    d0.j(4).b(d1.j(4), this.m, this.s, false);
                    return;
                }
                case 8: {
                    d0.j(3).b(d1.j(3), this.n, this.t, false);
                    return;
                }
                case 9: {
                    d0.j(3).b(d1.j(5), this.n, this.t, false);
                    return;
                }
                case 10: {
                    d0.w(3, 6, this.n, this.t, d1);
                    return;
                }
                case 11: {
                    d0.j(5).b(d1.j(3), this.o, this.u, false);
                    return;
                }
                case 12: {
                    d0.j(5).b(d1.j(5), this.o, this.u, false);
                    return;
                }
                case 13: {
                    d0.w(5, 6, this.o, this.u, d1);
                    return;
                }
                case 14: {
                    d0.w(6, 6, this.v, this.w, d1);
                    return;
                }
                case 15: {
                    d0.w(6, 3, this.v, this.w, d1);
                    return;
                }
                case 16: {
                    d0.w(6, 5, this.v, this.w, d1);
                    return;
                }
                default: {
                    return;
                }
            }
        }
        float f = this.b0;
        d0.w(7, 7, ((int)this.c0), 0, d1);
        d0.E = f;
    }

    public final void e(Object object0) {
        this.j0 = 13;
        this.V = object0;
    }

    public final void f() {
        int v = this.j0;
        if(v != 0) {
            int v1 = v.h.d(v);
            if(v1 != 19) {
                switch(v1) {
                    case 0: 
                    case 1: {
                        this.J = null;
                        this.K = null;
                        this.j = 0;
                        this.p = 0;
                        return;
                    }
                    case 2: 
                    case 3: {
                        this.L = null;
                        this.M = null;
                        this.k = 0;
                        this.q = 0;
                        return;
                    }
                    case 4: 
                    case 5: {
                        this.N = null;
                        this.O = null;
                        this.l = 0;
                        this.r = 0;
                        return;
                    }
                    case 6: 
                    case 7: {
                        this.P = null;
                        this.Q = null;
                        this.m = 0;
                        this.s = 0;
                        return;
                    }
                    case 8: 
                    case 9: 
                    case 10: {
                        this.R = null;
                        this.S = null;
                        this.T = null;
                        this.n = 0;
                        this.t = 0;
                        return;
                    }
                    case 11: 
                    case 12: 
                    case 13: {
                        this.U = null;
                        this.V = null;
                        this.W = null;
                        this.o = 0;
                        this.u = 0;
                        return;
                    }
                    case 14: {
                        this.X = null;
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            this.a0 = null;
            return;
        }
        this.J = null;
        this.K = null;
        this.j = 0;
        this.L = null;
        this.M = null;
        this.k = 0;
        this.N = null;
        this.O = null;
        this.l = 0;
        this.P = null;
        this.Q = null;
        this.m = 0;
        this.R = null;
        this.S = null;
        this.n = 0;
        this.U = null;
        this.V = null;
        this.o = 0;
        this.X = null;
        this.a0 = null;
        this.h = 0.5f;
        this.i = 0.5f;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
    }

    public final void g() {
        this.j0 = this.N == null ? 6 : 5;
        this.f();
        this.j0 = this.P == null ? 8 : 7;
        this.f();
        this.j0 = this.J == null ? 2 : 1;
        this.f();
        this.j0 = this.L == null ? 4 : 3;
        this.f();
    }

    @Override  // l1.h
    public final Object getKey() {
        return this.a;
    }

    public final void h() {
        this.j0 = this.R == null ? 10 : 9;
        this.f();
        this.j0 = 15;
        this.f();
        this.j0 = this.U == null ? 13 : 12;
        this.f();
    }

    public final void i(Object object0) {
        this.j0 = 8;
        this.Q = object0;
    }

    public final Object j(Object object0) {
        if(object0 == null) {
            return null;
        }
        return !(object0 instanceof b) ? ((h)this.b.c.get(object0)) : object0;
    }

    public b k(int v) {
        int v1 = this.j0;
        if(v1 != 0) {
            int v2 = v.h.d(v1);
            if(v2 != 19) {
                switch(v2) {
                    case 0: 
                    case 1: {
                        this.j = v;
                        return this;
                    }
                    case 2: 
                    case 3: {
                        this.k = v;
                        return this;
                    }
                    case 4: 
                    case 5: {
                        this.l = v;
                        return this;
                    }
                    case 6: 
                    case 7: {
                        this.m = v;
                        return this;
                    }
                    case 8: 
                    case 9: 
                    case 10: {
                        this.n = v;
                        return this;
                    }
                    case 11: 
                    case 12: 
                    case 13: {
                        this.o = v;
                        return this;
                    }
                    case 14: 
                    case 15: 
                    case 16: {
                        this.v = v;
                        return this;
                    }
                    default: {
                        return this;
                    }
                }
            }
            this.c0 = (float)v;
            return this;
        }
        this.j = v;
        this.k = v;
        this.l = v;
        this.m = v;
        this.n = v;
        this.o = v;
        return this;
    }

    public b l(Float float0) {
        return this.k(this.b.c(float0));
    }

    public final void m(int v) {
        int v1 = this.j0;
        if(v1 != 0) {
            switch(v.h.d(v1)) {
                case 0: 
                case 1: {
                    this.p = v;
                    return;
                }
                case 2: 
                case 3: {
                    this.q = v;
                    return;
                }
                case 4: 
                case 5: {
                    this.r = v;
                    return;
                }
                case 6: 
                case 7: {
                    this.s = v;
                    return;
                }
                case 8: 
                case 9: 
                case 10: {
                    this.t = v;
                    return;
                }
                case 11: 
                case 12: 
                case 13: {
                    this.u = v;
                    return;
                }
                case 14: 
                case 15: 
                case 16: {
                    this.w = v;
                    return;
                }
                default: {
                    return;
                }
            }
        }
        this.p = v;
        this.q = v;
        this.r = v;
        this.s = v;
        this.t = v;
        this.u = v;
    }

    public final void n(Float float0) {
        this.m(this.b.c(float0));
    }

    public final void o(Object object0) {
        this.j0 = 5;
        this.N = object0;
    }

    public final void p(Object object0) {
        this.j0 = 9;
        this.R = object0;
    }
}

