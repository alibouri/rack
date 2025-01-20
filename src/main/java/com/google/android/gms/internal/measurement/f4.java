package com.google.android.gms.internal.measurement;

import E7.u;

public final class f4 implements c4 {
    public static final K1 a;
    public static final K1 b;

    static {
        u u0 = new u(I1.a("com.google.android.gms.measurement"), "", "", true, true);
        u0.w("measurement.client.sessions.background_sessions_enabled", true);
        f4.a = u0.w("measurement.client.sessions.enable_fix_background_engagement", false);
        u0.w("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f4.b = u0.w("measurement.client.sessions.enable_pause_engagement_in_background", true);
        u0.w("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        u0.w("measurement.client.sessions.session_id_enabled", true);
        u0.u(0L, "measurement.id.client.sessions.enable_fix_background_engagement");
    }
}

