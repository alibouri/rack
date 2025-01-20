package h1;

import K.v;
import a8.Q;
import java.util.ArrayList;
import java.util.Arrays;

public final class c {
    public int a;
    public boolean b;
    public int c;
    public final d d;
    public int e;
    public int f;
    public b[] g;
    public boolean h;
    public boolean[] i;
    public int j;
    public int k;
    public int l;
    public final Q m;
    public e[] n;
    public int o;
    public b p;
    public static boolean q = false;

    public c() {
        this.a = 1000;
        this.b = false;
        this.c = 0;
        this.e = 0x20;
        this.f = 0x20;
        this.h = false;
        this.i = new boolean[0x20];
        this.j = 1;
        this.k = 0;
        this.l = 0x20;
        this.n = new e[1000];
        this.o = 0;
        this.g = new b[0x20];
        this.s();
        Q q0 = new Q(7, false);
        q0.Y = new I1.c();
        q0.Z = new I1.c();
        q0.b0 = new e[0x20];
        this.m = q0;
        d d0 = new d(q0);  // initializer: Lh1/b;-><init>(La8/Q;)V
        d0.f = new e[0x80];
        d0.g = new e[0x80];
        d0.h = 0;
        d0.i = new v(d0);
        this.d = d0;
        this.p = new b(q0);
    }

    public final e a(int v) {
        I1.c c0 = (I1.c)this.m.Z;
        int v1 = c0.b;
        Object object0 = null;
        if(v1 > 0) {
            Object object1 = c0.a[v1 - 1];
            c0.a[v1 - 1] = null;
            c0.b = v1 - 1;
            object0 = object1;
        }
        e e0 = (e)object0;
        if(e0 == null) {
            e0 = new e(v);
        }
        else {
            e0.c();
        }
        e0.j0 = v;
        int v2 = this.a;
        if(this.o >= v2) {
            this.a = v2 * 2;
            this.n = (e[])Arrays.copyOf(this.n, v2 * 2);
        }
        int v3 = this.o;
        this.o = v3 + 1;
        this.n[v3] = e0;
        return e0;
    }

    public final void b(e e0, e e1, int v, float f, e e2, e e3, int v1, int v2) {
        b b0 = this.l();
        if(e1 == e2) {
            b0.d.g(e0, 1.0f);
            b0.d.g(e3, 1.0f);
            b0.d.g(e1, -2.0f);
        }
        else if(Float.compare(f, 0.5f) == 0) {
            b0.d.g(e0, 1.0f);
            b0.d.g(e1, -1.0f);
            b0.d.g(e2, -1.0f);
            b0.d.g(e3, 1.0f);
            if(v > 0 || v1 > 0) {
                b0.b = (float)(-v + v1);
            }
        }
        else if(f <= 0.0f) {
            b0.d.g(e0, -1.0f);
            b0.d.g(e1, 1.0f);
            b0.b = (float)v;
        }
        else if(f >= 1.0f) {
            b0.d.g(e3, -1.0f);
            b0.d.g(e2, 1.0f);
            b0.b = (float)(-v1);
        }
        else {
            b0.d.g(e0, (1.0f - f) * 1.0f);
            b0.d.g(e1, (1.0f - f) * -1.0f);
            b0.d.g(e2, -1.0f * f);
            b0.d.g(e3, 1.0f * f);
            if(v > 0 || v1 > 0) {
                b0.b = ((float)v1) * f + ((float)(-v)) * (1.0f - f);
            }
        }
        if(v2 != 8) {
            b0.a(this, v2);
        }
        this.c(b0);
    }

