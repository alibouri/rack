package p;

import J2.w;
import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class c extends w {
    public final Object a;
    public final ExecutorService b;
    public volatile Handler c;

    public c() {
        this.a = new Object();
        this.b = Executors.newFixedThreadPool(4, new b());
    }

    public static Handler V(Looper looper0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return A1.b.b(looper0);
        }
        try {
            return (Handler)Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper0, null, Boolean.TRUE);
        }
        catch(IllegalAccessException | InstantiationException | NoSuchMethodException unused_ex) {
            return new Handler(looper0);
        }
        catch(InvocationTargetException unused_ex) {
            return new Handler(looper0);
        }
    }
}

