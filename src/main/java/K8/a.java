package k8;

import g8.d;
import java.lang.reflect.Type;

public final class a {
    public final Class a;
    public final Type b;
    public final int c;

    public a(Type type0) {
        type0.getClass();
        Type type1 = d.b(type0);
        this.b = type1;
        this.a = d.g(type1);
        this.c = type1.hashCode();
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof a && d.e(this.b, ((a)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.c;
    }

    @Override
    public final String toString() {
        return d.j(this.b);
    }
}

