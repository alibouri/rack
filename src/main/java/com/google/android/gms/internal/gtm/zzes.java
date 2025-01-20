package com.google.android.gms.internal.gtm;

import N5.r;
import S5.b;
import android.content.SharedPreferences.Editor;
import java.util.UUID;

public final class zzes {
    final zzeu zza;
    private final String zzb;
    private final long zzc;

    public zzes(zzeu zzeu0, String s, long v, zzet zzet0) {
        this.zza = zzeu0;
        super();
        r.f("monitoring");
        r.b(v > 0L);
        this.zzb = "monitoring";
        this.zzc = v;
    }

    public final String zzb() {
        return this.zzb + ":value";
    }

    public final void zzc(String s) {
        if(this.zzd() == 0L) {
            this.zzg();
        }
        if(s == null) {
            s = "";
        }
        synchronized(this) {
            long v1 = zzeu.zzc(this.zza).getLong(this.zze(), 0L);
            if(Long.compare(v1, 0L) <= 0) {
                SharedPreferences.Editor sharedPreferences$Editor0 = zzeu.zzc(this.zza).edit();
                sharedPreferences$Editor0.putString(this.zzb(), s);
                sharedPreferences$Editor0.putLong(this.zze(), 1L);
                sharedPreferences$Editor0.apply();
                return;
            }
            long v2 = UUID.randomUUID().getLeastSignificantBits();
            SharedPreferences.Editor sharedPreferences$Editor1 = zzeu.zzc(this.zza).edit();
            if((v2 & 0x7FFFFFFFFFFFFFFFL) < 0x7FFFFFFFFFFFFFFFL / (v1 + 1L)) {
                sharedPreferences$Editor1.putString(this.zzb(), s);
            }
            sharedPreferences$Editor1.putLong(this.zze(), v1 + 1L);
            sharedPreferences$Editor1.apply();
        }
    }

    private final long zzd() {
        String s = this.zzf();
        return zzeu.zzc(this.zza).getLong(s, 0L);
    }

    private final String zze() {
        return this.zzb + ":count";
    }

    private final String zzf() {
        return this.zzb + ":start";
    }

    private final void zzg() {
        ((b)this.zza.zzC()).getClass();
        SharedPreferences.Editor sharedPreferences$Editor0 = zzeu.zzc(this.zza).edit();
        sharedPreferences$Editor0.remove(this.zze());
        sharedPreferences$Editor0.remove(this.zzb());
        sharedPreferences$Editor0.putLong(this.zzf(), System.currentTimeMillis());
        sharedPreferences$Editor0.commit();
    }
}

