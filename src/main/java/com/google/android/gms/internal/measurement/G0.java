package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

public final class g0 implements Callable {
    @Override
    public final Object call() {
        Object object0 = new b("internal.platform", 4);
        b b0 = new b("getVersion", 0);
        object0.Y.put("getVersion", b0);
        return object0;
    }
}

