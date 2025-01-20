package X1;

public final class o implements n {
    public final int X;
    public int Y;
    public int Z;

    public o(int v) {
        this.Y = -1;
        this.Z = -1;
        this.X = v;
    }

    @Override  // X1.n
    public final Object a() {
        return this;
    }

    @Override  // X1.n
    public final boolean d(CharSequence charSequence0, int v, int v1, u u0) {
        int v2 = this.X;
        if(v <= v2 && v2 < v1) {
            this.Y = v;
            this.Z = v1;
            return false;
        }
        return v1 <= v2;
    }
}

