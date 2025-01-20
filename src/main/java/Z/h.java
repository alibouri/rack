package Z;

import Ob.a;
import java.util.Iterator;
import java.util.Map.Entry;
import t0.E;

public final class h implements a, Iterator {
    public final int X;
    public final Iterator Y;

    public h(e e0) {
        this.X = 0;
        super();
        n[] arr_n = new n[8];
        for(int v = 0; v < 8; ++v) {
            arr_n[v] = new p(this);
        }
        this.Y = new f(e0, arr_n);
    }

    public h(E e0) {
        this.X = 1;
        super();
        this.Y = e0.h0.iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.X == 0 ? ((f)this.Y).Z : this.Y.hasNext();
    }

    @Override
    public final Object next() {
        return this.X != 0 ? this.Y.next() : ((Map.Entry)((f)this.Y).next());
    }

    @Override
    public final void remove() {
        if(this.X != 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        ((f)this.Y).remove();
    }
}

