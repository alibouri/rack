package com.wave.customer.overdraft;

import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import c.q;
import q9.k3;
import q9.o0;
import q9.r1;
import qa.a;
import qa.b;
import qa.c;
import qa.k;

public final class OverdraftActivity extends k3 {
    public k F0;

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        q.a(this);
        k k0 = (k)new ViewModelProvider(this, new b(this, new E9.b(r1.b(this).e(), "overdraft", "overdraft main"))).a(k.class);
        this.F0 = k0;
        a a0 = new a(this);  // initializer: Lq9/j3;-><init>(Lq9/k3;)V
        k0.c0.c(this, a0);
        o0.U(this, new c0.b(0xEFB71231, new c(this), true));
    }
}