    public final void c(b b0) {
        boolean z4;
        boolean z3;
        ArrayList arrayList0;
        if(this.k + 1 >= this.l || this.j + 1 >= this.f) {
            this.o();
        }
        if(b0.e) {
            z4 = false;
        }
        else {
            if(this.g.length != 0) {
                boolean z = false;
                while(!z) {
                    int v = b0.d.d();
                    for(int v1 = 0; true; ++v1) {
                        arrayList0 = b0.c;
                        if(v1 >= v) {
                            break;
                        }
                        e e0 = b0.d.e(v1);
                        if(e0.Z != -1 || e0.d0) {
                            arrayList0.add(e0);
                        }
                    }
                    int v2 = arrayList0.size();
                    if(v2 > 0) {
                        for(int v3 = 0; v3 < v2; ++v3) {
                            e e1 = (e)arrayList0.get(v3);
                            if(e1.d0) {
                                b0.h(this, e1, true);
                            }
                            else {
                                b0.i(this, this.g[e1.Z], true);
                            }
                        }
                        arrayList0.clear();
                    }
                    else {
                        z = true;
                    }
                }
                if(b0.a != null && b0.d.d() == 0) {
                    b0.e = true;
                    this.b = true;
                }
            }
            if(b0.e()) {
                return;
            }
            float f = b0.b;
            if(f < 0.0f) {
                b0.b = f * -1.0f;
                a a0 = b0.d;
                int v4 = a0.h;
                for(int v5 = 0; v4 != -1 && v5 < a0.a; ++v5) {
                    a0.g[v4] *= -1.0f;
                    v4 = a0.f[v4];
                }
            }
            int v6 = b0.d.d();
            float f1 = 0.0f;
            float f2 = 0.0f;
            e e2 = null;
            e e3 = null;
            int v7 = 0;
            boolean z1 = false;
            boolean z2 = false;
            while(v7 < v6) {
                float f3 = b0.d.f(v7);
                e e4 = b0.d.e(v7);
                if(e4.j0 != 1) {
                    if(e2 == null && f3 >= 0.0f) {
                        if(e3 == null) {
                            z2 = e4.i0 > 1 ? false : true;
                            goto label_83;
                        }
                        else if(f2 > f3) {
                            z2 = e4.i0 <= 1;
                        label_83:
                            e3 = e4;
                            f2 = f3;
                        }
                        else if(!z2 && e4.i0 <= 1) {
                            z2 = true;
                            e3 = e4;
                            f2 = f3;
                        }
                    }
                }
                else if(e2 == null) {
                    z1 = e4.i0 > 1 ? false : true;
                    goto label_66;
                }
                else if(f1 > f3) {
                    z1 = e4.i0 <= 1;
                label_66:
                    e2 = e4;
                    f1 = f3;
                }
                else if(!z1 && e4.i0 <= 1) {
                    z1 = true;
                    e2 = e4;
                    f1 = f3;
                }
                ++v7;
            }
            if(e2 == null) {
                e2 = e3;
            }
            if(e2 == null) {
                z3 = true;
            }
            else {
                b0.g(e2);
                z3 = false;
            }
            if(b0.d.d() == 0) {
                b0.e = true;
            }
            if(z3) {
                if(this.j + 1 >= this.f) {
                    this.o();
                }
                e e5 = this.a(3);
                int v8 = this.c + 1;
                this.c = v8;
                ++this.j;
                e5.Y = v8;
                Q q0 = this.m;
                ((e[])q0.b0)[v8] = e5;
                b0.a = e5;
                int v9 = this.k;
                this.h(b0);
                if(this.k == v9 + 1) {
                    b b1 = this.p;
                    b1.getClass();
                    b1.a = null;
                    b1.d.b();
                    for(int v10 = 0; v10 < b0.d.d(); ++v10) {
                        e e6 = b0.d.e(v10);
                        float f4 = b0.d.f(v10);
                        b1.d.a(e6, f4, true);
                    }
                    this.r(this.p);
                    if(e5.Z == -1) {
                        if(b0.a == e5) {
                            e e7 = b0.f(null, e5);
                            if(e7 != null) {
                                b0.g(e7);
                            }
                        }
                        if(!b0.e) {
                            b0.a.e(this, b0);
                        }
                        ((I1.c)q0.Y).b(b0);
                        --this.k;
                    }
                    z4 = true;
                }
                else {
                    z4 = false;
                }
            }
            else {
                z4 = false;
            }
            if(b0.a == null || b0.a.j0 != 1 && b0.b >= 0.0f) {
                return;
            }
        }
        if(!z4) {
            this.h(b0);
        }
    }

