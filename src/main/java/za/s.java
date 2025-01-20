package za;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.R9;
import ac.B0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class s extends j implements Function2 {
    public String c0;
    public int d0;
    public final z e0;

    public s(z z0, g g0) {
        this.e0 = z0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((s)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new s(this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        String s;
        Object object1 = a.X;
        Object object2 = t.a;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                z z0 = this.e0;
                q q0 = (q)((B0)z0.g0.X).getValue();
                if(q0 instanceof p) {
                    s = ((p)q0).b;
                }
                else if(q0 instanceof n) {
                    s = ((n)q0).b;
                }
                else {
                    break;
                }
                z0.Z.d("ussd security challenge: ussd code copied to clipboard", null);
                z0.e0.a("copied ussd code to clipboard", new Object[0]);
                this.c0 = s;
                this.d0 = 1;
                object0 = z0.d0.e(this);
                if(object0 == object1) {
                    return object1;
                }
                ((d)object0).Q(s);
                return object2;
            }
            case 1: {
                String s1 = this.c0;
                f.b0(object0);
                ((d)object0).Q(s1);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object2;
    }
}

