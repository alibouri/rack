package E;

public final class f {
    public final int a;
    public final int b;
    public final m c;

    public f(int v, int v1, m m0) {
        this.a = v;
        this.b = v1;
        this.c = m0;
        if(v < 0) {
            throw new IllegalArgumentException(("startIndex should be >= 0, but was " + v).toString());
        }
        if(v1 <= 0) {
            throw new IllegalArgumentException(("size should be >0, but was " + v1).toString());
        }
    }
}

