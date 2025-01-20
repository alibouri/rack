package E5;

import Q4.j;
import android.util.Log;
import h2.a;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import r3.n;
import r3.o;

public final class g extends FutureTask {
    public final int X;
    public Object Y;

    public g(h h0, Runnable runnable0, Object object0) {
        this.X = 0;
        this.Y = h0;
        super(runnable0, object0);
    }

    public g(a a0, j j0) {
        this.X = 1;
        this.Y = a0;
        super(j0);
    }

    public g(Callable callable0) {
        this.X = 2;
        super(callable0);
    }

    @Override
    public void done() {
        switch(this.X) {
            case 1: {
                a a0 = (a)this.Y;
                try {
                    Object object0 = this.get();
                    if(!a0.b0.get()) {
                        a0.a(object0);
                        return;
                    }
                }
                catch(InterruptedException interruptedException0) {
                    Log.w("AsyncTask", interruptedException0);
                    return;
                }
                catch(ExecutionException executionException0) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", executionException0.getCause());
                }
                catch(CancellationException unused_ex) {
                    if(!a0.b0.get()) {
                        a0.a(null);
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", throwable0);
                }
                return;
            }
            case 2: {
                try {
                    if(!this.isCancelled()) {
                        try {
                            ((o)this.Y).e(((n)this.get()));
                        }
                        catch(InterruptedException | ExecutionException interruptedException1) {
                            ((o)this.Y).e(new n(interruptedException1));
                        }
                    }
                }
                finally {
                    this.Y = null;
                }
                return;
            }
            default: {
                super.done();
            }
        }
    }

    @Override
    public void setException(Throwable throwable0) {
        if(this.X != 0) {
            super.setException(throwable0);
            return;
        }
        Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = ((h)this.Y).X.d;
        if(thread$UncaughtExceptionHandler0 != null) {
            thread$UncaughtExceptionHandler0.uncaughtException(Thread.currentThread(), throwable0);
        }
        else if(Log.isLoggable("GAv4", 6)) {
            Log.e("GAv4", "MeasurementExecutor: job failed with " + throwable0);
        }
        super.setException(throwable0);
    }
}

