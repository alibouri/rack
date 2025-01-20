package com.google.android.gms.internal.measurement;

import A3.e;
import v.h;

public final class w2 implements C2 {
    public final N1 a;

    public w2(N1 n10) {
        this.a = n10;
    }

    @Override  // com.google.android.gms.internal.measurement.C2
    public final boolean a(Object object0) {
        e.x(object0);
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.C2
    public final int b(c2 c20) {
        return c20.zzb.hashCode();
    }

    @Override  // com.google.android.gms.internal.measurement.C2
    public final boolean c(c2 c20, Object object0) {
        return c20.zzb.equals(((c2)object0).zzb);
    }

    @Override  // com.google.android.gms.internal.measurement.C2
    public final void d(Object object0) {
        d2.g(object0);
        e.x(object0);
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.C2
    public final int e(c2 c20) {
        D2 d20 = c20.zzb;
        int v = d20.d;
        if(v == -1) {
            int v2 = 0;
            for(int v1 = 0; v1 < d20.a; ++v1) {
                v2 += U1.A(3, ((T1)d20.c[v1])) + (U1.R(2, d20.b[v1] >>> 3) + (U1.Q(8) << 1));
            }
            d20.d = v2;
            return v2;
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.measurement.C2
    public final void f(Object object0, Object object1) {
        G1.m(object0, object1);
    }

    @Override  // com.google.android.gms.internal.measurement.C2
    public final void g(Object object0, byte[] arr_b, int v, int v1, R1 r10) {
        if(((c2)object0).zzb == D2.f) {
            ((c2)object0).zzb = D2.e();
        }
        throw h.c(object0);
    }

    @Override  // com.google.android.gms.internal.measurement.C2
    public final void h(Object object0, q2 q20) {
        e.x(object0);
        throw null;
    }

    // Deobfuscation rating: LOW(20)
    @Override  // com.google.android.gms.internal.measurement.C2
    public final c2 zza() {
        return this.a instanceof c2 ? ((c2)((c2)this.a).e(4)) : ((b2)((c2)this.a).e(5)).e();
    }
}

