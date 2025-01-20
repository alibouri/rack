package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import Ma.p;
import Ma.w;
import W5.f;
import Xb.G;
import com.wave.customer.CustomerApp;
import io.sentry.hints.i;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q2.z;

public final class f0 extends j implements Function2 {
    public int c0;
    public final CustomerApp d0;
    public final String e0;

    public f0(CustomerApp customerApp0, String s, g g0) {
        this.d0 = customerApp0;
        this.e0 = s;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((f0)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new f0(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        Object object2 = t.a;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                w w0 = i.t(this.d0, this.e0).s();
                this.c0 = 1;
                w0.getClass();
                p p0 = new p(w0, null, 0);
                Object object3 = z.a(w0.a, p0, this);
                if(object3 != object1) {
                    object3 = object2;
                }
                return object3 == object1 ? object1 : object2;
            }
            case 1: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

