package com.google.android.gms.internal.gtm;

import N5.r;
import S5.a;
import S5.b;
import android.os.SystemClock;

final class zzfb {
    private final a zza;
    private long zzb;

    public zzfb(a a0) {
        r.j(a0);
        this.zza = a0;
    }

    public zzfb(a a0, long v) {
        r.j(a0);
        this.zza = a0;
        this.zzb = v;
    }

    public final void zza() {
        this.zzb = 0L;
    }

    public final void zzb() {
        ((b)this.zza).getClass();
        this.zzb = SystemClock.elapsedRealtime();
    }

    public final boolean zzc(long v) {
        if(Long.compare(this.zzb, 0L) == 0) {
            return true;
        }
        ((b)this.zza).getClass();
        return SystemClock.elapsedRealtime() - this.zzb > v;
    }
}

