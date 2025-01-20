package com.google.android.gms.internal.gtm;

import N5.r;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzbw {
    private final String zza;
    private final String zzb;
    private final boolean zzc;
    private long zzd;
    private final Map zze;

    public zzbw(long v, String s, String s1, boolean z, long v1, Map map0) {
        r.f(s);
        r.f(s1);
        this.zza = s;
        this.zzb = s1;
        this.zzc = z;
        this.zzd = v1;
        if(map0 != null) {
            this.zze = new HashMap(map0);
            return;
        }
        this.zze = Collections.emptyMap();
    }

    public final String zzc() {
        return this.zzb;
    }

    public final boolean zzf() {
        return this.zzc;
    }
}

