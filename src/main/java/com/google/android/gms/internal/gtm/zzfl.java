package com.google.android.gms.internal.gtm;

import m5.b;

final class zzfl extends zzfr {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    public zzfl(String s, boolean z, int v, zzfh zzfh0, zzfi zzfi0, int v1, zzfk zzfk0) {
        this.zzb = s;
        this.zzc = v;
        this.zzd = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof zzfr) {
            String s = ((zzfr)object0).zzc();
            if(this.zzb.equals(s)) {
                ((zzfr)object0).zzd();
                int v = this.zzc;
                int v1 = ((zzfr)object0).zze();
                if(v == 0) {
                    throw null;
                }
                if(v == v1) {
                    ((zzfr)object0).zza();
                    ((zzfr)object0).zzb();
                    int v2 = ((zzfr)object0).zzf();
                    if(this.zzd == 0) {
                        throw null;
                    }
                    return v2 == 1;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzb.hashCode();
        int v1 = this.zzc;
        if(v1 == 0 || this.zzd == 0) {
            throw null;
        }
        return (((v ^ 1000003) * 1000003 ^ 0x4D5) * 1000003 ^ v1) * 0x22CD8CDB ^ 1;
    }

    @Override
    public final String toString() {
        String s1;
        String s = "null";
        switch(this.zzc) {
            case 1: {
                s1 = "ALL_CHECKS";
                break;
            }
            case 2: {
                s1 = "SKIP_COMPLIANCE_CHECK";
                break;
            }
            case 3: {
                s1 = "SKIP_SECURITY_CHECK";
                break;
            }
            case 4: {
                s1 = "NO_CHECKS";
                break;
            }
            default: {
                s1 = "null";
            }
        }
        if(this.zzd == 1) {
            s = "READ_AND_WRITE";
        }
        StringBuilder stringBuilder0 = new StringBuilder("FileComplianceOptions{fileOwner=");
        stringBuilder0.append(this.zzb);
        stringBuilder0.append(", hasDifferentDmaOwner=false, fileChecks=");
        stringBuilder0.append(s1);
        stringBuilder0.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        return b.y(stringBuilder0, s, "}");
    }

    @Override  // com.google.android.gms.internal.gtm.zzfr
    public final zzfh zza() {
        return null;
    }

    @Override  // com.google.android.gms.internal.gtm.zzfr
    public final zzfi zzb() {
        return null;
    }

    @Override  // com.google.android.gms.internal.gtm.zzfr
    public final String zzc() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.gtm.zzfr
    public final boolean zzd() {
        return false;
    }

    @Override  // com.google.android.gms.internal.gtm.zzfr
    public final int zze() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.gtm.zzfr
    public final int zzf() {
        return this.zzd;
    }
}

