package com.wave.customer.paymentcards;

import Aa.x;
import Nb.j;
import Xb.J;
import a5.c;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import c0.b;
import q9.k3;
import q9.o0;
import ra.L0;
import ra.L;
import ra.e0;
import ra.f0;
import ra.w0;
import ra.x0;

public final class PaymentCardsActivity extends k3 {
    public L0 F0;
    public final c G0;

    public PaymentCardsActivity() {
        this.G0 = new c(13, this);
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.getWindow().addFlags(0x2000);
        Parcelable parcelable0 = this.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable0 == null) {
            throw new Exception(PaymentCardsActivity.class.getName() + " invoked with no params");
        }
        L0 l00 = (L0)new ViewModelProvider(this, new f0(this, ((PaymentCardsParams)parcelable0))).a(L0.class);
        this.F0 = l00;
        e0 e00 = new e0(this);
        l00.j0.c(this, e00);
        o0.U(this, new b(0xB03C513D, new x(24, this), true));
    }

    @Override  // c2.x
    public final void onPause() {
        super.onPause();
        i2.b.a(this).d(this.G0);
    }

    @Override  // q9.z3
    public final void onResume() {
        super.onResume();
        i2.b b0 = i2.b.a(this);
        IntentFilter intentFilter0 = new IntentFilter("com.wave.components.NOTIFICATION_RECEIVED");
        b0.b(this.G0, intentFilter0);
    }

    @Override  // q9.k3
    public final void onStart() {
        super.onStart();
        L0 l00 = this.F0;
        if(l00 != null) {
            J.q(ViewModelKt.a(l00), null, null, new x0(l00, null), 3);
            w0 w00 = new w0(l00, null, 5);
            l00.q(L.X, w00);
            return;
        }
        j.p("vm");
        throw null;
    }
}

