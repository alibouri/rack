package j6;

import java.util.Iterator;

public final class r implements Iterator {
    public final int X;
    public Iterator Y;

    public r() {
        this.X = 0;
        super();
    }

    public r(Iterator iterator0) {
        this.X = 1;
        super();
        this.Y = iterator0;
    }

    @Override
    public final boolean hasNext() {
        return this.Y.hasNext();
    }

    @Override
    public final Object next() {
        return this.X != 0 ? this.Y.next() : this.Y.next();
    }

    @Override
    public final void remove() {
        throw this.X == 0 ? new UnsupportedOperationException("Remove not supported") : new UnsupportedOperationException("remove() is not allowed due to the internal contraints");
    }
}

