package com.google.android.gms.internal.measurement;

public final class p1 extends c2 {
    private static final p1 zzc;
    private static volatile x2 zzd;
    private int zze;
    private long zzf;
    private String zzg;
    private String zzh;
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        p1 p10 = new p1();
        p1.zzc = p10;
        c2.h(p1.class, p10);
    }

    public p1() {
        this.zzg = "";
        this.zzh = "";
    }

    public static o1 A() {
        return (o1)p1.zzc.k();
    }

    public final String B() {
        return this.zzg;
    }

    public final String C() {
        return this.zzh;
    }

    public final boolean D() {
        return (this.zze & 0x20) != 0;
    }

    public final boolean E() {
        return (this.zze & 16) != 0;
    }

    public final boolean F() {
        return (this.zze & 8) != 0;
    }

    public final boolean G() {
        return (this.zze & 1) != 0;
    }

    public final boolean H() {
        return (this.zze & 4) != 0;
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final Object e(int v) {
        switch(P0.a[v - 1]) {
            case 1: {
                return new p1();
            }
            case 2: {
                return new o1(p1.zzc);  // initializer: Lcom/google/android/gms/internal/measurement/b2;-><init>(Lcom/google/android/gms/internal/measurement/c2;)V
            }
            case 3: {
                return new B2(p1.zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            }
            case 4: {
                return p1.zzc;
            }
            case 5: {
                x2 x20 = p1.zzd;
                if(x20 == null) {
                    Class class0 = p1.class;
                    synchronized(class0) {
                        x20 = p1.zzd;
                        if(x20 == null) {
                            x20 = new d2(7);
                            p1.zzd = x20;
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

    public static void p(p1 p10, double f) {
        p10.zze |= 0x20;
        p10.zzk = f;
    }

    public static void q(p1 p10, long v) {
        p10.zze |= 8;
        p10.zzi = v;
    }

    public static void r(p1 p10, String s) {
        s.getClass();
        p10.zze |= 2;
        p10.zzg = s;
    }

    public static void s(p1 p10) {
        p10.zze &= -33;
        p10.zzk = 0.0;
    }

    public final float t() {
        return this.zzj;
    }

    public static void u(p1 p10) {
        p10.zze &= -9;
        p10.zzi = 0L;
    }

    public static void v(p1 p10, long v) {
        p10.zze |= 1;
        p10.zzf = v;
    }

    public static void w(p1 p10, String s) {
        s.getClass();
        p10.zze |= 4;
        p10.zzh = s;
    }

    public final long x() {
        return this.zzi;
    }

    public static void y(p1 p10) {
        p10.zze &= -5;
        p10.zzh = p1.zzc.zzh;
    }

    public final long z() {
        return this.zzf;
    }
}

