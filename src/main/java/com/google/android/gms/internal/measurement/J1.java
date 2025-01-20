package com.google.android.gms.internal.measurement;

public final class j1 extends c2 {
    private static final j1 zzc;
    private static volatile x2 zzd;
    private int zze;
    private int zzf;
    private l2 zzg;

    static {
        j1 j10 = new j1();
        j1.zzc = j10;
        c2.h(j1.class, j10);
    }

    public j1() {
        this.zzf = 1;
        this.zzg = z2.c0;
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final Object e(int v) {
        switch(P0.a[v - 1]) {
            case 1: {
                return new j1();
            }
            case 2: {
                return new u0(j1.zzc);  // initializer: Lcom/google/android/gms/internal/measurement/b2;-><init>(Lcom/google/android/gms/internal/measurement/c2;)V
            }
            case 3: {
                return new B2(j1.zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001B", new Object[]{"zze", "zzf", z0.h, "zzg", b1.class});
            }
            case 4: {
                return j1.zzc;
            }
            case 5: {
                x2 x20 = j1.zzd;
                if(x20 == null) {
                    Class class0 = j1.class;
                    synchronized(class0) {
                        x20 = j1.zzd;
                        if(x20 == null) {
                            x20 = new d2(7);
                            j1.zzd = x20;
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
}

