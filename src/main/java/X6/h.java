package X6;

import java.util.NoSuchElementException;

public final class h extends l {
    public boolean Y;
    public final Object Z;

    public h(Object object0) {
        super(0);
        this.Z = object0;
    }

    @Override
    public final boolean hasNext() {
        return !this.Y;
    }

    @Override
    public final Object next() {
        if(this.Y) {
            throw new NoSuchElementException();
        }
        this.Y = true;
        return this.Z;
    }
}

