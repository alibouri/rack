package Z;

public final class o extends n {
    public final int b0;

    public o(int v) {
        this.b0 = v;
        super();
    }

    @Override
    public final Object next() {
        switch(this.b0) {
            case 0: {
                int v1 = this.Z;
                this.Z = v1 + 2;
                return new a(this.X[v1], this.X[v1 + 1]);
            }
            case 1: {
                int v2 = this.Z;
                this.Z = v2 + 2;
                return this.X[v2];
            }
            default: {
                int v = this.Z;
                this.Z = v + 2;
                return this.X[v + 1];
            }
        }
    }
}

