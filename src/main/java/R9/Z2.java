package R9;

import Nb.j;
import Xb.A0;
import Y8.N;
import ac.h0;
import f9.K;
import q9.r1;

public final class z2 implements K {
    public final E2 a;
    public final String b;
    public final String c;
    public final String d;

    public z2(E2 e20, String s, String s1) {
        j.f(e20, "vm");
        j.f(s, "verifiedPin");
        j.f(s1, "newPin");
        super();
        this.a = e20;
        this.b = s;
        this.c = s1;
        this.d = r1.d(0x7F120341, new Object[0]);  // string:pin_confirm_new "Confirm your new secret code"
    }

    @Override  // f9.K
    public final String a() {
        return this.d;
    }

    @Override  // f9.K
    public final A0 b(String s, h0 h00) {
        j.f(s, "pin");
        j.f(h00, "loading");
        y2 y20 = new y2(this, s, this.a, h00, null);
        return N.k(this.a, this.a.c0, true, y20);
    }
}

