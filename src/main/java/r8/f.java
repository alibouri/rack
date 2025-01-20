package r8;

public final class f extends g {
    public final g c;

    public f(g g0) {
        super(g0.a, g0.b);
        this.c = g0;
    }

    @Override  // r8.g
    public final byte[] a() {
        byte[] arr_b = this.c.a();
        int v = this.a * this.b;
        byte[] arr_b1 = new byte[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_b1[v1] = (byte)(~arr_b[v1] & 0xFF);
        }
        return arr_b1;
    }

    @Override  // r8.g
    public final byte[] b(int v, byte[] arr_b) {
        byte[] arr_b1 = this.c.b(v, arr_b);
        for(int v1 = 0; v1 < this.a; ++v1) {
            arr_b1[v1] = (byte)(~arr_b1[v1] & 0xFF);
        }
        return arr_b1;
    }

    @Override  // r8.g
    public final boolean c() {
        return this.c.c();
    }

    @Override  // r8.g
    public final g d() {
        return new f(this.c.d());
    }
}

