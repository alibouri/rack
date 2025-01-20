package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public final class d1 extends c2 {
    private static final d1 zzc;
    private static volatile x2 zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private float zzi;
    private double zzj;
    private l2 zzk;

    static {
        d1 d10 = new d1();
        d1.zzc = d10;
        c2.h(d1.class, d10);
    }

    public d1() {
        this.zzf = "";
        this.zzg = "";
        this.zzk = z2.c0;
    }

    public final long A() {
        return this.zzh;
    }

    public static void B(d1 d10) {
        d10.zze &= -3;
        d10.zzg = d1.zzc.zzg;
    }

    public static c1 C() {
        return (c1)d1.zzc.k();
    }

    public final String D() {
        return this.zzf;
    }

    public final String E() {
        return this.zzg;
    }

    public final List F() {
        return this.zzk;
    }

    public final boolean G() {
        return (this.zze & 16) != 0;
    }

    public final boolean H() {
        return (this.zze & 8) != 0;
    }

    public final boolean I() {
        return (this.zze & 4) != 0;
    }

    public final boolean J() {
        return (this.zze & 1) != 0;
    }

    public final boolean K() {
        return (this.zze & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final Object e(int v) {
        switch(P0.a[v - 1]) {
            case 1: {
                return new d1();
            }
            case 2: {
                return new c1(d1.zzc);  // initializer: Lcom/google/android/gms/internal/measurement/b2;-><init>(Lcom/google/android/gms/internal/measurement/c2;)V
            }
            case 3: {
                return new B2(d1.zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001B", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", d1.class});
            }
            case 4: {
                return d1.zzc;
            }
            case 5: {
                x2 x20 = d1.zzd;
                if(x20 == null) {
                    Class class0 = d1.class;
                    synchronized(class0) {
                        x20 = d1.zzd;
                        if(x20 == null) {
                            x20 = new d2(7);
                            d1.zzd = x20;
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
        return this.zzj;
    }

    public static void p(d1 d10, double f) {
        d10.zze |= 16;
        d10.zzj = f;
    }

    public static void q(d1 d10, long v) {
        d10.zze |= 4;
        d10.zzh = v;
    }

    public static void r(d1 d10, d1 d11) {
        l2 l20 = d10.zzk;
        if(!((O1)l20).X) {
            d10.zzk = l20.b(l20.size() << 1);
        }
        d10.zzk.add(d11);
    }

    public static void s(d1 d10, String s) {
        s.getClass();
        d10.zze |= 1;
        d10.zzf = s;
    }

    public static void t(d1 d10, ArrayList arrayList0) {
        l2 l20 = d10.zzk;
        if(!((O1)l20).X) {
            d10.zzk = l20.b(l20.size() << 1);
        }
        N1.b(arrayList0, d10.zzk);
    }

    public static void u(d1 d10) {
        d10.zze &= -17;
        d10.zzj = 0.0;
    }

    public final float v() {
        return this.zzi;
    }

    public static void w(d1 d10) {
        d10.zze &= -5;
        d10.zzh = 0L;
    }

    public static void x(d1 d10, String s) {
        s.getClass();
        d10.zze |= 2;
        d10.zzg = s;
    }

    public final int y() {
        return this.zzk.size();
    }

    public static void z(d1 d10) {
        d10.zzk = z2.c0;
    }
}

