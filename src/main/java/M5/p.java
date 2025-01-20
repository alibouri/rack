package M5;

import T2.a;
import T5.b;
import a6.d;
import android.os.Looper;
import j6.w0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class p implements Executor {
    public final int X;
    public final Object Y;

    public p() {
        this.X = 4;
        super();
        d d0 = new d(Looper.getMainLooper());  // initializer: Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
        Looper.getMainLooper();
        this.Y = d0;
    }

    public p(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    public p(Looper looper0) {
        this.X = 2;
        super();
        this.Y = new d(looper0, 2);
    }

    @Override
    public final void execute(Runnable runnable0) {
        switch(this.X) {
            case 0: {
                ((d)this.Y).post(runnable0);
                return;
            }
            case 1: {
                ((a)this.Y).c.post(runnable0);
                return;
            }
            case 2: {
                ((d)this.Y).post(runnable0);
                return;
            }
            case 3: {
                ((w0)this.Y).c().z(runnable0);
                return;
            }
            case 4: {
                ((d)this.Y).post(runnable0);
                return;
            }
            default: {
                b b0 = new b(runnable0, 2);
                ((ExecutorService)this.Y).execute(b0);
            }
        }
    }
}

