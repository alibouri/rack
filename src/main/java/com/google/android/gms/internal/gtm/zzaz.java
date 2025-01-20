package com.google.android.gms.internal.gtm;

import E5.f;
import android.text.TextUtils;
import java.util.HashMap;

public final class zzaz extends f {
    public int zza;
    public int zzb;
    private String zzc;

    @Override
    public final String toString() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("language", this.zzc);
        Integer integer0 = 0;
        hashMap0.put("screenColors", integer0);
        hashMap0.put("screenWidth", ((int)this.zza));
        hashMap0.put("screenHeight", ((int)this.zzb));
        hashMap0.put("viewportWidth", integer0);
        hashMap0.put("viewportHeight", integer0);
        return f.zza(hashMap0);
    }

    @Override  // E5.f
    public final void zzc(f f0) {
        int v = this.zza;
        if(v != 0) {
            ((zzaz)f0).zza = v;
        }
        int v1 = this.zzb;
        if(v1 != 0) {
            ((zzaz)f0).zzb = v1;
        }
        if(!TextUtils.isEmpty(this.zzc)) {
            ((zzaz)f0).zzc = this.zzc;
        }
    }

    public final void zze(String s) {
        this.zzc = s;
    }
}

