package com.google.android.gms.internal.gtm;

import E5.k;
import N5.r;
import R5.a;
import android.content.ComponentName;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;

public final class zzcb extends zzbr {
    private final zzca zza;
    private final zzcv zzb;
    private final zzfb zzc;
    private zzel zzd;

    public zzcb(zzbu zzbu0) {
        super(zzbu0);
        this.zzc = new zzfb(zzbu0.zzr());
        this.zza = new zzca(this);
        this.zzb = new zzbx(this, zzbu0);
    }

    public static void zzb(zzcb zzcb0, ComponentName componentName0) {
        k.a();
        if(zzcb0.zzd != null) {
            zzcb0.zzd = null;
            zzcb0.zzO("Disconnected from device AnalyticsService", componentName0);
            zzcb0.zzs().zzk();
        }
    }

    public final void zzc() {
        k.a();
        this.zzV();
        try {
            a.b().c(this.zzo(), this.zza);
        }
        catch(IllegalStateException | IllegalArgumentException unused_ex) {
        }
        if(this.zzd != null) {
            this.zzd = null;
            this.zzs().zzk();
        }
    }

    @Override  // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
    }

    public final boolean zzf() {
        k.a();
        this.zzV();
        if(this.zzd != null) {
            return true;
        }
        zzel zzel0 = this.zza.zza();
        if(zzel0 != null) {
            this.zzd = zzel0;
            this.zzj();
            return true;
        }
        return false;
    }

    public final boolean zzg() {
        k.a();
        this.zzV();
        return this.zzd != null;
    }

    public final boolean zzh(zzek zzek0) {
        r.j(zzek0);
        k.a();
        this.zzV();
        zzel zzel0 = this.zzd;
        if(zzel0 == null) {
            return false;
        }
        String s = zzek0.zzh() ? zzcs.zzi() : zzcs.zzk();
        List list0 = Collections.emptyList();
        try {
            zzel0.zzf(zzek0.zzg(), zzek0.zzd(), s, list0);
            this.zzj();
            return true;
        }
        catch(RemoteException unused_ex) {
            this.zzN("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    public static void zzi(zzcb zzcb0, zzel zzel0) {
        k.a();
        zzcb0.zzd = zzel0;
        zzcb0.zzj();
        zzcb0.zzs().zzj();
    }

    private final void zzj() {
        this.zzc.zzb();
        long v = (long)(((Long)zzeh.zzA.zzb()));
        this.zzb.zzg(v);
    }
}

