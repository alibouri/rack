package com.wave.customer;

import Ab.o;
import E7.l;
import J1.E;
import Nb.j;
import R1.d;
import R9.F2;
import R9.y3;
import W4.f;
import android.os.Bundle;
import ca.U;
import q9.k3;
import q9.r1;

public final class VerifyPinActivity extends k3 {
    public U F0;
    public final o G0;
    public static final int H0;

    public VerifyPinActivity() {
        this.G0 = f.A(new F2(2, this));
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.A0 = false;
        R2.f.z(this.getWindow(), false);
        y3 y30 = (y3)this.G0.getValue();
        U u0 = (U)d.a(this.getLayoutInflater(), 0x7F0D00CE, null);  // layout:pin_entry
        u0.v(y30.j0);
        u0.u(y30.k0);
        u0.w(y30);
        u0.r(this);
        this.F0 = u0;
        this.setContentView(u0.d);
        U u1 = this.F0;
        if(u1 != null) {
            l l0 = new l(28);
            E.k(u1.v, l0);
            r1.b(this).e().d("view enter secret code screen", null);
            return;
        }
        j.p("binding");
        throw null;
    }

    @Override  // q9.z3
    public final void onResume() {
        super.onResume();
        U u0 = this.F0;
        if(u0 != null) {
            u0.q.requestFocus();
            return;
        }
        j.p("binding");
        throw null;
    }
}

