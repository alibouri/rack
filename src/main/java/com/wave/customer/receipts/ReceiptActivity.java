package com.wave.customer.receipts;

import Ab.o;
import E9.a;
import W4.f;
import android.os.Bundle;
import c0.b;
import q9.k3;
import q9.o0;
import va.e;
import va.x;

public final class ReceiptActivity extends k3 {
    public final o F0;
    public final o G0;
    public static final int H0;

    public ReceiptActivity() {
        this.F0 = f.A(new e(this, 0));
        this.G0 = f.A(new e(this, 1));
    }

    public final x I() {
        return (x)this.F0.getValue();
    }

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        x x0 = this.I();
        this.X.a(x0.m0);
        R2.f.z(this.getWindow(), false);
        o0.U(this, new b(-1020695062, new Aa.x(29, this), true));
    }

    @Override  // q9.k3
    public final void onStart() {
        super.onStart();
        ((a)this.G0.getValue()).d("click receipt button", null);
    }
}

