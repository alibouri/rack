package com.wave.customer.risk.ussdsecuritychallenge;

import Ab.o;
import W4.f;
import android.os.Bundle;
import c0.b;
import c2.I;
import f.g;
import hd.a;
import hd.c;
import q9.c3;
import q9.k3;
import q9.o0;
import va.i;
import za.e;
import za.z;

public final class UssdSecurityChallengeActivity extends k3 {
    public final o F0;
    public final o G0;
    public final o H0;
    public final g I0;
    public final a J0;
    public static final int K0;

    public UssdSecurityChallengeActivity() {
        this.F0 = f.A(new e(this, 0));
        this.G0 = f.A(new e(this, 1));
        this.H0 = f.A(new e(this, 2));
        this.I0 = (g)this.v(new I(3), new c3(8, this));
        c.a.n("UssdSecurityChallengeActivity");
        this.J0 = c.a;
    }

    public final z I() {
        return (z)this.H0.getValue();
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        z z0 = this.I();
        za.f f0 = new za.f(this);
        z0.d0.c(this, f0);
        o0.U(this, new b(0xC0ABBD9D, new i(3, this), true));
    }
}

