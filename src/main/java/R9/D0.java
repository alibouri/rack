package R9;

import E9.a;
import S9.c;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.wave.customer.CustomerApp;
import kotlin.jvm.functions.Function0;
import q9.o0;
import rb.l;

public final class d0 implements Function0 {
    public final int X;
    public final CustomerApp Y;

    public d0(CustomerApp customerApp0, int v) {
        this.X = v;
        this.Y = customerApp0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CustomerApp customerApp0 = this.Y;
        switch(this.X) {
            case 0: {
                return new l(customerApp0, ((sb.l)customerApp0.A0.getValue()), customerApp0.e(), customerApp0.i0);
            }
            case 1: {
                return new sb.l(customerApp0, customerApp0.a());
            }
            case 2: {
                return o0.u(customerApp0);
            }
            case 3: {
                return new c(customerApp0.e(), customerApp0.D0);
            }
            case 4: {
                return (a)customerApp0.d0.getValue();
            }
            case 5: {
                return FirebaseAnalytics.getInstance(customerApp0);
            }
            default: {
                return new N4.l(customerApp0);
            }
        }
    }
}

