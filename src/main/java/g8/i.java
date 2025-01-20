package g8;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class i implements Iterator {
    public k X;
    public k Y;
    public int Z;
    public final l b0;
    public final int c0;

    public i(l l0, int v) {
        this.c0 = v;
        super();
        this.b0 = l0;
        this.X = l0.c0.b0;
        this.Y = null;
        this.Z = l0.b0;
    }

    public final Object a() {
        return this.b();
    }

    public final k b() {
        k k0 = this.X;
        l l0 = this.b0;
        if(k0 == l0.c0) {
            throw new NoSuchElementException();
        }
        if(l0.b0 != this.Z) {
            throw new ConcurrentModificationException();
        }
        this.X = k0.b0;
        this.Y = k0;
        return k0;
    }

    @Override
    public final boolean hasNext() {
        return this.X != this.b0.c0;
    }

    @Override
    public Object next() {
        return this.c0 == 1 ? this.b().d0 : this.a();
    }

    @Override
    public final void remove() {
        k k0 = this.Y;
        if(k0 == null) {
            throw new IllegalStateException();
        }
        this.b0.c(k0, true);
        this.Y = null;
        this.Z = this.b0.b0;
    }
}

