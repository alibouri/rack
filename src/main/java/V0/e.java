package V0;

import R2.w;
import android.os.Build.VERSION;

public abstract class e {
    public static final d a;

    static {
        w w0 = Build.VERSION.SDK_INT >= 24 ? new w(22, 0) : new H6.e(12);
        e.a = w0;
    }
}

