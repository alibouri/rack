package aa;

import Bb.p;
import Bb.w;
import C.E;
import C.u;
import C.v;
import Kb.h;
import Nb.j;
import U.C;
import U.d;
import Ub.g;
import Ub.i;
import X9.f;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class b {
    public final E a;
    public final Function2 b;
    public final C c;

    public b(E e0, Function2 function20) {
        j.f(function20, "snapOffsetForItem");
        super();
        this.a = e0;
        this.b = function20;
        this.c = d.w(new f(this, 1));
    }

    public final boolean a() {
        E e0 = this.a;
        v v0 = (v)p.x0(((List)e0.g().j));
        if(v0 != null) {
            u u0 = e0.g();
            return v0.a < u0.m - 1 || v0.p + v0.q > this.f();
        }
        return false;
    }

    public final boolean b() {
        v v0 = (v)p.q0(((List)this.a.g().j));
        return v0 != null && (v0.a > 0 || v0.p < 0);
    }

    public final int c(int v) {
        Object object0 = null;
        h h0 = i.W(new w(0, ((Iterable)this.a.g().j)), a.g0);
        for(Object object1: ((g)h0.b)) {
            Object object2 = ((Function1)h0.c).n(object1);
            if(((c)object2).a() == v) {
                object0 = object2;
                break;
            }
        }
        Function2 function20 = this.b;
        if(((c)object0) != null) {
            return ((c)object0).a.p - ((Number)function20.j(this, ((c)object0))).intValue();
        }
        c c0 = this.e();
        if(c0 == null) {
            return 0;
        }
        int v1 = Pb.a.H(this.d() * ((float)(v - c0.a())));
        return c0.a.p + v1 - ((Number)function20.j(this, c0)).intValue();
    }

    public final float d() {
        Object object2;
        E e0 = this.a;
        u u0 = e0.g();
        if(((List)u0.j).isEmpty()) {
            return -1.0f;
        }
        Object object0 = u0.j;
        Iterator iterator0 = ((Iterable)object0).iterator();
        Object object1 = null;
        if(iterator0.hasNext()) {
            object2 = iterator0.next();
            if(iterator0.hasNext()) {
                int v = ((v)object2).p;
                while(true) {
                    Object object3 = iterator0.next();
                    int v1 = ((v)object3).p;
                    if(v > v1) {
                        object2 = object3;
                        v = v1;
                    }
                    if(!iterator0.hasNext()) {
                        break;
                    }
                }
            }
        }
        else {
            object2 = null;
        }
        if(((v)object2) == null) {
            return -1.0f;
        }
        Iterator iterator1 = ((Iterable)object0).iterator();
        if(iterator1.hasNext()) {
            object1 = iterator1.next();
            if(iterator1.hasNext()) {
                int v2 = ((v)object1).p + ((v)object1).q;
                while(true) {
                    Object object4 = iterator1.next();
                    int v3 = ((v)object4).p + ((v)object4).q;
                    if(v2 < v3) {
                        object1 = object4;
                        v2 = v3;
                    }
                    if(!iterator1.hasNext()) {
                        break;
                    }
                }
            }
        }
        if(((v)object1) == null) {
            return -1.0f;
        }
        int v4 = Math.max(((v)object2).p + ((v)object2).q, ((v)object1).p + ((v)object1).q) - Math.min(((v)object2).p, ((v)object1).p);
        if(v4 != 0) {
            u u1 = e0.g();
            int v5 = 0;
            if(((List)u1.j).size() >= 2) {
                v v6 = (v)((List)u1.j).get(0);
                v5 = ((v)((List)u1.j).get(1)).p - (v6.q + v6.p);
            }
            return ((float)(v4 + v5)) / ((float)((List)object0).size());
        }
        return -1.0f;
    }

    public final c e() {
        return (c)this.c.getValue();
    }

    public final int f() {
        u u0 = this.a.g();
        return u0.l - u0.o;
    }
}

