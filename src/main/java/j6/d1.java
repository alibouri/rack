package j6;

import E.h0;
import android.os.SystemClock;

public final class d1 extends k {
    public final int e;
    public final Object f;

    public d1(Object object0, n0 n00, int v) {
        this.e = v;
        this.f = object0;
        super(n00);
    }

    @Override  // j6.k
    public final void c() {
        if(this.e != 0) {
            ((f1)this.f).x();
            ((f1)this.f).b().m0.d("Starting upload from DelayedRunnable");
            ((f1)this.f).Z.f0();
            return;
        }
        ((a1)((h0)this.f).b0).q();
        a1 a10 = (a1)((h0)this.f).b0;
        ((d0)a10.Y).l0.getClass();
        long v = SystemClock.elapsedRealtime();
        ((h0)this.f).b(v, false, false);
        d0 d00 = (d0)a10.Y;
        n n0 = d00.l();
        d00.l0.getClass();
        n0.u(SystemClock.elapsedRealtime());
    }
}

