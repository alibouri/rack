package J;

import android.os.Build.VERSION;

public abstract class d {
    public static final boolean a;

    static {
        d.a = Build.VERSION.SDK_INT >= 34;
    }
}

