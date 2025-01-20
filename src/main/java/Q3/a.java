package q3;

public final class a extends b {
    public final int b;

    public a(int v) {
        this.b = 0;
        super(v);
    }

    public a(int v, byte b) {
        this.b = v;
        super();
    }

    @Override  // q3.b
    public final int d() {
        return this.b == 0 ? 0x1E00 : 0x1700;
    }
}

