package e8;

import java.util.ArrayList;
import java.util.Iterator;

public final class l extends m implements Iterable {
    public final ArrayList X;

    public l() {
        this.X = new ArrayList();
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this || object0 instanceof l && ((l)object0).X.equals(this.X);
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return this.X.iterator();
    }
}

