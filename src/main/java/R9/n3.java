package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Y8.R9;
import com.wave.customer.UpgradeToPinResult;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class n3 extends j implements Function2 {
    public int c0;
    public final o3 d0;
    public final String e0;

    public n3(o3 o30, String s, g g0) {
        this.d0 = o30;
        this.e0 = s;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((n3)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new n3(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                object0 = this.d0.Y.e(this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((d)object0).Y(new UpgradeToPinResult(this.e0));
        return t.a;
    }
}

