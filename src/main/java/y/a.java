package y;

import java.util.concurrent.CancellationException;

public final class a extends CancellationException {
    public a() {
        super("Anchored drag finished");
    }

    @Override
    public final Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

