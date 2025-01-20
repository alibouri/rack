package l4;

public final class b extends i {
    public final byte[] b;
    public final int c;

    public b(int v, byte[] arr_b) {
        arr_b.getClass();
        if(v < 0) {
            throw new IllegalArgumentException("Must be zero or greater");
        }
        this.b = arr_b;
        this.c = v;
    }

    @Override  // l4.i
    public final void E(int v, int v1) {
        if(v1 < 0 || v < 0 || ((long)v) + ((long)v1) - 1L >= this.n()) {
            throw new a(v + this.c, ((long)this.b.length), v1);
        }
    }

    @Override  // l4.i
    public final byte b(int v) {
        this.E(v, 1);
        return this.b[v + this.c];
    }

    @Override  // l4.i
    public final byte[] d(int v, int v1) {
        this.E(v, v1);
        byte[] arr_b = new byte[v1];
        System.arraycopy(this.b, v + this.c, arr_b, 0, v1);
        return arr_b;
    }

    @Override  // l4.i
    public final long n() {
        return (long)(this.b.length - this.c);
    }
}

