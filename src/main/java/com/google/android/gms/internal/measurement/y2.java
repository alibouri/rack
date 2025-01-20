package com.google.android.gms.internal.measurement;

import E7.u;

public final class Y2 implements Z2 {
    public static final K1 a;
    public static final K1 b;
    public static final K1 c;
    public static final K1 d;

    static {
        u u0 = new u(I1.a("com.google.android.gms.measurement"), "", "", true, true);
        Y2.a = u0.w("measurement.consent.stop_reset_on_storage_denied.client", true);
        Y2.b = u0.w("measurement.consent.stop_reset_on_storage_denied.service", true);
        Y2.c = u0.w("measurement.consent.scrub_audience_data_analytics_consent", true);
        Y2.d = u0.w("measurement.consent.fix_first_open_count_from_snapshot", true);
    }
}

