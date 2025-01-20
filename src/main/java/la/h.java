package la;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.R9;
import Y8.T;
import a5.w;
import ac.B0;
import hd.c;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class h extends j implements Function2 {
    public int c0;
    public final boolean d0;
    public final la.j e0;

    public h(boolean z, la.j j0, g g0) {
        this.d0 = z;
        this.e0 = j0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((h)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new h(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        la.j j0 = this.e0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                if(this.d0) {
                    B0 b00 = j0.f0;
                    while(true) {
                        Object object2 = b00.getValue();
                        d d0 = d.a(((d)object2), null, l.Z, false, 5);
                        c.a.n("AccountLimitsViewModel");
                        c.a.a("update() called with: newState = " + d0, new Object[0]);
                        if(b00.j(object2, d0)) {
                            break;
                        }
                    }
                }
                try {
                    this.c0 = 1;
                    object0 = w.G(j0.Y, this);
                    if(object0 == object1) {
                        return object1;
                    label_16:
                        f.b0(object0);
                    }
                    B0 b01 = j0.f0;
                    do {
                        Object object3 = b01.getValue();
                        d d1 = d.a(((d)object3), ((k)object0), null, false, 2);
                        c.a.n("AccountLimitsViewModel");
                        c.a.a("update() called with: newState = " + d1, new Object[0]);
                    }
                    while(!b01.j(object3, d1));
                    goto label_44;
                }
                catch(T unused_ex) {
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_37;
                }
            }
            case 1: {
                goto label_16;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            B0 b02 = j0.f0;
            while(true) {
                Object object4 = b02.getValue();
                d d2 = d.a(((d)object4), null, null, true, 3);
                c.a.n("AccountLimitsViewModel");
                c.a.a("update() called with: newState = " + d2, new Object[0]);
                if(b02.j(object4, d2)) {
                    break;
                }
            }
        }
        catch(Throwable throwable0) {
            goto label_37;
        }
        do {
            Object object5 = j0.f0.getValue();
            d d3 = h.y(((d)object5));
            c.a.n("AccountLimitsViewModel");
            c.a.a("update() called with: newState = " + d3, new Object[0]);
        }
        while(!j0.f0.j(object5, d3));
        return t.a;
    label_37:
        B0 b03 = j0.f0;
        do {
            Object object6 = b03.getValue();
            d d4 = h.y(((d)object6));
            c.a.n("AccountLimitsViewModel");
            c.a.a("update() called with: newState = " + d4, new Object[0]);
        }
        while(!b03.j(object6, d4));
        throw throwable0;
        do {
        label_44:
            Object object7 = j0.f0.getValue();
            d d5 = h.y(((d)object7));
            c.a.n("AccountLimitsViewModel");
            c.a.a("update() called with: newState = " + d5, new Object[0]);
        }
        while(!j0.f0.j(object7, d5));
        return t.a;
    }

    public static d y(d d0) {
        return d.a(d0, null, l.b0, false, 5);
    }
}

