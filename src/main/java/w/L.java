package w;

import Ab.t;
import Bb.p;
import Eb.a;
import Fb.i;
import W5.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import m0.b;
import v1.r;
import y.v1;
import z0.m;
import z0.x;

public final class l extends i implements Function2 {
    public int Z;
    public Object b0;
    public final n c0;

    public l(n n0, g g0) {
        this.c0 = n0;
        super(g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((l)this.t(((x)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new l(this.c0, g0);
        g1.b0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object4;
        x x0;
        Object object1 = a.X;
        n n0 = this.c0;
        switch(this.Z) {
            case 0: {
                f.b0(object0);
                x0 = (x)this.b0;
                this.b0 = x0;
                this.Z = 1;
                object0 = v1.c(x0, this, 2);
                if(object0 == object1) {
                    return object1;
                }
                n0.e0 = new m(((z0.n)object0).a);
                n0.X = new b(((z0.n)object0).c);
                goto label_51;
            }
            case 1: {
                x0 = (x)this.b0;
                f.b0(object0);
                n0.e0 = new m(((z0.n)object0).a);
                n0.X = new b(((z0.n)object0).c);
                goto label_51;
            }
            case 2: {
                x0 = (x)this.b0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            Object object2 = ((z0.f)object0).a;
            ArrayList arrayList0 = new ArrayList(((List)object2).size());
            int v = ((List)object2).size();
            int v1 = 0;
            for(int v2 = 0; v2 < v; ++v2) {
                Object object3 = ((List)object2).get(v2);
                if(((z0.n)object3).d) {
                    arrayList0.add(object3);
                }
            }
            int v3 = arrayList0.size();
            while(true) {
                object4 = null;
                if(v1 < v3) {
                    Object object5 = arrayList0.get(v1);
                    if(n0.e0 instanceof m && ((z0.n)object5).a == n0.e0.a) {
                        object4 = object5;
                    }
                    else {
                        ++v1;
                        continue;
                    }
                }
                break;
            }
            z0.n n1 = (z0.n)object4;
            if(n1 == null) {
                n1 = (z0.n)p.q0(arrayList0);
            }
            if(n1 != null) {
                n0.e0 = new m(n1.a);
                n0.X = new b(n1.c);
            }
            if(arrayList0.isEmpty()) {
                n0.e0 = null;
                return t.a;
            }
        label_51:
            this.b0 = x0;
            this.Z = 2;
            object0 = r.a(x0, this);
        }
        while(object0 != object1);
        return object1;
    }
}

