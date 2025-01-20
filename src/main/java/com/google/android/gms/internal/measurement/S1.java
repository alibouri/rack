package com.google.android.gms.internal.measurement;

public final class s1 extends c2 {
    private static final s1 zzc;
    private static volatile x2 zzd;
    private int zze;
    private l2 zzf;
    private q1 zzg;

    static {
        s1 s10 = new s1();
        s1.zzc = s10;
        c2.h(s1.class, s10);
    }

    public s1() {
        this.zzf = z2.c0;
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final Object e(int v) {
        switch(u1.a[v - 1]) {
            case 1: {
                return new s1();
            }
            case 2: {
                return new u0(s1.zzc);  // initializer: Lcom/google/android/gms/internal/measurement/b2;-><init>(Lcom/google/android/gms/internal/measurement/c2;)V
            }
            case 3: {
                return new B2(s1.zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001B\u0002ဉ\u0000", new Object[]{"zze", "zzf", t1.class, "zzg"});
            }
            case 4: {
                return s1.zzc;
            }
            case 5: {
                x2 x20 = s1.zzd;
                if(x20 == null) {
                    Class class0 = s1.class;
                    synchronized(class0) {
                        x20 = s1.zzd;
                        if(x20 == null) {
                            x20 = new d2(7);
                            s1.zzd = x20;
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

    public final q1 o() {
        return this.zzg == null ? q1.p() : this.zzg;
    }

    public final l2 p() {
        return this.zzf;
    }
}

