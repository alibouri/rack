package com.wave.customer;

import Aa.n;
import Ab.o;
import R1.d;
import R9.P0;
import W4.f;
import android.os.Bundle;
import ca.u;
import q9.k3;
import q9.r1;

public final class EnterNameActivity extends k3 {
    public final o F0;
    public static final int G0;

    public EnterNameActivity() {
        this.F0 = f.A(new n(25, this));
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        P0 p00 = (P0)this.F0.getValue();
        u u0 = (u)d.a(this.getLayoutInflater(), 0x7F0D0053, null);  // layout:enter_name
        this.setContentView(u0.d);
        u0.u(p00);
        u0.r(this);
        r1.b(this).e().d("view name entry screen", null);
    }
}

