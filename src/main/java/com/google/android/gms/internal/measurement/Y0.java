package com.google.android.gms.internal.measurement;

import java.util.List;

public final class y0 extends c2 {
    private static final y0 zzc;
    private static volatile x2 zzd;
    private int zze;
    private int zzf;
    private String zzg;
    private boolean zzh;
    private l2 zzi;

    static {
        y0 y00 = new y0();
        y0.zzc = y00;
        c2.h(y0.class, y00);
    }

    public y0() {
        this.zzg = "";
        this.zzi = z2.c0;
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final Object e(int v) {
        switch(n0.a[v - 1]) {
            case 1: {
                return new y0();
            }
            case 2: {
                return new u0(y0.zzc);  // initializer: Lcom/google/android/gms/internal/measurement/b2;-><init>(Lcom/google/android/gms/internal/measurement/c2;)V
            }
            case 3: {
                return new B2(y0.zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001A", new Object[]{"zze", "zzf", z0.c, "zzg", "zzh", "zzi"});
            }
            case 4: {
                return y0.zzc;
            }
            case 5: {
                x2 x20 = y0.zzd;
                if(x20 == null) {
                    Class class0 = y0.class;
                    synchronized(class0) {
                        x20 = y0.zzd;
                        if(x20 == null) {
                            x20 = new d2(7);
                            y0.zzd = x20;
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
        return this.zzi.size();
    }

    public final int p() {
        switch(this.zzf) {
            case 0: {
                return 1;
            }
            case 1: {
                return 2;
            }
            case 2: {
                return 3;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 5;
            }
            case 5: {
                return 6;
            }
            case 6: {
                return 7;
            }
            default: {
                return 1;
            }
        }
    }

    public static y0 q() {
        return y0.zzc;
    }

    public final String r() {
        return this.zzg;
    }

    public final List s() {
        return this.zzi;
    }

    public final boolean t() {
        return this.zzh;
    }

    public final boolean u() {
        return (this.zze & 4) != 0;
    }

    public final boolean v() {
        return (this.zze & 2) != 0;
    }

    public final boolean w() {
        return (this.zze & 1) != 0;
    }
}

