package q9;

import Nb.j;

public final class e0 extends RuntimeException {
    public final Throwable X;

    public e0(Throwable throwable0) {
        j.f(throwable0, "cause");
        super("Apollo internal error", throwable0);
        this.X = throwable0;
    }

    @Override
    public final Throwable getCause() {
        return this.X;
    }
}

