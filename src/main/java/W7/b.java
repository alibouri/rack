package W7;

import java.util.concurrent.ScheduledExecutorService;
import o.N0;
import o6.k;
import o6.p;

public final class b implements Runnable {
    public final int X;
    public final long Y;
    public final N0 Z;

    public b(N0 n00, int v, long v1) {
        this.Z = n00;
        this.X = v;
        this.Y = v1;
    }

    @Override
    public final void run() {
        synchronized(this.Z) {
            p p0 = ((h)this.Z.b0).c(4 - this.X);
            o6.h h0 = ((c)this.Z.c0).b();
            k.f(new o6.h[]{p0, h0}).d(((ScheduledExecutorService)this.Z.e0), new a(this.Z, p0, h0, this.Y, this.X - 1));
        }
    }
}

