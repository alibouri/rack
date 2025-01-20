package t0;

import Nb.j;
import a1.d;
import m5.b;
import n0.M;
import n0.v;
import r.t;
import v1.r;

public final class e {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final E f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;
    public static final t k;
    public static int l;

    static {
        e.k = new t();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public e(String s, float f, float f1, float f2, float f3, E e0, long v, int v1, boolean z) {
        int v2;
        synchronized(e.k) {
            v2 = e.l;
            e.l = v2 + 1;
        }
        super();
        this.a = s;
        this.b = f;
        this.c = f1;
        this.d = f2;
        this.e = f3;
        this.f = e0;
        this.g = v;
        this.h = v1;
        this.i = z;
        this.j = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        if(!j.a(this.a, ((e)object0).a)) {
            return false;
        }
        if(!d.a(this.b, ((e)object0).b)) {
            return false;
        }
        if(!d.a(this.c, ((e)object0).c)) {
            return false;
        }
        if(this.d == ((e)object0).d || this.e == ((e)object0).e || !this.f.equals(((e)object0).f)) {
            return false;
        }
        if(!v.c(this.g, ((e)object0).g)) {
            return false;
        }
        return M.p(this.h, ((e)object0).h) ? this.i == ((e)object0).i : false;
    }

    @Override
    public final int hashCode() {
        int v = (r.c((this.f.hashCode() + b.p(b.p(b.p(b.p(this.a.hashCode() * 0x1F, this.b, 0x1F), this.c, 0x1F), this.d, 0x1F), this.e, 0x1F)) * 0x1F, this.g, 0x1F) + this.h) * 0x1F;
        return this.i ? v + 0x4CF : v + 0x4D5;
    }
}

