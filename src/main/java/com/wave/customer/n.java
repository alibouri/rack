package com.wave.customer;

import Ab.t;
import Fb.j;
import W5.f;
import Xb.G;
import android.content.Context;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.o0;
import q9.v2;

public final class n extends j implements Function2 {
    public final RecoverPinActivity c0;
    public final StepVerifyAuthCode d0;
    public final RecoverPinResult e0;

    public n(RecoverPinActivity recoverPinActivity0, StepVerifyAuthCode recoverPinWorkflow$StepVerifyAuthCode0, RecoverPinResult recoverPinResult0, g g0) {
        this.c0 = recoverPinActivity0;
        this.d0 = recoverPinWorkflow$StepVerifyAuthCode0;
        this.e0 = recoverPinResult0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((n)this.t(((G)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new n(this.c0, this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        Context context0 = this.c0.getApplicationContext();
        Nb.j.e(context0, "getApplicationContext(...)");
        new v2(context0).c(this.d0.X);
        o0.T(this.c0, this.e0, true);
        return t.a;
    }
}

