package com.google.android.gms.internal.gtm;

import E5.k;
import android.os.Looper;

final class zzcu implements Runnable {
    final zzcv zza;

    public zzcu(zzcv zzcv0) {
        this.zza = zzcv0;
        super();
    }

    @Override
    public final void run() {
        if(Looper.myLooper() == Looper.getMainLooper()) {
            k k0 = this.zza.zzb.zzd();
            k0.getClass();
            k0.b.submit(this);
            return;
        }
        zzcv.zzd(this.zza, 0L);
        if(this.zza.zzh()) {
            this.zza.zza();
        }
    }
}

