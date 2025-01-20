package r8;

public abstract class l extends Exception {
    public static final boolean X;
    public static final StackTraceElement[] Y;

    static {
        l.X = System.getProperty("surefire.test.class.path") != null;
        l.Y = new StackTraceElement[0];
    }

    @Override
    public final Throwable fillInStackTrace() {
        synchronized(this) {
        }
        return null;
    }
}

