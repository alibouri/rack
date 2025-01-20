package g8;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

public final class a implements Serializable, GenericArrayType {
    public final Type X;

    public a(Type type0) {
        this.X = d.b(type0);
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof GenericArrayType && d.e(this, ((GenericArrayType)object0));
    }

    @Override
    public final Type getGenericComponentType() {
        return this.X;
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override
    public final String toString() {
        return d.j(this.X) + "[]";
    }
}

