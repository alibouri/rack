package com.wave.customer.deviceapproval;

import Aa.x;
import Ab.o;
import R9.F2;
import W4.f;
import Y8.N;
import android.os.Bundle;
import c0.b;
import da.k;
import da.q;
import q9.k3;
import q9.o0;
import q9.r1;

public final class DeviceApprovalRequiredActivity extends k3 {
    public final o F0;
    public static final int G0;

    public DeviceApprovalRequiredActivity() {
        this.F0 = f.A(new F2(15, this));
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        o0.U(this, new b(-1700672799, new x(12, this), true));
        r1.b(this).e().d("view device approval required screen", null);
        q q0 = (q)this.F0.getValue();
        q0.getClass();
        k k0 = new k(q0, null);
        N.k(q0, q0.d0, true, k0);
    }
}

