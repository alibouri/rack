package com.wave.customer.accountswitcher;

import B9.f;
import B9.g;
import Fb.c;
import I2.m;
import Nb.j;
import R9.Z0;
import S9.o;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

public final class UpdateDeviceSessionsWorker extends CoroutineWorker {
    public final WorkerParameters g;
    public final f h;
    public final g i;
    public static final o j;

    static {
        UpdateDeviceSessionsWorker.j = new o();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public UpdateDeviceSessionsWorker(Context context0, WorkerParameters workerParameters0) {
        j.f(context0, "appContext");
        j.f(workerParameters0, "params");
        super(context0, workerParameters0);
        this.g = workerParameters0;
        this.h = Z0.a(context0).d();
        this.i = new g(context0, 1);
    }

    @Override  // androidx.work.CoroutineWorker
    public final Object c(kotlin.coroutines.g g0) {
        m m0 = this.g.b;
        j.e(m0, "getInputData(...)");
        return UpdateDeviceSessionsWorker.j.a(m0, this.b.c, this.h, this.i, ((c)g0));
    }
}

