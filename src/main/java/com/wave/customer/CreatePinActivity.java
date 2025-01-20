package com.wave.customer;

import Aa.n;
import Ab.o;
import B9.d;
import Nb.j;
import R9.c0;
import W4.f;
import android.os.Bundle;
import ca.U;
import f.g;
import q9.k3;
import q9.o0;

public final class CreatePinActivity extends k3 {
    public U F0;
    public final o G0;
    public final g H0;
    public final b I0;
    public static final int J0;

    public CreatePinActivity() {
        this.G0 = f.A(new n(24, this));
        this.H0 = o0.Q(this, new d(1, this));
        this.I0 = new b(this);
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        c0 c00 = (c0)this.G0.getValue();
        U u0 = (U)R1.d.a(this.getLayoutInflater(), 0x7F0D00CE, null);  // layout:pin_entry
        this.setContentView(u0.d);
        u0.r(this);
        u0.v(c00.d0);
        u0.u(f9.d.a);
        this.F0 = u0;
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

