package com.google.android.gms.internal.measurement;

import E7.u;

public final class q3 implements r3 {
    public static final K1 a;
    public static final K1 b;
    public static final K1 c;

    static {
        u u0 = new u(I1.a("com.google.android.gms.measurement"), "", "", true, true);
        u0.w("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        q3.a = u0.w("measurement.audience.refresh_event_count_filters_timestamp", false);
        q3.b = u0.w("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        q3.c = u0.w("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}

