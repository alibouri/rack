package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public final class g1 extends c2 {
    private static final g1 zzc;
    private static volatile x2 zzd;
    private int zze;
    private l2 zzf;
    private String zzg;
    private String zzh;
    private int zzi;

    static {
        g1 g10 = new g1();
        g1.zzc = g10;
        c2.h(g1.class, g10);
    }

    public g1() {
        this.zzf = z2.c0;
        this.zzg = "";
        this.zzh = "";
    }

    public final boolean A() {
        return (this.zze & 1) != 0;
    }

    public final boolean B() {
        return (this.zze & 2) != 0;
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final Object e(int v) {
        switch(P0.a[v - 1]) {
            case 1: {
                return new g1();
            }
            case 2: {
                return new f1(g1.zzc);  // initializer: Lcom/google/android/gms/internal/measurement/b2;-><init>(Lcom/google/android/gms/internal/measurement/c2;)V
            }
            case 3: {
                return new B2(g1.zzc, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001B\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", i1.class, "zzg", "zzh", "zzi", z0.g});
            }
            case 4: {
                return g1.zzc;
            }
            case 5: {
                x2 x20 = g1.zzd;
                if(x20 == null) {
                    Class class0 = g1.class;
                    synchronized(class0) {
                        x20 = g1.zzd;
                        if(x20 == null) {
                            x20 = new d2(7);
                            g1.zzd = x20;
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
        return this.zzf.size();
    }

    public static f1 p(g1 g10) {
        b2 b20 = g1.zzc.k();
        b20.b(g10);
        return (f1)b20;
    }

    public final i1 q() {
        return (i1)this.zzf.get(0);
    }

    public static void r(g1 g10, i1 i10) {
        l2 l20 = g10.zzf;
        if(!((O1)l20).X) {
            g10.zzf = l20.b(l20.size() << 1);
        }
        g10.zzf.add(i10);
    }

    public static void s(g1 g10, String s) {
        s.getClass();
        g10.zze |= 1;
        g10.zzg = s;
    }

    public static void t(g1 g10, ArrayList arrayList0) {
        l2 l20 = g10.zzf;
        if(!((O1)l20).X) {
            g10.zzf = l20.b(l20.size() << 1);
        }
        N1.b(arrayList0, g10.zzf);
    }

    public static void u(g1 g10) {
        g10.zzf = z2.c0;
    }

    public static void v(g1 g10, String s) {
        s.getClass();
        g10.zze |= 2;
        g10.zzh = s;
    }

    public static f1 w() {
        return (f1)g1.zzc.k();
    }

    public final String x() {
        return this.zzg;
    }

    public final String y() {
        return this.zzh;
    }

    public final List z() {
        return this.zzf;
    }
}

