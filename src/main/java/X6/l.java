package X6;

import java.util.Iterator;

public abstract class l implements Iterator {
    public final int X;

    public l(int v) {
        this.X = v;
        super();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

