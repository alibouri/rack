package com.google.android.gms.internal.measurement;

import java.util.List;

public final class q1 extends c2 {
    private static final q1 zzc;
    private static volatile x2 zzd;
    private l2 zze;

    static {
        q1 q10 = new q1();
        q1.zzc = q10;
        c2.h(q1.class, q10);
    }

    public q1() {
        this.zze = z2.c0;
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final Object e(int v) {
        switch(u1.a[v - 1]) {
            case 1: {
                return new q1();
            }
            case 2: {
                return new u0(q1.zzc);  // initializer: Lcom/google/android/gms/internal/measurement/b2;-><init>(Lcom/google/android/gms/internal/measurement/c2;)V
            }
            case 3: {
                return new B2(q1.zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"zze", r1.class});
            }
            case 4: {
                return q1.zzc;
            }
            case 5: {
                x2 x20 = q1.zzd;
                if(x20 == null) {
                    Class class0 = q1.class;
                    synchronized(class0) {
                        x20 = q1.zzd;
                        if(x20 == null) {
                            x20 = new d2(7);
                            q1.zzd = x20;
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
        return this.zze.size();
    }

    public static q1 p() {
        return q1.zzc;
    }

    public final List q() {
        return this.zze;
    }
}

