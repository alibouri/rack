package com.google.android.gms.internal.gtm;

public abstract class zzbr extends zzbq {
    private boolean zza;

    public zzbr(zzbu zzbu0) {
        super(zzbu0);
    }

    public final void zzV() {
        if(!this.zzX()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzW() {
        this.zzd();
        this.zza = true;
    }

    public final boolean zzX() {
        return this.zza;
    }

    public abstract void zzd();
}

