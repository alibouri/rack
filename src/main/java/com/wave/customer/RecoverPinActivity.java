package com.wave.customer;

import Aa.n;
import Ab.o;
import E7.w;
import Nb.j;
import R1.d;
import R9.u2;
import W4.f;
import W9.a;
import android.os.Bundle;
import c2.I;
import ca.U;
import f.g;
import q9.k3;

public final class RecoverPinActivity extends k3 {
    public U F0;
    public final o G0;
    public final g H0;
    public static final int I0;

    public RecoverPinActivity() {
        this.G0 = f.A(new n(28, this));
        this.H0 = (g)this.v(new I(4), new w(6, this));
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.A0 = false;
        u2 u20 = (u2)this.G0.getValue();
        U u0 = (U)d.a(this.getLayoutInflater(), 0x7F0D00CE, null);  // layout:pin_entry
        u0.r(this);
        u0.v(u20.e0);
        u0.u(u20.f0);
        this.F0 = u0;
        this.setContentView(u0.d);
        u2 u21 = (u2)this.G0.getValue();
        u21.b0 = new B9.d(2, this);
        u2 u22 = (u2)this.G0.getValue();
        u22.c0 = new a(2, this);
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

