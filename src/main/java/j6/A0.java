package j6;

import N5.r;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class a0 extends o0 {
    public e0 b0;
    public e0 c0;
    public final PriorityBlockingQueue d0;
    public final LinkedBlockingQueue e0;
    public final c0 f0;
    public final c0 g0;
    public final Object h0;
    public final Semaphore i0;
    public static final AtomicLong j0;

    static {
        a0.j0 = new AtomicLong(0x8000000000000000L);
    }

    public a0(d0 d00) {
        super(d00);
        this.h0 = new Object();
        this.i0 = new Semaphore(2);
        this.d0 = new PriorityBlockingQueue();
        this.e0 = new LinkedBlockingQueue();
        this.f0 = new c0(this, "Thread death: Uncaught exception on worker thread");
        this.g0 = new c0(this, "Thread death: Uncaught exception on network thread");
    }

    public final void A(Runnable runnable0) {
        this.r();
        this.w(new b0(this, runnable0, true, "Task exception on worker thread"));
    }

    public final boolean B() {
        return Thread.currentThread() == this.b0;
    }

    public final void C() {
        if(Thread.currentThread() != this.c0) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override  // O3.j
    public final void q() {
        if(Thread.currentThread() != this.b0) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override  // j6.o0
    public final boolean t() {
        return false;
    }

    public final b0 u(Callable callable0) {
        this.r();
        b0 b00 = new b0(this, callable0, false);
        if(Thread.currentThread() == this.b0) {
            if(!this.d0.isEmpty()) {
                this.b().h0.d("Callable skipped the worker queue.");
            }
            b00.run();
            return b00;
        }
        this.w(b00);
        return b00;
    }

    public final Object v(AtomicReference atomicReference0, long v, String s, Runnable runnable0) {
        synchronized(atomicReference0) {
            this.c().z(runnable0);
            try {
                atomicReference0.wait(v);
            }
            catch(InterruptedException unused_ex) {
                this.b().h0.d("Interrupted waiting for " + s);
                return null;
            }
        }
        Object object0 = atomicReference0.get();
        if(object0 == null) {
            this.b().h0.d("Timed out waiting for " + s);
        }
        return object0;
    }

    public final void w(b0 b00) {
        synchronized(this.h0) {
            this.d0.add(b00);
            e0 e00 = this.b0;
            if(e00 == null) {
                e0 e01 = new e0(this, "Measurement Worker", this.d0);
                this.b0 = e01;
                e01.setUncaughtExceptionHandler(this.f0);
                this.b0.start();
            }
            else {
                e00.a();
            }
        }
    }

    public final void x(Runnable runnable0) {
        this.r();
        b0 b00 = new b0(this, runnable0, false, "Task exception on network thread");
        synchronized(this.h0) {
            this.e0.add(b00);
            e0 e00 = this.c0;
            if(e00 == null) {
                e0 e01 = new e0(this, "Measurement Network", this.e0);
                this.c0 = e01;
                e01.setUncaughtExceptionHandler(this.g0);
                this.c0.start();
            }
            else {
                e00.a();
            }
        }
    }

    public final b0 y(Callable callable0) {
        this.r();
        b0 b00 = new b0(this, callable0, true);
        if(Thread.currentThread() == this.b0) {
            b00.run();
            return b00;
        }
        this.w(b00);
        return b00;
    }

    public final void z(Runnable runnable0) {
        this.r();
        r.j(runnable0);
        this.w(new b0(this, runnable0, false, "Task exception on worker thread"));
    }
}

