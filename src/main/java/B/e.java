package B;

import Nb.j;
import androidx.compose.ui.unit.LayoutDirection;

public final class E extends e {
    public final g0.e c;

    public E(g0.e e0) {
        this.c = e0;
    }

    @Override  // B.e
    public final int d(int v, LayoutDirection layoutDirection0) {
        return this.c.a(0, v, layoutDirection0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof E ? j.a(this.c, ((E)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.c.a);
    }

    @Override
    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.c + ')';
    }
}

