package h2;

import E5.g;
import I5.c;
import Q4.j;
import Y6.b;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a implements Runnable {
    public final g X;
    public volatile int Y;
    public final AtomicBoolean Z;
    public final AtomicBoolean b0;
    public final c c0;
    public static Handler d0;

    public a(c c0) {
        this.c0 = c0;
        this.Y = 1;
        this.Z = new AtomicBoolean();
        this.b0 = new AtomicBoolean();
        this.X = new g(this, new j(this));
    }

    public final void a(Object object0) {
        synchronized(a.class) {
            if(a.d0 == null) {
                a.d0 = new Handler(Looper.getMainLooper());
            }
        }
        a.d0.post(new b(24, this, object0, false));
    }

    @Override
    public final void run() {
        this.c0.b();
    }
}

