package N;

import A.d;
import A.e;
import A.h;
import A.j;
import A.l;
import A.m;
import A.n;
import Ab.t;
import ac.i;
import e0.p;
import kotlin.coroutines.g;

public final class c0 implements i {
    public final int X;
    public final p Y;

    public c0(p p0, int v) {
        this.X = v;
        this.Y = p0;
        super();
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        if(this.X != 0) {
            p p0 = this.Y;
            if(((j)object0) instanceof h) {
                p0.add(((j)object0));
                return t.a;
            }
            if(((j)object0) instanceof A.i) {
                p0.remove(((A.i)(((j)object0))).a);
                return t.a;
            }
            if(((j)object0) instanceof d) {
                p0.add(((j)object0));
                return t.a;
            }
            if(((j)object0) instanceof e) {
                p0.remove(((e)(((j)object0))).a);
                return t.a;
            }
            if(((j)object0) instanceof m) {
                p0.add(((j)object0));
                return t.a;
            }
            if(((j)object0) instanceof n) {
                p0.remove(((n)(((j)object0))).a);
                return t.a;
            }
            if(((j)object0) instanceof l) {
                p0.remove(((l)(((j)object0))).a);
            }
            return t.a;
        }
        p p1 = this.Y;
        if(((j)object0) instanceof h) {
            p1.add(((j)object0));
            return t.a;
        }
        if(((j)object0) instanceof A.i) {
            p1.remove(((A.i)(((j)object0))).a);
            return t.a;
        }
        if(((j)object0) instanceof d) {
            p1.add(((j)object0));
            return t.a;
        }
        if(((j)object0) instanceof e) {
            p1.remove(((e)(((j)object0))).a);
            return t.a;
        }
        if(((j)object0) instanceof m) {
            p1.add(((j)object0));
            return t.a;
        }
        if(((j)object0) instanceof n) {
            p1.remove(((n)(((j)object0))).a);
            return t.a;
        }
        if(((j)object0) instanceof l) {
            p1.remove(((l)(((j)object0))).a);
        }
        return t.a;
    }
}

