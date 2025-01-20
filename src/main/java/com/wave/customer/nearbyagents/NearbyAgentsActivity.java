package com.wave.customer.nearbyagents;

import Aa.x;
import Nb.j;
import R9.Z0;
import Xb.q;
import Y8.R6;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import c2.I;
import f.g;
import g3.b;
import m7.o;
import pa.D;
import pa.k;
import pa.l;
import q9.k3;
import q9.o0;

public final class NearbyAgentsActivity extends k3 {
    public final g F0;
    public q G0;
    public final g H0;
    public final g I0;
    public q J0;
    public final g K0;
    public D L0;
    public static final int M0;

    public NearbyAgentsActivity() {
        this.F0 = (g)this.v(new I(2), new pa.g(this, 0));
        this.H0 = (g)this.v(new I(5), new pa.g(this, 1));
        this.I0 = (g)this.v(new I(4), new pa.g(this, 2));
        this.K0 = (g)this.v(new I(4), new o(13));
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.getWindow().setStatusBarColor(this.getColor(0x7F06018F));  // color:white
        R6 r60 = Z0.a(this).a();
        j.f(r60, "repository");
        D d0 = (D)new ViewModelProvider(this, new l(new b(13, r60), this)).a(D.class);
        k k0 = new k(this);
        d0.b0.c(this, k0);
        this.L0 = d0;
        o0.U(this, new c0.b(0x59FA450D, new x(22, this), true));
    }

    @Override  // q9.k3
    public final void onStart() {
        super.onStart();
        D d0 = this.L0;
        if(d0 != null) {
            d0.q(false);
            return;
        }
        j.p("viewModel");
        throw null;
    }
}

