package com.google.android.gms.internal.measurement;

import E7.u;

public final class j3 implements g3 {
    public static final K1 a;
    public static final K1 b;
    public static final K1 c;

    static {
        u u0 = new u(I1.a("com.google.android.gms.measurement"), "", "", true, true);
        u0.w("measurement.dma_consent.client", true);
        u0.w("measurement.dma_consent.client_bow_check2", true);
        u0.w("measurement.dma_consent.separate_service_calls_fix", true);
        u0.w("measurement.dma_consent.service", true);
        j3.a = u0.w("measurement.dma_consent.service_database_update_fix", true);
        u0.w("measurement.dma_consent.service_dcu_event", true);
        j3.b = u0.w("measurement.dma_consent.service_dcu_event2", true);
        u0.w("measurement.dma_consent.service_npa_remote_default", true);
        u0.w("measurement.dma_consent.service_split_batch_on_consent", true);
        u0.w("measurement.dma_consent.set_consent_inline_on_worker", true);
        j3.c = u0.w("measurement.dma_consent.setting_npa_inline_fix", true);
    }
}

