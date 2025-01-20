package com.wave.customer.scratchCardRewards;

import Aa.t;
import Ea.k;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.ViewModelProvider;
import c0.b;
import q9.k3;
import q9.o0;

public final class RedeemScratchCardActivity extends k3 {
    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Parcelable parcelable0 = this.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable0 == null) {
            throw new Exception(RedeemScratchCardActivity.class.getName() + " invoked with no params");
        }
        g g0 = (g)new ViewModelProvider(this, new k(this, ((RedeemScratchCardParams)parcelable0))).a(g.class);
        g0.c0.c(this, this.E0);
        o0.U(this, new b(1165802126, new t(g0, 3, this), true));
    }
}

