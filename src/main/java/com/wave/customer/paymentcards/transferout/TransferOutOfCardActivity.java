package com.wave.customer.paymentcards.transferout;

import Aa.x;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import c0.b;
import q9.k3;
import q9.o0;
import ua.e;
import ua.f;
import ua.k;

public final class TransferOutOfCardActivity extends k3 {
    public k F0;

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        k k0 = (k)new ViewModelProvider(this, new f(this)).a(k.class);
        this.F0 = k0;
        e e0 = new e(this);  // initializer: Lq9/j3;-><init>(Lq9/k3;)V
        k0.d0.c(this, e0);
        o0.U(this, new b(0xE623306E, new x(27, this), true));
    }
}

