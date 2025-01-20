package com.wave.customer.linkedaccounts;

import Ab.o;
import R1.d;
import R9.F2;
import W4.f;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import ca.B;
import f9.E;
import hb.h;
import ma.M;
import q9.k3;

public final class LinkedAccountSelectActivity extends k3 {
    public final o F0;
    public static final int G0;

    public LinkedAccountSelectActivity() {
        this.F0 = f.A(new F2(25, this));
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        B b0 = (B)d.a(this.getLayoutInflater(), 0x7F0D0069, null);  // layout:linked_account_select
        b0.v(((M)this.F0.getValue()));
        b0.r(this);
        b0.u(new f9.f(new Adapter[]{N4.o.t(this), new E(this, ((M)this.F0.getValue()).b0, ((M)this.F0.getValue()))}));
        this.setContentView(b0.d);
        h h0 = this.z();
        if(h0 != null) {
            h0.h0(true);
        }
    }
}

