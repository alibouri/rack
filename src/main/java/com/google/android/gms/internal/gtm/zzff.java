package com.google.android.gms.internal.gtm;

import N5.r;
import S5.d;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public abstract class zzff {
    public static long zza(String s) {
        if(s == null) {
            return 0L;
        }
        try {
            return Long.parseLong(s);
        }
        catch(NumberFormatException unused_ex) {
            return 0L;
        }
    }

    public static zzav zzb(zzeo zzeo0, String s) {
        Map map0;
        r.j(zzeo0);
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        new HashMap();
        try {
            map0 = d.a(new URI("?" + s));
        }
        catch(URISyntaxException uRISyntaxException0) {
            zzeo0.zzR("No valid campaign data found", uRISyntaxException0);
            return null;
        }
        zzav zzav0 = new zzav();
        zzav0.zzp(((String)map0.get("utm_content")));
        zzav0.zzu(((String)map0.get("utm_medium")));
        zzav0.zzv(((String)map0.get("utm_campaign")));
        zzav0.zzw(((String)map0.get("utm_source")));
        zzav0.zzt(((String)map0.get("utm_term")));
        zzav0.zzs(((String)map0.get("utm_id")));
        zzav0.zzo(((String)map0.get("anid")));
        zzav0.zzr(((String)map0.get("gclid")));
        zzav0.zzq(((String)map0.get("dclid")));
        zzav0.zzn(((String)map0.get("aclid")));
        return zzav0;
    }

    public static String zzd(Locale locale0) {
        if(locale0 != null) {
            String s = locale0.getLanguage();
            if(!TextUtils.isEmpty(s)) {
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(s.toLowerCase(locale0));
                if(!TextUtils.isEmpty(locale0.getCountry())) {
                    stringBuilder0.append("-");
                    stringBuilder0.append(locale0.getCountry().toLowerCase(locale0));
                }
                return stringBuilder0.toString();
            }
        }
        return null;
    }

    public static void zzg(Map map0, String s, String s1) {
        if(s1 != null && !map0.containsKey(s)) {
            map0.put(s, s1);
        }
    }

    public static boolean zzi(Context context0, String s, boolean z) {
        try {
            ActivityInfo activityInfo0 = context0.getPackageManager().getReceiverInfo(new ComponentName(context0, s), 0);
            if(activityInfo0 == null || !activityInfo0.enabled) {
                return false;
            }
            return z ? activityInfo0.exported : true;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return false;
        }
    }
}

