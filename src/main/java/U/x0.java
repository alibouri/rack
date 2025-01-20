package U;

import Nb.j;

public final class x0 {
    public final p a;

    public x0(p p0) {
        this.a = p0;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof x0 && j.a(this.a, ((x0)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "SkippableUpdater(composer=" + this.a + ')';
    }
}

