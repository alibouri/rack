package com.google.firebase.analytics.ktx;

import Bb.q;
import a5.w;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

public final class FirebaseAnalyticsLegacyRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return q.K(w.x("fire-analytics-ktx", "22.1.2"));
    }
}

