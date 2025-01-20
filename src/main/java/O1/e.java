package o1;

import Ec.p;
import a8.Q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import p1.c;
import p1.o;

public final class e extends d {
    public int A0;
    public int B0;
    public b[] C0;
    public b[] D0;
    public int E0;
    public boolean F0;
    public boolean G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public WeakReference K0;
    public HashSet L0;
    public p1.b M0;
    public ArrayList r0;
    public Q s0;
    public p t0;
    public int u0;
    public c v0;
    public boolean w0;
    public h1.c x0;
    public int y0;
    public int z0;

    public e() {
        this.r0 = new ArrayList();
        this.s0 = new Q(this);
        this.t0 = new p(this);
        this.v0 = null;
        this.w0 = false;
        this.x0 = new h1.c();
        this.A0 = 0;
        this.B0 = 0;
        this.C0 = new b[4];
        this.D0 = new b[4];
        this.E0 = 0x101;
        this.F0 = false;
        this.G0 = false;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = null;
        this.L0 = new HashSet();
        this.M0 = new p1.b();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // o1.d
    public final void D() {
        this.x0.t();
        this.y0 = 0;
        this.z0 = 0;
        this.r0.clear();
        super.D();
    }

    @Override  // o1.d
    public final void G(Q q0) {
        super.G(q0);
        int v = this.r0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((d)this.r0.get(v1)).G(q0);
        }
    }

