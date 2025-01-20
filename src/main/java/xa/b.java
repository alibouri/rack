package xa;

import Ab.t;
import Bb.p;
import Bb.q;
import Bb.r;
import Eb.a;
import Fb.j;
import I2.v;
import I2.x;
import W5.f;
import Xb.G;
import Y8.G6;
import Y8.H6;
import Y8.R6;
import Y8.g1;
import Y8.i1;
import Y8.p7;
import Y8.y6;
import com.wave.customer.risk.SuspiciousPackageCheckWorker;
import java.util.ArrayList;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.o0;

public final class b extends j implements Function2 {
    public String c0;
    public int d0;
    public final SuspiciousPackageCheckWorker e0;

    public b(SuspiciousPackageCheckWorker suspiciousPackageCheckWorker0, g g0) {
        this.e0 = suspiciousPackageCheckWorker0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((b)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new b(this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        String s;
        Object object1 = a.X;
        SuspiciousPackageCheckWorker suspiciousPackageCheckWorker0 = this.e0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                s = suspiciousPackageCheckWorker0.b.b.b("packageName");
                if(s == null) {
                    return new v();
                }
                R6 r60 = suspiciousPackageCheckWorker0.g.a();
                i1 i10 = new i1();  // initializer: Ljava/lang/Object;-><init>()V
                this.c0 = s;
                this.d0 = 1;
                object0 = R6.d(r60, i10, H6.b0, null, this, 4);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                s = this.c0;
                f.b0(object0);
                break;
            }
            case 2: {
                f.b0(object0);
                return new x();
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Iterable iterable0 = ((g1)((y6)object0).b).a.c.d.h.c.l;
        ArrayList arrayList0 = new ArrayList(r.b0(iterable0));
        for(Object object2: iterable0) {
            arrayList0.add(new String(o0.h(0, ((String)object2)), Vb.a.a));
        }
        if(p.U0(arrayList0).contains(s)) {
            byte[] arr_b = s.getBytes(Vb.a.a);
            Nb.j.e(arr_b, "getBytes(...)");
            p7 p70 = new p7(q.K(o0.k(0, arr_b)));
            R6 r61 = suspiciousPackageCheckWorker0.g.a();
            this.c0 = null;
            this.d0 = 2;
            if(r61.f(p70, G6.X, this) == object1) {
                return object1;
            }
        }
        return new x();
    }
}

