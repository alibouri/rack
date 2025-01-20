package com.google.android.gms.common.api.internal;

import M5.g;
import N5.r;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;

public class LifecycleCallback {
    public final Object X;

    public LifecycleCallback(LifecycleFragment lifecycleFragment0) {
        this.X = lifecycleFragment0;
    }

    public final Activity a() {
        Activity activity0 = ((LifecycleFragment)this.X).f();
        r.j(activity0);
        return activity0;
    }

    public void b(int v, int v1, Intent intent0) {
    }

    public void c(Bundle bundle0) {
    }

    public void d() {
    }

    public void e(Bundle bundle0) {
    }

    public void f() {
    }

    public void g() {
    }

    @Keep
    private static LifecycleFragment getChimeraLifecycleFragmentImpl(g g0) {
        throw new IllegalStateException("Method not available in SDK.");
    }
}

