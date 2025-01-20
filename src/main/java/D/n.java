package D;

import Aa.J;
import Nb.j;
import Nb.z;
import P3.e;
import W5.f;
import java.util.LinkedHashMap;
import java.util.List;

public final class n {
    public final int a;
    public int b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public n(int v, J j0) {
        this.a = v;
        this.c = j0;
        this.d = new LinkedHashMap(0, 0.75f);
    }

    public n(t t0, int v, int v1, m m0, x x0) {
        this.d = t0;
        this.c = t0;
        this.a = v;
        this.b = v1;
        this.e = m0;
        this.f = x0;
    }

    public long a(int v, int v1) {
        int v2;
        t t0 = (t)this.c;
        int[] arr_v = t0.a;
        if(v1 == 1) {
            v2 = arr_v[v];
        }
        else {
            int v3 = v1 + v - 1;
            v2 = t0.b[v3] + arr_v[v3] - t0.b[v];
        }
        if(v2 < 0) {
            v2 = 0;
        }
        return f.u(v2, v2, 0, 0x7FFFFFFF);
    }

    public s b(int v) {
        w w0 = ((x)this.f).c(v);
        Object object0 = w0.c;
        int v1 = ((List)object0).size();
        int v3 = w0.b;
        int v4 = v1 == 0 || v3 + v1 == this.a ? 0 : this.b;
        r[] arr_r = new r[v1];
        int v5 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            int v6 = (int)((b)((List)object0).get(v2)).a;
            long v7 = this.a(v5, v6);
            r r0 = ((m)this.e).b(v3 + v2, v7, v5, v6, v4);
            v5 += v6;
            arr_r[v2] = r0;
        }
        return new s(v, arr_r, ((t)this.d), ((List)object0), v4);
    }

    public void c(e e0) {
        e e1 = e0.d;
        if(e1 == null) {
            return;
        }
        e1.c = e0.c;
        e e2 = e0.c;
        if(e2 == null) {
            this.f = e1;
        }
        else {
            e2.d = e1;
        }
        e e3 = (e)this.e;
        e0.c = e3;
        e0.d = null;
        if(e3 != null) {
            e3.d = e0;
        }
        this.e = e0;
    }

    public void d(Object object0, O3.f f0) {
        LinkedHashMap linkedHashMap0 = (LinkedHashMap)this.d;
        e e0 = (e)linkedHashMap0.get(object0);
        if(e0 == null) {
            e e1 = (e)this.e;
            e e2 = new e();  // initializer: Ljava/lang/Object;-><init>()V
            e2.a = object0;
            e2.b = f0;
            e2.c = e1;
            e2.d = null;
            this.e = e2;
            if(e1 == null) {
                this.f = e2;
            }
            else {
                e1.d = e2;
            }
            int v = this.b;
            this.b = ((Number)((J)this.c).j(object0, f0)).intValue() + v;
            linkedHashMap0.put(object0, e2);
        }
        else {
            e0.b = f0;
            this.c(e0);
        }
        for(e e3 = (e)this.f; e3 != null && this.b > this.a; e3 = (e)this.f) {
            Object object1 = e3.a;
            z.c(linkedHashMap0).remove(object1);
            this.e(e3);
        }
    }

    public void e(e e0) {
        e e1 = e0.d;
        if(e1 == null) {
            this.e = e0.c;
        }
        else {
            e1.c = e0.c;
        }
        e e2 = e0.c;
        if(e2 == null) {
            this.f = e1;
        }
        else {
            e2.d = e1;
        }
        int v = this.b;
        Object object0 = e0.a;
        j.c(object0);
        this.b = v - ((Number)((J)this.c).j(object0, e0.b)).intValue();
        e0.a = null;
        e0.b = null;
        e0.c = null;
        e0.d = null;
    }
}

