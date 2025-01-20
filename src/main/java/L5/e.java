package L5;

import M5.a;
import android.os.Looper;

public final class e {
    public final a a;
    public final Looper b;
    public static final e c;

    static {
        e.c = new e(new a(), Looper.getMainLooper());  // initializer: Ljava/lang/Object;-><init>()V
    }

    public e(a a0, Looper looper0) {
        this.a = a0;
        this.b = looper0;
    }
}

