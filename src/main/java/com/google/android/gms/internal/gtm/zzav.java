package com.google.android.gms.internal.gtm;

import E5.f;
import android.text.TextUtils;
import java.util.HashMap;

public final class zzav extends f {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;

    @Override
    public final String toString() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("name", this.zza);
        hashMap0.put("source", this.zzb);
        hashMap0.put("medium", this.zzc);
        hashMap0.put("keyword", this.zzd);
        hashMap0.put("content", this.zze);
        hashMap0.put("id", this.zzf);
        hashMap0.put("adNetworkId", this.zzg);
        hashMap0.put("gclid", this.zzh);
        hashMap0.put("dclid", this.zzi);
        hashMap0.put("aclid", this.zzj);
        return f.zza(hashMap0);
    }

    @Override  // E5.f
    public final void zzc(f f0) {
        if(!TextUtils.isEmpty(this.zza)) {
            ((zzav)f0).zza = this.zza;
        }
        if(!TextUtils.isEmpty(this.zzb)) {
            ((zzav)f0).zzb = this.zzb;
        }
        if(!TextUtils.isEmpty(this.zzc)) {
            ((zzav)f0).zzc = this.zzc;
        }
        if(!TextUtils.isEmpty(this.zzd)) {
            ((zzav)f0).zzd = this.zzd;
        }
        if(!TextUtils.isEmpty(this.zze)) {
            ((zzav)f0).zze = this.zze;
        }
        if(!TextUtils.isEmpty(this.zzf)) {
            ((zzav)f0).zzf = this.zzf;
        }
        if(!TextUtils.isEmpty(this.zzg)) {
            ((zzav)f0).zzg = this.zzg;
        }
        if(!TextUtils.isEmpty(this.zzh)) {
            ((zzav)f0).zzh = this.zzh;
        }
        if(!TextUtils.isEmpty(this.zzi)) {
            ((zzav)f0).zzi = this.zzi;
        }
        if(!TextUtils.isEmpty(this.zzj)) {
            ((zzav)f0).zzj = this.zzj;
        }
    }

    public final void zzn(String s) {
        this.zzj = s;
    }

    public final void zzo(String s) {
        this.zzg = s;
    }

    public final void zzp(String s) {
        this.zze = s;
    }

    public final void zzq(String s) {
        this.zzi = s;
    }

    public final void zzr(String s) {
        this.zzh = s;
    }

    public final void zzs(String s) {
        this.zzf = s;
    }

    public final void zzt(String s) {
        this.zzd = s;
    }

    public final void zzu(String s) {
        this.zzc = s;
    }

    public final void zzv(String s) {
        this.zza = s;
    }

    public final void zzw(String s) {
        this.zzb = s;
    }
}

