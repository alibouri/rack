package d6;

import X6.l;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class m extends l implements ListIterator {
    public final int Y;
    public int Z;
    public final o b0;

    public m(o o0, int v) {
        int v1 = o0.size();
        super(1);
        if(v < 0 || v > v1) {
            throw new IndexOutOfBoundsException(T4.l.W(v, v1, "index"));
        }
        this.Y = v1;
        this.Z = v;
        this.b0 = o0;
    }

    public final Object a(int v) {
        return this.b0.get(v);
    }

    @Override
    public final void add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        return this.Z < this.Y;
    }

    @Override
    public final boolean hasPrevious() {
        return this.Z > 0;
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        int v = this.Z;
        this.Z = v + 1;
        return this.a(v);
    }

    @Override
    public final int nextIndex() {
        return this.Z;
    }

    @Override
    public final Object previous() {
        if(!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        int v = this.Z - 1;
        this.Z = v;
        return this.a(v);
    }

    @Override
    public final int previousIndex() {
        return this.Z - 1;
    }

    @Override
    public final void set(Object object0) {
        throw new UnsupportedOperationException();
    }
}

