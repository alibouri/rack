package com.google.android.gms.internal.measurement;

import N5.r;
import V5.b;
import android.app.Activity;
import android.os.Bundle;

public final class i0 extends c0 {
    public final int c0;
    public final String d0;
    public final String e0;
    public final e0 f0;
    public final Object g0;

    public i0(e0 e00, Activity activity0, String s, String s1) {
        this.c0 = 2;
        this.g0 = activity0;
        this.d0 = s;
        this.e0 = s1;
        this.f0 = e00;
        super(e00, true);
    }

    public i0(e0 e00, String s, String s1, Object object0, int v) {
        this.c0 = v;
        this.d0 = s;
        this.e0 = s1;
        this.g0 = object0;
        this.f0 = e00;
        super(e00, true);
    }

    @Override  // com.google.android.gms.internal.measurement.c0
    public final void a() {
        switch(this.c0) {
            case 0: {
                P p1 = this.f0.g;
                r.j(p1);
                p1.getConditionalUserProperties(this.d0, this.e0, ((Q)this.g0));
                return;
            }
            case 1: {
                P p2 = this.f0.g;
                r.j(p2);
                p2.clearConditionalUserProperty(this.d0, this.e0, ((Bundle)this.g0));
                return;
            }
            default: {
                P p0 = this.f0.g;
                r.j(p0);
                p0.setCurrentScreen(new b(((Activity)this.g0)), this.d0, this.e0, this.X);
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.c0
    public void b() {
        if(this.c0 != 0) {
            return;
        }
        ((Q)this.g0).f(null);
    }
}

