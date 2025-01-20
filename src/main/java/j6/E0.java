package j6;

import N5.r;
import android.os.Process;
import java.util.AbstractQueue;
import java.util.concurrent.BlockingQueue;
import jeb.synthetic.FIN;

public final class e0 extends Thread {
    public final Object X;
    public final AbstractQueue Y;
    public boolean Z;
    public final a0 b0;

    public e0(a0 a00, String s, BlockingQueue blockingQueue0) {
        this.b0 = a00;
        super();
        this.Z = false;
        r.j(blockingQueue0);
        this.X = new Object();
        this.Y = (AbstractQueue)blockingQueue0;
        this.setName(s);
    }

    public final void a() {
        synchronized(this.X) {
            this.X.notifyAll();
        }
    }

    public final void b(InterruptedException interruptedException0) {
        this.b0.b().h0.b(interruptedException0, this.getName() + " was interrupted");
    }

    public final void c() {
        synchronized(this.b0.h0) {
            if(!this.Z) {
                this.b0.i0.release();
                this.b0.h0.notifyAll();
                a0 a00 = this.b0;
                if(this == a00.b0) {
                    a00.b0 = null;
                }
                else if(this == a00.c0) {
                    a00.c0 = null;
                }
                else {
                    a00.b().e0.d("Current scheduler thread is neither worker nor network");
                }
                this.Z = true;
            }
        }
    }

    @Override
    public final void run() {
        for(boolean z = false; !z; z = true) {
            try {
                this.b0.i0.acquire();
            }
            catch(InterruptedException interruptedException0) {
                this.b(interruptedException0);
            }
        }
        int v = FIN.finallyOpen$NT();
        int v1 = Process.getThreadPriority(Process.myTid());
        while(true) {
            b0 b00 = (b0)this.Y.poll();
            if(b00 == null) {
                Object object0 = this.X;
                __monitor_enter(object0);
                try {
                    if(this.Y.peek() == null) {
                        this.b0.getClass();
                        try {
                            this.X.wait(30000L);
                        }
                        catch(InterruptedException interruptedException1) {
                            this.b(interruptedException1);
                        }
                    }
                }
                catch(Throwable throwable0) {
                    __monitor_exit(object0);
                    FIN.finallyExec$NT(v);
                    throw throwable0;
                }
                __monitor_exit(object0);
                Object object1 = this.b0.h0;
                __monitor_enter(object1);
                try {
                    if(this.Y.peek() == null) {
                        this.c();
                        goto label_38;
                    }
                    goto label_43;
                }
                catch(Throwable throwable1) {
                    __monitor_exit(object1);
                    FIN.finallyExec$NT(v);
                    throw throwable1;
                }
            label_38:
                __monitor_exit(object1);
                FIN.finallyCodeBegin$NT(v);
                this.c();
                FIN.finallyCodeEnd$NT(v);
                return;
            label_43:
                __monitor_exit(object1);
            }
            else {
                Process.setThreadPriority((b00.Y ? v1 : 10));
                b00.run();
            }
        }
    }
}

