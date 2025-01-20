package com.google.android.gms.internal.measurement;

import E7.u;

public final class k3 implements l3 {
    public static final K1 a;
    public static final K1 b;

    static {
        u u0 = new u(I1.a("com.google.android.gms.measurement"), "", "", true, true);
        u0.w("measurement.collection.event_safelist", true);
        k3.a = u0.w("measurement.service.store_null_safelist", true);
        k3.b = u0.w("measurement.service.store_safelist", true);
    }
}