    public final void d(e e0, int v) {
        int v1 = e0.Z;
        if(v1 == -1) {
            e0.d(this, ((float)v));
            for(int v2 = 0; v2 < this.c + 1; ++v2) {
                e e1 = ((e[])this.m.b0)[v2];
            }
            return;
        }
        b b0 = this.g[v1];
        if(b0.e) {
            b0.b = (float)v;
            return;
        }
        if(b0.d.d() == 0) {
            b0.e = true;
            b0.b = (float)v;
            return;
        }
        b b1 = this.l();
        if(v < 0) {
            b1.b = (float)(v * -1);
            b1.d.g(e0, 1.0f);
        }
        else {
            b1.b = (float)v;
            b1.d.g(e0, -1.0f);
        }
        this.c(b1);
    }

    public final void e(e e0, e e1, int v, int v1) {
        if(v1 == 8 && e1.d0 && e0.Z == -1) {
            e0.d(this, e1.c0 + ((float)v));
            return;
        }
        b b0 = this.l();
        boolean z = false;
        if(v != 0) {
            if(v < 0) {
                v *= -1;
                z = true;
            }
            b0.b = (float)v;
        }
        if(z) {
            b0.d.g(e0, 1.0f);
            b0.d.g(e1, -1.0f);
        }
        else {
            b0.d.g(e0, -1.0f);
            b0.d.g(e1, 1.0f);
        }
        if(v1 != 8) {
            b0.a(this, v1);
        }
        this.c(b0);
    }

    public final void f(e e0, e e1, int v, int v1) {
        b b0 = this.l();
        e e2 = this.m();
        e2.b0 = 0;
        b0.b(e0, e1, e2, v);
        if(v1 != 8) {
            float f = b0.d.c(e2);
            e e3 = this.j(v1);
            b0.d.g(e3, ((float)(((int)(f * -1.0f)))));
        }
        this.c(b0);
    }

    public final void g(e e0, e e1, int v, int v1) {
        b b0 = this.l();
        e e2 = this.m();
        e2.b0 = 0;
        b0.c(e0, e1, e2, v);
        if(v1 != 8) {
            float f = b0.d.c(e2);
            e e3 = this.j(v1);
            b0.d.g(e3, ((float)(((int)(f * -1.0f)))));
        }
        this.c(b0);
    }

    public final void h(b b0) {
        int v4;
        if(b0.e) {
            b0.a.d(this, b0.b);
        }
        else {
            int v = this.k;
            this.g[v] = b0;
            b0.a.Z = v;
            this.k = v + 1;
            b0.a.e(this, b0);
        }
        if(this.b) {
            for(int v1 = 0; v1 < this.k; ++v1) {
                if(this.g[v1] == null) {
                    System.out.println("WTF");
                }
                b b1 = this.g[v1];
                if(b1 != null && b1.e) {
                    b1.a.d(this, b1.b);
                    ((I1.c)this.m.Y).b(b1);
                    this.g[v1] = null;
                    int v2 = v1 + 1;
                    int v3 = v2;
                    while(true) {
                        v4 = this.k;
                        if(v2 >= v4) {
                            break;
                        }
                        b[] arr_b = this.g;
                        b b2 = arr_b[v2];
                        arr_b[v2 - 1] = b2;
                        e e0 = b2.a;
                        if(e0.Z == v2) {
                            e0.Z = v2 - 1;
                        }
                        v3 = v2;
                        ++v2;
                    }
                    if(v3 < v4) {
                        this.g[v3] = null;
                    }
                    this.k = v4 - 1;
                    --v1;
                }
            }
            this.b = false;
        }
    }

