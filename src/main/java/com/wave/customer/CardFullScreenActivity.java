package com.wave.customer;

import Aa.n;
import Ab.o;
import R1.d;
import R9.S;
import W4.f;
import android.os.Bundle;
import ca.k;
import q9.k3;

public final class CardFullScreenActivity extends k3 {
    public final o F0;
    public static final int G0;

    public CardFullScreenActivity() {
        this.F0 = f.A(new n(22, this));
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.getWindow().getDecorView().setSystemUiVisibility(0x1706);
        S s0 = (S)this.F0.getValue();
        k k0 = (k)d.a(this.getLayoutInflater(), 0x7F0D0032, null);  // layout:card_full_screen
        this.setContentView(k0.d);
        k0.u(s0);
        k0.r(this);
        this.getWindow().addFlags(0x2000);
    }

    @Override  // i.j
    public final void onDestroy() {
        super.onDestroy();
        this.setRequestedOrientation(1);
    }
}

