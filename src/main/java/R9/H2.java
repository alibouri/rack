package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import N4.o;
import W5.f;
import Wb.c;
import Xb.G;
import Xb.Q;
import Y8.N;
import com.wave.customer.QrScanOrCardActivity;
import com.wave.customer.m;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class h2 extends j implements Function2 {
    public int c0;
    public final QrScanOrCardActivity d0;

    public h2(QrScanOrCardActivity qrScanOrCardActivity0, g g0) {
        this.d0 = qrScanOrCardActivity0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((h2)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new h2(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        Object object2 = t.a;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                long v = o.I(1, c.b0);
                this.c0 = 1;
                Object object3 = Q.b(Q.d(v), this);
                if(object3 != object1) {
                    object3 = object2;
                }
                if(object3 == object1) {
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
        o2 o20 = this.d0.J();
        o20.getClass();
        m m0 = new m(o20, "https://qr.wave.com/test", null);
        N.k(o20, o20.c0, true, m0);
        return object2;
    }
}

