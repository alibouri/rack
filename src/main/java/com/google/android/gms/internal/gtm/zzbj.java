package com.google.android.gms.internal.gtm;

final class zzbj implements Runnable {
    final String zza;
    final Runnable zzb;
    final zzbp zzc;

    public zzbj(zzbp zzbp0, String s, Runnable runnable0) {
        this.zza = s;
        this.zzb = runnable0;
        this.zzc = zzbp0;
        super();
    }

    @Override
    public final void run() {
        zzbp.zzb(this.zzc).zzn(this.zza);
        this.zzb.run();
    }
}

