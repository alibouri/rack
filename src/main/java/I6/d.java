package I6;

import android.os.Handler;
import android.os.Looper;

public final class d {
    public Object a;
    public static d b;

    public d() {
        this.a = new Object();
        new Handler(Looper.getMainLooper(), new c(0, this));
    }

    public d(Object object0) {
        this.a = object0;
    }

    public void a() {
        synchronized(this.a) {
        }
    }
}

