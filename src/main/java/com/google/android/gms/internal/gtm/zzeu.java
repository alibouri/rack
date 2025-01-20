package com.google.android.gms.internal.gtm;

import E5.k;
import S5.b;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.text.TextUtils;

public final class zzeu extends zzbr {
    private SharedPreferences zza;
    private long zzb;
    private long zzc;
    private final zzes zzd;

    public zzeu(zzbu zzbu0) {
        super(zzbu0);
        this.zzc = -1L;
        this.zzd = new zzes(this, "monitoring", ((long)(((Long)zzeh.zzD.zzb()))), null);
    }

    public final long zza() {
        k.a();
        this.zzV();
        long v = this.zzb;
        if(v == 0L) {
            long v1 = this.zza.getLong("first_run", 0L);
            if(v1 != 0L) {
                this.zzb = v1;
                return v1;
            }
            ((b)this.zzC()).getClass();
            long v2 = System.currentTimeMillis();
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zza.edit();
            sharedPreferences$Editor0.putLong("first_run", v2);
            if(!sharedPreferences$Editor0.commit()) {
                this.zzQ("Failed to commit first run time");
            }
            this.zzb = v2;
            return v2;
        }
        return v;
    }

    public final long zzb() {
        k.a();
        this.zzV();
        long v = this.zzc;
        if(v == -1L) {
            v = this.zza.getLong("last_dispatch", 0L);
            this.zzc = v;
        }
        return v;
    }

    public static SharedPreferences zzc(zzeu zzeu0) {
        return zzeu0.zza;
    }

    @Override  // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
        this.zza = this.zzo().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final zzes zze() {
        return this.zzd;
    }

    public final zzfb zzf() {
        return new zzfb(this.zzC(), this.zza());
    }

    public final String zzg() {
        k.a();
        this.zzV();
        String s = this.zza.getString("installation_campaign", null);
        return TextUtils.isEmpty(s) ? null : s;
    }

    public final void zzh(String s) {
        k.a();
        this.zzV();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zza.edit();
        if(TextUtils.isEmpty(s)) {
            sharedPreferences$Editor0.remove("installation_campaign");
        }
        else {
            sharedPreferences$Editor0.putString("installation_campaign", s);
        }
        if(!sharedPreferences$Editor0.commit()) {
            this.zzQ("Failed to commit campaign data");
        }
    }

    public final void zzi() {
        k.a();
        this.zzV();
        ((b)this.zzC()).getClass();
        long v = System.currentTimeMillis();
        SharedPreferences.Editor sharedPreferences$Editor0 = this.zza.edit();
        sharedPreferences$Editor0.putLong("last_dispatch", v);
        sharedPreferences$Editor0.apply();
        this.zzc = v;
    }
}

