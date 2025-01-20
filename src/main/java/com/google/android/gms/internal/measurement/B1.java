package com.google.android.gms.internal.measurement;

public final class b1 extends c2 {
    private static final b1 zzc;
    private static volatile x2 zzd;
    private int zze;
    private String zzf;
    private long zzg;

    static {
        b1 b10 = new b1();
        b1.zzc = b10;
        c2.h(b1.class, b10);
    }

    public b1() {
        this.zzf = "";
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final Object e(int v) {
        switch(P0.a[v - 1]) {
            case 1: {
                return new b1();
            }
            case 2: {
                return new u0(b1.zzc);  // initializer: Lcom/google/android/gms/internal/measurement/b2;-><init>(Lcom/google/android/gms/internal/measurement/c2;)V
            }
            case 3: {
                return new B2(b1.zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            case 4: {
                return b1.zzc;
            }
            case 5: {
                x2 x20 = b1.zzd;
                if(x20 == null) {
                    Class class0 = b1.class;
                    synchronized(class0) {
                        x20 = b1.zzd;
                        if(x20 == null) {
                            x20 = new d2(7);
                            b1.zzd = x20;
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

