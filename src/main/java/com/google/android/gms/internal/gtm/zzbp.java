package com.google.android.gms.internal.gtm;

import E5.k;
import N5.r;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public final class zzbp extends zzbr {
    private final zzcj zza;

    public zzbp(zzbu zzbu0, zzbv zzbv0) {
        super(zzbu0);
        r.j(zzbv0);
        this.zza = new zzcj(zzbu0, zzbv0);
    }

    public static zzcj zzb(zzbp zzbp0) {
        return zzbp0.zza;
    }

    public final void zzc() {
        this.zzV();
        Context context0 = this.zzo();
        if(zzev.zzb(context0) && zzfa.zzh(context0)) {
            Intent intent0 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent0.setComponent(new ComponentName(context0, "com.google.android.gms.analytics.AnalyticsService"));
            context0.startService(intent0);
            return;
        }
        this.zze(null);
    }

    @Override  // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
        this.zza.zzW();
    }

    public final void zze(zzcy zzcy0) {
        this.zzV();
        k k0 = this.zzq();
        zzbn zzbn0 = new zzbn(this, zzcy0);
        k0.getClass();
        k0.b.submit(zzbn0);
    }

    public final void zzf(String s, Runnable runnable0) {
        r.g(s, "campaign param can\'t be empty");
        k k0 = this.zzq();
        zzbj zzbj0 = new zzbj(this, s, runnable0);
        k0.getClass();
        k0.b.submit(zzbj0);
    }

    public final void zzi() {
        k.a();
        this.zza.zzl();
    }

    public final void zzj() {
        k.a();
        this.zza.zzm();
    }

    public final void zzk() {
        this.zzV();
        k.a();
        k.a();
        this.zza.zzV();
        this.zza.zzN("Service disconnected");
    }

    public final void zzm() {
        this.zza.zzZ();
    }
}

