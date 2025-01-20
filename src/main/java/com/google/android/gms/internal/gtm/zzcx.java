package com.google.android.gms.internal.gtm;

import N5.r;
import S5.b;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import android.os.SystemClock;

public final class zzcx extends zzbr {
    private boolean zza;
    private boolean zzb;
    private final AlarmManager zzc;
    private Integer zzd;

    public zzcx(zzbu zzbu0) {
        super(zzbu0);
        this.zzc = (AlarmManager)this.zzo().getSystemService("alarm");
    }

    public final void zza() {
        try {
            this.zzb = false;
            PendingIntent pendingIntent0 = this.zzg();
            this.zzc.cancel(pendingIntent0);
        }
        catch(NullPointerException unused_ex) {
        }
        if(Build.VERSION.SDK_INT >= 24) {
            int v = this.zzf();
            this.zzO("Cancelling job. JobID", v);
            ((JobScheduler)this.zzo().getSystemService("jobscheduler")).cancel(v);
        }
    }

    public final void zzb() {
        this.zzV();
        r.l("Receiver not registered", this.zza);
        long v = zzcs.zzd();
        if(v > 0L) {
            this.zza();
            ((b)this.zzC()).getClass();
            long v1 = SystemClock.elapsedRealtime();
            this.zzb = true;
            ((Boolean)zzeh.zzF.zzb()).getClass();
            if(Build.VERSION.SDK_INT >= 24) {
                this.zzN("Scheduling upload with JobScheduler");
                Context context0 = this.zzo();
                ComponentName componentName0 = new ComponentName(context0, "com.google.android.gms.analytics.AnalyticsJobService");
                int v2 = this.zzf();
                PersistableBundle persistableBundle0 = new PersistableBundle();
                persistableBundle0.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                JobInfo jobInfo0 = new JobInfo.Builder(v2, componentName0).setMinimumLatency(v).setOverrideDeadline(v + v).setExtras(persistableBundle0).build();
                this.zzO("Scheduling job. JobID", v2);
                zzft.zza(context0, jobInfo0, "com.google.android.gms", "DispatchAlarm");
                return;
            }
            this.zzN("Scheduling upload with AlarmManager");
            PendingIntent pendingIntent0 = this.zzg();
            this.zzc.setInexactRepeating(2, v1 + v, v, pendingIntent0);
        }
    }

    public final boolean zzc() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
        try {
            this.zza();
            if(zzcs.zzd() > 0L) {
                Context context0 = this.zzo();
                ActivityInfo activityInfo0 = context0.getPackageManager().getReceiverInfo(new ComponentName(context0, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if(activityInfo0 != null && activityInfo0.enabled) {
                    this.zzN("Receiver registered for local dispatch.");
                    this.zza = true;
                }
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
    }

    public final boolean zze() {
        return this.zzb;
    }

    private final int zzf() {
        if(this.zzd == null) {
            this.zzd = "analyticscom.wave.personal".hashCode();
        }
        return (int)this.zzd;
    }

    private final PendingIntent zzg() {
        Context context0 = this.zzo();
        return PendingIntent.getBroadcast(context0, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(context0, "com.google.android.gms.analytics.AnalyticsReceiver")), zzfs.zza);
    }
}

