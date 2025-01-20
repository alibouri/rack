package com.google.android.gms.internal.measurement;

import E7.u;

public final class d3 implements a3 {
    public static final K1 a;
    public static final K1 b;
    public static final K1 c;

    static {
        u u0 = new u(I1.a("com.google.android.gms.measurement"), "", "", true, true);
        d3.a = u0.w("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        d3.b = u0.w("measurement.defensively_copy_bundles_validate_default_params", true);
        d3.c = u0.w("measurement.set_default_event_parameters_with_backfill.service", false);
    }
}

