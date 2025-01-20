package com.wave.customer.savings.lock;

import Aa.x;
import Ca.e;
import Ca.f;
import Ca.z;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import c0.b;
import q9.k3;
import q9.o0;

public final class LockVaultActivity extends k3 {
    public z F0;

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        z z0 = (z)new ViewModelProvider(this, new f(this)).a(z.class);
        this.F0 = z0;
        e e0 = new e(this);  // initializer: Lq9/j3;-><init>(Lq9/k3;)V
        z0.f0.c(this, e0);
        o0.U(this, new b(0x29079B02, new x(2, this), true));
    }
}

