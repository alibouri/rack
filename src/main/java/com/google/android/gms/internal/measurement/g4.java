package com.google.android.gms.internal.measurement;

import E7.u;

public final class g4 implements h4 {
    public static final K1 a;
    public static final K1 b;
    public static final K1 c;
    public static final K1 d;
    public static final K1 e;

    static {
        u u0 = new u(I1.a("com.google.android.gms.measurement"), "", "", true, true);
        g4.a = u0.w("measurement.sgtm.google_signal.enable", false);
        g4.b = u0.w("measurement.sgtm.preview_mode_enabled", true);
        g4.c = u0.w("measurement.sgtm.rollout_percentage_fix", false);
        g4.d = u0.w("measurement.sgtm.service", true);
        g4.e = u0.w("measurement.sgtm.upload_queue", false);
        u0.u(0L, "measurement.id.sgtm");
    }
}

