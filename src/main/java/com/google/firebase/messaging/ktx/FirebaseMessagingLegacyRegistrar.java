package com.google.firebase.messaging.ktx;

import Bb.q;
import a5.w;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

@Keep
public final class FirebaseMessagingLegacyRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return q.K(w.x("fire-fcm-ktx", "24.1.0"));
    }
}

