package com.sendwave.shared;

import R1.d;
import android.os.Parcelable;
import androidx.lifecycle.ViewModelProvider;
import f9.f;
import i9.c0;
import o9.Y0;
import o9.g0;
import o9.t1;
import o9.w1;
import q9.o0;
import q9.r1;

public final class PayBillWithInvoicesDialogActivity extends g0 {
    @Override  // o9.g0
    public final Y0 I() {
        Parcelable parcelable0 = this.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable0 == null) {
            throw new Exception(PayBillWithInvoicesDialogActivity.class.getName() + " invoked with no params");
        }
        return (Y0)new ViewModelProvider(this, new t1(o0.r(((PayBillDialogParams)parcelable0).Z, this), ((PayBillDialogParams)parcelable0), r1.b(this).j(), this)).a(w1.class);
    }

    @Override  // o9.g0
    public final void J(Y0 y00, f f0) {
        w1 w10 = null;
        c0 c00 = (c0)d.a(this.getLayoutInflater(), 0x7F0D00BB, null);  // layout:pay_bill_with_invoices_dialog
        c00.q.q.setItemAnimator(null);
        this.setContentView(c00.d);
        if(y00 instanceof w1) {
            w10 = (w1)y00;
        }
        c00.v(w10);
        c00.u(f0);
        c00.r(this);
    }
}

