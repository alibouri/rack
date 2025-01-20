package J9;

import B9.b;
import B9.c;
import J2.u;
import Nb.j;
import com.sendwave.backend.fragment.CustomerHomeFragment;

public final class k implements c {
    public final l a;

    public k(l l0) {
        this.a = l0;
    }

    @Override  // B9.c
    public final void a(String s) {
        l l0 = this.a;
        if(l0.d().f().size() == 1) {
            ((p)l0.u0.getValue()).getClass();
            p.a();
        }
        u u0 = u.V(l0);
        j.e(u0, "getInstance(context)");
        u0.T("AssociateTokenWithUserWorker_" + s);
    }

    @Override  // B9.c
    public final void b(String s, String s1, CustomerHomeFragment customerHomeFragment0) {
        j.f(s, "loggedInMobile");
    }

    @Override  // B9.c
    public final void c(b b0) {
    }
}

