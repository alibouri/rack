package W6;

import hb.h;
import java.io.Serializable;
import java.util.Arrays;

public final class g implements d, Serializable {
    public final Object X;

    public g(Object object0) {
        this.X = object0;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof g ? h.M(this.X, ((g)object0).X) : false;
    }

    @Override  // W6.d
    public final Object get() {
        return this.X;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X});
    }

    @Override
    public final String toString() {
        return "Suppliers.ofInstance(" + this.X + ")";
    }
}

