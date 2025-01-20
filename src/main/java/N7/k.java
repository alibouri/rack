package n7;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public enum k implements Executor {
    INSTANCE;

    public static final Handler Y;

    static {
        k.Y = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void execute(Runnable runnable0) {
        k.Y.post(runnable0);
    }
}

