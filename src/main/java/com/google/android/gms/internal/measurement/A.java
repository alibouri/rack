package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

public final class a implements Callable {
    public final int a;
    public w b;

    public a(int v) {
        this.a = v;
        super();
    }

    @Override
    public final Object call() {
        if(this.a != 0) {
            return new i2(this.b.c);
        }
        w w0 = this.b;
        w0.getClass();
        Object object0 = new i2("internal.registerCallback");
        object0.b0 = w0.d;
        return object0;
    }
}

