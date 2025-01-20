package com.google.android.gms.internal.gtm;

final class zzbn implements Runnable {
    final zzcy zza;
    final zzbp zzb;

    public zzbn(zzbp zzbp0, zzcy zzcy0) {
        this.zza = zzcy0;
        this.zzb = zzbp0;
        super();
    }

    @Override
    public final void run() {
        zzbp.zzb(this.zzb).zzf(this.zza);
    }
}

