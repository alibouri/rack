package T1;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class q extends j implements Function2 {
    public int c0;
    public Object d0;
    public final F e0;

    public q(F f0, g g0) {
        this.e0 = f0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((q)this.t(((n)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new q(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object3;
        Object object1 = a.X;
        Object object2 = t.a;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                n n0 = (n)this.d0;
                F f0 = this.e0;
                if(n0 instanceof l) {
                    this.c0 = 1;
                    G g0 = (G)f0.f.getValue();
                    if(!(g0 instanceof c)) {
                        if(!(g0 instanceof T1.j)) {
                            if(!Nb.j.a(g0, H.a)) {
                                goto label_20;
                            }
                            object3 = f0.g(this);
                            if(object3 == object1) {
                                return object3 == object1 ? object1 : object2;
                            label_20:
                                if(g0 instanceof i) {
                                    throw new IllegalStateException("Can\'t read in final state.");
                                }
                                return object2 == object1 ? object1 : object2;
                            }
                        }
                        else if(g0 == ((l)n0).a) {
                            object3 = f0.g(this);
                            if(object3 == object1) {
                                return object3 == object1 ? object1 : object2;
                            }
                        }
                    }
                    return object2 == object1 ? object1 : object2;
                }
                if(n0 instanceof m) {
                    this.c0 = 2;
                    return F.c(f0, ((m)n0), this) == object1 ? object1 : object2;
                }
                return object2;
            }
            case 1: 
            case 2: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

