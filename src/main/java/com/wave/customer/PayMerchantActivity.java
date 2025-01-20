package com.wave.customer;

import Aa.n;
import Ab.o;
import R1.d;
import R9.k1;
import W4.f;
import android.os.Bundle;
import ca.L;
import hb.h;
import q9.k3;
import q9.r1;

public final class PayMerchantActivity extends k3 {
    public final o F0;
    public static final int G0;

    public PayMerchantActivity() {
        this.F0 = f.A(new n(26, this));
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        r1.b(this).e().d("view merchant pay screen", null);
        L l0 = (L)d.a(this.getLayoutInflater(), 0x7F0D00BC, null);  // layout:pay_merchant
        l0.u(((k1)this.F0.getValue()));
        l0.r(this);
        this.setContentView(l0.d);
        this.C(((k1)this.F0.getValue()).h0);
        h h0 = this.z();
        if(h0 != null) {
            h0.h0(true);
        }
    }
}

