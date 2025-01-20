package com.google.firebase.appcheck.ktx;

import Bb.q;
import a5.w;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

@Keep
public final class FirebaseAppcheckLegacyRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return q.K(w.x("fire-app-check-ktx", "18.0.0"));
    }
}

