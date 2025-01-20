package x2;

import M.J;

public final class d extends RuntimeException {
    public final int X;
    public final Throwable Y;

    public d(int v, Throwable throwable0) {
        J.l(v, "callbackName");
        super(throwable0);
        this.X = v;
        this.Y = throwable0;
    }

    @Override
    public final Throwable getCause() {
        return this.Y;
    }
}

