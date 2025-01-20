package com.google.android.gms.internal.gtm;

final class zzey implements zzcy {
    final Runnable zza;
    final zzfa zzb;

    public zzey(zzfa zzfa0, Runnable runnable0) {
        this.zza = runnable0;
        this.zzb = zzfa0;
        super();
    }

    @Override  // com.google.android.gms.internal.gtm.zzcy
    public final void zza(Throwable throwable0) {
        zzfa.zzb(this.zzb).post(this.zza);
    }
}

