package com.sendwave.shared;

import Bb.p;
import R1.d;
import R9.Q1;
import android.os.Parcelable;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import f9.E;
import f9.I;
import f9.f;
import i9.W;
import java.util.List;
import lb.j;
import o9.Y0;
import o9.a1;
import o9.g0;
import o9.g1;
import q9.o0;
import q9.r1;

public final class PayBillInvoiceDialogActivity extends g0 {
    public static final int H0;

    @Override  // o9.g0
    public final Y0 I() {
        r1.b(this).e().d("view bill pay screen", null);
        Parcelable parcelable0 = this.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable0 == null) {
            throw new Exception(PayBillInvoiceDialogActivity.class.getName() + " invoked with no params");
        }
        return (Y0)new ViewModelProvider(this, new a1(o0.r(((PayBillDialogParams)parcelable0).Z, this), ((PayBillDialogParams)parcelable0), r1.b(this).j(), this)).a(g1.class);
    }

    @Override  // o9.g0
    public final void J(Y0 y00, f f0) {
        Parcelable parcelable0 = this.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable0 == null) {
            throw new Exception(PayBillInvoiceDialogActivity.class.getName() + " invoked with no params");
        }
        String s = null;
        W w0 = (W)d.a(this.getLayoutInflater(), 0x7F0D00B5, null);  // layout:pay_bill_invoice_dialog
        this.setContentView(w0.d);
        w0.q.q.setItemAnimator(null);
        w0.u(new f(new Adapter[]{new I(0x7F0D00B4, ((g1)y00), this), new E(this, new Q1(((g1)y00).P0, 4), ((g1)y00)), new I(0x7F0D00CC, y00.A0, this)}));  // layout:pay_bill_dialog_header
        w0.r(this);
        w0.w(((g1)y00));
        List list0 = ((PayBillDialogParams)parcelable0).c0;
        if(list0 != null) {
            s = p.v0(list0, " – ", null, null, new j(4), 30);
        }
        w0.v(s);
    }
}

