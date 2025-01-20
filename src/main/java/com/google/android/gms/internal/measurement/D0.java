package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

public final class d0 implements Application.ActivityLifecycleCallbacks {
    public final e0 X;

    public d0(e0 e00) {
        this.X = e00;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        b0 b00 = new b0(this, bundle0, activity0);
        this.X.e(b00);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        m0 m00 = new m0(this, activity0, 4);
        this.X.e(m00);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        m0 m00 = new m0(this, activity0, 3);
        this.X.e(m00);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        m0 m00 = new m0(this, activity0, 0);
        this.X.e(m00);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        Q q0 = new Q();
        b0 b00 = new b0(this, activity0, q0);
        this.X.e(b00);
        Bundle bundle1 = q0.c(50L);
        if(bundle1 != null) {
            bundle0.putAll(bundle1);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        m0 m00 = new m0(this, activity0, 1);
        this.X.e(m00);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
        m0 m00 = new m0(this, activity0, 2);
        this.X.e(m00);
    }
}

