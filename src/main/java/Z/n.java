package Z;

import Ob.a;
import java.util.Iterator;

public abstract class n implements a, Iterator {
    public Object[] X;
    public int Y;
    public int Z;

    public n() {
        this.X = m.e.d;
    }

    public final void a(Object[] arr_object, int v, int v1) {
        this.X = arr_object;
        this.Y = v;
        this.Z = v1;
    }

    @Override
    public final boolean hasNext() {
        return this.Z < this.Y;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

