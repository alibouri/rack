package com.google.android.gms.internal.gtm;

public final class zzeg {
    private final Object zza;
    private final Object zzb;

    private zzeg(Object object0, Object object1, zzef zzef0) {
        this.zzb = new Object();
        this.zza = object0;
    }

    public static zzeg zza(Object object0, Object object1, zzef zzef0) {
        return new zzeg(object0, object1, zzef0);
    }

    public final Object zzb() {
        synchronized(this.zzb) {
        }
        return this.zza;
    }
}

