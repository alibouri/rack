package com.google.android.gms.internal.gtm;

import N5.r;
import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import n6.a;

public final class zzfa {
    private static Boolean zza;
    private final Handler zzb;
    private final Context zzc;

    public zzfa(Context context0) {
        r.j(context0);
        this.zzc = context0;
        this.zzb = new zzfy();
    }

    public final int zza(Intent intent0, int v, int v1) {
        try {
            Object object0 = zzev.zza;
            synchronized(object0) {
                a a0 = zzev.zzb;
                if(a0 != null && a0.b()) {
                    a0.c();
                }
            }
        }
        catch(SecurityException unused_ex) {
        }
        zzeo zzeo0 = zzbu.zzg(this.zzc).zzm();
        if(intent0 == null) {
            zzeo0.zzQ("AnalyticsService started with null intent");
            return 2;
        }
        String s = intent0.getAction();
        zzeo0.zzP("Local AnalyticsService called. startId, action", v1, s);
        if("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(s)) {
            this.zzg(() -> if(((zzez)this.zzc).callServiceStopSelfResult(v1)) {
                zzeo0.zzN("Local AnalyticsService processed last dispatch request");
            });
        }
        return 2;
    }

    public static Handler zzb(zzfa zzfa0) {
        return zzfa0.zzb;
    }

    public final void zze() {
        zzbu.zzg(this.zzc).zzm().zzN("Local AnalyticsService is starting up");
    }

    public final void zzf() {
        zzbu.zzg(this.zzc).zzm().zzN("Local AnalyticsService is shutting down");
    }

    public final void zzg(Runnable runnable0) {
        zzbu.zzg(this.zzc).zzf().zze(new zzey(this, runnable0));
    }

    public static boolean zzh(Context context0) {
        boolean z;
        r.j(context0);
        Boolean boolean0 = zzfa.zza;
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        try {
            z = false;
            ServiceInfo serviceInfo0 = context0.getPackageManager().getServiceInfo(new ComponentName(context0, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if(serviceInfo0 != null && serviceInfo0.enabled) {
                z = true;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        zzfa.zza = Boolean.valueOf(z);
        return z;
    }

    @TargetApi(24)
    public final boolean zzi(JobParameters jobParameters0) {
        zzeo zzeo0 = zzbu.zzg(this.zzc).zzm();
        String s = jobParameters0.getExtras().getString("action");
        zzeo0.zzO("Local AnalyticsJobService called. action", s);
        if("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(s)) {
            this.zzg(() -> {
                zzeo0.zzN("AnalyticsJobService processed last dispatch request");
                ((zzez)this.zzc).zza(jobParameters0, false);
            });
        }
        return true;
    }
}

