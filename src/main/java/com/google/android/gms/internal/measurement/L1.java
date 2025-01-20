package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public final class l1 extends c2 {
    private static final l1 zzc;
    private static volatile x2 zzd;
    private h2 zze;
    private h2 zzf;
    private l2 zzg;
    private l2 zzh;

    static {
        l1 l10 = new l1();
        l1.zzc = l10;
        c2.h(l1.class, l10);
    }

    public l1() {
        this.zze = p2.c0;
        this.zzf = p2.c0;
        this.zzg = z2.c0;
        this.zzh = z2.c0;
    }

    public static k1 A() {
        return (k1)l1.zzc.k();
    }

    public static l1 B() {
        return l1.zzc;
    }

    public final l2 C() {
        return this.zzg;
    }

    public final List D() {
        return this.zzf;
    }

    public final l2 E() {
        return this.zzh;
    }

    public final List F() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final Object e(int v) {
        switch(P0.a[v - 1]) {
            case 1: {
                return new l1();
            }
            case 2: {
                return new k1(l1.zzc);  // initializer: Lcom/google/android/gms/internal/measurement/b2;-><init>(Lcom/google/android/gms/internal/measurement/c2;)V
            }
            case 3: {
                return new B2(l1.zzc, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001B\u0004\u001B", new Object[]{"zze", "zzf", "zzg", Y0.class, "zzh", n1.class});
            }
            case 4: {
                return l1.zzc;
            }
            case 5: {
                x2 x20 = l1.zzd;
                if(x20 == null) {
                    Class class0 = l1.class;
                    synchronized(class0) {
                        x20 = l1.zzd;
                        if(x20 == null) {
                            x20 = new d2(7);
                            l1.zzd = x20;
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
        return this.zzg.size();
    }

    public static void p(l1 l10) {
        l10.zzg = z2.c0;
    }

    public static void q(l1 l10, ArrayList arrayList0) {
        l2 l20 = l10.zzg;
        if(!((O1)l20).X) {
            l10.zzg = l20.b(l20.size() << 1);
        }
        N1.b(arrayList0, l10.zzg);
    }

    public final int r() {
        return this.zzf.size();
    }

    public static void s(l1 l10) {
        l10.zzf = p2.c0;
    }

    public static void t(l1 l10, List list0) {
        h2 h20 = l10.zzf;
        if(!((O1)h20).X) {
            l10.zzf = ((p2)h20).e(h20.size() << 1);
        }
        N1.b(list0, l10.zzf);
    }

    public final int u() {
        return this.zzh.size();
    }

    public static void v(l1 l10) {
        l10.zzh = z2.c0;
    }

    public static void w(l1 l10, List list0) {
        l2 l20 = l10.zzh;
        if(!((O1)l20).X) {
            l10.zzh = l20.b(l20.size() << 1);
        }
        N1.b(list0, l10.zzh);
    }

    public final int x() {
        return this.zze.size();
    }

    public static void y(l1 l10) {
        l10.zze = p2.c0;
    }

    public static void z(l1 l10, List list0) {
        h2 h20 = l10.zze;
        if(!((O1)h20).X) {
            l10.zze = ((p2)h20).e(h20.size() << 1);
        }
        N1.b(list0, l10.zze);
    }
}

