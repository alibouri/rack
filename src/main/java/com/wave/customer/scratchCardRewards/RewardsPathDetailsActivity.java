package com.wave.customer.scratchCardRewards;

import Ea.z;
import android.os.Bundle;
import android.os.Parcelable;
import c0.b;
import q9.k3;
import q9.o0;

public final class RewardsPathDetailsActivity extends k3 {
    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Parcelable parcelable0 = this.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable0 == null) {
            throw new Exception(RewardsPathDetailsActivity.class.getName() + " invoked with no params");
        }
        o0.U(this, new b(0x8DF5AB20, new z(((RewardsPathDetailsParams)parcelable0), this, 1), true));
    }
}

