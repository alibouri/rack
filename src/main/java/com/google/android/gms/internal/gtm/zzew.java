package com.google.android.gms.internal.gtm;

public final class zzew implements Runnable {
    public final zzfa zza;
    public final int zzb;
    public final zzeo zzc;

    public zzew(zzfa zzfa0, int v, zzeo zzeo0) {
        this.zza = zzfa0;
        this.zzb = v;
        this.zzc = zzeo0;
    }

    @Override
    public final void run() {
        this.zza.zzc(this.zzb, this.zzc);
    }
}

