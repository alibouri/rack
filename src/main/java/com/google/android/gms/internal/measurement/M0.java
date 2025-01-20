package com.google.android.gms.internal.measurement;

import N5.r;
import V5.b;
import android.app.Activity;

public final class m0 extends c0 {
    public final int c0;
    public final Activity d0;
    public final d0 e0;

    public m0(d0 d00, Activity activity0, int v) {
        this.c0 = v;
        switch(v) {
            case 1: {
                this.d0 = activity0;
                this.e0 = d00;
                super(d00.X, true);
                return;
            }
            case 2: {
                this.d0 = activity0;
                this.e0 = d00;
                super(d00.X, true);
                return;
            }
            case 3: {
                this.d0 = activity0;
                this.e0 = d00;
                super(d00.X, true);
                return;
            }
            case 4: {
                this.d0 = activity0;
                this.e0 = d00;
                super(d00.X, true);
                return;
            }
            default: {
                this.d0 = activity0;
                this.e0 = d00;
                super(d00.X, true);
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.c0
    public final void a() {
        switch(this.c0) {
            case 0: {
                P p1 = this.e0.X.g;
                r.j(p1);
                p1.onActivityResumed(new b(this.d0), this.Y);
                return;
            }
            case 1: {
                P p2 = this.e0.X.g;
                r.j(p2);
                p2.onActivityStarted(new b(this.d0), this.Y);
                return;
            }
            case 2: {
                P p3 = this.e0.X.g;
                r.j(p3);
                p3.onActivityStopped(new b(this.d0), this.Y);
                return;
            }
            case 3: {
                P p4 = this.e0.X.g;
                r.j(p4);
                p4.onActivityPaused(new b(this.d0), this.Y);
                return;
            }
            default: {
                P p0 = this.e0.X.g;
                r.j(p0);
                p0.onActivityDestroyed(new b(this.d0), this.Y);
            }
        }
    }
}

