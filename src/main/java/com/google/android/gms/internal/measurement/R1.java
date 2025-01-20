package com.google.android.gms.internal.measurement;

public final class r1 extends c2 {
    private static final r1 zzc;
    private static volatile x2 zzd;
    private int zze;
    private String zzf;
    private l2 zzg;

    static {
        r1 r10 = new r1();
        r1.zzc = r10;
        c2.h(r1.class, r10);
    }

    public r1() {
        this.zzf = "";
        this.zzg = z2.c0;
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final Object e(int v) {
        switch(u1.a[v - 1]) {
            case 1: {
                return new r1();
            }
            case 2: {
                return new u0(r1.zzc);  // initializer: Lcom/google/android/gms/internal/measurement/b2;-><init>(Lcom/google/android/gms/internal/measurement/c2;)V
            }
            case 3: {
                return new B2(r1.zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001B", new Object[]{"zze", "zzf", "zzg", t1.class});
            }
            case 4: {
                return r1.zzc;
            }
            case 5: {
                x2 x20 = r1.zzd;
                if(x20 == null) {
                    Class class0 = r1.class;
                    synchronized(class0) {
                        x20 = r1.zzd;
                        if(x20 == null) {
                            x20 = new d2(7);
                            r1.zzd = x20;
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

    public final String o() {
        return this.zzf;
    }

    public final l2 p() {
        return this.zzg;
    }
}

