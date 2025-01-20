package com.google.android.gms.internal.gtm;

final class zzbt implements Thread.UncaughtExceptionHandler {
    final zzbu zza;

    public zzbt(zzbu zzbu0) {
        this.zza = zzbu0;
        super();
    }

    @Override
    public final void uncaughtException(Thread thread0, Throwable throwable0) {
        zzeo zzeo0 = this.zza.zzn();
        if(zzeo0 != null) {
            zzeo0.zzJ("Job execution failed", throwable0);
        }
    }
}

