package D5;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class d extends Thread {
    public final WeakReference X;
    public final long Y;
    public final CountDownLatch Z;
    public boolean b0;

    public d(b b0, long v) {
        this.X = new WeakReference(b0);
        this.Y = v;
        this.Z = new CountDownLatch(1);
        this.b0 = false;
        this.start();
    }

    @Override
    public final void run() {
        WeakReference weakReference0;
        try {
            weakReference0 = this.X;
            if(!this.Z.await(this.Y, TimeUnit.MILLISECONDS)) {
                b b0 = (b)weakReference0.get();
                if(b0 != null) {
                    b0.b();
                    this.b0 = true;
                }
            }
        }
        catch(InterruptedException unused_ex) {
            b b1 = (b)weakReference0.get();
            if(b1 != null) {
                b1.b();
                this.b0 = true;
            }
        }
    }
}

