package S2;

import I2.A;
import L2.e;
import L2.f;
import R2.i;

public final class r implements Runnable {
    public final s X;
    public final i Y;

    public r(s s0, i i0) {
        this.X = s0;
        this.Y = i0;
    }

    @Override
    public final void run() {
        synchronized(this.X.d) {
            if(((r)this.X.b.remove(this.Y)) == null) {
                A.e().a("WrkTimerRunnable", "Timer with " + this.Y + " is already marked as complete.");
            }
            else {
                q q0 = (q)this.X.c.remove(this.Y);
                if(q0 != null) {
                    A.e().a(f.m0, "Exceeded time limits on execution for " + this.Y);
                    e e0 = new e(((f)q0), 0);
                    ((f)q0).f0.execute(e0);
                }
            }
        }
    }
}

