package com.wave.customer.devicemanagement;

import Aa.x;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import c0.b;
import ea.c;
import ea.k;
import q9.k3;
import q9.o0;
import q9.r1;

public final class DeviceManagementActivity extends k3 {
    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        k k0 = (k)new ViewModelProvider(this, new c(r1.b(this).a(), this)).a(k.class);
        k0.b0.c(this, this.E0);
        this.C(k0.c0);
        o0.U(this, new b(0xB35F141, new x(13, k0), true));
    }
}

