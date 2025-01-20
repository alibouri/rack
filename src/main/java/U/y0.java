package U;

import F0.u;
import Y8.o;
import java.util.ArrayList;

public final class y0 {
    public final z0 a;
    public final int[] b;
    public final int c;
    public final Object[] d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public final u j;
    public int k;
    public int l;
    public int m;
    public boolean n;

    public y0(z0 z00) {
        this.a = z00;
        this.b = z00.X;
        this.c = z00.Y;
        this.d = z00.Z;
        this.e = z00.b0;
        this.h = z00.Y;
        this.i = -1;
        this.j = new u();
    }

    public final c a(int v) {
        ArrayList arrayList0 = this.a.f0;
        int v1 = d.J(arrayList0, v, this.c);
        if(v1 < 0) {
            c c0 = new c(v);
            arrayList0.add(-(v1 + 1), c0);
            return c0;
        }
        return (c)arrayList0.get(v1);
    }

    public final Object b(int[] arr_v, int v) {
        if(d.f(arr_v, v)) {
            return v * 5 < arr_v.length ? this.d[d.r(arr_v[v * 5 + 1] >> 29) + arr_v[v * 5 + 4]] : this.d[arr_v.length];
        }
        return l.a;
    }

    public final void c() {
        this.f = true;
        z0 z00 = this.a;
        z00.getClass();
        if(this.a == z00) {
            int v = z00.c0;
            if(v > 0) {
                z00.c0 = v - 1;
                return;
            }
        }
        d.p("Unexpected reader close()");
        throw null;
    }

    public final void d() {
        if(this.k == 0) {
            if(this.g == this.h) {
                int[] arr_v = this.b;
                int v = d.k(arr_v, this.i);
                this.i = v;
                int v1 = this.c;
                this.h = v >= 0 ? d.e(arr_v, v) + v : v1;
                int v2 = this.j.a();
                if(v2 < 0) {
                    this.l = 0;
                    this.m = 0;
                    return;
                }
                this.l = v2;
                this.m = v < v1 - 1 ? d.d(arr_v, v + 1) : this.e;
                return;
            }
            d.p("endGroup() not called at the end of a group");
            throw null;
        }
    }

    public final Object e() {
        int v = this.g;
        return v < this.h ? this.b(this.b, v) : 0;
    }

    public final int f() {
        return this.g >= this.h ? 0 : this.b[this.g * 5];
    }

    public final Object g(int v, int v1) {
        int v2 = d.m(this.b, v) + v1;
        return v2 < (v + 1 >= this.c ? this.e : this.b[(v + 1) * 5 + 4]) ? this.d[v2] : l.a;
    }

    public final Object h() {
        if(this.k <= 0) {
            int v = this.l;
            if(v < this.m) {
                this.n = true;
                this.l = v + 1;
                return this.d[v];
            }
        }
        this.n = false;
        return l.a;
    }

    // Deobfuscation rating: LOW(20)
    public final Object i(int v) {
        return d.h(this.b, v) ? this.d[this.b[v * 5 + 4]] : null;
    }

    // Deobfuscation rating: LOW(20)
    public final Object j(int[] arr_v, int v) {
        return d.g(arr_v, v) ? this.d[d.r(arr_v[v * 5 + 1] >> 30) + arr_v[v * 5 + 4]] : null;
    }

    public final void k(int v) {
        if(this.k == 0) {
            this.g = v;
            int[] arr_v = this.b;
            int v1 = this.c;
            int v2 = v >= v1 ? -1 : d.k(arr_v, v);
            this.i = v2;
            this.h = v2 < 0 ? v1 : d.e(arr_v, v2) + v2;
            this.l = 0;
            this.m = 0;
            return;
        }
        d.p("Cannot reposition while in an empty region");
        throw null;
    }

    public final int l() {
        int v = 1;
        if(this.k == 0) {
            int[] arr_v = this.b;
            if(!d.h(arr_v, this.g)) {
                v = d.j(arr_v, this.g);
            }
            this.g = d.e(arr_v, this.g) + this.g;
            return v;
        }
        d.p("Cannot skip while in an empty region");
        throw null;
    }

    public final void m() {
        if(this.k == 0) {
            this.g = this.h;
            this.l = 0;
            this.m = 0;
            return;
        }
        d.p("Cannot skip the enclosing group while in an empty region");
        throw null;
    }

    public final void n() {
        if(this.k <= 0) {
            int v = this.g;
            int[] arr_v = this.b;
            if(d.k(arr_v, v) == this.i) {
                int v1 = this.l;
                u u0 = this.j;
                if(v1 != 0 || this.m != 0) {
                    u0.b(v1);
                }
                else {
                    u0.b(-1);
                }
                this.i = v;
                this.h = d.e(arr_v, v) + v;
                this.g = v + 1;
                this.l = d.m(arr_v, v);
                this.m = v < this.c - 1 ? d.d(arr_v, v + 1) : this.e;
                return;
            }
            d.M("Invalid slot table detected");
            throw null;
        }
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SlotReader(current=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", key=");
        stringBuilder0.append(this.f());
        stringBuilder0.append(", parent=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", end=");
        return o.z(stringBuilder0, this.h, ')');
    }
}

