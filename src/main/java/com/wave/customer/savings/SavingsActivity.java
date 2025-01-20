package com.wave.customer.savings;

import Aa.n;
import Aa.u0;
import Aa.u;
import Ab.o;
import W4.f;
import a5.c;
import android.content.IntentFilter;
import android.os.Bundle;
import c0.b;
import q9.k3;
import q9.o0;

public final class SavingsActivity extends k3 {
    public final o F0;
    public final c G0;
    public static final int H0;

    public SavingsActivity() {
        this.F0 = f.A(new n(0, this));
        this.G0 = new c(1, this);
    }

    public static final u0 I(SavingsActivity savingsActivity0) {
        return (u0)savingsActivity0.F0.getValue();
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        o0.U(this, new b(0x3CBFC11D, new u(this), true));
    }

    @Override  // c2.x
    public final void onPause() {
        i2.b.a(this).d(this.G0);
        super.onPause();
    }

    @Override  // q9.z3
    public final void onResume() {
        super.onResume();
        i2.b b0 = i2.b.a(this);
        IntentFilter intentFilter0 = new IntentFilter("com.wave.components.NOTIFICATION_RECEIVED");
        b0.b(this.G0, intentFilter0);
    }
}

