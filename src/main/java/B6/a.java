package b6;

import android.os.Build.VERSION;

public abstract class a {
    public static final int a;

    static {
        a.a = Build.VERSION.SDK_INT < 0x1F ? 0 : 0x2000000;
    }
}

