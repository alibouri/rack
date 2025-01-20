package com.google.android.gms.internal.gtm;

import E5.k;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;

public final class zzce extends zzbr {
    private final zzau zza;

    public zzce(zzbu zzbu0) {
        super(zzbu0);
        this.zza = new zzau();
    }

    public final zzau zza() {
        this.zzV();
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
        k k0 = this.zzq();
        if(k0.c == null) {
            synchronized(k0) {
                if(k0.c == null) {
                    zzau zzau0 = new zzau();
                    PackageManager packageManager0 = k0.a.getPackageManager();
                    String s = "com.wave.personal";
                    zzau0.zzi("com.wave.personal");
                    zzau0.zzj(packageManager0.getInstallerPackageName("com.wave.personal"));
                    String s1 = null;
                    try {
                        PackageInfo packageInfo0 = packageManager0.getPackageInfo("com.wave.personal", 0);
                        if(packageInfo0 != null) {
                            CharSequence charSequence0 = packageManager0.getApplicationLabel(packageInfo0.applicationInfo);
                            if(!TextUtils.isEmpty(charSequence0)) {
                                s = charSequence0.toString();
                            }
                            s1 = packageInfo0.versionName;
                        }
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                        Log.e("GAv4", "Error retrieving package info: appName set to com.wave.personal");
                    }
                    zzau0.zzk(s);
                    zzau0.zzl(s1);
                    k0.c = zzau0;
                }
            }
        }
        k0.c.zzh(this.zza);
        zzfg zzfg0 = this.zzB();
        zzfg0.zzV();
        String s2 = zzfg0.zzb;
        if(s2 != null) {
            this.zza.zzk(s2);
        }
        zzfg0.zzV();
        String s3 = zzfg0.zza;
        if(s3 != null) {
            this.zza.zzl(s3);
        }
    }
}

