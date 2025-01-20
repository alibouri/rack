package com.google.android.gms.measurement;

import G1.n;
import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import i.J;
import j6.L;
import j6.b1;
import j6.d0;
import j6.k1;
import j6.z0;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements b1 {
    public J X;

    @Override  // j6.b1
    public final void a(Intent intent0) {
    }

    @Override  // j6.b1
    public final boolean b(int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // j6.b1
    public final void c(JobParameters jobParameters0) {
        this.jobFinished(jobParameters0, false);
    }

    public final J d() {
        if(this.X == null) {
            this.X = new J(9, this);
        }
        return this.X;
    }

    @Override  // android.app.Service
    public final void onCreate() {
        super.onCreate();
        d0 d00 = d0.d(((Service)this.d().Y), null, null);
        d0.h(d00.g0);
        d00.g0.m0.d("Local AppMeasurementService is starting up");
    }

    @Override  // android.app.Service
    public final void onDestroy() {
        d0 d00 = d0.d(((Service)this.d().Y), null, null);
        d0.h(d00.g0);
        d00.g0.m0.d("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override  // android.app.Service
    public final void onRebind(Intent intent0) {
        J j0 = this.d();
        if(intent0 == null) {
            j0.u().e0.d("onRebind called with null intent");
            return;
        }
        j0.getClass();
        String s = intent0.getAction();
        j0.u().m0.b(s, "onRebind called. action");
    }

    @Override  // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters0) {
        J j0 = this.d();
        L l0 = d0.d(((Service)j0.Y), null, null).g0;
        d0.h(l0);
        String s = jobParameters0.getExtras().getString("action");
        l0.m0.b(s, "Local AppMeasurementJobService called. action");
        if("com.google.android.gms.measurement.UPLOAD".equals(s)) {
            n n0 = new n(12);
            n0.Y = j0;
            n0.Z = l0;
            n0.b0 = jobParameters0;
            k1 k10 = k1.i(((Service)j0.Y));
            k10.c().z(new z0(k10, 8, n0));
        }
        return true;
    }

    @Override  // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters0) {
        return false;
    }

    @Override  // android.app.Service
    public final boolean onUnbind(Intent intent0) {
        J j0 = this.d();
        if(intent0 == null) {
            j0.u().e0.d("onUnbind called with null intent");
            return true;
        }
        j0.getClass();
        String s = intent0.getAction();
        j0.u().m0.b(s, "onUnbind called for intent. action");
        return true;
    }
}

