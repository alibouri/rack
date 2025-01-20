package com.google.android.gms.internal.measurement;

public final class x0 extends c2 {
    private static final x0 zzc;
    private static volatile x2 zzd;
    private int zze;
    private int zzf;
    private String zzg;
    private t0 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        x0 x00 = new x0();
        x0.zzc = x00;
        c2.h(x0.class, x00);
    }

    public x0() {
        this.zzg = "";
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final Object e(int v) {
        switch(n0.a[v - 1]) {
            case 1: {
                return new x0();
            }
            case 2: {
                return new w0(x0.zzc);  // initializer: Lcom/google/android/gms/internal/measurement/b2;-><init>(Lcom/google/android/gms/internal/measurement/c2;)V
            }
            case 3: {
                return new B2(x0.zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            }
            case 4: {
                return x0.zzc;
            }
            case 5: {
                x2 x20 = x0.zzd;
                if(x20 == null) {
                    Class class0 = x0.class;
                    synchronized(class0) {
                        x20 = x0.zzd;
                        if(x20 == null) {
                            x20 = new d2(7);
                            x0.zzd = x20;
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
        return this.zzf;
    }

    public static void p(x0 x00, String s) {
        x00.zze |= 2;
        x00.zzg = s;
    }

    public final t0 q() {
        return this.zzh == null ? t0.p() : this.zzh;
    }

    public static w0 r() {
        return (w0)x0.zzc.k();
    }

    public final String s() {
        return this.zzg;
    }

    public final boolean t() {
        return this.zzi;
    }

    public final boolean u() {
        return this.zzj;
    }

    public final boolean v() {
        return this.zzk;
    }

    public final boolean w() {
        return (this.zze & 1) != 0;
    }

    public final boolean x() {
        return (this.zze & 0x20) != 0;
    }
}

