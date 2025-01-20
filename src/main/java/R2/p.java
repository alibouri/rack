package R2;

import A3.e;
import E7.l;
import I2.A;
import I2.g;
import I2.m;
import M.J;
import Nb.j;
import androidx.work.OverwritingInputMerger;
import v.h;

public final class p {
    public final String a;
    public int b;
    public final String c;
    public final String d;
    public m e;
    public final m f;
    public final long g;
    public final long h;
    public final long i;
    public g j;
    public final int k;
    public int l;
    public long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public int r;
    public final int s;
    public final int t;
    public long u;
    public int v;
    public final int w;
    public String x;
    public static final String y;
    public static final l z;

    static {
        String s = A.g("WorkSpec");
        j.e(s, "tagWithPrefix(\"WorkSpec\")");
        p.y = s;
        p.z = new l(26);
    }

    public p(String s, int v, String s1, String s2, m m0, m m1, long v1, long v2, long v3, g g0, int v4, int v5, long v6, long v7, long v8, long v9, boolean z, int v10, int v11, int v12, long v13, int v14, int v15, String s3) {
        j.f(s, "id");
        J.l(v, "state");
        j.f(s1, "workerClassName");
        j.f(s2, "inputMergerClassName");
        j.f(m0, "input");
        j.f(m1, "output");
        j.f(g0, "constraints");
        J.l(v5, "backoffPolicy");
        J.l(v10, "outOfQuotaPolicy");
        super();
        this.a = s;
        this.b = v;
        this.c = s1;
        this.d = s2;
        this.e = m0;
        this.f = m1;
        this.g = v1;
        this.h = v2;
        this.i = v3;
        this.j = g0;
        this.k = v4;
        this.l = v5;
        this.m = v6;
        this.n = v7;
        this.o = v8;
        this.p = v9;
        this.q = z;
        this.r = v10;
        this.s = v11;
        this.t = v12;
        this.u = v13;
        this.v = v14;
        this.w = v15;
        this.x = s3;
    }

    public p(String s, int v, String s1, String s2, m m0, m m1, long v1, long v2, long v3, g g0, int v4, int v5, long v6, long v7, long v8, long v9, boolean z, int v10, int v11, long v12, int v13, int v14, String s3, int v15) {
        int v16 = 1;
        String s4 = (v15 & 8) == 0 ? s2 : OverwritingInputMerger.class.getName();
        m m2 = (v15 & 16) == 0 ? m0 : m.b;
        m m3 = (v15 & 0x20) == 0 ? m1 : m.b;
        g g1 = (v15 & 0x200) == 0 ? g0 : g.j;
        if((0x20000 & v15) == 0) {
            v16 = v10;
        }
        this(s, ((v15 & 2) == 0 ? v : 1), s1, s4, m2, m3, ((v15 & 0x40) == 0 ? v1 : 0L), ((v15 & 0x80) == 0 ? v2 : 0L), ((v15 & 0x100) == 0 ? v3 : 0L), g1, ((v15 & 0x400) == 0 ? v4 : 0), ((v15 & 0x800) == 0 ? v5 : 1), ((v15 & 0x1000) == 0 ? v6 : 30000L), ((v15 & 0x2000) == 0 ? v7 : -1L), ((v15 & 0x4000) == 0 ? v8 : 0L), ((0x8000 & v15) == 0 ? v9 : -1L), ((0x10000 & v15) == 0 ? z : false), v16, ((0x40000 & v15) == 0 ? v11 : 0), 0, ((0x100000 & v15) == 0 ? v12 : 0x7FFFFFFFFFFFFFFFL), ((0x200000 & v15) == 0 ? v13 : 0), ((0x400000 & v15) == 0 ? v14 : 0xFFFFFF00), ((v15 & 0x800000) == 0 ? s3 : null));
    }

    public final long a() {
        return I2.J.l(this.b == 1 && this.k > 0, this.k, this.l, this.m, this.n, this.s, this.d(), this.g, this.i, this.h, this.u);
    }

