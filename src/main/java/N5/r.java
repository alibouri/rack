package N5;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

public abstract class r {
    public static final Object a;
    public static boolean b;
    public static int c;

    static {
        r.a = new Object();
    }

    public static void a(String s, boolean z) {
        if(!z) {
            throw new IllegalArgumentException(s);
        }
    }

    public static void b(boolean z) {
        if(!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(boolean z, String s, Object[] arr_object) {
        if(!z) {
            throw new IllegalArgumentException(String.format(s, arr_object));
        }
    }

    public static void d(Handler handler0) {
        Looper looper0 = Looper.myLooper();
        if(looper0 != handler0.getLooper()) {
            String s = looper0 == null ? "null current looper" : looper0.getThread().getName();
            throw new IllegalStateException("Must be called on " + handler0.getLooper().getThread().getName() + " thread, but got " + s + ".");
        }
    }

    public static void e(String s) {
        if(Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(s);
        }
    }

    public static void f(String s) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void g(String s, String s1) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException(s1);
        }
    }

    public static void h() {
        Looper looper0 = Looper.myLooper();
        if(looper0 != null) {
            String s = looper0.getThread().getName();
            switch(s) {
                case 0: {
                    break;
                }
                case 10986: {
                    throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
                }
                default: {
                    if(s.equals("GoogleApiHandler")) {
                        throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
                    }
                }
            }
        }
    }

    public static void i(String s) {
        if(Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(s);
        }
    }

    public static void j(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void k(Object object0, String s) {
        if(object0 == null) {
            throw new NullPointerException(s);
        }
    }

    public static void l(String s, boolean z) {
        if(!z) {
            throw new IllegalStateException(String.valueOf(s));
        }
    }

    // Deobfuscation rating: LOW(20)
    public static boolean m(Object object0, Object object1) {
        return object0 == object1 || object0 != null && object0.equals(object1);
    }
}

