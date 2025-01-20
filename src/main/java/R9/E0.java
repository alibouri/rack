package R9;

import Ab.t;
import B9.b;
import B9.f;
import Nb.j;
import S9.c;
import Xb.G;
import Y8.R6;
import com.sendwave.backend.FragmentHandle;
import com.wave.accounts.AccountEvent.AccountChangeAfterInvoluntaryLogout;
import com.wave.customer.CustomerApp;
import kotlin.jvm.functions.Function1;
import ra.j0;
import ra.t0;
import yc.d;

public final class e0 implements Function1 {
    public final int X;
    public final CustomerApp Y;

    public e0(CustomerApp customerApp0, int v) {
        this.X = v;
        this.Y = customerApp0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        FragmentHandle fragmentHandle0;
        Object object1 = t.a;
        CustomerApp customerApp0 = this.Y;
        switch(this.X) {
            case 0: {
                j.f(((G)object0), "it");
                R6 r60 = customerApp0.a();
                j0.a.getClass();
                j.f(r60, "repo");
                return new t0(r60, ((G)object0));
            }
            case 1: {
                j.f(((String)object0), "mobileBeingLoggedOut");
                boolean z = ((String)object0).equals(customerApp0.d().h());
                String s = f.e(customerApp0.d(), "backend_initiated", ((String)object0), 2);
                if(s == null) {
                    fragmentHandle0 = null;
                }
                else {
                    b b0 = customerApp0.d().j(s);
                    fragmentHandle0 = b0 == null ? null : b0.b();
                }
                if(customerApp0.o() && z && fragmentHandle0 != null) {
                    ((c)customerApp0.E0.getValue()).b(S9.b.Y, ((String)object0), s);
                    d.A(customerApp0, fragmentHandle0, new AccountChangeAfterInvoluntaryLogout(((String)object0), s), 4);
                }
                return object1;
            }
            default: {
                j.f(((String)object0), "mobileBeingLoggedOut");
                f.e(customerApp0.d(), "backend_initiated", ((String)object0), 2);
                return object1;
            }
        }
    }
}

