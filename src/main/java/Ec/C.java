package Ec;

import android.os.Process;
import io.sentry.hints.i;
import java.util.concurrent.locks.ReentrantLock;

public final class c extends Thread {
    public final int X;

    public c(String s) {
        this.X = 0;
        super(s);
    }

    public c(ThreadGroup threadGroup0, String s) {
        this.X = 1;
        super(threadGroup0, s);
    }

    @Override
    public final void run() {
        f f0;
        if(this.X != 0) {
            Process.setThreadPriority(19);
            synchronized(this) {
                try {
                    while(true) {
                        this.wait();
                    }
                }
                catch(InterruptedException unused_ex) {
                    return;
                }
            }
        }
        while(true) {
            try {
                ReentrantLock reentrantLock0 = f.h;
                reentrantLock0.lock();
                try {
                    f0 = i.l();
                    if(f0 == f.l) {
                        f.l = null;
                        return;
                    }
                }
                finally {
                    reentrantLock0.unlock();
                }
                if(f0 != null) {
                    f0.k();
                }
            }
            catch(InterruptedException unused_ex) {
            }
        }
    }
}

