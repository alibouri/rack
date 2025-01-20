package e8;

import g8.l;

public final class p extends m {
    public final l X;

    public p() {
        this.X = new l();
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this || object0 instanceof p && ((p)object0).X.equals(this.X);
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }
}

