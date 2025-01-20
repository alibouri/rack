package s;

import Nb.j;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

public final class c implements Iterator, Map.Entry {
    public int X;
    public int Y;
    public boolean Z;
    public final e b0;

    public c(e e0) {
        this.b0 = e0;
        this.X = e0.Z - 1;
        this.Y = -1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!this.Z) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return object0 instanceof Map.Entry ? j.a(((Map.Entry)object0).getKey(), this.b0.e(this.Y)) && j.a(((Map.Entry)object0).getValue(), this.b0.h(this.Y)) : false;
    }

    @Override
    public final Object getKey() {
        if(!this.Z) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.b0.e(this.Y);
    }

    @Override
    public final Object getValue() {
        if(!this.Z) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.b0.h(this.Y);
    }

    @Override
    public final boolean hasNext() {
        return this.Y < this.X;
    }

    @Override
    public final int hashCode() {
        if(!this.Z) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        Object object0 = this.b0.e(this.Y);
        Object object1 = this.b0.h(this.Y);
        int v = 0;
        int v1 = object0 == null ? 0 : object0.hashCode();
        if(object1 != null) {
            v = object1.hashCode();
        }
        return v1 ^ v;
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        ++this.Y;
        this.Z = true;
        return this;
    }

    @Override
    public final void remove() {
        if(!this.Z) {
            throw new IllegalStateException();
        }
        this.b0.f(this.Y);
        --this.Y;
        --this.X;
        this.Z = false;
    }

    @Override
    public final Object setValue(Object object0) {
        if(!this.Z) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.b0.g(this.Y, object0);
    }

    @Override
    public final String toString() {
        return this.getKey() + "=" + this.getValue();
    }
}