    public final void i() {
        for(int v = 0; v < this.k; ++v) {
            b b0 = this.g[v];
            b0.a.c0 = b0.b;
        }
    }

    public final e j(int v) {
        if(this.j + 1 >= this.f) {
            this.o();
        }
        e e0 = this.a(4);
        int v1 = this.c + 1;
        this.c = v1;
        ++this.j;
        e0.Y = v1;
        e0.b0 = v;
        ((e[])this.m.b0)[v1] = e0;
        this.d.i.Y = e0;
        Arrays.fill(e0.f0, 0.0f);
        e0.f0[e0.b0] = 1.0f;
        this.d.j(e0);
        return e0;
    }

    public final e k(Object object0) {
        e e0 = null;
        if(object0 == null) {
            return null;
        }
        if(this.j + 1 >= this.f) {
            this.o();
        }
        if(object0 instanceof o1.c) {
            e0 = ((o1.c)object0).i;
            if(e0 == null) {
                ((o1.c)object0).k();
                e0 = ((o1.c)object0).i;
            }
            int v = e0.Y;
            Q q0 = this.m;
            if(v == -1 || v > this.c || ((e[])q0.b0)[v] == null) {
                if(v != -1) {
                    e0.c();
                }
                int v1 = this.c + 1;
                this.c = v1;
                ++this.j;
                e0.Y = v1;
                e0.j0 = 1;
                ((e[])q0.b0)[v1] = e0;
            }
        }
        return e0;
    }

    public final b l() {
        Object object0;
        Q q0 = this.m;
        I1.c c0 = (I1.c)q0.Y;
        int v = c0.b;
        if(v > 0) {
            object0 = c0.a[v - 1];
            c0.a[v - 1] = null;
            c0.b = v - 1;
        }
        else {
            object0 = null;
        }
        if(((b)object0) == null) {
            return new b(q0);
        }
        ((b)object0).a = null;
        ((b)object0).d.b();
        ((b)object0).b = 0.0f;
        ((b)object0).e = false;
        return (b)object0;
    }

    public final e m() {
        if(this.j + 1 >= this.f) {
            this.o();
        }
        e e0 = this.a(3);
        int v = this.c + 1;
        this.c = v;
        ++this.j;
        e0.Y = v;
        ((e[])this.m.b0)[v] = e0;
        return e0;
    }

    public static int n(Object object0) {
        e e0 = ((o1.c)object0).i;
        return e0 == null ? 0 : ((int)(e0.c0 + 0.5f));
    }

    public final void o() {
        int v = this.e * 2;
        this.e = v;
        this.g = (b[])Arrays.copyOf(this.g, v);
        this.m.b0 = (e[])Arrays.copyOf(((e[])this.m.b0), this.e);
        int v1 = this.e;
        this.i = new boolean[v1];
        this.f = v1;
        this.l = v1;
    }

    public final void p() {
        d d0 = this.d;
        if(d0.e()) {
            this.i();
            return;
        }
        if(this.h) {
            for(int v = 0; v < this.k; ++v) {
                if(!this.g[v].e) {
                    this.q(d0);
                    return;
                }
            }
            this.i();
            return;
        }
        this.q(d0);
    }

