package com.sendwave.shared;

import R1.d;
import Y8.R6;
import android.os.Parcelable;
import androidx.lifecycle.ViewModelProvider;
import f9.f;
import i9.U;
import o9.Y0;
import o9.c0;
import o9.g0;
import o9.l0;
import q9.n;
import q9.o0;
import q9.r1;

public final class PayBillDialogActivity extends g0 {
    @Override  // o9.g0
    public final Y0 I() {
        r1.b(this).e().d("view bill pay screen", null);
        Parcelable parcelable0 = this.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable0 == null) {
            throw new Exception(PayBillDialogActivity.class.getName() + " invoked with no params");
        }
        R6 r60 = o0.r(((PayBillDialogParams)parcelable0).Z, this);
        n n0 = r1.b(this).j();
        r1.b(this);
        return (Y0)new ViewModelProvider(this, new c0(r60, ((PayBillDialogParams)parcelable0), n0, this)).a(l0.class);
    }

    @Override  // o9.g0
    public final void J(Y0 y00, f f0) {
        l0 l00 = null;
        U u0 = (U)d.a(this.getLayoutInflater(), 0x7F0D00B2, null);  // layout:pay_bill_dialog
        u0.q.q.setItemAnimator(null);
        this.setContentView(u0.d);
        if(y00 instanceof l0) {
            l00 = (l0)y00;
        }
        u0.v(l00);
        u0.u(f0);
        u0.r(this);
    }
}

