package com.google.android.gms.internal.gtm;

final class zzfj extends zzfq {
    private String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    public final zzfq zza(String s) {
        this.zza = "";
        return this;
    }

    public final zzfq zzb(boolean z) {
        this.zzb = 1;
        return this;
    }

    public final zzfr zzc() {
        if(this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
            return new zzfl(this.zza, false, this.zzc, null, null, this.zzd, null);
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.zza == null) {
            stringBuilder0.append(" fileOwner");
        }
        if(this.zzb == 0) {
            stringBuilder0.append(" hasDifferentDmaOwner");
        }
        if(this.zzc == 0) {
            stringBuilder0.append(" fileChecks");
        }
        if(this.zzd == 0) {
            stringBuilder0.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final zzfq zzd(int v) {
        this.zzc = v;
        return this;
    }

    public final zzfq zze(int v) {
        this.zzd = 1;
        return this;
    }
}

