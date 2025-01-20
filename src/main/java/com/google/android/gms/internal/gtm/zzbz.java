package com.google.android.gms.internal.gtm;

import android.content.ComponentName;

final class zzbz implements Runnable {
    final ComponentName zza;
    final zzca zzb;

    public zzbz(zzca zzca0, ComponentName componentName0) {
        this.zza = componentName0;
        this.zzb = zzca0;
        super();
    }

    @Override
    public final void run() {
        zzcb.zzb(this.zzb.zza, this.zza);
    }
}

