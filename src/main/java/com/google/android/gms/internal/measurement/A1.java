package com.google.android.gms.internal.measurement;

public final class a1 extends c2 {
    private static final a1 zzc;
    private static volatile x2 zzd;
    private int zze;
    private l2 zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        a1 a10 = new a1();
        a1.zzc = a10;
        c2.h(a1.class, a10);
    }

    public a1() {
        this.zzf = z2.c0;
        this.zzg = "";
    }

    public final long A() {
        return this.zzh;
    }

    public static Z0 B() {
        return (Z0)a1.zzc.k();
    }

    public final String C() {
        return this.zzg;
    }

    public final l2 D() {
        return this.zzf;
    }

    public final boolean E() {
        return (this.zze & 8) != 0;
    }

    public final boolean F() {
        return (this.zze & 4) != 0;
    }

    public final boolean G() {
        return (this.zze & 2) != 0;
    }

    public final void H() {
        l2 l20 = this.zzf;
        if(!((O1)l20).X) {
            this.zzf = l20.b(l20.size() << 1);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final Object e(int v) {
        switch(P0.a[v - 1]) {
            case 1: {
                return new a1();
            }
            case 2: {
                return new Z0(a1.zzc);  // initializer: Lcom/google/android/gms/internal/measurement/b2;-><init>(Lcom/google/android/gms/internal/measurement/c2;)V
            }
            case 3: {
                return new B2(a1.zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001B\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", d1.class, "zzg", "zzh", "zzi", "zzj"});
            }
            case 4: {
                return a1.zzc;
            }
            case 5: {
                x2 x20 = a1.zzd;
                if(x20 == null) {
                    Class class0 = a1.class;
                    synchronized(class0) {
                        x20 = a1.zzd;
                        if(x20 == null) {
                            x20 = new d2(7);
                            a1.zzd = x20;
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
        return this.zzj;
    }

    public final d1 p(int v) {
        return (d1)this.zzf.get(v);
    }

    public static void q(int v, a1 a10) {
        a10.H();
        a10.zzf.remove(v);
    }

    public static void r(long v, a1 a10) {
        a10.zze |= 4;
        a10.zzi = v;
    }

    public static void s(a1 a10) {
        a10.zzf = z2.c0;
    }

    public static void t(a1 a10, int v, d1 d10) {
        a10.H();
        a10.zzf.set(v, d10);
    }

    public static void u(a1 a10, d1 d10) {
        d10.getClass();
        a10.H();
        a10.zzf.add(d10);
    }

    public static void v(a1 a10, Iterable iterable0) {
        a10.H();
        N1.b(iterable0, a10.zzf);
    }

    public static void w(a1 a10, String s) {
        s.getClass();
        a10.zze |= 1;
        a10.zzg = s;
    }

    public final int x() {
        return this.zzf.size();
    }

    public static void y(long v, a1 a10) {
        a10.zze |= 2;
        a10.zzh = v;
    }

    public final long z() {
        return this.zzi;
    }
}

