package B;

import A3.e;
import Bb.A;
import D0.J;
import D0.K;
import D0.L;
import D0.M;
import D0.V;
import D0.o;
import Nb.j;
import W5.f;
import a1.a;
import a5.w;
import g0.c;
import java.util.List;
import m5.b;

public final class u implements K {
    public final c a;
    public final boolean b;

    public u(c c0, boolean z) {
        this.a = c0;
        this.b = z;
    }

    @Override  // D0.K
    public final int a(o o0, List list0, int v) {
        return e.e(this, o0, list0, v);
    }

    @Override  // D0.K
    public final L b(M m0, List list0, long v) {
        int v4;
        int v3;
        A a0 = A.X;
        if(list0.isEmpty()) {
            return m0.L(a.j(v), a.i(v), a0, p.Z);
        }
        long v1 = this.b ? v : a.a(v, 0, 0, 0, 0, 10);
        boolean z = true;
        if(list0.size() == 1) {
            J j0 = (J)list0.get(0);
            Object object0 = j0.g();
            n n0 = object0 instanceof n ? ((n)object0) : null;
            if(!(n0 == null ? false : n0.m0)) {
                V v2 = j0.a(v1);
                v3 = Math.max(a.j(v), v2.X);
                v4 = Math.max(a.i(v), v2.Y);
                return m0.L(v3, v4, a0, new s(v2, j0, m0, v3, v4, this));
            }
            v3 = a.j(v);
            v4 = a.i(v);
            int v5 = a.j(v);
            int v6 = a.i(v);
            if(v5 < 0 || v6 < 0) {
                z = false;
            }
            if(z) {
                return m0.L(v3, v4, a0, new s(j0.a(f.u(v5, v5, v6, v6)), j0, m0, v3, v4, this));
            }
            w.k0(("width(" + v5 + ") and height(" + v6 + ") must be >= 0"));
            throw null;
        }
        V[] arr_v = new V[list0.size()];
        Nb.u u0 = new Nb.u();  // initializer: Ljava/lang/Object;-><init>()V
        u0.X = a.j(v);
        Nb.u u1 = new Nb.u();  // initializer: Ljava/lang/Object;-><init>()V
        u1.X = a.i(v);
        int v7 = list0.size();
        boolean z1 = false;
        for(int v8 = 0; v8 < v7; ++v8) {
            J j1 = (J)list0.get(v8);
            Object object1 = j1.g();
            n n1 = object1 instanceof n ? ((n)object1) : null;
            if((n1 == null ? false : n1.m0)) {
                z1 = true;
            }
            else {
                V v9 = j1.a(v1);
                arr_v[v8] = v9;
                u0.X = Math.max(u0.X, v9.X);
                u1.X = Math.max(u1.X, v9.Y);
            }
        }
        if(z1) {
            long v10 = f.b((u0.X == 0x7FFFFFFF ? 0 : u0.X), u0.X, (u1.X == 0x7FFFFFFF ? 0 : u1.X), u1.X);
            int v11 = list0.size();
            for(int v12 = 0; v12 < v11; ++v12) {
                J j2 = (J)list0.get(v12);
                Object object2 = j2.g();
                n n2 = object2 instanceof n ? ((n)object2) : null;
                if((n2 == null ? false : n2.m0)) {
                    arr_v[v12] = j2.a(v10);
                }
            }
        }
        return m0.L(u0.X, u1.X, a0, new t(arr_v, list0, m0, u0, u1, this, 0));
    }

    @Override  // D0.K
    public final int c(o o0, List list0, int v) {
        return e.h(this, o0, list0, v);
    }

    @Override  // D0.K
    public final int d(o o0, List list0, int v) {
        return e.k(this, o0, list0, v);
    }

    @Override  // D0.K
    public final int e(o o0, List list0, int v) {
        return e.b(this, o0, list0, v);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof u)) {
            return false;
        }
        return j.a(this.a, ((u)object0).a) ? this.b == ((u)object0).b : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b ? v * 0x1F + 0x4CF : v * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BoxMeasurePolicy(alignment=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", propagateMinConstraints=");
        return b.z(stringBuilder0, this.b, ')');
    }
}

