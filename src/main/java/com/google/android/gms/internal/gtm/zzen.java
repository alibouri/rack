package com.google.android.gms.internal.gtm;

import A3.e;
import E5.b;
import android.annotation.SuppressLint;
import android.util.Log;

@Deprecated
public abstract class zzen {
    private static volatile b zza;

    static {
        zzen.zza = new zzct();
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zzb(String s, Object object0) {
        String s1;
        zzeo zzeo0 = zzeo.zza();
        if(zzeo0 != null) {
            zzeo0.zzJ(s, object0);
        }
        else if(zzen.zzf(3)) {
            if(object0 == null) {
                s1 = s;
            }
            else {
                StringBuilder stringBuilder0 = e.w(s, ":");
                stringBuilder0.append(((String)object0));
                s1 = stringBuilder0.toString();
            }
            Log.e(((String)zzeh.zzb.zzb()), s1);
        }
        b b0 = zzen.zza;
        if(b0 != null) {
            b0.error(s);
        }
    }

    public static boolean zzf(int v) {
        return zzen.zza != null && zzen.zza.getLogLevel() <= v;
    }
}

