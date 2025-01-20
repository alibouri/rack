package i3;

public final class k {
    public final int a;
    public static final k b;

    static {
        k.b = new k(0);
    }

    public k(int v) {
        this.a = v;
        super();
    }

    @Override
    public String toString() {
        return this.a == 0 ? "coil.request.NullRequestData" : super.toString();
    }
}

