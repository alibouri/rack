package s;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a implements Ob.a, Iterator {
    public int X;
    public int Y;
    public boolean Z;
    public final int b0;
    public final Object c0;

    public a(int v) {
        this.X = v;
    }

    public a(e e0, int v) {
        this.b0 = v;
        if(v != 1) {
            this.c0 = e0;
            this(e0.Z);
            return;
        }
        this.c0 = e0;
        this(e0.Z);
    }

    public a(f f0) {
        this.b0 = 2;
        this.c0 = f0;
        this(f0.Z);
    }

    @Override
    public final boolean hasNext() {
        return this.Y < this.X;
    }

    @Override
    public final Object next() {
        Object object0;
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        int v = this.Y;
        switch(this.b0) {
            case 0: {
                object0 = ((e)this.c0).e(v);
                break;
            }
            case 1: {
                object0 = ((e)this.c0).h(v);
                break;
            }
            default: {
                object0 = ((f)this.c0).Y[v];
            }
        }
        ++this.Y;
        this.Z = true;
        return object0;
    }

    @Override
    public final void remove() {
        if(!this.Z) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int v = this.Y - 1;
        this.Y = v;
        switch(this.b0) {
            case 0: {
                ((e)this.c0).f(v);
                break;
            }
            case 1: {
                ((e)this.c0).f(v);
                break;
            }
            default: {
                ((f)this.c0).a(v);
            }
        }
        --this.X;
        this.Z = false;
    }
}

