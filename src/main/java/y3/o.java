package Y3;

import Ab.t;
import Nb.j;
import Xb.G;
import Y8.R6;
import com.wave.customer.paymentcards.settings.PaymentCardSettingsActivity;
import kotlin.jvm.functions.Function1;
import pc.e;
import q9.r1;
import ra.j0;
import ra.t0;
import sb.g;
import z0.r;

public final class o implements Function1 {
    public final int X;
    public Object Y;

    public o() {
        this.X = 3;
        super();
    }

    public o(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        Object object1 = t.a;
        switch(this.X) {
            case 0: {
                Throwable throwable0 = (Throwable)object0;
                ((e)this.Y).cancel();
                return object1;
            }
            case 1: {
                Throwable throwable1 = (Throwable)object0;
                Process process0 = ((g)this.Y).f;
                if(process0 != null) {
                    process0.destroy();
                    return object1;
                }
                j.p("process");
                throw null;
            }
            case 2: {
                j.f(((G)object0), "scope");
                PaymentCardSettingsActivity paymentCardSettingsActivity0 = (PaymentCardSettingsActivity)this.Y;
                paymentCardSettingsActivity0.getClass();
                R6 r60 = r1.b(paymentCardSettingsActivity0).a();
                j0.a.getClass();
                j.f(r60, "repo");
                return new t0(r60, ((G)object0));
            }
            default: {
                boolean z = ((Boolean)object0).booleanValue();
                r r0 = (r)this.Y;
                if(r0 != null) {
                    r0.Z = z;
                }
                return object1;
            }
        }
    }
}

