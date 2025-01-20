package g8;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public final class b implements Serializable, ParameterizedType {
    public final Type X;
    public final Type Y;
    public final Type[] Z;

    public b(Type type0, Type type1, Type[] arr_type) {
        boolean z = true;
        super();
        if(type1 instanceof Class) {
            if(type0 == null && (!Modifier.isStatic(((Class)type1).getModifiers()) && ((Class)type1).getEnclosingClass() != null)) {
                z = false;
            }
            d.c(z);
        }
        this.X = type0 == null ? null : d.b(type0);
        this.Y = d.b(type1);
        Type[] arr_type1 = (Type[])arr_type.clone();
        this.Z = arr_type1;
        for(int v = 0; v < arr_type1.length; ++v) {
            this.Z[v].getClass();
            d.d(this.Z[v]);
            this.Z[v] = d.b(this.Z[v]);
        }
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof ParameterizedType && d.e(this, ((ParameterizedType)object0));
    }

    @Override
    public final Type[] getActualTypeArguments() {
        return (Type[])this.Z.clone();
    }

    @Override
    public final Type getOwnerType() {
        return this.X;
    }

    @Override
    public final Type getRawType() {
        return this.Y;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.Z);
        int v1 = this.Y.hashCode();
        return this.X == null ? v ^ v1 : v ^ v1 ^ this.X.hashCode();
    }

    @Override
    public final String toString() {
        Type[] arr_type = this.Z;
        Type type0 = this.Y;
        if(arr_type.length == 0) {
            return d.j(type0);
        }
        StringBuilder stringBuilder0 = new StringBuilder((arr_type.length + 1) * 30);
        stringBuilder0.append(d.j(type0));
        stringBuilder0.append("<");
        stringBuilder0.append(d.j(arr_type[0]));
        for(int v = 1; v < arr_type.length; ++v) {
            stringBuilder0.append(", ");
            stringBuilder0.append(d.j(arr_type[v]));
        }
        stringBuilder0.append(">");
        return stringBuilder0.toString();
    }
}

