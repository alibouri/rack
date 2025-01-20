package Q7;

import T7.k;
import com.google.firebase.perf.util.Timer;

public final class a implements Runnable {
    public final int X;
    public final b Y;
    public final Timer Z;

    public a(b b0, Timer timer0, int v) {
        this.X = v;
        this.Y = b0;
        this.Z = timer0;
        super();
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            b b0 = this.Y;
            k k0 = b0.b(this.Z);
            if(k0 != null) {
                b0.a.add(k0);
            }
            return;
        }
        b b1 = this.Y;
        k k1 = b1.b(this.Z);
        if(k1 != null) {
            b1.a.add(k1);
        }
    }
}

