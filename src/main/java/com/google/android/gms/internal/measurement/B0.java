package com.google.android.gms.internal.measurement;

import N5.r;
import W5.b;
import W5.e;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import j6.t0;

public final class b0 extends c0 {
    public final int c0;
    public final Object d0;
    public final Object e0;
    public final Object f0;

    public b0(d0 d00, Activity activity0, Q q0) {
        this.c0 = 3;
        this.e0 = activity0;
        this.f0 = q0;
        this.d0 = d00;
        super(d00.X, true);
    }

    public b0(d0 d00, Bundle bundle0, Activity activity0) {
        this.c0 = 2;
        this.f0 = bundle0;
        this.e0 = activity0;
        this.d0 = d00;
        super(d00.X, true);
    }

    public b0(e0 e00, Object object0, Object object1, int v) {
        this.c0 = v;
        this.e0 = object0;
        this.f0 = object1;
        this.d0 = e00;
        super(e00, true);
    }

    @Override  // com.google.android.gms.internal.measurement.c0
    public final void a() {
        Bundle bundle0;
        P p1;
        switch(this.c0) {
            case 0: {
                try {
                    ((e0)this.d0).getClass();
                    r.j(((Context)this.e0));
                    e0 e00 = (e0)this.d0;
                    Context context0 = (Context)this.e0;
                    e00.getClass();
                    try {
                        p1 = T.asInterface(e.c(context0, e.c, "com.google.android.gms.measurement.dynamite").b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    }
                    catch(b b0) {
                        e00.f(b0, true, false);
                        p1 = null;
                    }
                    e00.g = p1;
                    if(((e0)this.d0).g == null) {
                        Log.w(((e0)this.d0).a, "Failed to connect to measurement client.");
                        return;
                    }
                    int v = e.a(((Context)this.e0), "com.google.android.gms.measurement.dynamite");
                    int v1 = e.d(((Context)this.e0), "com.google.android.gms.measurement.dynamite", false);
                    String s = t0.b(((Context)this.e0));
                    P p2 = ((e0)this.d0).g;
                    r.j(p2);
                    p2.initialize(new V5.b(((Context)this.e0)), new zzdw(106000L, ((long)Math.max(v, v1)), v1 < v, null, null, null, ((Bundle)this.f0), s), this.X);
                    return;
                }
                catch(Exception exception0) {
                }
                ((e0)this.d0).f(exception0, true, false);
                return;
            }
            case 1: {
                P p3 = ((e0)this.d0).g;
                r.j(p3);
                p3.getMaxUserProperties(((String)this.e0), ((Q)this.f0));
                return;
            }
            case 2: {
                if(((Bundle)this.f0) == null) {
                    bundle0 = null;
                }
                else {
                    bundle0 = new Bundle();
                    if(((Bundle)this.f0).containsKey("com.google.app_measurement.screen_service")) {
                        Object object0 = ((Bundle)this.f0).get("com.google.app_measurement.screen_service");
                        if(object0 instanceof Bundle) {
                            bundle0.putBundle("com.google.app_measurement.screen_service", ((Bundle)object0));
                        }
                    }
                }
                P p4 = ((d0)this.d0).X.g;
                r.j(p4);
                p4.onActivityCreated(new V5.b(((Activity)this.e0)), bundle0, this.Y);
                return;
            }
            default: {
                P p0 = ((d0)this.d0).X.g;
                r.j(p0);
                p0.onActivitySaveInstanceState(new V5.b(((Activity)this.e0)), ((Q)this.f0), this.Y);
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.c0
    public void b() {
        if(this.c0 != 1) {
            return;
        }
        ((Q)this.f0).f(null);
    }
}

