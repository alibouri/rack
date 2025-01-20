package b4;

public final class g implements e {
    public final int a;

    public g(int v) {
        this.a = v;
        super();
    }

    @Override  // b4.e
    public final boolean a(Z z0) {
        switch(this.a) {
            case 0: {
                return !(z0 instanceof X) || ((X)z0).f().size() == 0;
            }
            case 1: {
                return z0.b == null;
            }
            default: {
                return false;
            }
        }
    }

    @Override
    public final String toString() {
        switch(this.a) {
            case 0: {
                return "empty";
            }
            case 1: {
                return "root";
            }
            default: {
                return "target";
            }
        }
    }
}

