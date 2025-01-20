package com.wave.customer.paymentcards.settings;

import Aa.x;
import Nb.j;
import Xb.J;
import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import q9.k3;
import q9.o0;
import ta.b;
import ta.c;
import ta.f;
import ta.h;

public final class PaymentCardSettingsActivity extends k3 {
    public h F0;

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        h h0 = (h)new ViewModelProvider(this, new c(this)).a(h.class);
        this.F0 = h0;
        b b0 = new b(this);  // initializer: Lq9/j3;-><init>(Lq9/k3;)V
        h0.e0.c(this, b0);
        o0.U(this, new c0.b(0xD86009F8, new x(26, this), true));
    }

    @Override  // q9.k3
    public final void onStart() {
        super.onStart();
        h h0 = this.F0;
        if(h0 != null) {
            J.q(ViewModelKt.a(h0), null, null, new f(h0, null), 3);
            return;
        }
        j.p("vm");
        throw null;
    }
}

