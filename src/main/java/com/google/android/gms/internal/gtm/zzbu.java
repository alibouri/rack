package com.google.android.gms.internal.gtm;

import E5.k;
import N5.r;
import S5.a;
import S5.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import java.util.HashSet;

@SuppressLint({"StaticFieldLeak"})
public final class zzbu {
    private static volatile zzbu zza;
    private final Context zzb;
    private final Context zzc;
    private final a zzd;
    private final zzcs zze;
    private final zzeo zzf;
    private final k zzg;
    private final zzbp zzh;
    private final zzcx zzi;
    private final zzfg zzj;
    private final zzeu zzk;
    private final E5.a zzl;
    private final zzcm zzm;
    private final zzbh zzn;
    private final zzce zzo;
    private final zzcw zzp;

    public zzbu(zzbv zzbv0) {
        Context context0 = zzbv0.zza();
        r.k(context0, "Application context can\'t be null");
        Context context1 = zzbv0.zzb();
        r.j(context1);
        this.zzb = context0;
        this.zzc = context1;
        this.zzd = b.a;
        this.zze = new zzcs(this);
        zzeo zzeo0 = new zzeo(this);
        zzeo0.zzW();
        this.zzf = zzeo0;
        this.zzm().zzL("Google Analytics " + zzbs.zza + " is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        zzeu zzeu0 = new zzeu(this);
        zzeu0.zzW();
        this.zzk = zzeu0;
        zzfg zzfg0 = new zzfg(this);
        zzfg0.zzW();
        this.zzj = zzfg0;
        zzbp zzbp0 = new zzbp(this, zzbv0);
        zzcm zzcm0 = new zzcm(this);
        zzbh zzbh0 = new zzbh(this);
        zzce zzce0 = new zzce(this);
        zzcw zzcw0 = new zzcw(this);
        if(k.e == null) {
            synchronized(k.class) {
                if(k.e == null) {
                    k.e = new k(context0);
                }
            }
        }
        k k0 = k.e;
        k0.d = new zzbt(this);
        this.zzg = k0;
        E5.a a0 = new E5.a(this);  // initializer: LR2/w;-><init>(Lcom/google/android/gms/internal/gtm/zzbu;)V
        new HashSet();
        zzcm0.zzW();
        this.zzm = zzcm0;
        zzbh0.zzW();
        this.zzn = zzbh0;
        zzce0.zzW();
        this.zzo = zzce0;
        zzcw0.zzW();
        this.zzp = zzcw0;
        zzcx zzcx0 = new zzcx(this);
        zzcx0.zzW();
        this.zzi = zzcx0;
        zzbp0.zzW();
        this.zzh = zzbp0;
        zzfg zzfg1 = ((zzbu)a0.b0).zzq();
        zzfg1.zzf();
        if(zzfg1.zze()) {
            zzfg1.zzc();
        }
        zzfg1.zzf();
        this.zzl = a0;
        zzbp0.zzm();
    }

    public final Context zza() {
        return this.zzb;
    }

    public final Context zzb() {
        return this.zzc;
    }

    public final k zzd() {
        r.j(this.zzg);
        return this.zzg;
    }

    public final zzbp zzf() {
        zzbu.zzs(this.zzh);
        return this.zzh;
    }

    public static zzbu zzg(Context context0) {
        r.j(context0);
        if(zzbu.zza == null) {
            synchronized(zzbu.class) {
                if(zzbu.zza == null) {
                    long v1 = SystemClock.elapsedRealtime();
                    zzbu zzbu0 = new zzbu(new zzbv(context0));
                    zzbu.zza = zzbu0;
                    E5.a.L();
                    long v2 = SystemClock.elapsedRealtime() - v1;
                    Long long0 = (Long)zzeh.zzE.zzb();
                    if(v2 > ((long)long0)) {
                        zzbu0.zzm().zzS("Slow initialization (ms)", v2, long0);
                    }
                }
            }
        }
        return zzbu.zza;
    }

    public final zzce zzh() {
        zzbu.zzs(this.zzo);
        return this.zzo;
    }

    public final zzcs zzj() {
        return this.zze;
    }

    public final zzcw zzk() {
        return this.zzp;
    }

    public final zzcx zzl() {
        zzbu.zzs(this.zzi);
        return this.zzi;
    }

    public final zzeo zzm() {
        zzbu.zzs(this.zzf);
        return this.zzf;
    }

    public final zzeo zzn() {
        return this.zzf;
    }

    public final zzeu zzo() {
        zzbu.zzs(this.zzk);
        return this.zzk;
    }

    public final zzeu zzp() {
        return this.zzk == null || !this.zzk.zzX() ? null : this.zzk;
    }

    public final zzfg zzq() {
        zzbu.zzs(this.zzj);
        return this.zzj;
    }

    public final a zzr() {
        return this.zzd;
    }

    private static final void zzs(zzbr zzbr0) {
        r.k(zzbr0, "Analytics service not created/initialized");
        r.a("Analytics service not initialized", zzbr0.zzX());
    }
}

