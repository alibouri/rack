package com.google.android.gms.internal.measurement;

import android.os.Build.VERSION;
import android.os.UserManager;

public abstract class y1 {
    public static UserManager a;
    public static volatile boolean b;

    static {
        y1.b = !y1.a();
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }
}

