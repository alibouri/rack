package com.google.android.gms.internal.gtm;

final class zzby implements Runnable {
    final zzca zza;
    final zzel zzb;

    public zzby(zzca zzca0, zzel zzel0) {
        this.zzb = zzel0;
        this.zza = zzca0;
        super();
    }

    @Override
    public final void run() {
        if(!this.zza.zza.zzg()) {
            this.zza.zza.zzE("Connected to service after a timeout");
            zzcb.zzi(this.zza.zza, this.zzb);
        }
    }
}

