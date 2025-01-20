package z0;

import Nb.j;
import Y8.o;

public final class a implements k {
    public final int b;

    public a(int v) {
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!a.class.equals(class0)) {
            return false;
        }
        j.d(object0, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.b == ((a)object0).b;
    }

    @Override
    public final int hashCode() {
        return this.b;
    }

    @Override
    public final String toString() {
        return o.z(new StringBuilder("AndroidPointerIcon(type="), this.b, ')');
    }
}

