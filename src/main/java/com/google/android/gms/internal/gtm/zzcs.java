package com.google.android.gms.internal.gtm;

import N5.r;
import S5.c;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

public final class zzcs {
    private final zzbu zza;
    private volatile Boolean zzb;
    private String zzc;
    private Set zzd;

    public zzcs(zzbu zzbu0) {
        r.j(zzbu0);
        this.zza = zzbu0;
    }

    public final Set zza() {
        String s = (String)zzeh.zzu.zzb();
        if(this.zzd == null || (this.zzc == null || !this.zzc.equals(s))) {
            String[] arr_s = TextUtils.split(s, ",");
            HashSet hashSet0 = new HashSet();
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v];
                try {
                    hashSet0.add(Integer.parseInt(s1));
                }
                catch(NumberFormatException unused_ex) {
                }
            }
            this.zzc = s;
            this.zzd = hashSet0;
        }
        return this.zzd;
    }

    public final boolean zzb() {
        if(this.zzb == null) {
            synchronized(this) {
                if(this.zzb == null) {
                    boolean z = false;
                    ApplicationInfo applicationInfo0 = this.zza.zza().getApplicationInfo();
                    String s = c.b();
                    if(applicationInfo0 != null) {
                        if(applicationInfo0.processName != null && applicationInfo0.processName.equals(s)) {
                            z = true;
                        }
                        this.zzb = Boolean.valueOf(z);
                    }
                    if((this.zzb == null || !this.zzb.booleanValue()) && "com.google.android.gms.analytics".equals(s)) {
                        this.zzb = Boolean.TRUE;
                    }
                    if(this.zzb == null) {
                        this.zzb = Boolean.TRUE;
                        this.zza.zzm().zzI("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzb.booleanValue();
    }

    public static final long zzc() {
        return (long)(((Long)zzeh.zzy.zzb()));
    }

    public static final long zzd() {
        return (long)(((Long)zzeh.zzg.zzb()));
    }

    public static final long zze() {
        return (long)(((Long)zzeh.zzf.zzb()));
    }

    public static final int zzf() {
        return (int)(((Integer)zzeh.zzr.zzb()));
    }

    public static final int zzg() {
        return (int)(((Integer)zzeh.zzj.zzb()));
    }

    public static final int zzh() {
        return (int)(((Integer)zzeh.zzi.zzb()));
    }

    public static final String zzi() {
        return (String)zzeh.zzl.zzb();
    }

    public static final String zzj() {
        return (String)zzeh.zzm.zzb();
    }

    public static final String zzk() {
        return (String)zzeh.zzk.zzb();
    }

    public static final boolean zzl() {
        return ((Boolean)zzeh.zza.zzb()).booleanValue();
    }
}

