package T5;

import android.os.Process;
import android.support.v4.media.session.a;

public final class b implements Runnable {
    public final int X;
    public final Runnable Y;

    public b(Runnable runnable0, int v) {
        this.X = v;
        this.Y = runnable0;
        super();
    }

    @Override
    public final void run() {
        switch(this.X) {
            case 0: {
                Process.setThreadPriority(0);
                this.Y.run();
                return;
            }
            case 1: {
                this.Y.run();
                return;
            }
            default: {
                try {
                    this.Y.run();
                }
                catch(Exception exception0) {
                    a.y("Executor", "Background execution failure.", exception0);
                }
            }
        }
    }

    @Override
    public String toString() {
        return this.X == 1 ? this.Y.toString() : super.toString();
    }
}

