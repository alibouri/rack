package com.google.android.gms.internal.gtm;

final class zzei implements zzcq {
    private final zzbu zza;
    private final zzej zzb;

    public zzei(zzbu zzbu0) {
        this.zza = zzbu0;
        this.zzb = new zzej();
    }

    @Override  // com.google.android.gms.internal.gtm.zzcq
    public final zzcp zza() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.gtm.zzcq
    public final void zzb(String s, String s1) {
    }

    @Override  // com.google.android.gms.internal.gtm.zzcq
    public final void zzc(String s, boolean z) {
        if("ga_dryRun".equals(s)) {
            this.zzb.zze = z;
            return;
        }
        this.zza.zzm().zzR("Bool xml configuration name not recognized", s);
    }

    @Override  // com.google.android.gms.internal.gtm.zzcq
    public final void zzd(String s, int v) {
        if("ga_dispatchPeriod".equals(s)) {
            this.zzb.zzd = v;
            return;
        }
        this.zza.zzm().zzR("Int xml configuration name not recognized", s);
    }

    @Override  // com.google.android.gms.internal.gtm.zzcq
    public final void zze(String s, String s1) {
        if("ga_appName".equals(s)) {
            this.zzb.zza = s1;
            return;
        }
        if("ga_appVersion".equals(s)) {
            this.zzb.zzb = s1;
            return;
        }
        if("ga_logLevel".equals(s)) {
            this.zzb.zzc = s1;
            return;
        }
        this.zza.zzm().zzR("String xml configuration name not recognized", s);
    }
}

