package b4;

public final class v extends c0 {
    public final int X;
    public static final v Y;
    public static final v Z;

    static {
        v.Y = new v(0xFF000000);
        v.Z = new v(0);
    }

    public v(int v) {
        this.X = v;
    }

    @Override
    public final String toString() {
        return String.format("#%08x", ((int)this.X));
    }
}

