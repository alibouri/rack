package com.wave.customer;

import Aa.n;
import Ab.o;
import Nb.j;
import R1.d;
import R9.E2;
import W4.f;
import android.os.Bundle;
import ca.U;
import q9.k3;

public final class ResetPinActivity extends k3 {
    public U F0;
    public final o G0;
    public static final int H0;

    public ResetPinActivity() {
        this.G0 = f.A(new n(29, this));
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        E2 e20 = (E2)this.G0.getValue();
        U u0 = (U)d.a(this.getLayoutInflater(), 0x7F0D00CE, null);  // layout:pin_entry
        u0.r(this);
        u0.v(e20.d0);
        u0.u(f9.d.a);
        this.F0 = u0;
        this.setContentView(u0.d);
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

