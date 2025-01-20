package com.google.android.gms.internal.gtm;

import N5.r;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import n6.a;

public final class zzev {
    static final Object zza;
    static a zzb;
    static Boolean zzc;

    static {
        zzev.zza = new Object();
    }

    public final void zza(Context context0, Intent intent0) {
        zzeo zzeo0 = zzbu.zzg(context0).zzm();
        if(intent0 == null) {
            zzeo0.zzQ("AnalyticsReceiver called with null intent");
            return;
        }
        String s = intent0.getAction();
        zzeo0.zzO("Local AnalyticsReceiver got", s);
        if("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(s)) {
            boolean z = zzfa.zzh(context0);
            Intent intent1 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent1.setComponent(new ComponentName(context0, "com.google.android.gms.analytics.AnalyticsService"));
            intent1.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized(zzev.zza) {
                context0.startService(intent1);
                if(!z) {
                    return;
                }
                try {
                    if(zzev.zzb == null) {
                        a a0 = new a(context0, "Analytics WakeLock");
                        zzev.zzb = a0;
                        a0.d(false);
                    }
                    zzev.zzb.a(1000L);
                }
                catch(SecurityException unused_ex) {
                    zzeo0.zzQ("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                }
            }
        }
    }

    public static boolean zzb(Context context0) {
        r.j(context0);
        Boolean boolean0 = zzev.zzc;
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        boolean z = zzff.zzi(context0, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        zzev.zzc = Boolean.valueOf(z);
        return z;
    }
}

