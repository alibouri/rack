package z0;

import A0.b;
import Bb.z;
import F0.c0;
import F0.m0;
import Nb.j;
import W.d;
import androidx.compose.ui.layout.LayoutCoordinates;
import d6.a;
import g0.n;
import java.util.ArrayList;
import java.util.List;
import s.o;
import y.u;

public final class e extends u {
    public final n b;
    public final b c;
    public final o d;
    public c0 e;
    public f f;
    public boolean g;
    public boolean h;
    public boolean i;

    public e(n n0) {
        super(1);
        this.b = n0;
        b b0 = new b();  // initializer: Ljava/lang/Object;-><init>()V
        b0.Y = new long[2];
        this.c = b0;
        this.d = new o(2);
        this.h = true;
        this.i = true;
    }

    @Override  // y.u
    public final boolean a(o o0, LayoutCoordinates layoutCoordinates0, a a0, boolean z) {
        boolean z5;
        Object object0;
        int v13;
        long v12;
        int v11;
        ArrayList arrayList3;
        boolean z3;
        int v6;
        b b0;
        o o1;
        boolean z1 = super.a(o0, layoutCoordinates0, a0, z);
        n n0 = this.b;
        if(!n0.k0) {
            return true;
        }
        d d0 = null;
        while(n0 != null) {
            if(n0 instanceof m0) {
                this.e = F0.f.t(((m0)n0), 16);
            }
            else if((n0.Z & 16) != 0 && n0 instanceof F0.n) {
                n n1 = ((F0.n)n0).m0;
                int v = 0;
                while(n1 != null) {
                    if((n1.Z & 16) != 0) {
                        ++v;
                        if(v == 1) {
                            n0 = n1;
                        }
                        else {
                            if(d0 == null) {
                                d0 = new d(new n[16]);
                            }
                            if(n0 != null) {
                                d0.c(n0);
                                n0 = null;
                            }
                            d0.c(n1);
                        }
                    }
                    n1 = n1.d0;
                }
                if(v != 1) {
                    goto label_27;
                }
                continue;
            }
        label_27:
            n0 = F0.f.f(d0);
        }
        int v1 = o0.m();
        int v2 = 0;
        while(true) {
            o1 = this.d;
            b0 = this.c;
            if(v2 >= v1) {
                break;
            }
            long v3 = o0.i(v2);
            z0.n n2 = (z0.n)o0.n(v2);
            if(b0.e(v3)) {
                long v4 = n2.g;
                if(m0.b.g(v4)) {
                    long v5 = n2.c;
                    if(m0.b.g(v5)) {
                        ArrayList arrayList0 = n2.k;
                        z z2 = z.X;
                        if(arrayList0 == null) {
                            arrayList0 = z2;
                        }
                        ArrayList arrayList1 = new ArrayList(arrayList0.size());
                        ArrayList arrayList2 = n2.k;
                        v6 = v1;
                        if(arrayList2 == null) {
                            arrayList2 = z2;
                        }
                        int v7 = arrayList2.size();
                        z3 = z1;
                        int v8 = 0;
                        while(v8 < v7) {
                            c c0 = (c)arrayList2.get(v8);
                            long v9 = c0.b;
                            if(m0.b.g(v9)) {
                                arrayList3 = arrayList2;
                                c0 c00 = this.e;
                                j.c(c00);
                                long v10 = c00.O0(layoutCoordinates0, v9);
                                v11 = v2;
                                v12 = v5;
                                arrayList1.add(new c(c0.a, v10, c0.c));
                            }
                            else {
                                v11 = v2;
                                v12 = v5;
                                arrayList3 = arrayList2;
                            }
                            ++v8;
                            v2 = v11;
                            arrayList2 = arrayList3;
                            v7 = v7;
                            v5 = v12;
                            v3 = v3;
                        }
                        v13 = v2;
                        c0 c01 = this.e;
                        j.c(c01);
                        long v14 = c01.O0(layoutCoordinates0, v4);
                        c0 c02 = this.e;
                        j.c(c02);
                        long v15 = c02.O0(layoutCoordinates0, v5);
                        z0.n n3 = new z0.n(n2.a, n2.b, v15, n2.d, n2.e, n2.f, v14, n2.h, n2.i, arrayList1, n2.j, n2.l);
                        n3.m = n2.m;
                        o1.j(v3, n3);
                    }
                }
            }
            else {
                z3 = z1;
                v6 = v1;
                v13 = v2;
            }
            v2 = v13 + 1;
            v1 = v6;
            z1 = z3;
        }
        if(o1.h()) {
            b0.X = 0;
            this.a.i();
            return true;
        }
        for(int v16 = b0.X - 1; -1 < v16; --v16) {
            if(o0.g(((long[])b0.Y)[v16]) < 0) {
                b0.i(v16);
            }
        }
        ArrayList arrayList4 = new ArrayList(o1.m());
        int v17 = o1.m();
        for(int v18 = 0; v18 < v17; ++v18) {
            arrayList4.add(o1.n(v18));
        }
        f f0 = new f(arrayList4, a0);
        int v19 = arrayList4.size();
        for(int v20 = 0; true; ++v20) {
            object0 = null;
            if(v20 >= v19) {
                break;
            }
            Object object1 = arrayList4.get(v20);
            if(a0.c(((z0.n)object1).a)) {
                object0 = object1;
                break;
            }
        }
        if(((z0.n)object0) != null) {
            boolean z4 = ((z0.n)object0).d;
            if(!z) {
                this.h = false;
            }
            else if(!this.h && (z4 || ((z0.n)object0).h)) {
                c0 c03 = this.e;
                j.c(c03);
                this.h = !l.f(((z0.n)object0), c03.Z);
            }
            int v21 = 5;
            if(this.h != this.g && (f0.d == 3 || f0.d == 4 || f0.d == 5)) {
                if(this.h) {
                    v21 = 4;
                }
                f0.d = v21;
            }
            else if(f0.d == 4 && this.g && !this.i) {
                f0.d = 3;
            }
            else if(f0.d == 5 && this.h && z4) {
                f0.d = 3;
            }
        }
        if(!z1 && f0.d == 3) {
            f f1 = this.f;
            if(f1 != null) {
                Object object2 = f1.a;
                Object object3 = f0.a;
                if(((List)object2).size() == ((List)object3).size()) {
                    z5 = false;
                    int v22 = ((List)object3).size();
                    for(int v23 = 0; true; ++v23) {
                        if(v23 >= v22) {
                            this.f = f0;
                            return z5;
                        }
                        z0.n n4 = (z0.n)((List)object2).get(v23);
                        z0.n n5 = (z0.n)((List)object3).get(v23);
                        if(!m0.b.b(n4.c, n5.c)) {
                            break;
                        }
                    }
                }
            }
        }
        this.f = f0;
        return true;
    }

