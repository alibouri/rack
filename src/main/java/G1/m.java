package G1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class m implements Executor {
    public final int X;
    public final Handler Y;

    public m(int v) {
        this.X = v;
        switch(v) {
            case 2: {
                super();
                this.Y = new Handler(Looper.getMainLooper());
                return;
            }
            case 3: {
                super();
                this.Y = new Handler(Looper.getMainLooper());
                return;
            }
            default: {
                super();
                this.Y = new Handler(Looper.getMainLooper());
            }
        }
    }

    public m(Handler handler0) {
        this.X = 0;
        super();
        this.Y = handler0;
    }

    @Override
    public final void execute(Runnable runnable0) {
        switch(this.X) {
            case 0: {
                runnable0.getClass();
                Handler handler0 = this.Y;
                if(!handler0.post(runnable0)) {
                    throw new RejectedExecutionException(handler0 + " is shutting down");
                }
                return;
            }
            case 1: {
                this.Y.post(runnable0);
                return;
            }
            case 2: {
                this.Y.post(runnable0);
                return;
            }
            default: {
                this.Y.post(runnable0);
            }
        }
    }
}

