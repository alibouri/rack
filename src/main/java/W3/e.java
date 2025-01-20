package W3;

import Ab.t;
import Eb.a;
import N9.l;
import W5.f;
import ac.i;
import kotlin.coroutines.g;

public final class e implements i {
    public final l X;
    public final i Y;

    public e(l l0, i i0) {
        this.X = l0;
        this.Y = i0;
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        e e0;
        d d0;
        if(g0 instanceof d) {
            d0 = (d)g0;
            int v = d0.d0;
            if((v & 0x80000000) == 0) {
                d0 = new d(this, g0);
            }
            else {
                d0.d0 = v ^ 0x80000000;
            }
        }
        else {
            d0 = new d(this, g0);
        }
        Object object1 = d0.c0;
        Object object2 = a.X;
        switch(d0.d0) {
            case 0: {
                f.b0(object1);
                d0.b0 = this;
                d0.d0 = 1;
                object1 = this.X.h(this.Y, object0, d0);
                if(object1 == object2) {
                    return object2;
                }
                e0 = this;
                break;
            }
            case 1: {
                e0 = d0.b0;
                f.b0(object1);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(!((Boolean)object1).booleanValue()) {
            throw new W3.a(e0);
        }
        return t.a;
    }
}

