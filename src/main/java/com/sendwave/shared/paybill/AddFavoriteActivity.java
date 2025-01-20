package com.sendwave.shared.paybill;

import Ab.o;
import R1.d;
import android.os.Bundle;
import i9.O;
import o9.R1;
import p9.e;
import p9.f;
import p9.u;

public final class AddFavoriteActivity extends e {
    public final o F0;
    public final f G0;
    public static final int H0;

    public AddFavoriteActivity() {
        this.F0 = W4.f.A(new R1(3, this));
        this.G0 = new f(this);
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        O o0 = (O)d.a(this.getLayoutInflater(), 0x7F0D00B0, null);  // layout:pay_bill_add_favorite
        o0.r(this);
        o0.u(((u)this.F0.getValue()));
        o0.r.requestFocus();
        this.setContentView(o0.d);
        this.C(((u)this.F0.getValue()).o0);
    }
}

