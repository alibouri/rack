package com.google.android.gms.internal.measurement;

import com.apollographql.apollo.api.b;

public final class v0 extends c2 {
    private static final v0 zzc;
    private static volatile x2 zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh;
    private String zzi;
    private String zzj;

    static {
        v0 v00 = new v0();
        v0.zzc = v00;
        c2.h(v0.class, v00);
    }

    public v0() {
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final Object e(int v) {
        switch(n0.a[v - 1]) {
            case 1: {
                return new v0();
            }
            case 2: {
                return new u0(v0.zzc);  // initializer: Lcom/google/android/gms/internal/measurement/b2;-><init>(Lcom/google/android/gms/internal/measurement/c2;)V
            }
            case 3: {
                return new B2(v0.zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", z0.b, "zzg", "zzh", "zzi", "zzj"});
            }
            case 4: {
                return v0.zzc;
            }
            case 5: {
                x2 x20 = v0.zzd;
                if(x20 == null) {
                    Class class0 = v0.class;
                    synchronized(class0) {
                        x20 = v0.zzd;
                        if(x20 == null) {
                            x20 = new d2(7);
                            v0.zzd = x20;
                        }
                    }
                }
                return x20;
            }
            case 6: {
                return (byte)1;
            }
            case 7: {
                return null;
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
    }

    public final int o() {
        int v = b.f(this.zzf);
        return v == 0 ? 1 : v;
    }

    public static v0 p() {
        return v0.zzc;
    }

    public final String q() {
        return this.zzh;
    }

    public final String r() {
        return this.zzj;
    }

    public final String s() {
        return this.zzi;
    }

    public final boolean t() {
        return this.zzg;
    }

    public final boolean u() {
        return (this.zze & 1) != 0;
    }

    public final boolean v() {
        return (this.zze & 4) != 0;
    }

    public final boolean w() {
        return (this.zze & 2) != 0;
    }

    public final boolean x() {
        return (this.zze & 16) != 0;
    }

    public final boolean y() {
        return (this.zze & 8) != 0;
    }
}

