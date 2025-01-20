package com.wave.customer.linkedaccounts;

import Ab.o;
import Nb.j;
import R1.d;
import R9.F2;
import W4.f;
import android.os.Bundle;
import ca.y;
import hb.h;
import ma.F;
import q9.k3;

public final class LinkedAccountCreationOtpActivity extends k3 {
    public y F0;
    public final o G0;
    public static final int H0;

    public LinkedAccountCreationOtpActivity() {
        this.G0 = f.A(new F2(24, this));
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        o o0 = this.G0;
        ((F)o0.getValue()).Z.c(this, this.E0);
        y y0 = (y)d.a(this.getLayoutInflater(), 0x7F0D0067, null);  // layout:linked_account_creation_otp
        j.f(y0, "<set-?>");
        this.F0 = y0;
        y0.u(((F)o0.getValue()));
        y y1 = this.F0;
        if(y1 != null) {
            y1.r(this);
            y y2 = this.F0;
            if(y2 != null) {
                this.setContentView(y2.d);
                this.C(((F)o0.getValue()).g0);
                h h0 = this.z();
                if(h0 != null) {
                    h0.h0(true);
                }
                return;
            }
            j.p("binding");
            throw null;
        }
        j.p("binding");
        throw null;
    }

    @Override  // q9.z3
    public final void onResume() {
        super.onResume();
        y y0 = this.F0;
        if(y0 != null) {
            y0.r.requestFocus();
            return;
        }
        j.p("binding");
        throw null;
    }
}

