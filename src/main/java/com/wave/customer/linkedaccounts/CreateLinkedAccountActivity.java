package com.wave.customer.linkedaccounts;

import Ab.o;
import Ca.v;
import R1.d;
import R9.F2;
import W4.f;
import Xb.H;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import ca.q;
import dc.e;
import f9.E;
import f9.I;
import hb.h;
import ma.b;
import ma.p;
import q9.k3;
import q9.o0;

public final class CreateLinkedAccountActivity extends k3 {
    public final o F0;
    public final e G0;
    public static final int H0;

    public CreateLinkedAccountActivity() {
        this.F0 = f.A(new F2(22, this));
        this.G0 = H.a(dc.o.a);
    }

    public final p I() {
        return (p)this.F0.getValue();
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.I().b0.c(this, this.E0);
        this.getWindow().addFlags(0x2000);
        b b0 = new b(this.I().i0, 0);
        q q0 = (q)d.a(this.getLayoutInflater(), 0x7F0D0039, null);  // layout:create_linked_account
        this.setContentView(q0.d);
        q0.v(this.I());
        q0.r(this);
        q0.u(new f9.f(new Adapter[]{new I(0x7F0D003B, this.I(), this), new E(this, b0, null), new I(0x7F0D003C, this.I(), this)}));  // layout:create_linked_account_header
        this.C(this.I().e0);
        h h0 = this.z();
        if(h0 != null) {
            h0.h0(true);
        }
        p p0 = this.I();
        v v0 = new v(17, this);
        o0.e(p0.i0, this, v0);
    }
}

