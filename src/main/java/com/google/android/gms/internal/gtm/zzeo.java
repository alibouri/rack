package com.google.android.gms.internal.gtm;

import N5.r;

public final class zzeo extends zzbr {
    private static zzeo zza;

    public zzeo(zzbu zzbu0) {
        super(zzbu0);
    }

    public static zzeo zza() {
        return zzeo.zza;
    }

    public final void zzb(zzek zzek0, String s) {
        this.zzR("Discarding hit. " + s, (zzek0 == null ? "no hit data" : zzek0.toString()));
    }

    @Override  // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
        synchronized(zzeo.class) {
            zzeo.zza = this;
        }
    }

    public final void zze(int v, String s, Object object0, Object object1, Object object2) {
        synchronized(this) {
            r.j(s);
            String s1 = zzbq.zzD(s, zzeo.zzf(object0), zzeo.zzf(object1), zzeo.zzf(object2));
            String s2 = "3" + "01VDIWEA?".charAt(v) + ((char)(this.zzw().zzb() ? 67 : 99)) + zzbs.zza + ":" + s1;
            if(s2.length() > 0x400) {
                s2 = s2.substring(0, 0x400);
            }
            zzeu zzeu0 = this.zzt().zzp();
            if(zzeu0 != null) {
                zzeu0.zze().zzc(s2);
            }
        }
    }

    public static final String zzf(Object object0) {
        if(object0 == null) {
            return null;
        }
        if(object0 instanceof Integer) {
            object0 = (long)(((int)(((Integer)object0))));
        }
        String s = "-";
        if(object0 instanceof Long) {
            if(Math.abs(((long)(((Long)object0)))) < 100L) {
                return object0.toString();
            }
            String s1 = String.valueOf(Math.abs(((long)(((Long)object0)))));
            StringBuilder stringBuilder0 = new StringBuilder();
            if(object0.toString().charAt(0) != 45) {
                s = "";
            }
            stringBuilder0.append(s);
            stringBuilder0.append(Math.round(Math.pow(10.0, s1.length() - 1)));
            stringBuilder0.append("...");
            stringBuilder0.append(s);
            stringBuilder0.append(Math.round(Math.pow(10.0, s1.length()) - 1.0));
            return stringBuilder0.toString();
        }
        if(object0 instanceof Boolean) {
            return object0.toString();
        }
        return object0 instanceof Throwable ? object0.getClass().getCanonicalName() : "-";
    }
}

