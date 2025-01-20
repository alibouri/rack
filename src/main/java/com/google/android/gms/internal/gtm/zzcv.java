package com.google.android.gms.internal.gtm;

import N5.r;
import S5.b;
import android.os.Handler;

abstract class zzcv {
    private static volatile Handler zza;
    private final zzbu zzb;
    private final Runnable zzc;
    private volatile long zzd;

    public zzcv(zzbu zzbu0) {
        r.j(zzbu0);
        this.zzb = zzbu0;
        this.zzc = new zzcu(this);
    }

    public abstract void zza();

    public final long zzb() {
        if(this.zzd == 0L) {
            return 0L;
        }
        ((b)this.zzb.zzr()).getClass();
        return Math.abs(System.currentTimeMillis() - this.zzd);
    }

    public static void zzd(zzcv zzcv0, long v) {
        zzcv0.zzd = 0L;
    }

    public final void zze(long v) {
        long v1 = 0L;
        if(this.zzh()) {
            if(v < 0L) {
                this.zzf();
                return;
            }
            ((b)this.zzb.zzr()).getClass();
            long v2 = v - Math.abs(System.currentTimeMillis() - this.zzd);
            if(v2 >= 0L) {
                v1 = v2;
            }
            this.zzi().removeCallbacks(this.zzc);
            if(!this.zzi().postDelayed(this.zzc, v1)) {
                this.zzb.zzm().zzJ("Failed to adjust delayed post. time", v1);
            }
        }
    }

    public final void zzf() {
        this.zzd = 0L;
        this.zzi().removeCallbacks(this.zzc);
    }

    public final void zzg(long v) {
        this.zzf();
        if(v >= 0L) {
            ((b)this.zzb.zzr()).getClass();
            this.zzd = System.currentTimeMillis();
            if(!this.zzi().postDelayed(this.zzc, v)) {
                this.zzb.zzm().zzJ("Failed to schedule delayed post. time", v);
            }
        }
    }

    public final boolean zzh() {
        return this.zzd != 0L;
    }

    private final Handler zzi() {
        if(zzcv.zza != null) {
            return zzcv.zza;
        }
        synchronized(zzcv.class) {
            if(zzcv.zza == null) {
                zzcv.zza = new zzfy(this.zzb.zza().getMainLooper());
            }
            return zzcv.zza;
        }
    }
}

