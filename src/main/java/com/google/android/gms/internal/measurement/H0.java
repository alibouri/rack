package com.google.android.gms.internal.measurement;

import N5.r;
import V5.b;
import android.os.Bundle;

public final class h0 extends c0 {
    public final int c0;
    public final String d0;
    public final String e0;
    public final boolean f0;
    public final e0 g0;
    public final Object h0;

    public h0(e0 e00, String s, String s1, Object object0, boolean z, int v) {
        this.c0 = v;
        this.d0 = s;
        this.e0 = s1;
        this.h0 = object0;
        this.f0 = z;
        this.g0 = e00;
        super(e00, true);
    }

    public h0(e0 e00, String s, String s1, boolean z, Q q0) {
        this.c0 = 1;
        this.d0 = s;
        this.e0 = s1;
        this.f0 = z;
        this.h0 = q0;
        this.g0 = e00;
        super(e00, true);
    }

    @Override  // com.google.android.gms.internal.measurement.c0
    public final void a() {
        switch(this.c0) {
            case 0: {
                P p1 = this.g0.g;
                r.j(p1);
                b b0 = new b(((String)this.h0));
                p1.setUserProperty(this.d0, this.e0, b0, this.f0, this.X);
                return;
            }
            case 1: {
                P p2 = this.g0.g;
                r.j(p2);
                p2.getUserProperties(this.d0, this.e0, this.f0, ((Q)this.h0));
                return;
            }
            default: {
                P p0 = this.g0.g;
                r.j(p0);
                p0.logEvent(this.d0, this.e0, ((Bundle)this.h0), this.f0, true, this.X);
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.c0
    public void b() {
        if(this.c0 != 1) {
            return;
        }
        ((Q)this.h0).f(null);
    }
}

