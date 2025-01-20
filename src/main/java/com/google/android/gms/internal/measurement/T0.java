package com.google.android.gms.internal.measurement;

public final class t0 extends c2 {
    private static final t0 zzc;
    private static volatile x2 zzd;
    private int zze;
    private y0 zzf;
    private v0 zzg;
    private boolean zzh;
    private String zzi;

    static {
        t0 t00 = new t0();
        t0.zzc = t00;
        c2.h(t0.class, t00);
    }

    public t0() {
        this.zzi = "";
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final Object e(int v) {
        switch(n0.a[v - 1]) {
            case 1: {
                return new t0();
            }
            case 2: {
                return new s0(t0.zzc);  // initializer: Lcom/google/android/gms/internal/measurement/b2;-><init>(Lcom/google/android/gms/internal/measurement/c2;)V
            }
            case 3: {
                return new B2(t0.zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            }
            case 4: {
                return t0.zzc;
            }
            case 5: {
                x2 x20 = t0.zzd;
                if(x20 == null) {
                    Class class0 = t0.class;
                    synchronized(class0) {
                        x20 = t0.zzd;
                        if(x20 == null) {
                            x20 = new d2(7);
                            t0.zzd = x20;
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

    public static void o(t0 t00, String s) {
        t00.zze |= 8;
        t00.zzi = s;
    }

    public static t0 p() {
        return t0.zzc;
    }

    public final v0 q() {
        return this.zzg == null ? v0.p() : this.zzg;
    }

    public final y0 r() {
        return this.zzf == null ? y0.q() : this.zzf;
    }

    public final String s() {
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
        return (this.zze & 8) != 0;
    }

    public final boolean x() {
        return (this.zze & 1) != 0;
    }
}

