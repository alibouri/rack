package g8;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

public final class c implements Serializable, WildcardType {
    public final Type X;
    public final Type Y;

    public c(Type[] arr_type, Type[] arr_type1) {
        boolean z = true;
        d.c(arr_type1.length <= 1);
        d.c(arr_type.length == 1);
        if(arr_type1.length == 1) {
            arr_type1[0].getClass();
            d.d(arr_type1[0]);
            Class class0 = Object.class;
            if(arr_type[0] != class0) {
                z = false;
            }
            d.c(z);
            this.Y = d.b(arr_type1[0]);
            this.X = class0;
            return;
        }
        arr_type[0].getClass();
        d.d(arr_type[0]);
        this.Y = null;
        this.X = d.b(arr_type[0]);
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof WildcardType && d.e(this, ((WildcardType)object0));
    }

    @Override
    public final Type[] getLowerBounds() {
        return this.Y == null ? d.a : new Type[]{this.Y};
    }

    @Override
    public final Type[] getUpperBounds() {
        return new Type[]{this.X};
    }

    @Override
    public final int hashCode() {
        return this.Y == null ? 1 ^ this.X.hashCode() + 0x1F : this.Y.hashCode() + 0x1F ^ this.X.hashCode() + 0x1F;
    }

    @Override
    public final String toString() {
        Type type0 = this.Y;
        if(type0 != null) {
            return "? super " + d.j(type0);
        }
        return this.X == Object.class ? "?" : "? extends " + d.j(this.X);
    }
}