    public static p b(p p0, int v, String s, m m0, int v1, long v2, int v3, int v4, long v5, int v6, int v7) {
        int v19;
        boolean z1;
        String s1 = p0.a;
        int v8 = (v7 & 2) == 0 ? v : p0.b;
        String s2 = (v7 & 4) == 0 ? s : p0.c;
        String s3 = p0.d;
        m m1 = (v7 & 16) == 0 ? m0 : p0.e;
        m m2 = p0.f;
        long v9 = p0.g;
        long v10 = p0.h;
        long v11 = p0.i;
        g g0 = p0.j;
        int v12 = (v7 & 0x400) == 0 ? v1 : p0.k;
        int v13 = p0.l;
        long v14 = p0.m;
        long v15 = (v7 & 0x2000) == 0 ? v2 : p0.n;
        long v16 = p0.o;
        long v17 = p0.p;
        boolean z = p0.q;
        int v18 = p0.r;
        if((v7 & 0x40000) == 0) {
            z1 = z;
            v19 = v3;
        }
        else {
            z1 = z;
            v19 = p0.s;
        }
        long v20 = (0x100000 & v7) == 0 ? v5 : p0.u;
        int v21 = (v7 & 0x200000) == 0 ? v6 : p0.v;
        String s4 = p0.x;
        p0.getClass();
        j.f(s1, "id");
        J.l(v8, "state");
        j.f(s2, "workerClassName");
        j.f(s3, "inputMergerClassName");
        j.f(m1, "input");
        j.f(m2, "output");
        j.f(g0, "constraints");
        J.l(v13, "backoffPolicy");
        J.l(v18, "outOfQuotaPolicy");
        return new p(s1, v8, s2, s3, m1, m2, v9, v10, v11, g0, v12, v13, v14, v15, v16, v17, z1, v18, v19, ((0x80000 & v7) == 0 ? v4 : p0.t), v20, v21, p0.w, s4);
    }

    public final boolean c() {
        return !j.a(g.j, this.j);
    }

    public final boolean d() {
        return this.h != 0L;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof p)) {
            return false;
        }
        if(!j.a(this.a, ((p)object0).a)) {
            return false;
        }
        if(this.b != ((p)object0).b) {
            return false;
        }
        if(!j.a(this.c, ((p)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((p)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((p)object0).e)) {
            return false;
        }
        if(!j.a(this.f, ((p)object0).f)) {
            return false;
        }
        if(this.g != ((p)object0).g) {
            return false;
        }
        if(this.h != ((p)object0).h) {
            return false;
        }
        if(this.i != ((p)object0).i) {
            return false;
        }
        if(!j.a(this.j, ((p)object0).j)) {
            return false;
        }
        if(this.k != ((p)object0).k) {
            return false;
        }
        if(this.l != ((p)object0).l) {
            return false;
        }
        if(this.m != ((p)object0).m) {
            return false;
        }
        if(this.n != ((p)object0).n) {
            return false;
        }
        if(this.o != ((p)object0).o) {
            return false;
        }
        if(this.p != ((p)object0).p) {
            return false;
        }
        if(this.q != ((p)object0).q) {
            return false;
        }
        if(this.r != ((p)object0).r) {
            return false;
        }
        if(this.s != ((p)object0).s) {
            return false;
        }
        if(this.t != ((p)object0).t) {
            return false;
        }
        if(this.u != ((p)object0).u) {
            return false;
        }
        if(this.v != ((p)object0).v) {
            return false;
        }
        return this.w == ((p)object0).w ? j.a(this.x, ((p)object0).x) : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(e.s((h.d(this.b) + this.a.hashCode() * 0x1F) * 0x1F, 0x1F, this.c), 0x1F, this.d);
        int v1 = this.e.hashCode();
        int v2 = this.j.hashCode();
        int v3 = (((((h.d(this.l) + ((v2 + ((((this.f.hashCode() + (v1 + v) * 0x1F) * 0x1F + ((int)(this.g ^ this.g >>> 0x20))) * 0x1F + ((int)(this.h ^ this.h >>> 0x20))) * 0x1F + ((int)(this.i ^ this.i >>> 0x20))) * 0x1F) * 0x1F + this.k) * 0x1F) * 0x1F + ((int)(this.m ^ this.m >>> 0x20))) * 0x1F + ((int)(this.n ^ this.n >>> 0x20))) * 0x1F + ((int)(this.o ^ this.o >>> 0x20))) * 0x1F + ((int)(this.p ^ this.p >>> 0x20))) * 0x1F;
        int v4 = this.q ? 0x4CF : 0x4D5;
        int v5 = ((((((h.d(this.r) + (v3 + v4) * 0x1F) * 0x1F + this.s) * 0x1F + this.t) * 0x1F + ((int)(this.u >>> 0x20 ^ this.u))) * 0x1F + this.v) * 0x1F + this.w) * 0x1F;
        return this.x == null ? v5 : v5 + this.x.hashCode();
    }

    @Override
    public final String toString() {
        return J.g(new StringBuilder("{WorkSpec: "), this.a, '}');
    }
}

