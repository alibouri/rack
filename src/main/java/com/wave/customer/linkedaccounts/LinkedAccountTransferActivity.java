package com.wave.customer.linkedaccounts;

import Ab.o;
import R1.d;
import R9.F2;
import W4.f;
import android.os.Bundle;
import ca.F;
import hb.h;
import ma.q0;
import q9.k3;

public final class LinkedAccountTransferActivity extends k3 {
    public final o F0;
    public static final int G0;

    public LinkedAccountTransferActivity() {
        this.F0 = f.A(new F2(26, this));
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        F f0 = (F)d.a(this.getLayoutInflater(), 0x7F0D006B, null);  // layout:linked_account_transfer
        f0.u(((q0)this.F0.getValue()));
        f0.r(this);
        this.setContentView(f0.d);
        this.C(((q0)this.F0.getValue()).f0);
        h h0 = this.z();
        if(h0 != null) {
            h0.h0(true);
        }
    }
}

