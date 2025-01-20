package com.google.android.gms.internal.gtm;

import E5.k;

final class zzbx extends zzcv {
    final zzcb zza;

    public zzbx(zzcb zzcb0, zzbu zzbu0) {
        this.zza = zzcb0;
        super(zzbu0);
    }

    @Override  // com.google.android.gms.internal.gtm.zzcv
    public final void zza() {
        k.a();
        zzcb zzcb0 = this.zza;
        if(!zzcb0.zzg()) {
            return;
        }
        zzcb0.zzN("Inactivity, disconnecting from device AnalyticsService");
        zzcb0.zzc();
    }
}

