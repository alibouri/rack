package k2;

import A7.b;
import Ab.t;
import Bb.D;
import C3.i;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.I0;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class m extends j implements Function2 {
    public Iterator c0;
    public int d0;
    public Object e0;
    public final i f0;

    public m(i i0, g g0) {
        this.f0 = i0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((m)this.t(((ac.i)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new m(this.f0, g0);
        g1.e0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Iterator iterator0;
        ac.i i2;
        ac.i i1;
        Object object1 = a.X;
        i i0 = this.f0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                i1 = (ac.i)this.e0;
                this.e0 = i1;
                this.d0 = 1;
                object0 = ((b)i0.X).l(this);
                if(object0 == object1) {
                    return object1;
                }
                ((I0)i0.b0).start();
                i2 = i1;
                iterator0 = ((List)object0).iterator();
                break;
            }
            case 1: {
                i1 = (ac.i)this.e0;
                f.b0(object0);
                ((I0)i0.b0).start();
                i2 = i1;
                iterator0 = ((List)object0).iterator();
                break;
            }
            case 2: {
                iterator0 = this.c0;
                i2 = (ac.i)this.e0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(iterator0.hasNext()) {
            Object object2 = iterator0.next();
            this.e0 = i2;
            this.c0 = iterator0;
            this.d0 = 2;
            if(i2.c(((D)object2), this) == object1) {
                return object1;
            }
            if(false) {
                break;
            }
        }
        return t.a;
    }
}

