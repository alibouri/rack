package com.wave.customer;

import Aa.n;
import Ab.o;
import Ca.v;
import K9.j;
import N2.l;
import R9.d;
import R9.q;
import W4.f;
import Xb.H;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import dc.e;
import f9.E;
import f9.I;
import q9.k3;
import q9.o0;

public final class BuyAirtimeDialogActivity extends k3 {
    public final e F0;
    public final o G0;
    public final d H0;
    public static final int I0;

    public BuyAirtimeDialogActivity() {
        this.F0 = H.a(dc.o.a);
        this.G0 = f.A(new n(20, this));
        this.H0 = new d(this);
    }

    public final q I() {
        return (q)this.G0.getValue();
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        ca.e e0 = (ca.e)R1.d.a(this.getLayoutInflater(), 0x7F0D002F, null);  // layout:buy_airtime_dialog
        this.setContentView(e0.d);
        e0.v(this.I());
        q q0 = this.I();
        q q1 = this.I();
        I i0 = new I(0x7F0D0030, new j(q0.h0.X, q1.h0.Y.d0, false, false, 12), this);  // layout:buy_airtime_recipient_header
        q q2 = this.I();
        q2.getClass();
        e0.u(new f9.f(new Adapter[]{i0, new E(this, new l(1, q2.q0), null)}));
        e0.r(this);
        View view0 = this.findViewById(0x7F0A0149);  // id:fields
        Nb.j.e(view0, "findViewById(...)");
        View view1 = this.findViewById(0x7F0A0209);  // id:next_button_shadow
        Nb.j.e(view1, "findViewById(...)");
        o0.a0(this, view0, view1);
        this.I().k0.c(this, this.H0);
        this.C(this.I().m0);
        q q3 = this.I();
        v v0 = new v(5, this);
        o0.e(q3.q0, this, v0);
    }
}

