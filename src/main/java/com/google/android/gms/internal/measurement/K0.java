package com.google.android.gms.internal.measurement;

import java.util.concurrent.ThreadFactory;

public final class k0 implements ThreadFactory {
    public ThreadFactory a;

    @Override
    public final Thread newThread(Runnable runnable0) {
        Thread thread0 = this.a.newThread(runnable0);
        thread0.setName("ScionFrontendApi");
        return thread0;
    }
}

