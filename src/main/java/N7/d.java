package n7;

import i.J;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class d implements g {
    public final int X;
    public final f Y;
    public final Runnable Z;
    public final long b0;
    public final long c0;
    public final TimeUnit d0;

    public d(f f0, Runnable runnable0, long v, long v1, TimeUnit timeUnit0, int v2) {
        this.X = v2;
        this.Y = f0;
        this.Z = runnable0;
        this.b0 = v;
        this.c0 = v1;
        this.d0 = timeUnit0;
        super();
    }

    @Override  // n7.g
    public final ScheduledFuture b(J j0) {
        if(this.X != 0) {
            this.Y.getClass();
            e e0 = new e(this.Y, this.Z, j0, 2);
            return this.Y.Y.scheduleWithFixedDelay(e0, this.b0, this.c0, this.d0);
        }
        this.Y.getClass();
        e e1 = new e(this.Y, this.Z, j0, 0);
        return this.Y.Y.scheduleAtFixedRate(e1, this.b0, this.c0, this.d0);
    }
}

