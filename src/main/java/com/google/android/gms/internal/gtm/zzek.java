package com.google.android.gms.internal.gtm;

import N5.r;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class zzek {
    private final Map zza;
    private final List zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;
    private final boolean zzf;
    private final String zzg;

    public zzek(zzbq zzbq0, Map map0, long v, boolean z, long v1, int v2, List list0) {
        CharSequence charSequence0 = null;
        super();
        r.j(zzbq0);
        r.j(map0);
        this.zzd = v;
        this.zzf = z;
        this.zzc = v1;
        this.zze = v2;
        this.zzb = list0 == null ? Collections.emptyList() : list0;
        CharSequence charSequence1 = null;
        if(list0 != null) {
            for(Object object0: list0) {
                zzco zzco0 = (zzco)object0;
                if("appendVersion".equals(zzco0.zza())) {
                    charSequence0 = zzco0.zzb();
                    break;
                }
            }
        }
        if(!TextUtils.isEmpty(charSequence0)) {
            charSequence1 = charSequence0;
        }
        this.zzg = charSequence1;
        HashMap hashMap0 = new HashMap();
        for(Object object1: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            if(zzek.zzl(map$Entry0.getKey())) {
                String s = zzek.zzj(zzbq0, map$Entry0.getKey());
                if(s != null) {
                    hashMap0.put(s, zzek.zzk(zzbq0, map$Entry0.getValue()));
                }
            }
        }
        for(Object object2: map0.entrySet()) {
            Map.Entry map$Entry1 = (Map.Entry)object2;
            if(!zzek.zzl(map$Entry1.getKey())) {
                String s1 = zzek.zzj(zzbq0, map$Entry1.getKey());
                if(s1 != null) {
                    hashMap0.put(s1, zzek.zzk(zzbq0, map$Entry1.getValue()));
                }
            }
        }
        if(!TextUtils.isEmpty(this.zzg)) {
            zzff.zzg(hashMap0, "_v", this.zzg);
            if(this.zzg.equals("ma4.0.0") || this.zzg.equals("ma4.0.1")) {
                hashMap0.remove("adid");
            }
        }
        this.zza = Collections.unmodifiableMap(hashMap0);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ht=");
        stringBuilder0.append(this.zzd);
        if(this.zzc != 0L) {
            stringBuilder0.append(", dbId=");
            stringBuilder0.append(this.zzc);
        }
        if(this.zze != 0) {
            stringBuilder0.append(", appUID=");
            stringBuilder0.append(this.zze);
        }
        ArrayList arrayList0 = new ArrayList(this.zza.keySet());
        Collections.sort(arrayList0);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = (String)arrayList0.get(v1);
            stringBuilder0.append(", ");
            stringBuilder0.append(s);
            stringBuilder0.append("=");
            stringBuilder0.append(((String)this.zza.get(s)));
        }
        return stringBuilder0.toString();
    }

    public final int zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return zzff.zza(this.zzi("_s", "0"));
    }

    public final long zzd() {
        return this.zzd;
    }

    public final Map zzg() {
        return this.zza;
    }

    public final boolean zzh() {
        return this.zzf;
    }

    private final String zzi(String s, String s1) {
        r.f(s);
        r.a("Short param name required", !s.startsWith("&"));
        String s2 = (String)this.zza.get(s);
        return s2 == null ? s1 : s2;
    }

    private static String zzj(zzbq zzbq0, Object object0) {
        if(object0 == null) {
            return null;
        }
        String s = object0.toString();
        s = s.startsWith("&") ? s.substring(1) : object0.toString();
        int v = s.length();
        if(v > 0x100) {
            s = s.substring(0, 0x100);
            zzbq0.zzS("Hit param name is too long and will be trimmed", v, s);
        }
        return TextUtils.isEmpty(s) ? null : s;
    }

    private static String zzk(zzbq zzbq0, Object object0) {
        String s = object0 == null ? "" : object0.toString();
        int v = s.length();
        if(v > 0x2000) {
            s = s.substring(0, 0x2000);
            zzbq0.zzS("Hit param value is too long and will be trimmed", v, s);
        }
        return s;
    }

    private static boolean zzl(Object object0) {
        return object0 == null ? false : object0.toString().startsWith("&");
    }
}

