package t0;

import Bb.z;
import Nb.k;
import V2.a;
import a8.Q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import n0.G;
import n0.M;
import n0.U;
import n0.j;
import n0.v;
import p0.d;
import v1.r;

public final class b extends B {
    public float[] b;
    public final ArrayList c;
    public boolean d;
    public long e;
    public List f;
    public boolean g;
    public j h;
    public k i;
    public final a j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public b() {
        this.c = new ArrayList();
        this.d = true;
        this.e = v.i;
        this.f = z.X;
        this.g = true;
        this.j = new a(20, this);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override  // t0.B
    public final void a(d d0) {
        float[] arr_f1;
        g3.b b0;
        if(this.s) {
            float[] arr_f = this.b;
            if(arr_f == null) {
                arr_f = G.a();
                this.b = arr_f;
            }
            else {
                G.d(arr_f);
            }
            G.h(arr_f, this.q + this.m, this.r + this.n, 0.0f);
            G.e(arr_f, this.l);
            G.f(arr_f, this.o, this.p, 1.0f);
            G.h(arr_f, -this.m, -this.n, 0.0f);
            this.s = false;
        }
        if(this.g) {
            if(!this.f.isEmpty()) {
                j j0 = this.h;
                if(j0 == null) {
                    j0 = M.h();
                    this.h = j0;
                }
                t0.a.d(this.f, j0);
            }
            this.g = false;
        }
        Q q0 = d0.A();
        long v1 = q0.A();
        q0.o().n();
        try {
            b0 = (g3.b)q0.Y;
            arr_f1 = this.b;
        }
        catch(Throwable throwable0) {
            r.i(q0, v1);
            throw throwable0;
        }
        Q q1 = (Q)b0.Y;
        try {
            if(arr_f1 != null) {
                q1.o().r(arr_f1);
            }
            j j1 = this.h;
            if(!this.f.isEmpty() && j1 != null) {
                q1.o().j(j1, 1);
            }
            ArrayList arrayList0 = this.c;
            int v2 = arrayList0.size();
            for(int v = 0; v < v2; ++v) {
                ((B)arrayList0.get(v)).a(d0);
            }
        }
        catch(Throwable throwable0) {
            r.i(q0, v1);
            throw throwable0;
        }
        r.i(q0, v1);
    }

    @Override  // t0.B
    public final Function1 b() {
        return this.i;
    }

    @Override  // t0.B
    public final void d(a a0) {
        this.i = a0;
    }

    public final void e(int v, B b0) {
        ArrayList arrayList0 = this.c;
        if(v < arrayList0.size()) {
            arrayList0.set(v, b0);
        }
        else {
            arrayList0.add(b0);
        }
        this.g(b0);
        b0.d(this.j);
        this.c();
    }

    public final void f(long v) {
        if(!this.d) {
            return;
        }
        if(v != 16L) {
            long v1 = this.e;
            if(v1 == 16L) {
                this.e = v;
                return;
            }
            if(v.h(v1) == v.h(v) || v.g(v1) == v.g(v) || v.e(v1) == v.e(v)) {
                this.d = false;
                this.e = v.i;
            }
        }
    }

    public final void g(B b0) {
        if(b0 instanceof g) {
            n0.r r0 = ((g)b0).b;
            if(this.d && r0 != null) {
                if(r0 instanceof U) {
                    this.f(((U)r0).a);
                }
                else {
                    this.d = false;
                    this.e = v.i;
                }
            }
            n0.r r1 = ((g)b0).g;
            if(this.d && r1 != null) {
                if(r1 instanceof U) {
                    this.f(((U)r1).a);
                    return;
                }
                this.d = false;
                this.e = v.i;
            }
        }
        else if(b0 instanceof b) {
            if(((b)b0).d && this.d) {
                this.f(((b)b0).e);
                return;
            }
            this.d = false;
            this.e = v.i;
        }
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("VGroup: ");
        stringBuilder0.append(this.k);
        ArrayList arrayList0 = this.c;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            B b0 = (B)arrayList0.get(v1);
            stringBuilder0.append("\t");
            stringBuilder0.append(b0.toString());
            stringBuilder0.append("\n");
        }
        return stringBuilder0.toString();
    }
}

