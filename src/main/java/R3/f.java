package r3;

import A3.c;
import android.graphics.drawable.Drawable.Callback;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

public final class f implements Runnable {
    public final int X;
    public final j Y;

    public f(j j0, int v) {
        this.X = v;
        this.Y = j0;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            j j0 = this.Y;
            Drawable.Callback drawable$Callback0 = j0.getCallback();
            if(drawable$Callback0 != null) {
                drawable$Callback0.invalidateDrawable(j0);
            }
            return;
        }
        j j1 = this.Y;
        Semaphore semaphore0 = j1.E0;
        c c0 = j1.j0;
        if(c0 != null) {
            try {
                semaphore0.acquire();
                c0.m(j1.Y.b());
                if(j.M0 && j1.D0) {
                    if(j1.F0 == null) {
                        j1.F0 = new Handler(Looper.getMainLooper());
                        j1.G0 = new f(j1, 1);
                    }
                    j1.F0.post(j1.G0);
                }
            }
            catch(InterruptedException unused_ex) {
            }
            finally {
                semaphore0.release();
            }
        }
    }
}

