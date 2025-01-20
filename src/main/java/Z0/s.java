package z0;

public final class s {
    public final int a;

    public s(int v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof s && this.a == ((s)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.a + ')';
    }
}

