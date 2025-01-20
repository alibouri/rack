package com.google.firebase.ktx;

import Bb.q;
import a5.w;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

@Keep
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return q.K(w.x("fire-core-ktx", "21.0.0"));
    }
}

