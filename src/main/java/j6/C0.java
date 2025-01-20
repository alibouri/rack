package j6;

public final class c0 implements Thread.UncaughtExceptionHandler {
    public final String X;
    public final a0 Y;

    public c0(a0 a00, String s) {
        this.Y = a00;
        this.X = s;
    }

    @Override
    public final void uncaughtException(Thread thread0, Throwable throwable0) {
        synchronized(this) {
            this.Y.b().e0.b(throwable0, this.X);
        }
    }
}

