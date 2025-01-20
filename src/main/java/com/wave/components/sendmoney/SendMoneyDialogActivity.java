package com.wave.components.sendmoney;

import Aa.n;
import Ab.o;
import Ha.Q;
import K9.v;
import K9.w;
import L9.i;
import Nb.j;
import W4.f;
import ac.e0;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import q9.k3;
import q9.o0;
import q9.r1;

public final class SendMoneyDialogActivity extends k3 {
    public final o F0;
    public static final int G0;

    public SendMoneyDialogActivity() {
        this.F0 = f.A(new n(12, this));
    }

    public final d I() {
        return (d)this.F0.getValue();
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        i i0 = (i)R1.d.a(this.getLayoutInflater(), 0x7F0D00F0, null);  // layout:send_money_dialog
        this.setContentView(i0.d);
        i0.r(this);
        i0.u(this.I());
        i0.D.requestFocus();
        d d0 = this.I();
        Integer integer0 = i0.D.getId();
        d0.n0.getClass();
        d0.n0.l(null, integer0);
        TextView textView0 = (TextView)this.findViewById(0x7F0A005C);  // id:agree_transfer_terms
        d d1 = this.I();
        d d2 = this.I();
        o0.e(new e0(d1.m0, d2.v0, w.f0, 0), this, new Q(this, 4, textView0));
        this.C(this.I().D0);
        o0.R(this, new v(this, i0, null));
        View view0 = this.findViewById(0x7F0A01BC);  // id:main_container
        j.e(view0, "findViewById(...)");
        View view1 = this.findViewById(0x7F0A029E);  // id:send_button_shadow
        j.e(view1, "findViewById(...)");
        o0.a0(this, view0, view1);
        r1.b(this).e().d("view amount entry screen", null);
    }
}

