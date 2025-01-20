package w0;

public final class a {
    public final int a;

    public a(int v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof a && this.a == ((a)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        int v = this.a;
        if(v == 1) {
            return "Touch";
        }
        return v == 2 ? "Keyboard" : "Error";
    }
}

