package com.wave.customer.linkedaccounts;

import Ab.o;
import R1.d;
import R9.F2;
import W4.f;
import android.os.Bundle;
import ca.w;
import hb.h;
import ma.x;
import q9.k3;

public final class LinkedAccountActivationKeyActivity extends k3 {
    public final o F0;
    public static final int G0;

    public LinkedAccountActivationKeyActivity() {
        this.F0 = f.A(new F2(23, this));
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        w w0 = (w)d.a(this.getLayoutInflater(), 0x7F0D0066, null);  // layout:linked_account_activation_key
        this.setContentView(w0.d);
        w0.u(((x)this.F0.getValue()));
        w0.r(this);
        h h0 = this.z();
        if(h0 != null) {
            h0.h0(true);
        }
    }
}

