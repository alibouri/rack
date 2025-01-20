package Z;

import Nb.j;
import java.util.Map.Entry;

public class a implements Ob.a, Map.Entry {
    public final Object X;
    public final Object Y;

    public a(Object object0, Object object1) {
        this.X = object0;
        this.Y = object1;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        Map.Entry map$Entry0 = object0 instanceof Map.Entry ? ((Map.Entry)object0) : null;
        return map$Entry0 != null && j.a(map$Entry0.getKey(), this.X) && j.a(map$Entry0.getValue(), this.getValue());
    }

    @Override
    public final Object getKey() {
        return this.X;
    }

    @Override
    public Object getValue() {
        return this.Y;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.X == null ? 0 : this.X.hashCode();
        Object object0 = this.getValue();
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v ^ v1;
    }

    @Override
    public Object setValue(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final String toString() {
        return this.X + '=' + this.getValue();
    }
}

