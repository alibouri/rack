package com.wave.customer.scratchCardRewards;

import Aa.H;
import C3.i;
import Ea.O0;
import Ea.a0;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import c.q;
import c0.b;
import q9.k3;
import q9.o0;

public final class ScratchCardRewardsActivity extends k3 {
    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        q.a(this);
        super.onCreate(bundle0);
        i i0 = new i(this);
        O0 o00 = (O0)new ViewModelProvider(this, new a0(this, i0)).a(O0.class);
        o00.e0.c(this, this.E0);
        o0.U(this, new b(0x42317E00, new H(o00, this, i0, 1), true));
    }
}

