package com.google.android.gms.internal.gtm;

import android.util.DisplayMetrics;
import java.util.Locale;

public final class zzcw extends zzbr {
    public zzcw(zzbu zzbu0) {
        super(zzbu0);
    }

    public final zzaz zza() {
        this.zzV();
        DisplayMetrics displayMetrics0 = this.zzq().a.getResources().getDisplayMetrics();
        zzaz zzaz0 = new zzaz();
        zzaz0.zze(zzff.zzd(Locale.getDefault()));
        zzaz0.zza = displayMetrics0.widthPixels;
        zzaz0.zzb = displayMetrics0.heightPixels;
        return zzaz0;
    }

    @Override  // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
    }
}

