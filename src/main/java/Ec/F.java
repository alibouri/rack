package Ec;

import Nb.j;
import io.sentry.hints.i;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class f extends N {
    public int e;
    public f f;
    public long g;
    public static final ReentrantLock h;
    public static final Condition i;
    public static final long j;
    public static final long k;
    public static f l;

    static {
        ReentrantLock reentrantLock0 = new ReentrantLock();
        f.h = reentrantLock0;
        Condition condition0 = reentrantLock0.newCondition();
        j.e(condition0, "newCondition(...)");
        f.i = condition0;
        long v = TimeUnit.SECONDS.toMillis(60L);
        f.j = v;
        f.k = TimeUnit.MILLISECONDS.toNanos(v);
    }

    public final void i() {
        long v = this.c;
        boolean z = this.a;
        if(v == 0L && !z) {
            return;
        }
        ReentrantLock reentrantLock0 = f.h;
        reentrantLock0.lock();
        try {
            if(this.e == 0) {
                this.e = 1;
                i.f(this, v, z);
                return;
            }
        }
        finally {
            reentrantLock0.unlock();
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final boolean j() {
        ReentrantLock reentrantLock0 = f.h;
        reentrantLock0.lock();
        try {
            int v1 = this.e;
            boolean z = false;
            this.e = 0;
            if(v1 == 1) {
                for(f f0 = f.l; f0 != null; f0 = f1) {
                    f f1 = f0.f;
                    if(f1 == this) {
                        f0.f = this.f;
                        this.f = null;
                        return false;
                    }
                }
                throw new IllegalStateException("node was not found in the queue");
            }
            if(v1 == 2) {
                z = true;
            }
            return z;
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    public void k() {
    }
}

