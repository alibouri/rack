package n7;

import N5.r;
import T5.b;
import j6.z0;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

public final class j implements Executor {
    public final Executor X;
    public final ArrayDeque Y;
    public int Z;
    public long b0;
    public final z0 c0;
    public static final Logger d0;

    static {
        j.d0 = Logger.getLogger(j.class.getName());
    }

    public j(Executor executor0) {
        this.Y = new ArrayDeque();
        this.Z = 1;
        this.b0 = 0L;
        this.c0 = new z0(this);
        r.j(executor0);
        this.X = executor0;
    }

    @Override
    public final void execute(Runnable runnable0) {
        r.j(runnable0);
        synchronized(this.Y) {
            if(this.Z != 3 && this.Z != 4) {
                long v1 = this.b0;
                b b0 = new b(runnable0, 1);
                this.Y.add(b0);
                this.Z = 2;
                try {
                    this.X.execute(this.c0);
                }
                catch(RuntimeException | Error runtimeException0) {
                    boolean z = true;
                    ArrayDeque arrayDeque1 = this.Y;
                    synchronized(arrayDeque1) {
                        if(this.Z != 1 && this.Z != 2 || !this.Y.removeLastOccurrence(b0)) {
                            z = false;
                        }
                        if(runtimeException0 instanceof RejectedExecutionException && !z) {
                            return;
                        }
                    }
                    throw runtimeException0;
                }
                if(this.Z != 2) {
                    return;
                }
                ArrayDeque arrayDeque2 = this.Y;
                synchronized(arrayDeque2) {
                    if(this.b0 == v1 && this.Z == 2) {
                        this.Z = 3;
                    }
                }
                return;
            }
            this.Y.add(runnable0);
        }
    }

    @Override
    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.X + "}";
    }
}

