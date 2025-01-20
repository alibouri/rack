package com.google.android.gms.internal.measurement;

import T8.m;

public abstract class w1 {
    public static final m a;

    static {
        synchronized(x1.class) {
            if(x1.a == null) {
                x1.i(new m());
            }
        }
        w1.a = x1.a;
    }
}

