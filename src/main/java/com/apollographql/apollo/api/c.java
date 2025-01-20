package com.apollographql.apollo.api;

import Ec.C;
import Ec.k;
import Ec.q;
import kotlin.jvm.functions.Function1;

public final class c implements Function1 {
    public final q X;
    public final C Y;

    public c(q q0, C c0) {
        this.X = q0;
        this.Y = c0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        return DefaultUploadKt__DefaultUpload_concurrentKt.toUpload$lambda$1$DefaultUploadKt__DefaultUpload_concurrentKt(this.X, this.Y, ((k)object0));
    }
}

