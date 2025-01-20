package jc;

import C.n;
import Nb.s;
import android.os.Looper;

public final class k implements Runnable {
    public final int X;
    public final n Y;

    public k(n n0, int v) {
        this.X = v;
        this.Y = n0;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            ((s)this.Y.Z).X = true;
            return;
        }
        Looper.myQueue().addIdleHandler(new j(this));
    }
}

