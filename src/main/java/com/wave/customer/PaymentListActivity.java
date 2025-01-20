package com.wave.customer;

import Aa.n;
import Ab.o;
import Ca.v;
import Nb.j;
import R1.d;
import R9.X1;
import R9.n1;
import R9.o1;
import W4.f;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import ca.Q;
import f9.D;
import f9.E;
import f9.H;
import f9.I;
import f9.J;
import q9.k3;
import q9.o0;

public final class PaymentListActivity extends k3 {
    public final o F0;
    public final n1 G0;
    public static final int H0;

    public PaymentListActivity() {
        this.F0 = f.A(new n(27, this));
        this.G0 = new n1(this);
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        X1 x10 = (X1)this.F0.getValue();
        Q q0 = (Q)d.a(this.getLayoutInflater(), 0x7F0D00C0, null);  // layout:payment_list
        q0.v(x10);
        q0.r(this);
        I i0 = N4.o.t(this);
        J j0 = new J(0x7F0D00BE, new E(this, x10.v0, null), x10.t0, this);  // layout:payment_categories
        H h0 = new H(0x7F0D00AE, x10.f0, this);  // layout:offline_indicator
        D d0 = new D(this, x10.n0, x10);
        j.f(x10.o0, "model");
        q0.u(new f9.f(new Adapter[]{i0, j0, h0, d0, new H(0x7F0D0065, x10.o0, this), new H(0x7F0D00C1, x10.p0, this)}));  // layout:item_loading_only_spinner
        this.setContentView(q0.d);
        q0.s.setItemAnimator(null);
        o1 o10 = new o1(this, q0.s);
        q0.s.j(o10);
        o0.e(((X1)this.F0.getValue()).s0, this, new v(6, q0));
    }
}

