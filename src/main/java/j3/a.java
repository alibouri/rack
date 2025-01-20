package j3;

import yc.l;

public final class a extends l {
    public final int b;

    public a(int v) {
        this.b = v;
        if(v <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof a && this.b == ((a)object0).b;
    }

    @Override
    public final int hashCode() {
        return this.b;
    }

    @Override
    public final String toString() {
        return String.valueOf(this.b);
    }
}