    @Override  // y.u
    public final void c(a a0) {
        super.c(a0);
        f f0 = this.f;
        if(f0 == null) {
            return;
        }
        this.g = this.h;
        Object object0 = f0.a;
        int v = ((List)object0).size();
        for(int v1 = 0; v1 < v; ++v1) {
            z0.n n0 = (z0.n)((List)object0).get(v1);
            long v2 = n0.a;
            boolean z = a0.c(v2);
            if(!n0.d && !z || !n0.d && !this.h) {
                b b0 = this.c;
                int v3 = b0.X;
                for(int v4 = 0; v4 < v3; ++v4) {
                    if(v2 == ((long[])b0.Y)[v4]) {
                        b0.i(v4);
                        break;
                    }
                }
            }
        }
        this.h = false;
        this.i = f0.d == 5;
    }

    public final void f() {
        d d0 = this.a;
        int v = d0.Z;
        if(v > 0) {
            Object[] arr_object = d0.X;
            int v1 = 0;
            while(true) {
                ((e)arr_object[v1]).f();
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        n n0 = this.b;
        d d1 = null;
        while(n0 != null) {
            if(n0 instanceof m0) {
                ((m0)n0).Y();
            }
            else if((n0.Z & 16) != 0 && n0 instanceof F0.n) {
                n n1 = ((F0.n)n0).m0;
                int v2 = 0;
                while(n1 != null) {
                    if((n1.Z & 16) != 0) {
                        ++v2;
                        if(v2 == 1) {
                            n0 = n1;
                        }
                        else {
                            if(d1 == null) {
                                d1 = new d(new n[16]);
                            }
                            if(n0 != null) {
                                d1.c(n0);
                                n0 = null;
                            }
                            d1.c(n1);
                        }
                    }
                    n1 = n1.d0;
                }
                if(v2 != 1) {
                    goto label_32;
                }
                continue;
            }
        label_32:
            n0 = F0.f.f(d1);
        }
    }

    public final boolean g(a a0) {
        o o0 = this.d;
        int v = 0;
        if(!o0.h()) {
            n n0 = this.b;
            if(n0.k0) {
                f f0 = this.f;
                j.c(f0);
                c0 c00 = this.e;
                j.c(c00);
                long v1 = c00.Z;
                n n1 = n0;
                d d0 = null;
                while(n1 != null) {
                    if(n1 instanceof m0) {
                        ((m0)n1).m(f0, g.Z, v1);
                    }
                    else if((n1.Z & 16) != 0 && n1 instanceof F0.n) {
                        n n2 = ((F0.n)n1).m0;
                        int v2 = 0;
                        while(n2 != null) {
                            if((n2.Z & 16) != 0) {
                                ++v2;
                                if(v2 == 1) {
                                    n1 = n2;
                                }
                                else {
                                    if(d0 == null) {
                                        d0 = new d(new n[16]);
                                    }
                                    if(n1 != null) {
                                        d0.c(n1);
                                        n1 = null;
                                    }
                                    d0.c(n2);
                                }
                            }
                            n2 = n2.d0;
                        }
                        if(v2 != 1) {
                            goto label_34;
                        }
                        continue;
                    }
                label_34:
                    n1 = F0.f.f(d0);
                }
                if(n0.k0) {
                    d d1 = this.a;
                    int v3 = d1.Z;
                    if(v3 > 0) {
                        Object[] arr_object = d1.X;
                        while(true) {
                            ((e)arr_object[v]).g(a0);
                            ++v;
                            if(v >= v3) {
                                break;
                            }
                        }
                    }
                }
                v = 1;
            }
        }
        this.c(a0);
        o0.c();
        this.e = null;
        return v != 0;
    }

    public final boolean h(a a0, boolean z) {
        if(!this.d.h()) {
            n n0 = this.b;
            if(n0.k0) {
                f f0 = this.f;
                j.c(f0);
                c0 c00 = this.e;
                j.c(c00);
                long v = c00.Z;
                n n1 = n0;
                d d0 = null;
                while(n1 != null) {
                    if(n1 instanceof m0) {
                        ((m0)n1).m(f0, g.X, v);
                    }
                    else if((n1.Z & 16) != 0 && n1 instanceof F0.n) {
                        n n2 = ((F0.n)n1).m0;
                        int v1 = 0;
                        while(n2 != null) {
                            if((n2.Z & 16) != 0) {
                                ++v1;
                                if(v1 == 1) {
                                    n1 = n2;
                                }
                                else {
                                    if(d0 == null) {
                                        d0 = new d(new n[16]);
                                    }
                                    if(n1 != null) {
                                        d0.c(n1);
                                        n1 = null;
                                    }
                                    d0.c(n2);
                                }
                            }
                            n2 = n2.d0;
                        }
                        if(v1 != 1) {
                            goto label_32;
                        }
                        continue;
                    }
                label_32:
                    n1 = F0.f.f(d0);
                }
                if(n0.k0) {
                    d d1 = this.a;
                    int v2 = d1.Z;
                    if(v2 > 0) {
                        Object[] arr_object = d1.X;
                        int v3 = 0;
                        while(true) {
                            e e0 = (e)arr_object[v3];
                            j.c(this.e);
                            e0.h(a0, z);
                            ++v3;
                            if(v3 >= v2) {
                                break;
                            }
                        }
                    }
                }
                if(n0.k0) {
                    d d2 = null;
                    while(n0 != null) {
                        if(n0 instanceof m0) {
                            ((m0)n0).m(f0, g.Y, v);
                        }
                        else if((n0.Z & 16) != 0 && n0 instanceof F0.n) {
                            n n3 = ((F0.n)n0).m0;
                            int v4 = 0;
                            while(n3 != null) {
                                if((n3.Z & 16) != 0) {
                                    ++v4;
                                    if(v4 == 1) {
                                        n0 = n3;
                                    }
                                    else {
                                        if(d2 == null) {
                                            d2 = new d(new n[16]);
                                        }
                                        if(n0 != null) {
                                            d2.c(n0);
                                            n0 = null;
                                        }
                                        d2.c(n3);
                                    }
                                }
                                n3 = n3.d0;
                            }
                            if(v4 != 1) {
                                goto label_69;
                            }
                            continue;
                        }
                    label_69:
                        n0 = F0.f.f(d2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void i(long v, s.z z0) {
        b b0 = this.c;
        int v1 = 0;
        if(b0.e(v) && z0.b(this) < 0) {
            int v2 = b0.X;
            for(int v3 = 0; v3 < v2; ++v3) {
                if(v == ((long[])b0.Y)[v3]) {
                    b0.i(v3);
                    break;
                }
            }
            this.d.k(v);
        }
        d d0 = this.a;
        int v4 = d0.Z;
        if(v4 > 0) {
            Object[] arr_object = d0.X;
            while(true) {
                ((e)arr_object[v1]).i(v, z0);
                ++v1;
                if(v1 >= v4) {
                    break;
                }
            }
        }
    }

    @Override
    public final String toString() {
        return "Node(pointerInputFilter=" + this.b + ", children=" + this.a + ", pointerIds=" + this.c + ')';
    }
}

