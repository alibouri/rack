package I2;

import java.util.concurrent.atomic.AtomicBoolean;

public final class s implements Runnable {
    public final int X;
    public final AtomicBoolean Y;

    public s(AtomicBoolean atomicBoolean0, int v) {
        this.X = v;
        this.Y = atomicBoolean0;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            this.Y.set(true);
            return;
        }
        this.Y.set(true);
    }
}

