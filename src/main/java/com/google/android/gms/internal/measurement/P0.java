package com.google.android.gms.internal.measurement;

import java.util.List;

public final class p0 extends c2 {
    private static final p0 zzc;
    private static volatile x2 zzd;
    private int zze;
    private int zzf;
    private l2 zzg;
    private l2 zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        p0 p00 = new p0();
        p0.zzc = p00;
        c2.h(p0.class, p00);
    }

    public p0() {
        this.zzg = z2.c0;
        this.zzh = z2.c0;
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final Object e(int v) {
        switch(n0.a[v - 1]) {
            case 1: {
                return new p0();
            }
            case 2: {
                return new o0(p0.zzc);  // initializer: Lcom/google/android/gms/internal/measurement/b2;-><init>(Lcom/google/android/gms/internal/measurement/c2;)V
            }
            case 3: {
                return new B2(p0.zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001B\u0003\u001B\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", x0.class, "zzh", r0.class, "zzi", "zzj"});
            }
            case 4: {
                return p0.zzc;
            }
            case 5: {
                x2 x20 = p0.zzd;
                if(x20 == null) {
                    Class class0 = p0.class;
                    synchronized(class0) {
                        x20 = p0.zzd;
                        if(x20 == null) {
                            x20 = new d2(7);
                            p0.zzd = x20;
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

    public final r0 p(int v) {
        return (r0)this.zzh.get(v);
    }

    public static void q(p0 p00, int v, r0 r00) {
        l2 l20 = p00.zzh;
        if(!((O1)l20).X) {
            p00.zzh = l20.b(l20.size() << 1);
        }
        p00.zzh.set(v, r00);
    }

    public static void r(p0 p00, int v, x0 x00) {
        l2 l20 = p00.zzg;
        if(!((O1)l20).X) {
            p00.zzg = l20.b(l20.size() << 1);
        }
        p00.zzg.set(v, x00);
    }

    public final int s() {
        return this.zzh.size();
    }

    public final x0 t(int v) {
        return (x0)this.zzg.get(v);
    }

    public final int u() {
        return this.zzg.size();
    }

    public final List v() {
        return this.zzh;
    }

    public final List w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zze & 1) != 0;
    }
}

