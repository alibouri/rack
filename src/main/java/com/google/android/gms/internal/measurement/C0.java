package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

public abstract class c0 implements Runnable {
    public final long X;
    public final long Y;
    public final boolean Z;
    public final e0 b0;

    public c0(e0 e00, boolean z) {
        this.b0 = e00;
        e00.b.getClass();
        this.X = System.currentTimeMillis();
        e00.b.getClass();
        this.Y = SystemClock.elapsedRealtime();
        this.Z = z;
    }

    public abstract void a();

    public void b() {
    }

    @Override
    public final void run() {
        e0 e00 = this.b0;
        if(e00.f) {
            this.b();
            return;
        }
        try {
            this.a();
        }
        catch(Exception exception0) {
            e00.f(exception0, false, this.Z);
            this.b();
        }
    }
}

