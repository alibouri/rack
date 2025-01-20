package u9;

import Nb.j;
import com.skydoves.balloon.Balloon;

public final class d implements Runnable {
    public final Balloon X;

    public d(Balloon balloon0) {
        j.f(balloon0, "balloon");
        super();
        this.X = balloon0;
    }

    @Override
    public final void run() {
        this.X.d();
    }
}

