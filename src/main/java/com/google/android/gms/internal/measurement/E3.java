package com.google.android.gms.internal.measurement;

import E7.u;

public final class e3 implements f3 {
    public static final K1 a;
    public static final K1 b;

    static {
        u u0 = new u(I1.a("com.google.android.gms.measurement"), "", "", true, true);
        e3.a = u0.w("measurement.set_default_event_parameters_propagate_clear.client.dev", false);
        e3.b = u0.w("measurement.set_default_event_parameters_propagate_clear.service", false);
        u0.u(0L, "measurement.id.set_default_event_parameters_propagate_clear.experiment_id");
    }
}

