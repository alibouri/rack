package n7;

import f1.a;
import i.J;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class h extends f1.h implements ScheduledFuture {
    public final ScheduledFuture f0;

    public h(g g0) {
        this.f0 = g0.b(new J(12, this));
    }

    @Override  // f1.h
    public final void c() {
        this.f0.cancel(this.X instanceof a && ((a)this.X).a);
    }

    @Override
    public final int compareTo(Object object0) {
        return this.f0.compareTo(((Delayed)object0));
    }

    @Override
    public final long getDelay(TimeUnit timeUnit0) {
        return this.f0.getDelay(timeUnit0);
    }
}

