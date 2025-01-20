package R9;

import Nb.j;
import Xb.A0;
import Y8.N;
import ac.h0;
import androidx.lifecycle.ViewModel;
import f9.K;
import q9.r1;

public final class a0 implements K {
    public final int a;
    public final String b;
    public final ViewModel c;

    public a0(c0 c00) {
        this.a = 0;
        j.f(c00, "vm");
        super();
        this.c = c00;
        this.b = r1.d(0x7F120342, new Object[0]);  // string:pin_enter_new "Create a new secret code"
        c00.b0.d("view create new secret code screen", null);
    }

    public a0(u2 u20) {
        this.a = 1;
        j.f(u20, "vm");
        super();
        this.c = u20;
        this.b = r1.d(0x7F120342, new Object[0]);  // string:pin_enter_new "Create a new secret code"
    }

    @Override  // f9.K
    public final String a() {
        return this.b;
    }

    @Override  // f9.K
    public final A0 b(String s, h0 h00) {
        if(this.a != 0) {
            j.f(s, "pin");
            j.f(h00, "loading");
            r2 r20 = new r2(((u2)this.c), s, this, null);
            return N.k(((u2)this.c), ((u2)this.c).d0, true, r20);
        }
        j.f(s, "pin");
        j.f(h00, "loading");
        Z z0 = new Z(((c0)this.c), s, null);
        return N.k(((c0)this.c), ((c0)this.c).c0, true, z0);
    }
}

