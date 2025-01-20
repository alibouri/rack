package S2;

import E7.n;
import Nb.j;
import Y6.b;
import d6.d;
import io.sentry.M1;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class h implements Executor {
    public final int X;
    public final Object Y;
    public final ArrayDeque Z;
    public Runnable b0;
    public final Executor c0;

    public h(d d0) {
        this.X = 1;
        super();
        this.Y = new Object();
        this.Z = new ArrayDeque();
        this.c0 = d0;
    }

    public h(Executor executor0) {
        this.X = 2;
        j.f(executor0, "executor");
        super();
        this.c0 = executor0;
        this.Z = new ArrayDeque();
        this.Y = new Object();
    }

    public h(ExecutorService executorService0) {
        this.X = 0;
        super();
        this.c0 = executorService0;
        this.Z = new ArrayDeque();
        this.Y = new Object();
    }

    private final void a(Runnable runnable0) {
        synchronized(this.Y) {
            b b0 = new b(this, 18, runnable0);
            this.Z.add(b0);
            if(this.b0 == null) {
                this.d();
            }
        }
    }

    private final void b(Runnable runnable0) {
        synchronized(this.Y) {
            n n0 = new n(this, 26, runnable0);
            this.Z.add(n0);
            if(this.b0 == null) {
                this.d();
            }
        }
    }

    public boolean c() {
        synchronized(this.Y) {
        }
        return !this.Z.isEmpty();
    }

    public final void d() {
        switch(this.X) {
            case 0: {
                Runnable runnable0 = (Runnable)this.Z.poll();
                this.b0 = runnable0;
                if(runnable0 != null) {
                    ((ExecutorService)this.c0).execute(runnable0);
                }
                return;
            }
            case 1: {
                this.e();
                return;
            }
            default: {
                Object object0 = this.Y;
                synchronized(object0) {
                    Object object1 = this.Z.poll();
                    this.b0 = (Runnable)object1;
                    if(object1 != null) {
                        this.c0.execute(((Runnable)object1));
                    }
                }
            }
        }
    }

    private final void e() {
        synchronized(this.Y) {
            Runnable runnable0 = (Runnable)this.Z.poll();
            this.b0 = runnable0;
            if(runnable0 != null) {
                ((d)this.c0).execute(runnable0);
            }
        }
    }

    @Override
    public final void execute(Runnable runnable0) {
        switch(this.X) {
            case 0: {
                this.a(runnable0);
                return;
            }
            case 1: {
                this.b(runnable0);
                return;
            }
            default: {
                j.f(runnable0, "command");
                Object object0 = this.Y;
                synchronized(object0) {
                    M1 m10 = new M1(runnable0, 17, this);
                    this.Z.offer(m10);
                    if(this.b0 == null) {
                        this.d();
                    }
                }
            }
        }
    }
}