    public final void q(d d0) {
        for(int v = 0; v < this.k; ++v) {
            b b0 = this.g[v];
            if(b0.a.j0 != 1 && b0.b >= 0.0f) {
                int v1 = 0;
                boolean z = false;
                while(!z) {
                    ++v1;
                    float f = 3.402823E+38f;
                    int v2 = -1;
                    int v3 = -1;
                    int v5 = 0;
                    for(int v4 = 0; v4 < this.k; ++v4) {
                        b b1 = this.g[v4];
                        if(b1.a.j0 != 1 && !b1.e && b1.b >= 0.0f) {
                            int v6 = b1.d.d();
                            for(int v7 = 0; v7 < v6; ++v7) {
                                e e0 = b1.d.e(v7);
                                float f1 = b1.d.c(e0);
                                if(f1 > 0.0f) {
                                    for(int v8 = 0; v8 < 9; ++v8) {
                                        float f2 = e0.e0[v8] / f1;
                                        if(f2 >= f && v8 != v5 || v8 > v5) {
                                            v5 = v8;
                                            v3 = e0.Y;
                                            v2 = v4;
                                            f = f2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if(v2 == -1) {
                        z = true;
                    }
                    else {
                        b b2 = this.g[v2];
                        b2.a.Z = -1;
                        b2.g(((e[])this.m.b0)[v3]);
                        b2.a.Z = v2;
                        b2.a.e(this, b2);
                    }
                    if(v1 > this.j / 2) {
                        z = true;
                    }
                }
                break;
            }
        }
        this.r(d0);
        this.i();
    }

    public final void r(b b0) {
        for(int v = 0; v < this.j; ++v) {
            this.i[v] = false;
        }
        int v1 = 0;
        boolean z = false;
        while(!z) {
            ++v1;
            if(v1 >= this.j * 2) {
                return;
            }
            e e0 = b0.a;
            if(e0 != null) {
                this.i[e0.Y] = true;
            }
            e e1 = b0.d(this.i);
            if(e1 != null) {
                boolean[] arr_z = this.i;
                int v2 = e1.Y;
                if(arr_z[v2]) {
                    return;
                }
                arr_z[v2] = true;
            }
            if(e1 == null) {
                z = true;
            }
            else {
                float f = 3.402823E+38f;
                int v4 = -1;
                for(int v3 = 0; v3 < this.k; ++v3) {
                    b b1 = this.g[v3];
                    if(b1.a.j0 != 1 && !b1.e) {
                        boolean z1 = false;
                        a a0 = b1.d;
                        int v5 = a0.h;
                        if(v5 != -1) {
                            for(int v6 = 0; v5 != -1 && v6 < a0.a; ++v6) {
                                if(a0.e[v5] == e1.Y) {
                                    z1 = true;
                                    break;
                                }
                                v5 = a0.f[v5];
                            }
                        }
                        if(z1) {
                            float f1 = b1.d.c(e1);
                            if(f1 < 0.0f) {
                                float f2 = -b1.b / f1;
                                if(f2 < f) {
                                    f = f2;
                                    v4 = v3;
                                }
                            }
                        }
                    }
                }
                if(v4 <= -1) {
                    continue;
                }
                b b2 = this.g[v4];
                b2.a.Z = -1;
                b2.g(e1);
                b2.a.Z = v4;
                b2.a.e(this, b2);
            }
        }
    }

    public final void s() {
        for(int v = 0; v < this.k; ++v) {
            b b0 = this.g[v];
            if(b0 != null) {
                ((I1.c)this.m.Y).b(b0);
            }
            this.g[v] = null;
        }
    }

    public final void t() {
        Q q0;
        for(int v = 0; true; ++v) {
            q0 = this.m;
            e[] arr_e = (e[])q0.b0;
            if(v >= arr_e.length) {
                break;
            }
            e e0 = arr_e[v];
            if(e0 != null) {
                e0.c();
            }
        }
        I1.c c0 = (I1.c)q0.Z;
        e[] arr_e1 = this.n;
        int v1 = this.o;
        c0.getClass();
        if(v1 > arr_e1.length) {
            v1 = arr_e1.length;
        }
        for(int v2 = 0; v2 < v1; ++v2) {
            e e1 = arr_e1[v2];
            int v3 = c0.b;
            Object[] arr_object = c0.a;
            if(v3 < arr_object.length) {
                arr_object[v3] = e1;
                c0.b = v3 + 1;
            }
        }
        this.o = 0;
        Arrays.fill(((e[])q0.b0), null);
        this.c = 0;
        this.d.h = 0;
        this.d.b = 0.0f;
        this.j = 1;
        for(int v4 = 0; v4 < this.k; ++v4) {
            b b0 = this.g[v4];
        }
        this.s();
        this.k = 0;
        this.p = new b(q0);
    }
}

