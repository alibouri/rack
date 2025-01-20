package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.gtm.zzez;
import com.google.android.gms.internal.gtm.zzfa;

public final class AnalyticsService extends Service implements zzez {
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
    public final IBinder onBind(Intent intent0) {
        this.a();
        return null;
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

    @Override  // com.google.android.gms.internal.gtm.zzez
    public final void zza(JobParameters jobParameters0, boolean z) {
        throw new UnsupportedOperationException();
    }
}

