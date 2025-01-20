package n7;

import android.os.StrictMode.ThreadPolicy;
import io.sentry.M1;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class a implements ThreadFactory {
    public final AtomicLong a;
    public final String b;
    public final int c;
    public final StrictMode.ThreadPolicy d;
    public static final ThreadFactory e;

    static {
        a.e = Executors.defaultThreadFactory();
    }

    public a(String s, int v, StrictMode.ThreadPolicy strictMode$ThreadPolicy0) {
        this.a = new AtomicLong();
        this.b = s;
        this.c = v;
        this.d = strictMode$ThreadPolicy0;
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        M1 m10 = new M1(this, 15, runnable0);
        Thread thread0 = a.e.newThread(m10);
        long v = this.a.getAndIncrement();
        thread0.setName(this.b + " Thread #" + v);
        return thread0;
    }
}