    @Override  // o1.d
    public final void T(boolean z, boolean z1) {
        super.T(z, z1);
        int v = this.r0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((d)this.r0.get(v1)).T(z, z1);
        }
    }

    public final void V(d d0) {
        this.r0.add(d0);
        e e0 = d0.U;
        if(e0 != null) {
            e0.r0.remove(d0);
            d0.D();
        }
        d0.U = this;
    }

    public final void W(d d0, int v) {
        switch(v) {
            case 0: {
                b[] arr_b = this.D0;
                if(this.A0 + 1 >= arr_b.length) {
                    this.D0 = (b[])Arrays.copyOf(arr_b, arr_b.length * 2);
                }
                b[] arr_b1 = this.D0;
                int v1 = this.A0;
                arr_b1[v1] = new b(d0, 0, this.w0);
                this.A0 = v1 + 1;
                return;
            }
            case 1: {
                b[] arr_b2 = this.C0;
                if(this.B0 + 1 >= arr_b2.length) {
                    this.C0 = (b[])Arrays.copyOf(arr_b2, arr_b2.length * 2);
                }
                b[] arr_b3 = this.C0;
                int v2 = this.B0;
                arr_b3[v2] = new b(d0, 1, this.w0);
                this.B0 = v2 + 1;
            }
        }
    }

    public final void X(h1.c c0) {
        boolean z = this.c0(0x40);
        this.c(c0, z);
        int v = this.r0.size();
        boolean z1 = false;
        for(int v1 = 0; v1 < v; ++v1) {
            d d0 = (d)this.r0.get(v1);
            d0.T[0] = false;
            d0.T[1] = false;
            if(d0 instanceof a) {
                z1 = true;
            }
        }
        if(z1) {
            for(int v2 = 0; v2 < v; ++v2) {
                d d1 = (d)this.r0.get(v2);
                if(d1 instanceof a) {
                    for(int v3 = 0; v3 < ((a)d1).s0; ++v3) {
                        d d2 = ((a)d1).r0[v3];
                        if(((a)d1).u0 || d2.d()) {
                            int v4 = ((a)d1).t0;
                            if(v4 == 0 || v4 == 1) {
                                d2.T[0] = true;
                            }
                            else if(v4 == 2 || v4 == 3) {
                                d2.T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet0 = this.L0;
        hashSet0.clear();
        for(int v5 = 0; v5 < v; ++v5) {
            d d3 = (d)this.r0.get(v5);
            d3.getClass();
            boolean z2 = d3 instanceof k;
            if(z2 || d3 instanceof h) {
                if(z2) {
                    hashSet0.add(d3);
                }
                else {
                    d3.c(c0, z);
                }
            }
        }
        while(hashSet0.size() > 0) {
            int v6 = hashSet0.size();
        alab1:
            for(Object object0: hashSet0) {
                k k0 = (k)(((d)object0));
                for(int v7 = 0; v7 < k0.s0; ++v7) {
                    if(hashSet0.contains(k0.r0[v7])) {
                        k0.c(c0, z);
                        hashSet0.remove(k0);
                        break alab1;
                    }
                }
            }
            if(v6 == hashSet0.size()) {
                for(Object object1: hashSet0) {
                    ((d)object1).c(c0, z);
                }
                hashSet0.clear();
            }
        }
        if(h1.c.q) {
            HashSet hashSet1 = new HashSet();
            for(int v8 = 0; v8 < v; ++v8) {
                d d4 = (d)this.r0.get(v8);
                d4.getClass();
                if(!(d4 instanceof k) && !(d4 instanceof h)) {
                    hashSet1.add(d4);
                }
            }
            this.b(this, c0, hashSet1, (this.q0[0] == 2 ? 0 : 1), false);
            for(Object object2: hashSet1) {
                j.b(this, c0, ((d)object2));
                ((d)object2).c(c0, z);
            }
        }
        else {
            for(int v9 = 0; v9 < v; ++v9) {
                d d5 = (d)this.r0.get(v9);
                if(d5 instanceof e) {
                    int v10 = d5.q0[0];
                    int v11 = d5.q0[1];
                    if(v10 == 2) {
                        d5.O(1);
                    }
                    if(v11 == 2) {
                        d5.Q(1);
                    }
                    d5.c(c0, z);
                    if(v10 == 2) {
                        d5.O(2);
                    }
                    if(v11 == 2) {
                        d5.Q(2);
                    }
                }
                else {
                    j.b(this, c0, d5);
                    if(!(d5 instanceof k) && !(d5 instanceof h)) {
                        d5.c(c0, z);
                    }
                }
            }
        }
        if(this.A0 > 0) {
            j.a(this, c0, null, 0);
        }
        if(this.B0 > 0) {
            j.a(this, c0, null, 1);
        }
    }

    public final boolean Y(int v, boolean z) {
        boolean z2;
        p p0 = this.t0;
        e e0 = (e)p0.d;
        boolean z1 = false;
        int v1 = e0.k(0);
        int v2 = e0.k(1);
        int v3 = e0.s();
        int v4 = e0.t();
        ArrayList arrayList0 = (ArrayList)p0.f;
        if(z && (v1 == 2 || v2 == 2)) {
            for(Object object0: arrayList0) {
                if(((o)object0).f == v && !((o)object0).k()) {
                    z = false;
                    break;
                }
                if(false) {
                    break;
                }
            }
            if(v != 0) {
                if(z && v2 == 2) {
                    e0.Q(1);
                    e0.N(p0.d(e0, 1));
                    e0.e.e.d(e0.l());
                }
            }
            else if(z && v1 == 2) {
                e0.O(1);
                e0.S(p0.d(e0, 0));
                e0.d.e.d(e0.r());
            }
        }
        int[] arr_v = e0.q0;
        if(v == 0) {
            switch(arr_v[0]) {
                case 1: 
                case 4: {
                    int v5 = e0.r() + v3;
                    e0.d.i.d(v5);
                    e0.d.e.d(v5 - v3);
                    z2 = true;
                    break;
                }
                default: {
                    z2 = false;
                }
            }
        }
        else {
            switch(arr_v[1]) {
                case 1: 
                case 4: {
                    int v6 = e0.l() + v4;
                    e0.e.i.d(v6);
                    e0.e.e.d(v6 - v4);
                    z2 = true;
                    break;
                }
                default: {
                    z2 = false;
                }
            }
        }
        p0.g();
        for(Object object1: arrayList0) {
            o o0 = (o)object1;
            if(o0.f == v && (o0.b != e0 || o0.g)) {
                o0.e();
            }
        }
        for(Object object2: arrayList0) {
            o o1 = (o)object2;
            if(o1.f != v || !z2 && o1.b == e0 || o1.h.j && o1.i.j && (o1 instanceof p1.d || o1.e.j)) {
                continue;
            }
            e0.O(v1);
            e0.Q(v2);
            return z1;
        }
        e0.O(v1);
        e0.Q(v2);
        return true;
    }

    public final void Z() {
        // ERROR - The method was not decompiled
        // External interruption
    }

    public final void a0(int v, int v1, int v2, int v3, int v4, int v5, int v6) {
    }

    public static void b0(d d0, c c0, p1.b b0) {
        int v1;
        int v;
        if(c0 == null) {
            return;
        }
        if(d0.h0 != 8 && !(d0 instanceof h) && !(d0 instanceof a)) {
            b0.a = d0.q0[0];
            b0.b = d0.q0[1];
            b0.c = d0.r();
            b0.d = d0.l();
            b0.i = false;
            b0.j = 0;
            boolean z = b0.a == 3;
            boolean z1 = b0.b == 3;
            boolean z2 = z && d0.X <= 0.0f;
            boolean z3 = z1 && d0.X <= 0.0f;
            if(z && d0.u(0) && d0.s == 0 && !z2) {
                b0.a = 2;
                if(z1 && d0.t == 0) {
                    b0.a = 1;
                }
                z = false;
            }
            if(z1 && d0.u(1) && d0.t == 0 && !z3) {
                b0.b = 2;
                if(z && d0.s == 0) {
                    b0.b = 1;
                }
                z1 = false;
            }
            if(d0.B()) {
                b0.a = 1;
                z = false;
            }
            if(d0.C()) {
                b0.b = 1;
                z1 = false;
            }
            int[] arr_v = d0.u;
            if(z2) {
                if(arr_v[0] == 4) {
                    b0.a = 1;
                }
                else if(!z1) {
                    if(b0.b == 1) {
                        v = b0.d;
                    }
                    else {
                        b0.a = 2;
                        c0.b(d0, b0);
                        v = b0.f;
                    }
                    b0.a = 1;
                    b0.c = (int)(d0.X * ((float)v));
                }
            }
            if(z3) {
                if(arr_v[1] == 4) {
                    b0.b = 1;
                }
                else if(!z) {
                    if(b0.a == 1) {
                        v1 = b0.c;
                    }
                    else {
                        b0.b = 2;
                        c0.b(d0, b0);
                        v1 = b0.e;
                    }
                    b0.b = 1;
                    b0.d = d0.Y == -1 ? ((int)(((float)v1) / d0.X)) : ((int)(d0.X * ((float)v1)));
                }
            }
            c0.b(d0, b0);
            d0.S(b0.e);
            d0.N(b0.f);
            d0.F = b0.h;
            d0.J(b0.g);
            b0.j = 0;
            return;
        }
        b0.e = 0;
        b0.f = 0;
    }

    public final boolean c0(int v) {
    }

    @Override  // o1.d
    public final void o(StringBuilder stringBuilder0) {
    }
}

