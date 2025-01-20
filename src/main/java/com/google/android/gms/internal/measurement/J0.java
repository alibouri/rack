package com.google.android.gms.internal.measurement;

import N5.r;

public final class j0 extends c0 {
    public final int c0;
    public final String d0;
    public final e0 e0;

    public j0(e0 e00, String s, int v) {
        this.c0 = v;
        this.d0 = s;
        this.e0 = e00;
        super(e00, true);
    }

    @Override  // com.google.android.gms.internal.measurement.c0
    public final void a() {
        switch(this.c0) {
            case 0: {
                P p1 = this.e0.g;
                r.j(p1);
                p1.setUserId(this.d0, this.X);
                return;
            }
            case 1: {
                P p2 = this.e0.g;
                r.j(p2);
                p2.endAdUnitExposure(this.d0, this.Y);
                return;
            }
            default: {
                P p0 = this.e0.g;
                r.j(p0);
                p0.beginAdUnitExposure(this.d0, this.Y);
            }
        }
    }
}

