package com.google.android.gms.internal.measurement;

import E7.u;

public final class p3 implements m3 {
    public static final K1 a;
    public static final K1 b;

    static {
        u u0 = new u(I1.a("com.google.android.gms.measurement"), "", "", true, true);
        u0.w("measurement.client.ad_id_consent_fix", true);
        u0.w("measurement.service.consent.aiid_reset_fix", false);
        u0.w("measurement.service.consent.aiid_reset_fix2", true);
        u0.w("measurement.service.consent.app_start_fix", true);
        p3.a = u0.w("measurement.service.consent.params_on_fx", true);
        p3.b = u0.w("measurement.service.consent.pfo_on_fx", true);
    }
}

