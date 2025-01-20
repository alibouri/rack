package q9;

import Ab.t;
import hd.c;
import kotlin.coroutines.k;

public final class f3 implements Runnable {
    public final int X;
    public final Object Y;

    public f3(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            c.a.n("WaveBarcodeCapMgr");
            c.a.a("Finishing due to inactivity", new Object[0]);
            ((F3)this.Y).b();
            return;
        }
        ((k)this.Y).i(t.a);
    }
}

