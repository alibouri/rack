package z0;

import java.util.concurrent.CancellationException;

public final class h extends CancellationException {
    public h(long v) {
        super("Timed out waiting for " + v + " ms");
    }

    @Override
    public final Throwable fillInStackTrace() {
        this.setStackTrace(l.c);
        return this;
    }
}

