package com.wave.customer.limits;

import Aa.t;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.ViewModelProvider;
import c0.b;
import la.a;
import la.j;
import q9.C3;
import q9.k3;
import q9.o0;
import q9.r1;

public final class AccountLimitsActivity extends k3 {
    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Parcelable parcelable0 = this.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable0 == null) {
            throw new Exception(AccountLimitsActivity.class.getName() + " invoked with no params");
        }
        C3 c30 = r1.b(this);
        j j0 = (j)new ViewModelProvider(this, new a(c30.a(), ((AccountLimitsParams)parcelable0), c30)).a(j.class);
        j0.c0.c(this, this.E0);
        this.C(j0.e0);
        o0.U(this, new b(1107414750, new t(j0, 12, ((AccountLimitsParams)parcelable0)), true));
    }
}

