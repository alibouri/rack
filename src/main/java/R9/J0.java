package R9;

import B9.b;
import B9.c;
import J9.p;
import Ja.g;
import Nb.j;
import Xb.J;
import a5.w;
import a9.H1;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import com.sendwave.backend.type.PartnerOrg;
import com.wave.customer.CustomerApp;
import q9.s0;
import q9.s1;
import q9.t0;
import q9.x1;

public final class j0 implements c {
    public final CustomerApp a;

    public j0(CustomerApp customerApp0) {
        this.a = customerApp0;
    }

    @Override  // B9.c
    public final void a(String s) {
        this.a.getClass();
        J.u(new g0(this.a, s, null));
    }

    @Override  // B9.c
    public final void b(String s, String s1, CustomerHomeFragment customerHomeFragment0) {
        j.f(s, "loggedInMobile");
        CustomerApp customerApp0 = this.a;
        customerApp0.getClass();
        H1 h10 = customerHomeFragment0.e;
        if(h10.g) {
            b b0 = customerApp0.d().a(s);
            j.c(b0);
            g g0 = w.X(b0);
            s1 s10 = g0.a.d();
            PartnerOrg partnerOrg0 = h10.e;
            x1 x10 = g.b;
            if(partnerOrg0 == null) {
                s10.a(x10);
            }
            else {
                s10.b(x10, partnerOrg0.a());
            }
            s10.apply();
            g0.b(h10.f);
        }
        ((p)customerApp0.u0.getValue()).b.remove(s);
        t0 t00 = (t0)customerApp0.g0.getValue();
        boolean z = t00.d.g(0xFF) == 0;
        t00.a.getClass();
        t00.a.b.i(s0.f[1], z);
        boolean z1 = t00.c();
        t00.a.a.i(s0.f[0], z1);
        new Na.p(customerApp0).a(true);
    }

    @Override  // B9.c
    public final void c(b b0) {
    }
}

