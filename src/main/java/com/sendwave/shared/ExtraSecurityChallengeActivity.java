package com.sendwave.shared;

import Ab.o;
import E7.w;
import J1.E;
import Nb.j;
import R1.d;
import W4.f;
import Xb.J;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.lifecycle.LifecycleOwnerKt;
import c2.I;
import c2.N;
import c2.a;
import f.g;
import hb.h;
import i9.A;
import o9.B;
import o9.X;
import o9.y;
import o9.z;
import q9.k3;

public class ExtraSecurityChallengeActivity extends k3 {
    public final o F0;
    public final o G0;
    public boolean H0;
    public final g I0;
    public static final int J0;

    public ExtraSecurityChallengeActivity() {
        this.F0 = f.A(new y(this, 0));
        this.G0 = f.A(new y(this, 1));
        this.I0 = (g)this.v(new I(4), new w(24, this));
    }

    public final X I() {
        return (X)this.G0.getValue();
    }

    @Override  // q9.z3
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        R2.f.z(this.getWindow(), false);
        A a0 = (A)d.a(this.getLayoutInflater(), 0x7F0D0057, null);  // layout:extra_security_challenge_base
        this.setContentView(a0.d);
        a0.u(this.I());
        a0.u(this.I());
        X x0 = this.I();
        z z0 = new z(this);
        x0.g0.c(this, z0);
        this.C(this.I().t0);
        h h0 = this.z();
        if(h0 != null) {
            h0.h0(true);
        }
        m7.o o0 = new m7.o(11);
        E.k(a0.q, o0);
        N n0 = this.w();
        n0.getClass();
        a a1 = new a(n0);
        a1.h(0x7F0A015B, new ExplanationScreenFragment(), null, 1);  // id:fragment_container
        a1.e();
        J.q(LifecycleOwnerKt.a(this), null, null, new B(this, null), 3);
    }

    @Override  // q9.z3
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        j.f(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

