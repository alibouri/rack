package o3;

import java.util.Iterator;
import q3.a;

public final class h implements Iterator {
    public a X;
    public Iterator Y;

    @Override
    public final boolean hasNext() {
        return this.Y.hasNext();
    }

    @Override
    public final Object next() {
        return this.Y.next();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("The XMPIterator does not support remove().");
    }
}

