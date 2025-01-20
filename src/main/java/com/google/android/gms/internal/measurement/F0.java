package com.google.android.gms.internal.measurement;

import N5.r;
import V5.b;
import android.os.Bundle;

public final class f0 extends c0 {
    public final int c0;
    public final e0 d0;
    public final Object e0;

    public f0(e0 e00, Bundle bundle0) {
        this.c0 = 0;
        this.e0 = bundle0;
        this.d0 = e00;
        super(e00, true);
    }

    public f0(e0 e00, Exception exception0) {
        this.c0 = 1;
        this.e0 = exception0;
        this.d0 = e00;
        super(e00, false);
    }

    @Override  // com.google.android.gms.internal.measurement.c0
    public final void a() {
        if(this.c0 != 0) {
            P p0 = this.d0.g;
            r.j(p0);
            p0.logHealthData(5, "Error with data collection. Data lost.", new b(((Exception)this.e0)), new b(null), new b(null));
            return;
        }
        P p1 = this.d0.g;
        r.j(p1);
        p1.setConditionalUserProperty(((Bundle)this.e0), this.X);
    }
}

