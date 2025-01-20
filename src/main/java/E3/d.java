package E3;

import android.util.Log;
import java.util.HashSet;

public abstract class d {
    public static final c a;

    static {
        d.a = new c();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public static void a() {
        d.a.getClass();
    }

    public static void b(String s) {
        d.a.getClass();
        HashSet hashSet0 = c.a;
        if(!hashSet0.contains(s)) {
            Log.w("LOTTIE", s, null);
            hashSet0.add(s);
        }
    }

    public static void c(String s, Throwable throwable0) {
        d.a.getClass();
        HashSet hashSet0 = c.a;
        if(!hashSet0.contains(s)) {
            Log.w("LOTTIE", s, throwable0);
            hashSet0.add(s);
        }
    }
}

