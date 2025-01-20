package n3;

public final class a extends Exception {
    public final int X;

    public a(String s, int v) {
        super(s);
        this.X = v;
    }

    public a(String s, int v, Exception exception0) {
        super(s, exception0);
        this.X = v;
    }
}

