package com.google.android.gms.internal.measurement;

import N5.r;

public final class l0 extends c0 {
    public final int c0;
    public final Q d0;
    public final e0 e0;

    public l0(e0 e00, Q q0, int v) {
        this.c0 = v;
        this.d0 = q0;
        this.e0 = e00;
        super(e00, true);
    }

    @Override  // com.google.android.gms.internal.measurement.c0
    public final void a() {
        switch(this.c0) {
            case 0: {
                P p1 = this.e0.g;
                r.j(p1);
                p1.getCachedAppInstanceId(this.d0);
                return;
            }
            case 1: {
                P p2 = this.e0.g;
                r.j(p2);
                p2.getGmpAppId(this.d0);
                return;
            }
            case 2: {
                P p3 = this.e0.g;
                r.j(p3);
                p3.getCurrentScreenName(this.d0);
                return;
            }
            case 3: {
                P p4 = this.e0.g;
                r.j(p4);
                p4.generateEventId(this.d0);
                return;
            }
            default: {
                P p0 = this.e0.g;
                r.j(p0);
                p0.getCurrentScreenClass(this.d0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.c0
    public final void b() {
        switch(this.c0) {
            case 0: {
                this.d0.f(null);
                return;
            }
            case 1: {
                this.d0.f(null);
                return;
            }
            case 2: {
                this.d0.f(null);
                return;
            }
            case 3: {
                this.d0.f(null);
                return;
            }
            default: {
                this.d0.f(null);
            }
        }
    }
}

