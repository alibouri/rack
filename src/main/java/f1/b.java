package f1;

public final class b extends Throwable {
    public final int X;

    public b(String s, int v) {
        this.X = v;
        super(s);
    }

    private final Throwable a() {
        synchronized(this) {
        }
        return this;
    }

    private final Throwable b() {
        synchronized(this) {
        }
        return this;
    }

    @Override
    public final Throwable fillInStackTrace() {
        return this;
    }
}

