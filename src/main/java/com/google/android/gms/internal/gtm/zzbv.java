package com.google.android.gms.internal.gtm;

import N5.r;
import android.content.Context;

public final class zzbv {
    private final Context zza;
    private final Context zzb;

    public zzbv(Context context0) {
        r.j(context0);
        Context context1 = context0.getApplicationContext();
        r.k(context1, "Application context can\'t be null");
        this.zza = context1;
        this.zzb = context1;
    }

    public final Context zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzb;
    }
}

