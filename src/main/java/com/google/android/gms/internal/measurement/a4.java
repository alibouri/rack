package com.google.android.gms.internal.measurement;

import E7.u;

public final class a4 implements b4 {
    public static final K1 a;

    static {
        u u0 = new u(I1.a("com.google.android.gms.measurement"), "", "", true, true);
        u0.w("measurement.collection.enable_session_stitching_token.client.dev", true);
        u0.w("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        a4.a = u0.w("measurement.session_stitching_token_enabled", false);
        u0.w("measurement.link_sst_to_sid", true);
    }
}

