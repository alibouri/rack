package com.google.firebase.remoteconfig;

import Bb.z;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

@Keep
public final class FirebaseRemoteConfigKtxRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return z.X;
    }
}

