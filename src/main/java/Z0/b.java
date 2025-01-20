package z0;

import java.util.concurrent.CancellationException;

public final class b extends CancellationException {
    public static final b X;

    static {
        b.X = new b();  // initializer: Ljava/util/concurrent/CancellationException;-><init>()V
    }

    @Override
    public final Throwable fillInStackTrace() {
        this.setStackTrace(l.c);
        return this;
    }
}

