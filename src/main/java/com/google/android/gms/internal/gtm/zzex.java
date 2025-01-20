package com.google.android.gms.internal.gtm;

import android.app.job.JobParameters;

public final class zzex implements Runnable {
    public final zzfa zza;
    public final zzeo zzb;
    public final JobParameters zzc;

    public zzex(zzfa zzfa0, zzeo zzeo0, JobParameters jobParameters0) {
        this.zza = zzfa0;
        this.zzb = zzeo0;
        this.zzc = jobParameters0;
    }

    @Override
    public final void run() {
        this.zza.zzd(this.zzb, this.zzc);
    }
}

