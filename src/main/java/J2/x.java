package J2;

import java.util.concurrent.CancellationException;

public final class x extends CancellationException {
    public final int X;

    public x(int v) {
        this.X = v;
    }
}

