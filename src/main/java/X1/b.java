package X1;

import android.os.Handler;
import android.os.Looper;

public abstract class b {
    public static Handler a(Looper looper0) {
        return Handler.createAsync(looper0);
    }
}

