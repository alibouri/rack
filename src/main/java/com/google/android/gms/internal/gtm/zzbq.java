package com.google.android.gms.internal.gtm;

import E5.k;
import N5.r;
import S5.a;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

public abstract class zzbq {
    private final zzbu zza;

    public zzbq(zzbu zzbu0) {
        r.j(zzbu0);
        this.zza = zzbu0;
    }

    public final zzeu zzA() {
        return this.zza.zzo();
    }

    public final zzfg zzB() {
        return this.zza.zzq();
    }

    public final a zzC() {
        return this.zza.zzr();
    }

    public static String zzD(String s, Object object0, Object object1, Object object2) {
        String s4;
        String s1 = zzbq.zza(object0);
        String s2 = zzbq.zza(object1);
        String s3 = zzbq.zza(object2);
        StringBuilder stringBuilder0 = new StringBuilder();
        if(TextUtils.isEmpty(s)) {
            s4 = "";
        }
        else {
            stringBuilder0.append(s);
            s4 = ": ";
        }
        String s5 = ", ";
        if(!TextUtils.isEmpty(s1)) {
            stringBuilder0.append(s4);
            stringBuilder0.append(s1);
            s4 = ", ";
        }
        if(TextUtils.isEmpty(s2)) {
            s5 = s4;
        }
        else {
            stringBuilder0.append(s4);
            stringBuilder0.append(s2);
        }
        if(!TextUtils.isEmpty(s3)) {
            stringBuilder0.append(s5);
            stringBuilder0.append(s3);
        }
        return stringBuilder0.toString();
    }

    public final void zzE(String s) {
        this.zzb(3, s, null, null, null);
    }

    public final void zzF(String s, Object object0) {
        this.zzb(3, s, object0, null, null);
    }

    public final void zzG(String s, Object object0, Object object1) {
        this.zzb(3, s, object0, object1, null);
    }

    public final void zzH(String s, Object object0, Object object1, Object object2) {
        this.zzb(3, "POST compressed size, ratio %, url", object0, object1, object2);
    }

    public final void zzI(String s) {
        this.zzb(6, s, null, null, null);
    }

    public final void zzJ(String s, Object object0) {
        this.zzb(6, s, object0, null, null);
    }

    public final void zzK(String s, Object object0, Object object1) {
        this.zzb(6, s, object0, object1, null);
    }

    public final void zzL(String s) {
        this.zzb(4, s, null, null, null);
    }

    public final void zzN(String s) {
        this.zzb(2, s, null, null, null);
    }

    public final void zzO(String s, Object object0) {
        this.zzb(2, s, object0, null, null);
    }

    public final void zzP(String s, Object object0, Object object1) {
        this.zzb(2, s, object0, object1, null);
    }

    public final void zzQ(String s) {
        this.zzb(5, s, null, null, null);
    }

    public final void zzR(String s, Object object0) {
        this.zzb(5, s, object0, null, null);
    }

    public final void zzS(String s, Object object0, Object object1) {
        this.zzb(5, s, object0, object1, null);
    }

    public final void zzT(String s, Object object0, Object object1, Object object2) {
        this.zzb(5, "Deleted fewer hits then expected", object0, object1, object2);
    }

    public static final boolean zzU() {
        return Log.isLoggable(((String)zzeh.zzb.zzb()), 2);
    }

    private static String zza(Object object0) {
        if(object0 == null) {
            return "";
        }
        if(object0 instanceof String) {
            return (String)object0;
        }
        if(object0 instanceof Boolean) {
            return object0 == Boolean.TRUE ? "true" : "false";
        }
        return object0 instanceof Throwable ? ((Throwable)object0).toString() : object0.toString();
    }

    private final void zzb(int v, String s, Object object0, Object object1, Object object2) {
        zzeo zzeo0 = this.zza == null ? null : this.zza.zzn();
        if(zzeo0 == null) {
            String s2 = (String)zzeh.zzb.zzb();
            if(Log.isLoggable(s2, v)) {
                Log.println(v, s2, zzbq.zzD(s, object0, object1, object2));
            }
        }
        else {
            String s1 = (String)zzeh.zzb.zzb();
            if(Log.isLoggable(s1, v)) {
                Log.println(v, s1, zzbq.zzD(s, object0, object1, object2));
            }
            if(v >= 5) {
                zzeo0.zze(v, s, object0, object1, object2);
            }
        }
    }

    public final Context zzo() {
        return this.zza.zza();
    }

    public final k zzq() {
        return this.zza.zzd();
    }

    public final zzbp zzs() {
        return this.zza.zzf();
    }

    public final zzbu zzt() {
        return this.zza;
    }

    public final zzcs zzw() {
        return this.zza.zzj();
    }

    public final zzcx zzy() {
        return this.zza.zzl();
    }

    public final zzeo zzz() {
        return this.zza.zzm();
    }
}

