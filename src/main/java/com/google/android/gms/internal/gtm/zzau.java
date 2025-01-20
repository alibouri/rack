package com.google.android.gms.internal.gtm;

import E5.f;
import android.text.TextUtils;
import java.util.HashMap;

public final class zzau extends f {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;

    @Override
    public final String toString() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("appName", this.zza);
        hashMap0.put("appVersion", this.zzb);
        hashMap0.put("appId", this.zzc);
        hashMap0.put("appInstallerId", this.zzd);
        return f.zza(hashMap0);
    }

    @Override  // E5.f
    public final void zzc(f f0) {
        this.zzh(((zzau)f0));
    }

    public final void zzh(zzau zzau0) {
        if(!TextUtils.isEmpty(this.zza)) {
            zzau0.zza = this.zza;
        }
        if(!TextUtils.isEmpty(this.zzb)) {
            zzau0.zzb = this.zzb;
        }
        if(!TextUtils.isEmpty(this.zzc)) {
            zzau0.zzc = this.zzc;
        }
        if(!TextUtils.isEmpty(this.zzd)) {
            zzau0.zzd = this.zzd;
        }
    }

    public final void zzi(String s) {
        this.zzc = s;
    }

    public final void zzj(String s) {
        this.zzd = s;
    }

    public final void zzk(String s) {
        this.zza = s;
    }

    public final void zzl(String s) {
        this.zzb = s;
    }
}

