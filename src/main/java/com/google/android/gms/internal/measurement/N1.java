package com.google.android.gms.internal.measurement;

import java.util.List;

public final class n1 extends c2 {
    private static final n1 zzc;
    private static volatile x2 zzd;
    private int zze;
    private int zzf;
    private h2 zzg;

    static {
        n1 n10 = new n1();
        n1.zzc = n10;
        c2.h(n1.class, n10);
    }

    public n1() {
        this.zzg = p2.c0;
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final Object e(int v) {
        switch(P0.a[v - 1]) {
            case 1: {
                return new n1();
            }
            case 2: {
                return new m1(n1.zzc);  // initializer: Lcom/google/android/gms/internal/measurement/b2;-><init>(Lcom/google/android/gms/internal/measurement/c2;)V
            }
            case 3: {
                return new B2(n1.zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            }
            case 4: {
                return n1.zzc;
            }
            case 5: {
                x2 x20 = n1.zzd;
                if(x20 == null) {
                    Class class0 = n1.class;
                    synchronized(class0) {
                        x20 = n1.zzd;
                        if(x20 == null) {
                            x20 = new d2(7);
                            n1.zzd = x20;
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

    public final long p(int v) {
        return ((p2)this.zzg).d(v);
    }

    public static void q(n1 n10, int v) {
        n10.zze |= 1;
        n10.zzf = v;
    }

    public static void r(n1 n10, List list0) {
        h2 h20 = n10.zzg;
        if(!((O1)h20).X) {
            n10.zzg = ((p2)h20).e(h20.size() << 1);
        }
        N1.b(list0, n10.zzg);
    }

    public final int s() {
        return this.zzf;
    }

    public static m1 t() {
        return (m1)n1.zzc.k();
    }

    public final List u() {
        return this.zzg;
    }

    public final boolean v() {
        return (this.zze & 1) != 0;
    }
}

