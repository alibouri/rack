package com.google.firebase.messaging;

import Bb.z;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

public final class FirebaseMessagingKtxRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return z.X;
    }
}

