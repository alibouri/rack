package com.google.android.gms.internal.gtm;

import N5.r;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class zzeq {
    final zzer zza;
    private int zzb;
    private final ByteArrayOutputStream zzc;

    public zzeq(zzer zzer0) {
        this.zza = zzer0;
        super();
        this.zzc = new ByteArrayOutputStream();
    }

    public final int zza() {
        return this.zzb;
    }

    public final boolean zzb(zzek zzek0) {
        r.j(zzek0);
        if(this.zzb + 1 <= zzcs.zzg()) {
            String s = this.zza.zza(zzek0, false);
            if(s == null) {
                this.zza.zzz().zzb(zzek0, "Error formatting hit");
                return true;
            }
            byte[] arr_b = s.getBytes();
            int v = arr_b.length;
            if(v > zzcs.zzf()) {
                this.zza.zzz().zzb(zzek0, "Hit size exceeds the maximum size limit");
                return true;
            }
            if(this.zzc.size() > 0) {
                ++v;
            }
            int v1 = (int)(((Integer)zzeh.zzt.zzb()));
            if(this.zzc.size() + v <= v1) {
                try {
                    if(this.zzc.size() > 0) {
                        this.zzc.write(new byte[]{10});
                    }
                    this.zzc.write(arr_b);
                    ++this.zzb;
                    return true;
                }
                catch(IOException iOException0) {
                }
                this.zza.zzJ("Failed to write payload when batching hits", iOException0);
                return true;
            }
        }
        return false;
    }

    public final byte[] zzc() {
        return this.zzc.toByteArray();
    }
}

