package com.google.android.gms.internal.measurement;

import android.os.Build.VERSION;

public abstract class N {
    public static final int a;

    static {
        N.a = Build.VERSION.SDK_INT < 0x1F ? 0 : 0x2000000;
    }
}

