package com.google.android.gms.internal.measurement;

public final class r0 extends c2 {
    private static final r0 zzc;
    private static volatile x2 zzd;
    private int zze;
    private int zzf;
    private String zzg;
    private l2 zzh;
    private boolean zzi;
    private v0 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        r0 r00 = new r0();
        r0.zzc = r00;
        c2.h(r0.class, r00);
    }

    public r0() {
        this.zzg = "";
        this.zzh = z2.c0;
    }

    public final boolean A() {
        return (this.zze & 8) != 0;
    }

    public final boolean B() {
        return (this.zze & 1) != 0;
    }

    public final boolean C() {
        return (this.zze & 0x40) != 0;
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final Object e(int v) {
        switch(n0.a[v - 1]) {
            case 1: {
                return new r0();
            }
            case 2: {
                return new q0(r0.zzc);  // initializer: Lcom/google/android/gms/internal/measurement/b2;-><init>(Lcom/google/android/gms/internal/measurement/c2;)V
            }
            case 3: {
                return new B2(r0.zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001B\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", t0.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            }
            case 4: {
                return r0.zzc;
            }
            case 5: {
                x2 x20 = r0.zzd;
                if(x20 == null) {
                    Class class0 = r0.class;
                    synchronized(class0) {
                        x20 = r0.zzd;
                        if(x20 == null) {
                            x20 = new d2(7);
                            r0.zzd = x20;
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
        return this.zzh.size();
    }

    public final t0 p(int v) {
        return (t0)this.zzh.get(v);
    }

    public static void q(r0 r00, int v, t0 t00) {
        l2 l20 = r00.zzh;
        if(!((O1)l20).X) {
            r00.zzh = l20.b(l20.size() << 1);
        }
        r00.zzh.set(v, t00);
    }

    public static void r(r0 r00, String s) {
        r00.zze |= 2;
        r00.zzg = s;
    }

    public final int s() {
        return this.zzf;
    }

    public static q0 t() {
        return (q0)r0.zzc.k();
    }

    public final v0 u() {
        return this.zzj == null ? v0.p() : this.zzj;
    }

    public final String v() {
        return this.zzg;
    }

    public final l2 w() {
        return this.zzh;
    }

    public final boolean x() {
        return this.zzk;
    }

    public final boolean y() {
        return this.zzl;
    }

    public final boolean z() {
        return this.zzm;
    }
}

