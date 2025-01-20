package R;

import A3.e;
import Nb.j;
import O0.O;
import T.l;

public final class f1 {
    public final O a;
    public final O b;
    public final O c;
    public final O d;
    public final O e;
    public final O f;
    public final O g;
    public final O h;
    public final O i;
    public final O j;
    public final O k;
    public final O l;
    public final O m;
    public final O n;
    public final O o;

    public f1() {
        this.a = l.d;
        this.b = l.e;
        this.c = l.f;
        this.d = l.g;
        this.e = l.h;
        this.f = l.i;
        this.g = l.m;
        this.h = l.n;
        this.i = l.o;
        this.j = l.a;
        this.k = l.b;
        this.l = l.c;
        this.m = l.j;
        this.n = l.k;
        this.o = l.l;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f1)) {
            return false;
        }
        if(!j.a(this.a, ((f1)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((f1)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((f1)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((f1)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((f1)object0).e)) {
            return false;
        }
        if(!j.a(this.f, ((f1)object0).f)) {
            return false;
        }
        if(!j.a(this.g, ((f1)object0).g)) {
            return false;
        }
        if(!j.a(this.h, ((f1)object0).h)) {
            return false;
        }
        if(!j.a(this.i, ((f1)object0).i)) {
            return false;
        }
        if(!j.a(this.j, ((f1)object0).j)) {
            return false;
        }
        if(!j.a(this.k, ((f1)object0).k)) {
            return false;
        }
        if(!j.a(this.l, ((f1)object0).l)) {
            return false;
        }
        if(!j.a(this.m, ((f1)object0).m)) {
            return false;
        }
        return j.a(this.n, ((f1)object0).n) ? j.a(this.o, ((f1)object0).o) : false;
    }

    @Override
    public final int hashCode() {
        return this.o.hashCode() + e.r(e.r(e.r(e.r(e.r(e.r(e.r(e.r(e.r(e.r(e.r(e.r(e.r(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c), 0x1F, this.d), 0x1F, this.e), 0x1F, this.f), 0x1F, this.g), 0x1F, this.h), 0x1F, this.i), 0x1F, this.j), 0x1F, this.k), 0x1F, this.l), 0x1F, this.m), 0x1F, this.n);
    }

    @Override
    public final String toString() {
        return "Typography(displayLarge=" + this.a + ", displayMedium=" + this.b + ",displaySmall=" + this.c + ", headlineLarge=" + this.d + ", headlineMedium=" + this.e + ", headlineSmall=" + this.f + ", titleLarge=" + this.g + ", titleMedium=" + this.h + ", titleSmall=" + this.i + ", bodyLarge=" + this.j + ", bodyMedium=" + this.k + ", bodySmall=" + this.l + ", labelLarge=" + this.m + ", labelMedium=" + this.n + ", labelSmall=" + this.o + ')';
    }
}

