package com.google.android.gms.internal.gtm;

import K5.c;

public abstract class zzbs {
    public static final String zza;
    public static final String zzb;

    static {
        String s = String.valueOf(c.a / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        zzbs.zza = s;
        zzbs.zzb = "ma" + s;
    }
}

