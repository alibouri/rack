package com.google.android.gms.internal.measurement;

import com.apollographql.apollo.api.b;
import java.util.List;

public final class t1 extends c2 {
    private static final t1 zzc;
    private static volatile x2 zzd;
    private int zze;
    private int zzf;
    private l2 zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private double zzk;

    static {
        t1 t10 = new t1();
        t1.zzc = t10;
        c2.h(t1.class, t10);
    }

    public t1() {
        this.zzg = z2.c0;
        this.zzh = "";
        this.zzi = "";
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final Object e(int v) {
        switch(u1.a[v - 1]) {
            case 1: {
                return new t1();
            }
            case 2: {
                return new u0(t1.zzc);  // initializer: Lcom/google/android/gms/internal/measurement/b2;-><init>(Lcom/google/android/gms/internal/measurement/c2;)V
            }
            case 3: {
                return new B2(t1.zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001B\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", z0.i, "zzg", t1.class, "zzh", "zzi", "zzj", "zzk"});
            }
            case 4: {
                return t1.zzc;
            }
            case 5: {
                x2 x20 = t1.zzd;
                if(x20 == null) {
                    Class class0 = t1.class;
                    synchronized(class0) {
                        x20 = t1.zzd;
                        if(x20 == null) {
                            x20 = new d2(7);
                            t1.zzd = x20;
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

    public final double o() {
        return this.zzk;
    }

    public final int p() {
        int v = b.h(this.zzf);
        return v == 0 ? 1 : v;
    }

    public final String q() {
        return this.zzh;
    }

    public final String r() {
        return this.zzi;
    }

    public final List s() {
        return this.zzg;
    }

    public final boolean t() {
        return this.zzj;
    }

    public final boolean u() {
        return (this.zze & 8) != 0;
    }

    public final boolean v() {
        return (this.zze & 16) != 0;
    }

    public final boolean w() {
        return (this.zze & 4) != 0;
    }
}

