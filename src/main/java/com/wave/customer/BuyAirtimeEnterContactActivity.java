package com.wave.customer;

import Aa.n;
import Ab.o;
import K9.i;
import L9.a;
import R1.d;
import W4.f;
import android.os.Bundle;
import q9.k3;
import q9.r1;

public final class BuyAirtimeEnterContactActivity extends k3 {
    public final o F0;
    public static final int G0;

    public BuyAirtimeEnterContactActivity() {
        this.F0 = f.A(new n(21, this));
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        i i0 = (i)this.F0.getValue();
        a a0 = (a)d.a(this.getLayoutInflater(), 0x7F0D0054, null);  // layout:enter_recipient_details
        this.setContentView(a0.d);
        i0.p(a0);
        a0.u(i0);
        a0.r(this);
        r1.b(this).e().d("view buy for new number screen", null);
    }
}

