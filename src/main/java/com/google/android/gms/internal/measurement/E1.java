package com.google.android.gms.internal.measurement;

public final class e1 extends c2 {
    private static final e1 zzc;
    private static volatile x2 zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private S0 zzh;

    static {
        e1 e10 = new e1();
        e1.zzc = e10;
        c2.h(e1.class, e10);
    }

    public e1() {
        this.zzf = "";
        this.zzg = "";
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final Object e(int v) {
        switch(P0.a[v - 1]) {
            case 1: {
                return new e1();
            }
            case 2: {
                return new u0(e1.zzc);  // initializer: Lcom/google/android/gms/internal/measurement/b2;-><init>(Lcom/google/android/gms/internal/measurement/c2;)V
            }
            case 3: {
                return new B2(e1.zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            }
            case 4: {
                return e1.zzc;
            }
            case 5: {
                x2 x20 = e1.zzd;
                if(x20 == null) {
                    Class class0 = e1.class;
                    synchronized(class0) {
                        x20 = e1.zzd;
                        if(x20 == null) {
                            x20 = new d2(7);
                            e1.zzd = x20;
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

