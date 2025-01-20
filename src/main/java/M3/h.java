package m3;

import android.os.SystemClock;
import java.io.File;

public final class h {
    public static final h a;
    public static final File b;
    public static int c;
    public static long d;
    public static boolean e;

    static {
        h.a = new h();  // initializer: Ljava/lang/Object;-><init>()V
        h.b = new File("/proc/self/fd");
        h.c = 30;
        h.d = SystemClock.uptimeMillis();
        h.e = true;
    }
}

