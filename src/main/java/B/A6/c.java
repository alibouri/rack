package a6;

import android.os.Build.VERSION;

public abstract class c {
    public static final int a;

    static {
        c.a = Build.VERSION.SDK_INT < 0x1F ? 0 : 0x2000000;
    }
}

