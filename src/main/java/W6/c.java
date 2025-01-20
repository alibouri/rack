package W6;

public final class c extends b {
    public final Object X;

    public c(Object object0) {
        this.X = object0;
    }

    @Override  // W6.b
    public final Object a() {
        return this.X;
    }

    @Override  // W6.b
    public final boolean b() {
        return true;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof c ? this.X.equals(((c)object0).X) : false;
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode() + 0x598DF91C;
    }

    @Override
    public final String toString() {
        return "Optional.of(" + this.X + ")";
    }
}

