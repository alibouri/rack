package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.internal.gtm.zzez;
import com.google.android.gms.internal.gtm.zzfa;

@TargetApi(24)
public final class AnalyticsJobService extends JobService implements zzez {
    public zzfa X;

    public final zzfa a() {
        if(this.X == null) {
            this.X = new zzfa(this);
        }
        return this.X;
    }

    @Override  // com.google.android.gms.internal.gtm.zzez
    public final boolean callServiceStopSelfResult(int v) {
        return this.stopSelfResult(v);
    }

    @Override  // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.a().zze();
    }

    @Override  // android.app.Service
    public final void onDestroy() {
        this.a().zzf();
        super.onDestroy();
    }

    @Override  // android.app.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        this.a().zza(intent0, v, v1);
        return 2;
    }

    @Override  // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters0) {
        this.a().zzi(jobParameters0);
        return true;
    }

    @Override  // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters0) {
        return false;
    }

    @Override  // com.google.android.gms.internal.gtm.zzez
    public final void zza(JobParameters jobParameters0, boolean z) {
        this.jobFinished(jobParameters0, false);
    }
}

